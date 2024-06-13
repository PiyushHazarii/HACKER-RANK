package Hacker Rank;

public class Java_Visitor_Pattern 
{

    class SumInLeavesVisitor extends TreeVis { int result=0;


        public int getResult() 
        {
            return result;
        }
        
        public void visitNode(TreeNode node) 
        {
        }
        
        public void visitLeaf(TreeLeaf leaf) 
        {
            result+=leaf.getValue();
        }
        }
        
        class ProductOfRedNodesVisitor extends TreeVis { long result=1L;
        
        public int getResult() 
        {
            return (int)result;
        }
        
        public void visitNode(TreeNode node) 
        {
            if(node.getColor()==Color.RED){
                   result= (result * node.getValue()) % (1000000007);
             }
        }
        
        public void visitLeaf(TreeLeaf leaf) 
        {
              if(leaf.getColor()==Color.RED){
                  result= (result * leaf.getValue()) % (1000000007);
              }
        }
        }
        
        class FancyVisitor extends TreeVis { int sumOfNode=0; int sumOfLeaf=0; public int getResult() { return Math.abs(sumOfNode-sumOfLeaf); }
        
        public void visitNode(TreeNode node) 
        {
            if(node.getDepth()%2==0){
                sumOfNode+=node.getValue();
            }
        }
        
        public void visitLeaf(TreeLeaf leaf) 
        {
            if(leaf.getColor()==Color.GREEN){
                sumOfLeaf+=leaf.getValue();
            }
        }
        }
        
        public class Solution 
        {
        
        public static Tree solve() 
        {
            //read the tree from STDIN and return its root as a return value of this function

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] vals = new int[n];
        
        for(int i=0; i<n; i++)
        {
            vals[i]= sc.nextInt();
        
        }

        Color[] colors = new Color[n];   
        
        for(int i=0; i<n; i++)
        {
            colors[i]= sc.nextInt()==1? Color.GREEN:Color.RED;
        }
        
        Map<Integer, Set<Integer>> nodeEdges = new HashMap<>();   

        for(int i=0; i<n-1; i++)
        {
            int u = sc.nextInt();

            int v = sc.nextInt();

            if(!nodeEdges.containsKey(u))
            {
               nodeEdges.put(u,new HashSet<Integer>());          
            }

            if(!nodeEdges.containsKey(v)){
               nodeEdges.put(v,new HashSet<Integer>());          
            }

            nodeEdges.get(u).add(v);

            nodeEdges.get(v).add(u);        
        }   
        
        Map<TreeNode, Integer> nodeIndexMap = new HashMap<>();

        List<TreeNode> parents = new ArrayList<>();
        
        TreeNode root = new TreeNode(vals[0],colors[0],0);

        nodeIndexMap.put(root,1);

        parents.add(root);    
        
        while(!parents.isEmpty())
        {
            List<TreeNode> nextLevelParents = new ArrayList<>();

            for(TreeNode node : parents)
            {
                int depth = node.getDepth();

                int parentIndex = nodeIndexMap.get(node);
        
                for(int childIndex: nodeEdges.get(parentIndex))
                {
        
                        nodeEdges.get(childIndex).remove(parentIndex); 
        
                        if(!nodeEdges.get(childIndex).isEmpty())
                        {
                            TreeNode child = new TreeNode(vals[childIndex-1], colors[childIndex-1],depth+1); 

                           nextLevelParents.add(child);

                           nodeIndexMap.put(child, childIndex);

                           node.addChild(child);

                        }
                        else
                        {
                           TreeLeaf leaf = new TreeLeaf(vals[childIndex-1], colors[childIndex-1],depth+1);
                           node.addChild(leaf);
                        }                    
                    }
                }

            parents = nextLevelParents;         
            }  
        sc.close();
        return root;           
        }       
    }
}