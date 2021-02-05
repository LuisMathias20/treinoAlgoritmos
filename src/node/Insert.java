package node;

public class Insert {
	
	public Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key){
			root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	Node insertRoot(Node root,int key) {
		Insert insert = new Insert();
		
		root = insert.insertRec(root, key);
		
		return root;
	}
	
	
}
