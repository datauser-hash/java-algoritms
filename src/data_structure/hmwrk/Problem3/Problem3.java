package data_structure.hmwrk.Problem3;
import data_structure.hmwrk.Problem1.ArrayList;
import data_structure.hmwrk.Problem1.Entry;
import data_structure.hmwrk.Problem2.Node;


public class Problem3 {

    public static <K,V> K findMedian(Node<Entry<K,V>> root){
        ArrayList<Entry<K,V>> entryArrayList = inorder(root);
        if (entryArrayList.size() % 2 == 0) {
            return  entryArrayList.get((entryArrayList.size() - 1) / 2).getKey();
        }
        return entryArrayList.get((entryArrayList.size() - 1 ) / 2).getKey();
    }


    private static <K,V> ArrayList<Entry<K,V>> inorder(Node<Entry<K,V>> root){
        ArrayList<Entry<K,V>> entryArrayList = new ArrayList<>();
        if (root != null) {
            inOrderTraversal(root, entryArrayList);
        }
        return entryArrayList;
    }


    private static <K,V> void inOrderTraversal(Node<Entry<K,V>> node, ArrayList<Entry<K,V>> entryArrayList) {
        if (node.getLeft() != null ){
            inOrderTraversal(node.getLeft(), entryArrayList);
        }
        entryArrayList.add(node.getElement());
        if (node.getRight() != null) {
            inOrderTraversal(node.getRight(), entryArrayList);
        }
    }
}
