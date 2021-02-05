package chapter.five;

import node.Insert;
import node.Node;
import node.InOrder;

public class BinarySearchTreesInsertion {
	
	static Node root;
	
	BinarySearchTreesInsertion(){
		root = null;
	}
	
	public static void main(String[] args) {
		Insert insert = new Insert();
		InOrder order = new InOrder();
		
		root = insert.insertRec(root, 50);
		root = insert.insertRec(root, 20);
		root = insert.insertRec(root, 60);
		root = insert.insertRec(root, 70);
		
		order.inOrderRec(root);
	}
}
