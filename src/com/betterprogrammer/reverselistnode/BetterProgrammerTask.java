package com.betterprogrammer.reverselistnode;

public class BetterProgrammerTask {

	// Please do not change this interface
    interface ListNode {
        int getItem();
        ListNode getNext();
        void setNext(ListNode next);
    }

    public static ListNode reverse(ListNode node) {
        /*
          Please implement this method to
          reverse a given linked list.
         */
    	ListNode nextNode;
    	if (node.getNext() != null) {
    		nextNode = reverse(node.getNext());
    	}
    	else {
    		return node;
    	}
    	nextNode.setNext(node);
    	return node;
    }
	
	public static void main(String[] args) {
		

	}

}
