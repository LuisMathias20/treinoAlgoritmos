package chapter.seven;

import node.Node;

public class TransversalTreePostOrder {

	Node root;
	
	public static void main(String[] args) {
		TransversalTreePostOrder tree = new TransversalTreePostOrder();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("PostOrder transversal of binary tree is ");
		tree.printPostOrder();
	}
	
	TransversalTreePostOrder() {
		root = null;
	}
	
	void printPostOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		printPostOrder(node.left);
		
		printPostOrder(node.right);
		
		System.out.print(node.key + " ");
	}
	
	void printPostOrder() {
		printPostOrder(root);
	}

}
