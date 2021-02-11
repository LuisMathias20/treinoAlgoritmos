package chapter.six;

import chapter.one.FizzBuzz;
import node.Node;

public class CheckIfIsBinaryTree {
	
	public static void main(String[] args) {
		CheckIfIsBinaryTree tree = new CheckIfIsBinaryTree();
		
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		
		if(tree.isBst()) {
			System.out.print("Is BST");
		}
		else{
			System.out.print("Not a BST");
		}
	}
	
	Node root;
	
	boolean isBst() {
		return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	boolean isBstUtil(Node node, int min, int max) {
		if(node == null) {
			return true;
		}
		
		if(node.key < min || node.key > max) {
			return false;
		}
		
		return(isBstUtil(node.left, min, node.key-1) && 
			   isBstUtil(node.right, node.key+1, max));
	}
}
