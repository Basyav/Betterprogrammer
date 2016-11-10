package com.betterprogrammer.treelevelsum;

import java.util.List;

/**
 * Created by dmitry on 11/10/16.
 */
public class BetterProgrammerTask {
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLevelSum(Node root, int N) {
        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */
    }
}
