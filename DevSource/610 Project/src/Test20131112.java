
public class Test20131112 {
	public static void main (String [] arg){
		
		GPTree tree = new GPTree();
		
		tree.rootnode = new TreeNode("+");
		
		tree.rootnode.left = new TreeNode("-");
		
		tree.rootnode.right = new TreeNode("*");
		
		tree.rootnode.left.left = new TreeNode("5");
		tree.rootnode.left.right = new TreeNode("3");
		tree.rootnode.right.left = new TreeNode("2");
		tree.rootnode.right.right = new TreeNode("8");
		
		
		System.out.println(tree.EvaTree(tree.rootnode));
		

	}
}
