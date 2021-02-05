package chapter.four;

import node.*;

public class Trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trees.binaryTree();
	}
	
	Node root;
	
	Trees(int key) {
		root = new Node(key);	
	}
	
	Trees(){
		root = null;
	}
	
	public static void binaryTree() {
		Trees binaryTree = new Trees();
		
		binaryTree.root = new Node(1);
		
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		
		binaryTree.root.left.left = new Node(4);
	}
}