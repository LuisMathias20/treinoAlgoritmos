package node;

import node.Node;

public class InOrder {
	public InOrder() {
		
	}

	public void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.key+" | ");
			inOrderRec(root.right);
		}
	}
}
