package data_structure.hmwrk.Problem2;
import data_structure.hmwrk.Problem1.*;

import java.util.Comparator;

public class Problem2 {
    private StringComparator stringComparator = new StringComparator();


    public static boolean isBST(Node<String> root, Comparator<String> comp) {
        if (root.getElement() == null) {
            return true;
        }
        int leftChildHeight = height(root.getLeft());
        int rightChildHeight = height(root.getRight());

        return Math.abs(leftChildHeight - rightChildHeight) <= 1;
    }

    private static int height(Node<String> node){
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }
}


