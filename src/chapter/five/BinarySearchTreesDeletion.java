package chapter.five;

import node.InOrder;
import node.Insert;
import node.Node;

public class BinarySearchTreesDeletion {
	
	static Node root;
	
	BinarySearchTreesDeletion() {
		root = null;
	}
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	Node deleteRec(Node root, int key) {
		if (root == null) {
			return root;
		}
		
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}
		else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			
			root.key  = minValue(root.right);
			
			root.right = deleteRec(root.right, root.key);
		}
		
		return root;
	}

	int minValue(Node root) {
		int minimumValue = root.key;
		
		while(root.left != null) {
			minimumValue = root.left.key;
			root = root.left;
		}
		return minimumValue;
	}

	public static void main(String[] args) {
		Insert insert = new Insert();
		InOrder order = new InOrder();
		BinarySearchTreesDeletion search = new BinarySearchTreesDeletion();
		
		root = insert.insertRec(root, 50);
		root = insert.insertRec(root, 20);
		root = insert.insertRec(root, 60);
		root = insert.insertRec(root, 70);
		
		System.out.println("Inorder traversal of the given tree");
		order.inOrderRec(root);
		
		System.out.println("\nDelete 20");
        search.deleteKey(20);
        
        System.out.println(" ");
        
        System.out.println("Inorder traversal of the given tree");
		order.inOrderRec(root);
	}
	
	
}
