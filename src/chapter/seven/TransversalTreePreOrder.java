package chapter.seven;

import node.Node;

public class TransversalTreePreOrder {

	Node root;
	
	public static void main(String[] args) {
		TransversalTreePreOrder tree = new TransversalTreePreOrder();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("PreOrder transversal of binary tree is ");
		tree.printPreOrder();
	}
	
	TransversalTreePreOrder() {
		root = null;
	}
	
	void printPreOrder(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.print(node.key + "");
		
		printPreOrder(node.left);
		
		printPreOrder(node.right);
	}
	
	void printPreOrder() {
		printPreOrder(root);
	}

}
