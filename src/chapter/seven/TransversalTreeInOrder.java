package chapter.seven;

import node.Node;

public class TransversalTreeInOrder {

	Node root;
	
	public static void main(String[] args) {
		TransversalTreeInOrder tree = new TransversalTreeInOrder();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("InOrder transversal of binary tree is ");
		tree.printInOrder();
	}
	
	TransversalTreeInOrder(){
		root = null;
	}
	
	void printInOrder(Node node) {
		if(node == null) {
			return;
		}
		
		printInOrder(node.left);
		
		System.out.println(node.key + "");
		
		printInOrder(node.right);
	}
	
	void printInOrder() {
		printInOrder(root);
	}

}
