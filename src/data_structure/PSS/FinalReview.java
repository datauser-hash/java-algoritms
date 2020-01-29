package data_structure.PSS;//package data_structure.PSS;
//import data_structure.ap_avlMap;
//import MAP.Map;
//import MAP.SortedTableMap;
//
//import java.util.*;
//
//public class FinalReview {
//    public static void main(String[] args) {
////        int[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
////        int[] ar = new int[2];
////        int[] newArr = findMinUnSortSub(arr,0,0,ar,0);
////        for (int i = 0; i < newArr.length;i++){
////            System.out.print(newArr[i] + " ");
////        }
//
//
//        Queue<Integer> queue = new LinkedQueue<>();
//        queue.enqueue(1);
//        queue.enqueue(3);
//        queue.enqueue(5);
//        queue.enqueue(7);
//        queue.enqueue(2);
//        queue.enqueue(4);
//        queue.enqueue(6);
//        queue.enqueue(8);
//        sort(queue);
//        while (!queue.isEmpty()){
//            System.out.print(queue.dequeue() + " ");
//        }
//        System.out.println();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list1.add(1);
//        list1.add(8);
//        list1.add(56);
//        list1.add(7);
//        list1.add(789);
//        list1.add(5);
//        list2.add(8);
//        list2.add(789);
//        list2.add(56);
//        int[] arr = commonEl(list1,list2);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//    }
///*
//1.O(n^3)
//2.O(n^1.5)
//3.O(n^1.75)
//4.O(n^2logn)
//5.O(nlogn)
//6.O(logn)
//7.O(n^2)
//8.O(n^2)
//9.O(n^1.25)
//10.O(nlogn)
//11.O(n^3)
//12.O(logn)
// */
//
////1
//    public static int[] findMinUnSortSub(int[] arr,int low,int high,int[] dist,int diff){
//        if (high >= arr.length - 1){
//            return dist;
//        }else if (low >= high){
//            return findMinUnSortSub(arr,0,high + 1,dist,diff);
//        }else {
//            int[] tmp = new int[high - low + 1];
//            for (int i = low,j = 0; i < high; i++){
//                tmp[j++] = arr[i];
//            }
//            Algo.mergeSort(tmp);
//            for (int i = 0,j = low; i < tmp.length; i++,j++){
//                if (arr[j] != tmp[i]){
//                   int first = j;
//                   while (j < high && arr[j] != tmp[i]){
//                       i++;
//                       j++;
//                   }
//                   int second = j - 1;
//                   if (second - first > diff) {
//                       dist[0] = first + 1;
//                       dist[1] = second - 1;
//                       diff = second - first;
//                   }
//                   break;
//                }
//            }
//            return findMinUnSortSub(arr,low + 1,high,dist,diff);
//        }
//    }
//
//    public class StackWithOneQueue<E> implements Stack<E> {
//        private Queue<E> S = new ArrayQueue<>();
//        private Queue<E> T = new ArrayQueue<>();
//
//        public int size() { return S.size(); }
//        public boolean isEmpty() { return S.isEmpty(); }
//        public E top() { return S.first(); }
//        public E pop() { return S.dequeue(); }
//        public void push(E e){
//            while (!S.isEmpty()){
//                T.enqueue(S.dequeue());
//            }
//            S.enqueue(e);
//            while (!T.isEmpty()){
//                S.enqueue(T.dequeue());
//            }
//        }
//    }
//
//    public static void sort(Queue<Integer> arr){
//        Queue<Integer> q1 = new LinkedQueue<>();
//        Queue<Integer> q2 = new LinkedQueue<>();
//        int i = arr.size() / 2;
//        int j = 0;
//        while (j < i){
//            q1.enqueue(arr.dequeue());
//            j++;
//        }
//        j = 0;
//        while (j < arr.size()){
//            q2.enqueue(arr.dequeue());
//        }
//        while (!q1.isEmpty() && !q2.isEmpty()){
//            if (q1.first() < q2.first()) {
//                arr.enqueue(q1.dequeue());
//            }else {
//                arr.enqueue(q2.dequeue());
//            }
//        }
//        while (!q1.isEmpty()){
//            arr.enqueue(q1.dequeue());
//        }
//        while (!q2.isEmpty()){
//            arr.enqueue(q2.dequeue());
//        }
//    }
//
//
//    public static int[] commonEl(ArrayList<Integer> list1,ArrayList<Integer> list2){
//        int[] arr = new int[list1.size() - list2.size()];
//        int k = 0;
//        for (int i = 0; i < list1.size(); i++){
//            int tmp = list1.get(i);
//            boolean isPresent = false;
//            for (int j = 0; j < list2.size(); j++){
//                if (tmp == list2.get(j)) { isPresent = true; }
//            }
//            if (!isPresent) {
//                arr[k++] = tmp;
//            }
//        }
//        return arr;
//    }
//
//}
//
//
//class Review2<K,V> extends AVLMap<K,V> {
//    public static void main(String[] args) {
//        String str = "[()]{}{[()()]()";
//        System.out.println(stackEx(str));
//
//        Queue<Integer> queue = new LinkedQueue<>();
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.enqueue(9);
//
//        while (!queue.isEmpty()){
//            System.out.println(queue.dequeue() + " ");
//        }
//        System.out.println();
//        LinkedPositionalList<Integer> positionalList = new LinkedPositionalList<>();
//        positionalList.addLast(1);
//        positionalList.addLast(2);
//        positionalList.addLast(3);
//        positionalList.addLast(4);
//        positionalList.addLast(5);
//        positionalList.addLast(6);
//        positionalList.addLast(7);
//        positionalList.addLast(8);
//        positionalList.addLast(9);
//        positionalList.addLast(10);
//        System.out.println(findMiddle(positionalList).getElement() + " ");
//
//        String a1 = "listen";
//        String a2 = "silent";
//        System.out.println(Anagrams(a1,a2));
//    }
//    public static boolean stackEx(String par){
//        char[] arr = par.toCharArray();
//        Stack<Character> stack = new LinkedStack<>();
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
//                stack.push(arr[i]);
//            }else {
//                if (arr[i] == '}' && stack.top() == '{'){
//                    stack.pop();
//                }else if (arr[i] == ')' && stack.top() == '('){
//                    stack.pop();
//                }else if (arr[i] == ']' && stack.top() == '['){
//                    stack.pop();
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//    public static Position<Integer> findMiddle(LinkedPositionalList<Integer> list){
//
//        Iterator<Position<Integer>> it1 = list.positions().iterator();
//        Iterator<Position<Integer>> it2 = list.positions().iterator();
//        Position<Integer> middle = null;
//        int i = 0;
//        while (it2.hasNext()){
//            i++;
//            if (i == 2) {
//                i = 0;
//                middle = it1.next();
//            }
//            it2.next();
//        }
//        if (i % 2 != 0){
//            return it1.next();
//        }else {
//            return middle;
//        }
//    }
//
//    public static void QueueSort(Queue<Integer> q){
//
//    }
//    public static boolean Anagrams(String s1, String s2){
//        Map<Character,Integer> map = new SortedTableMap<>();
//        char[] arr1 = s1.toCharArray();
//        char[] arr2 = s2.toCharArray();
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (map.get(arr1[i]) == null){
//                map.put(arr1[i],0);
//            }else {
//                map.put(arr1[i],map.remove(arr1[i]) + 1);
//            }
//        }
//        for (int i = 0; i < arr2.length; i++){
//            if (map.get(arr2[i]) == null) {
//                break;
//            }else {
//                if (map.get(arr2[i]) > 0){
//                    map.put(arr2[i],map.remove(arr2[i]) - 1);
//                }else {
//                    map.remove(arr2[i]);
//                }
//            }
//        }
//        return map.isEmpty();
//    }
//
//}
//class Algo {
//    public static <V> void heapSort(Entry<Integer, V>[] arr) {
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            heapify(arr, arr.length, i);
//        }
//        for (int i = arr.length - 1; i >= 0; i--) {
//            Entry<Integer, V> tmp = arr[0];
//            arr[0] = arr[i];
//            arr[i] = tmp;
//            heapify(arr, i, 0);
//        }
//    }
//
//    public static <V> void heapify(Entry<Integer, V>[] arr, int size, int root) {
//        int largestEl = root;
//        int left = 2 * root + 1;
//        int right = 2 * root + 2;
//        if (left < size && arr[left].getKey() > arr[largestEl].getKey()) {
//            largestEl = left;
//        }
//        if (right < size && arr[right].getKey() > arr[largestEl].getKey()) {
//            largestEl = right;
//        }
//        if (largestEl != root) {
//            Entry<Integer, V> tmp = arr[root];
//            arr[root] = arr[largestEl];
//            arr[largestEl] = tmp;
//            heapify(arr, size, largestEl);
//        }
//    }
//    public static int binarySearchRecursiveInt(int[] arr, int start, int end, int key) {
//        if (start > end) {
//            return -1;
//        }
//        int middle = (start + end) / 2;
//        if (arr[middle] == key) {
//            return middle;
//        } else if (arr[middle] < key) {
//            return binarySearchRecursiveInt(arr, middle + 1, end, key);
//        } else {
//            return binarySearchRecursiveInt(arr, start, middle - 1, key);
//        }
//    }
//
//    public static boolean binarySearchRecursiveBool(int[] arr, int start, int end, int key) {
//        if (start > end) {
//            return false;
//        }
//        int middle = (start + end) / 2;
//        if (arr[middle] == key) {
//            return true;
//        } else if (arr[middle] < key) {
//            return binarySearchRecursiveBool(arr, middle + 1, end, key);
//        } else {
//            return binarySearchRecursiveBool(arr, start, middle - 1, key);
//        }
//    }
//
//    public static boolean binarySearchIterativeBool(int[] arr, int key) {
//        int start = 0, end = arr.length;
//        while (start < end) {
//            int middle = (start + end) / 2;
//            if (arr[middle] == key) {
//                return true;
//            } else if (arr[middle] < key) {
//                start = middle + 1;
//            } else {
//                end = middle - 1;
//            }
//        }
//        return false;
//    }
//
//    public static int binarySearchIterativeInt(int[] arr, int key) {
//        int start = 0, end = arr.length;
//        while (start < end) {
//            int middle = (start + end) / 2;
//            if (arr[middle] == key) {
//                return middle;
//            } else if (arr[middle] < key) {
//                start = middle + 1;
//            } else {
//                end = middle - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//    }
//
//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int j = i;
//            int tmp = arr[j];
//            while (j > 0 && arr[j - 1] > tmp) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = tmp;
//        }
//    }
//
//    public static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int min = i;
//            int j = i;
//            while (j < arr.length) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//                j++;
//            }
//            int tmp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = tmp;
//        }
//    }
//
//    public static void mergeSort(int[] arr) {
//        int n = arr.length;
//        if (n < 2) {
//            return;
//        }
//        int middle = n / 2;
//        int[] part1 = Arrays.copyOfRange(arr, 0, middle);
//        int[] part2 = Arrays.copyOfRange(arr, middle, n);
//
//        mergeSort(part1);
//        mergeSort(part2);
//        merge(part1, part2, arr);
//    }
//
//    public static void merge(int[] part1, int[] part2, int[] arr) {
//        int i = 0, j = 0;
//        while (i + j < arr.length) {
//            if (j == part2.length || (i < part1.length && part1[i] < part2[j])) {
//                arr[i + j] = part1[i++];
//            } else {
//                arr[i + j] = part2[j++];
//            }
//        }
//    }
//
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    public static int partition(int[] arr, int low, int high) {
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (arr[j] < arr[high]) {
//                i++;
//                int tmp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = tmp;
//            }
//        }
//        int tmp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = tmp;
//        return i + 1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("Check for bubble: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("Check for insertion: ");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        insertionSort(arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("Check for selection: ");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//        selectionSort(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//        int[] arr3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("Check for merge: ");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }
//        System.out.println();
//        mergeSort(arr3);
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }
//        System.out.println();
//        int[] arr4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println("Check for quick: ");
//        for (int i = 0; i < arr4.length; i++) {
//            System.out.print(arr4[i] + " ");
//        }
//        System.out.println();
//        quickSort(arr4, 0, arr4.length - 1);
//        for (int i = 0; i < arr4.length; i++) {
//            System.out.print(arr4[i] + " ");
//        }
//    }
//}
//
///*
////class Algo{
////    public static int binarySearch(int[] arr,int start,int end,int key){
////        if (start > end) {
////            return -1;
////        }
////        int middle = (start + end) / 2;
////        if (arr[middle] == key) { return middle; }
////        else if (arr[middle] < key) { return binarySearch(arr,middle + 1,end,key);}
////        else { return binarySearch(arr,start,middle - 1,key); }
////    }
////    public static int binarySearchIterative(int[] arr, int key) {
////        int start = 0, end = arr.length;
////        while (start <= end) {
////            int middle = (start + end) / 2;
////            if (arr[middle] == key) { return middle; }
////            else if (arr[middle] < key) { start = middle + 1; }
////            else { end = middle - 1; }
////        }
////        return -1;
////    }
////    public static void insertionSort(int[] arr){
////        for (int i = 1; i < arr.length; i++){
////            int j = i;
////            int tmp = arr[i];
////            while (j > 0 && arr[j - 1] > tmp){
////                arr[j] = arr[j - 1];
////                j--;
////            }
////            arr[j] = tmp;
////        }
////    }
////    public static void selectionSort(int[] arr) {
////        for (int i = 0; i < arr.length - 1; i++){
////            int min = i;
////            int j = i + 1;
////            while (j < arr.length){
////                if (arr[j] < arr[min]){
////                    min = j;
////                }
////                j++;
////            }
////            int tmp = arr[min];
////            arr[min] = arr[i];
////            arr[i] = tmp;
////        }
////    }
////
////    public static void bubbleSort(int[] arr) {
////        for (int i = 0; i < arr.length - 1; i++){
////            boolean swapped = false;
////            for (int j = 0; j < arr.length - i - 1; j++){
////                if (arr[j] > arr[j + 1]){
////                    int tmp = arr[j];
////                    arr[j] = arr[j + 1];
////                    arr[j + 1] = tmp;
////                    swapped = true;
////                }
////            }
////            if (!swapped) { break; }
////        }
////    }
////
////    public static void mergeSort(int[] arr){
////        if (arr.length < 2) { return; }
////        int middle = arr.length / 2;
////        int[] part1 = Arrays.copyOfRange(arr,0,middle);
////        int[] part2 = Arrays.copyOfRange(arr,middle,arr.length);
////
////        mergeSort(part1);
////        mergeSort(part2);
////        merge(part1,part2,arr);
////    }
////    public static void merge(int[] part1,int[] part2,int[] orig){
////        int i = 0,j = 0;
////        while (i + j < orig.length){
////            if (j == part2.length || (i < part1.length && part1[i] < part2[j])){
////                orig[i + j] = part1[i++];
////            }else {
////                orig[i + j] = part2[j++];
////            }
////        }
////    }
////
////    public static void quickSort(int[] arr,int low,int high){
////        if (low < high){
////            int pi = partition(arr,low,high);
////            quickSort(arr,low,pi - 1);
////            quickSort(arr,pi + 1,high);
////        }
////    }
////
////    public static int partition(int[] arr,int low,int high){
////        int i = (low - 1);
////        for (int j = low; j < high; j++){
////            if (arr[j] < arr[high]){
////                i++;
////                int tmp = arr[i];
////                arr[i] = arr[j];
////                arr[j] = tmp;
////            }
////        }
////        int tmp = arr[i + 1];
////        arr[i + 1] = arr[high];
////        arr[high] = tmp;
////        return i + 1;
////    }
////}
//
//*/
//class SLLNode<E> {
//    private E element;
//    private SLLNode<E> next;
//
//    public SLLNode(E element, SLLNode<E> next) {
//        this.element = element;
//        this.next = next;
//    }
//
//    public SLLNode<E> getNext() {
//        return next;
//    }
//
//    public E getElement() {
//        return element;
//    }
//
//    public void setElement(E element) {
//        this.element = element;
//    }
//
//    public void setNext(SLLNode<E> next) {
//        this.next = next;
//    }
//
//
//}
//
//class DLLNode<E> {
//    private E element;
//    private DLLNode<E> next;
//    private DLLNode<E> prev;
//
//    public DLLNode(E element, DLLNode<E> prev, DLLNode<E> next) {
//        this.element = element;
//        this.prev = prev;
//        this.next = next;
//    }
//
//    public DLLNode<E> getNext() {
//        return next;
//    }
//
//    public DLLNode<E> getPrev() {
//        return prev;
//    }
//
//    public E getElement() {
//        return element;
//    }
//
//    public void setElement(E element) {
//        this.element = element;
//    }
//
//    public void setNext(DLLNode<E> next) {
//        this.next = next;
//    }
//
//    public void setPrev(DLLNode<E> prev) {
//        this.prev = prev;
//    }
//}
//
//class SLL<E> {
//    private SLLNode<E> head = null;
//    private SLLNode<E> tail = null;
//    private int size = 0;
//
//    public SLL() {
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public void addFirst(E e) {
//        SLLNode<E> newest = new SLLNode<>(e, head);
//        head = newest;
//        if (isEmpty()) {
//            tail = head;
//        }
//        size++;
//    }
//
//    public void addLast(E e) {
//        SLLNode<E> newest = new SLLNode<>(e, null);
//        if (isEmpty()) {
//            head = newest;
//            tail = head;
//        } else {
//            tail.setNext(newest);
//            tail = newest;
//        }
//        size++;
//    }
//
//    public E first() {
//        if (isEmpty()) {
//            return null;
//        }
//        return head.getElement();
//    }
//
//    public E last() {
//        if (isEmpty()) {
//            return null;
//        }
//        return tail.getElement();
//    }
//
//    public E removeFirst() {
//        if (isEmpty()) {
//            return null;
//        }
//        E answer = head.getElement();
//        head = head.getNext();
//        size--;
//        if (isEmpty()) {
//            tail = null;
//        }
//        return answer;
//    }
//}
//
//class SinglyLinkedList<E>{
//    private static class Node<E> {
//        private E element;
//        private Node<E> next;
//
//        public Node(E element, Node<E> next){
//            this.element = element;
//            this.next = next;
//        }
//
//        public E getElement() { return element; }
//        public Node<E> getNext() { return next; }
//        public void setElement(E element) { this.element = element; }
//        public void setNext(Node<E> next) { this.next = next; }
//
//    }
//
//    private Node<E> head = null;
//    private Node<E> tail = null;
//    private int size = 0;
//
//    public int size() { return size; }
//    public boolean isEmpty() { return size() == 0; }
//
//    public E first() {
//        if (isEmpty()) { return null; }
//        return head.getElement();
//    }
//    public E last() {
//        if (isEmpty()) { return null; }
//        return tail.getElement();
//    }
//    public E removeFirst() {
//        if (isEmpty()) {
//            return null;
//        }
//        E answer = head.getElement();
//        head = head.getNext();
//        size--;
//        if (isEmpty()) {
//            tail = null;
//        }
//        return answer;
//    }
//
//    public void addFirst(E e){
//        Node<E> newest = new Node<>(e,head);
//        head = newest;
//        if (isEmpty()) {
//            tail = head;
//        }
//        size++;
//    }
//    public void addLast(E e) {
//        Node<E> newest = new Node<>(e,null);
//        if (isEmpty()) {
//            head = newest;
//            tail = head;
//        }else {
//            tail.setNext(newest);
//            tail = newest;
//        }size++;
//    }
//}
//
//class CLL<E> {
//    private SLLNode<E> tail = null;
//    private int size = 0;
//
//    public CLL() {
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public E first() {
//        if (isEmpty()) return null;
//        return tail.getNext().getElement();
//    }
//
//    public E last() {
//        if (isEmpty()) return null;
//        return tail.getElement();
//    }
//
//    public void rotate() {
//        if (tail != null) {
//            tail = tail.getNext();
//        }
//    }
//
//    public void addFirst(E e) {
//        if (isEmpty()) {
//            tail = new SLLNode<>(e, null);
//            tail.setNext(tail);
//        } else {
//            SLLNode<E> newnode = new SLLNode<>(e, tail.getNext());
//            tail.setNext(newnode);
//        }
//        size++;
//    }
//
//    public void addLast(E e) {
//        addFirst(e);
//        tail = tail.getNext();
//    }
//
//    public E removeFirst() {
//        if (isEmpty()) {
//            return null;
//        }
//        SLLNode<E> head = tail.getNext();
//        if (head == tail) {
//            tail = null;
//        } else {
//            tail.setNext(head.getNext());
//        }
//        size--;
//        return head.getElement();
//    }
//}
//
//class CircularLinkedList<E> {
//    private static class Node<E> {
//        private E element;
//        private Node<E> next;
//
//        public Node(E element, Node<E> next) {
//            this.element = element;
//            this.next = next;
//        }
//        public E getElement() { return element; }
//        public Node<E> getNext() { return next; }
//        public void setElement(E e) { this.element = e; }
//        public void setNext(Node<E> next) { this.next = next; }
//    }
//
//    private Node<E> tail = null;
//    private int size = 0;
//
//    public int size() { return size; }
//    public boolean isEmpty() { return size() == 0; }
//
//    public E first() {
//        if (isEmpty()) { return null; }
//        return tail.getNext().getElement();
//    }
//    public E last() {
//        if (isEmpty()) { return null; }
//        return tail.getElement();
//    }
//    public E removeFirst(){
//        if (isEmpty()) {
//            return null;
//        }
//        Node<E> head = tail.getNext();
//        if (head == tail) {
//            tail = null;
//        }else {
//            tail.setNext(head.getNext());
//        }
//        head.setNext(null);
//        size--;
//        return head.getElement();
//    }
//    public void addFirst(E e){
//        Node<E> newest = new Node<>(e,tail.getNext());
//        if (isEmpty()){
//            tail = newest;
//            tail.setNext(tail);
//        }
//        tail.setNext(newest);
//        size++;
//    }
//    public void addLast(E e){
//        Node<E> newest = new Node<>(e,tail.getNext());
//        if (isEmpty()){
//            tail = newest;
//            tail.setNext(tail);
//        }
//        tail.setNext(newest);
//        tail = newest;
//        size++;
//    }
//}
//
//class DLL<E> {
//    private DLLNode<E> header;
//    private DLLNode<E> trailer;
//    private int size;
//
//    public DLL() {
//        header = new DLLNode<>(null, null, null);
//        trailer = new DLLNode<>(null, null, null);
//        header.setNext(trailer);
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public E first() {
//        if (isEmpty()) {
//            return null;
//        }
//        return header.getNext().getElement();
//    }
//
//    public E last() {
//        if (isEmpty()) {
//            return null;
//        }
//        return trailer.getNext().getElement();
//    }
//
//    public void addFirst(E e) {
//        addBetween(e, header, header.getNext());
//    }
//
//    public void addLast(E e) {
//        addBetween(e, trailer.getPrev(), trailer);
//    }
//
//    private void addBetween(E e, DLLNode<E> predecessor, DLLNode<E> successor) {
//        DLLNode<E> newest = new DLLNode<>(e, predecessor, successor);
//        predecessor.setNext(newest);
//        successor.setPrev(newest);
//        size++;
//    }
//
//    private E remove(DLLNode<E> node) {
//        DLLNode<E> predecessor = node.getPrev();
//        DLLNode<E> successor = node.getNext();
//        predecessor.setNext(successor);
//        successor.setPrev(predecessor);
//        size--;
//        return node.getElement();
//    }
//
//    public E removeFirst() {
//        if (isEmpty()) {
//            return null;
//        }
//        return remove(header.getNext());
//    }
//
//    public E removeLast() {
//        if (isEmpty()) {
//            return null;
//        }
//        return remove(trailer.getPrev());
//    }
//}
//
//class DoublLinkedList<E> {
//    private static class Node<E> {
//        private E element;
//        private Node<E> next;
//        private Node<E> prev;
//
//        public Node(E element, Node<E> prev, Node<E> next){
//            this.element = element;
//            this.prev = prev;
//            this.next = next;
//        }
//
//        public E getElement() { return element; }
//        public Node<E> getNext() { return next; }
//        public Node<E> getPrev() { return prev; }
//
//        public void setElement(E e) { this.element = e; }
//        public void setNext(Node<E> e) { this.next = e; }
//        public void setPrev(Node<E> e) { this.prev = e; }
//    }
//
//    private Node<E> createNode(E element, Node<E> prev,Node<E> next){
//        return new Node<>(element,prev,next);
//    }
//
//    private Node<E> header;
//    private Node<E> trailer;
//    private int size = 0;
//
//
//    public DoublLinkedList() {
//        header = createNode(null,null,trailer);
//        trailer = createNode(null,header,null);
//    }
//
//    private void addBetween(E element, Node<E> pred, Node<E> succ){
//        Node<E> newest = createNode(element,pred,succ);
//        pred.setNext(newest);
//        succ.setPrev(newest);
//        size++;
//    }
//    private E remove(Node<E> e){
//        Node<E> pred = e.getPrev();
//        Node<E> succ = e.getNext();
//        pred.setNext(succ);
//        succ.setPrev(pred);
//        E answer = e.getElement();
//        e.setNext(null);
//        e.setPrev(null);
//        e.setElement(null);
//        size--;
//        return answer;
//    }
//
//    public int size() { return size; }
//    public boolean isEmpty() { return size() == 0; }
//
//    public E first() {
//        if (isEmpty()) {
//            return null;
//        }
//        return header.getNext().getElement();
//    }
//    public E last() {
//        if (isEmpty()) { return null; }
//        return trailer.getPrev().getElement();
//    }
//    public E removeFirst() {
//        if (isEmpty()) { return null; }
//        return remove(header.getNext());
//    }
//    public E removeLast(){
//        if (isEmpty()) { return null; }
//        return remove(trailer.getPrev());
//    }
//    public void addFirst(E e){
//        addBetween(e,header,header.getNext());
//    }
//    public void addLast(E e){
//        addBetween(e,trailer.getPrev(),trailer);
//    }
//
//
//}
//interface Stack<E> {
//    int size();
//
//    boolean isEmpty();
//
//    E pop();
//
//    E top();
//
//    void push(E e);
//}
//
///*
//size O(1)
//isEmpty O(1)
//push O(1)
//pop O(1)
//top O(1)
// */
//class ArrayStack<E> implements Stack<E> {
//    private E[] arr;
//    private int Capacity;
//    private int t = -1;
//
//    public ArrayStack(int Cap) {
//        arr = (E[]) new Object[Cap];
//    }
//
//    public ArrayStack() {
//        arr = (E[]) new Object[Capacity];
//    }
//
//    public int size() {
//        return t + 1;
//    }
//
//    public boolean isEmpty() {
//        return t == -1;
//    }
//
//    public void push(E e) throws IllegalArgumentException {
//        if (size() == arr.length) {
//            throw new IllegalArgumentException("Stack is full");
//        }
//        arr[++t] = e;
//    }
//
//    public E top() {
//        if (isEmpty()) {
//            return null;
//        }
//        return arr[t];
//    }
//
//    public E pop() {
//        if (isEmpty()) {
//            return null;
//        }
//        E answer = arr[t];
//        arr[t] = null;
//        t--;
//        return answer;
//    }
//}
//class AStack<E> implements Stack<E> {
//    private static final int CAPACITY = 16;
//    private E[] data;
//    private int size = -1;
//
//    public AStack(int cap) {
//        data = (E[]) new Object[cap];
//    }
//    public AStack() {
//        this(CAPACITY);
//    }
//    public int size() { return size + 1; }
//    public boolean isEmpty() { return size() == 0; }
//
//    public E pop(){
//        if (isEmpty()) { return null; }
//        E answer = data[size];
//        data[size] = null;
//        size--;
//        return answer;
//    }
//    public E top(){
//        if (isEmpty()) { return null; }
//        return data[size];
//    }
//    public void push(E e) throws IllegalArgumentException{
//        if (size() == data.length) { throw new IllegalArgumentException("Stack is full"); }
//        data[++size] = e;
//    }
//}
///*
//size O(1)
//isEmpty O(1)
//push O(1)
//pop O(1)
//top O(1)
// */
//class LinkedStack<E> implements Stack<E> {
//    private SLL<E> list = new SLL<>();
//
//    public int size() {
//        return list.size();
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//
//    public E top() {
//        return list.first();
//    }
//
//    public E pop() {
//        return list.removeFirst();
//    }
//
//    public void push(E e) {
//        list.addFirst(e);
//    }
//}
//class LStack<E> implements Stack<E> {
//    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
//    public int size() {
//        return list.size();
//    }
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//    public void push(E e){
//        list.addFirst(e);
//    }
//    public E top() {
//        return list.first();
//    }
//    public E pop() {
//        return list.removeFirst();
//    }
//}
//
//interface Queue<E> {
//    int size();
//
//    boolean isEmpty();
//
//    void enqueue(E e);
//
//    E dequeue();
//
//    E first();
//}
//
///*
//size O(1)
//isEmpty O(1)
//enqueue O(1)
//dequeue O(1)
//first O(1)
// */
//class LinkedQueue<E> implements Queue<E> {
//    private SLL<E> list = new SLL<>();
//
//    public int size() {
//        return list.size();
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//
//    public void enqueue(E e) {
//        list.addLast(e);
//    }
//
//    public E first() {
//        return list.first();
//    }
//
//    public E dequeue() {
//        return list.removeFirst();
//    }
//}
//class lQueue<E> implements Queue<E> {
//    private SinglyLinkedList<E> lList = new SinglyLinkedList<>();
//
//    public int size() { return lList.size(); }
//    public boolean isEmpty() { return lList.isEmpty(); }
//    public E first() {
//        return lList.first();
//    }
//    public E dequeue() {
//        return lList.removeFirst();
//    }
//    public void enqueue(E e){
//        lList.addLast(e);
//    }
//}
///*
//size O(1)
//isEmpty O(1)
//enqueue O(1)
//dequeue O(1)
//first O(1)
// */
//class ArrayQueue<E> implements Queue<E> {
//    private static final int CAPACITY = 1000;
//
//    private E[] data;
//    private int sz = 0;
//    private int f = 0;
//
//    public ArrayQueue() {
//        data = (E[]) new Object[CAPACITY];
//    }
//
//    public ArrayQueue(int cap) {
//        data = (E[]) new Object[cap];
//    }
//
//    public int size() {
//        return sz;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public void enqueue(E e) throws IllegalArgumentException {
//        if (sz == data.length) {
//            throw new IllegalArgumentException("Queue is full");
//        }
//        int avail = (f + sz) % data.length;
//        sz++;
//        data[avail] = e;
//    }
//
//    public E first() {
//        if (isEmpty()) {
//            return null;
//        }
//        return data[f];
//    }
//
//    public E dequeue() {
//        if (isEmpty()) {
//            return null;
//        }
//        E answer = data[f];
//        data[f] = null;
//        f = (f + 1) % data.length;
//        sz--;
//        return answer;
//    }
//}
//class AQueue<E> implements Queue<E> {
//    private static final int CAPACITY = 16;
//    private E[] data;
//    private int size = 0;
//    private int f = 0;
//
//    public AQueue(int cap){
//        data = (E[]) new Object[cap];
//    }
//    public AQueue(){ this(CAPACITY); }
//
//    public int size() { return size; }
//    public boolean isEmpty() { return size() == 0; }
//    public void enqueue(E e) throws IllegalArgumentException{
//        if (size == data.length) { throw new IllegalArgumentException("Queue is full");}
//        int avail = (f + size) % data.length;
//        data[avail] = e;
//        size++;
//    }
//    public E dequeue(){
//        if (isEmpty()) { return null; }
//        E answer = data[f];
//        f = (f + 1) % data.length;
//        data[f] = null;
//        size--;
//        return answer;
//    }
//    public E first() {
//        if (isEmpty()) { return null; }
//        return data[f];
//    }
//}
//interface Dequeue<E> {
//    int size();
//
//    boolean isEmpty();
//
//    void addFirst(E e);
//
//    void addLast(E e);
//
//    E first();
//
//    E last();
//
//    E removeFirst();
//
//    E removeLast();
//}
//
///*
//size O(1)
//isEmpty O(1)
//first O(1)
//last O(1)
//addFirst O(1)
//addLast O(1)
//removeFirst O(1)
//removeLast O(1)
//*/
//class LinkedDeque<E> implements Dequeue<E> {
//    private DLL<E> list = new DLL<>();
//
//    public int size() {
//        return list.size();
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//
//    @Override
//    public E first() {
//        return list.first();
//    }
//
//    public E last() {
//        return list.last();
//    }
//
//    public E removeFirst() {
//        return list.removeFirst();
//    }
//
//    public E removeLast() {
//        return list.removeLast();
//    }
//
//    public void addFirst(E e) {
//        list.addFirst(e);
//    }
//
//    public void addLast(E e) {
//        list.addLast(e);
//    }
//}
//
///*
//size O(1)
//isEmpty O(1)
//first O(1)
//last O(1)
//addFirst O(1)
//addLast O(1)
//removeFirst O(1)
//removeLast O(1)
//*/
//class ArrayDeque<E> implements Dequeue<E> {
//    private int CAPACITY = 1000;
//
//    private E[] data;
//    private int sz = 0;
//    private int f = 0;
//    private int l = 0;
//
//    public ArrayDeque(int cap) {
//        data = (E[]) new Object[cap];
//    }
//
//    public ArrayDeque() {
//        data = (E[]) new Object[CAPACITY];
//    }
//
//    public int size() {
//        return sz;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public E first() {
//        if (isEmpty()) {
//            return null;
//        }
//        return data[f];
//    }
//
//    public E last() {
//        if (isEmpty()) {
//            return null;
//        }
//        return data[l];
//    }
//
//    public void addFirst(E e) throws IllegalArgumentException {
//        if (sz == data.length) {
//            throw new IllegalArgumentException("Deque is full");
//        }
//        if (isEmpty()) {
//            data[f] = e;
//            sz++;
//        } else {
//            f = (f - 1 + data.length) & data.length;
//            data[f] = e;
//            sz++;
//        }
//    }
//
//    public void addLast(E e) throws IllegalArgumentException {
//        if (sz == data.length) {
//            throw new IllegalArgumentException("Deque is full");
//        }
//        if (isEmpty()) {
//            addFirst(e);
//        } else {
//            l = (l + 1) % data.length;
//            data[l] = e;
//            sz++;
//        }
//    }
//
//    public E removeFirst() {
//        if (isEmpty()) {
//            return null;
//        }
//        E element = data[f];
//        data[f] = null;
//        f = (f + 1) % data.length;
//        sz--;
//        return element;
//    }
//
//    public E removeLast() {
//        if (isEmpty()) {
//            return null;
//        }
//        E element = data[l];
//        data[l] = null;
//        l = (l - 1 + data.length) % data.length;
//        sz--;
//        return element;
//    }
//
//}
//
//interface List<E> extends Iterable<E> {
//    int size();
//
//    boolean isEmpty();
//
//    E get(int i) throws IllegalArgumentException;
//
//    E set(int i, E e) throws IllegalArgumentException;
//
//    void add(int i, E e) throws IllegalArgumentException;
//
//    void add(E e) throws IllegalArgumentException;
//
//    E remove(int i) throws IllegalArgumentException;
//}
//
///*
//size O(1)
//isEmpty O(1)
//get O(1)
//set O(1)
//add O(1)
//add(i, e) O(n)
//remove O(n)
// */
//class ArrayList<E> implements List<E>,Iterable<E> {
//    private E[] data;
//    private int size = 0;
//    private static final int CAPACITY = 16;
//
//    public ArrayList(int cap) {
//        data = (E[]) new Object[cap];
//    }
//
//    public ArrayList() {
//        data = (E[]) new Object[CAPACITY];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    protected void checkIndex(int i, int n) throws IllegalArgumentException {
//        if (i < 0 || i >= n) {
//            throw new IndexOutOfBoundsException("Illegal index " + i);
//        }
//    }
//
//    protected void resize(int capacity) {
//        E[] newData = (E[]) new Object[capacity];
//        for (int i = 0; i < size; i++) {
//            newData[i] = data[i];
//        }
//        data = newData;
//    }
//
//    public E get(int i) {
//        checkIndex(i, size);
//        return data[i];
//    }
//
//    public E set(int i, E element) {
//        checkIndex(i, size);
//        E tmp = data[i];
//        data[i] = element;
//        return tmp;
//    }
//
//    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalArgumentException {
//        checkIndex(i, size + 1);
//        if (size == data.length) {
//            resize(2 * data.length);
//        }
//        for (int k = size - 1; k >= i; k--) {
//            data[k + 1] = data[k];
//        }
//        data[i] = e;
//        size++;
//    }
//
//    public void add(E e) {
//        if (size == data.length) {
//            resize(2 * data.length);
//        }
//        data[size++] = e;
//
//    }
//
//    public E remove(int i) throws IndexOutOfBoundsException {
//        checkIndex(i, size);
//        E tmp = data[i];
//        for (int k = i; k < size - 1; k++) {
//            data[k] = data[k + 1];
//        }
//        data[size - 1] = null;
//        size--;
//        return tmp;
//    }
//    private class ArrayIterator implements Iterator<E> {
//        private int j = 0;
//        private boolean removable = false;
//
//        @Override
//        public boolean hasNext() throws IllegalArgumentException{
//            return j < size;
//        }
//        public E next() {
//            if (j == size()) { throw new IllegalArgumentException("Nothing left");}
//            return data[j++];
//        }
//    }
//    public Iterator<E> iterator() {
//        return new ArrayIterator();
//    }
//}
//
//interface Position<E> {
//    E getElement();
//}
//
//interface PositionalList<E> {
//    int size();
//
//    boolean isEmpty();
//
//    Position<E> first();
//
//    Position<E> last();
//
//    Position<E> before(Position<E> p) throws IllegalArgumentException;
//
//    Position<E> after(Position<E> p) throws IllegalArgumentException;
//
//    Position<E> addFirst(E e);
//
//    Position<E> addLast(E e);
//
//    Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
//
//    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
//
//    E set(Position<E> p, E e) throws IllegalArgumentException;
//
//    E remove(Position<E> p) throws IllegalArgumentException;
//}
//
///*
//size O(1)
//isEmpty O(1)
//first O(1)
//last O(1)
//before O(1)
//after O(1)
//addFirst O(1)
//addLast O(1)
//addAfter O(1)
//addBefore O(1)
//set O(1)
//remove O(1)
// */
//class LinkedPositionalList<E> implements PositionalList<E> {
//    protected static class Node<E> implements Position<E> {
//        private E element;
//        private Node<E> prev;
//        private Node<E> next;
//
//        public Node(E e, Node<E> prev, Node<E> next) {
//            this.element = e;
//            this.prev = prev;
//            this.next = next;
//        }
//
//        public E getElement() throws IllegalStateException {
//            if (next == null) {
//                throw new IllegalStateException("Position no longer valid");
//            }
//            return element;
//        }
//
//        public Node<E> getPrev() {
//            return prev;
//        }
//
//        public Node<E> getNext() {
//            return next;
//        }
//
//        public void setElement(E e) {
//            element = e;
//        }
//
//        public void setPrev(Node<E> p) {
//            prev = p;
//        }
//
//        public void setNext(Node<E> n) {
//            next = n;
//        }
//    }
//
//    private class PositionIterator implements Iterator<Position<E>> {
//        private Position<E> cursor = first(); // position of the next element to report
//        private Position<E> recent = null;
//
//
//        // position of last reported element
//        /**
//         * Tests whether the iterator has a next object.
//         * */
//        public boolean hasNext( ) { return (cursor != null); }
//
//        /**
//         * Returns the next position in the iterator.
//         * */
//        public Position<E> next( ) throws NoSuchElementException {
//            if (cursor == null) throw new NoSuchElementException("nothing left");
//            recent = cursor;
//            // element at this position might later be removed
//            cursor = after(cursor);
//            return recent;
//        }
//
//
//    }
//    //------------ end of nested PositionIterator class ------------
//
//    //---------------- nested PositionIterable class ----------------
//    private class PositionIterable implements Iterable<Position<E>> {
//        public Iterator<Position<E>> iterator() { return new PositionIterator(); }
//    }
//    //------------ end of nested PositionIterable class ------------
//
//    /**
//     *  Returns an iterable representation of the list's positions.
//     *  */
//    public Iterable<Position<E>> positions( ) {
//        return new PositionIterable();// create a new instance of the inner class
//    }
//
//    private Node<E> header;
//    private Node<E> trailer;
//    private int size = 0;
//
//    public LinkedPositionalList() {
//        header = new Node<>(null, null, null);
//        trailer = new Node<>(null, header, null);
//        header.setNext(trailer);
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
//        if (!(p instanceof Node)) {
//            throw new IllegalArgumentException("Invalid p");
//        }
//        Node<E> node = (Node<E>) p;
//        if (node.getNext() == null) {
//            throw new IllegalArgumentException("p is no longer in the list");
//        }
//        return node;
//    }
//
//    private Position<E> position(Node<E> node) {
//        if (node == header || node == trailer) {
//            return null;
//        }
//        return node;
//    }
//
//    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
//        Node<E> newest = new Node<>(e, pred, succ);
//        pred.setNext(newest);
//        succ.setPrev(newest);
//        size++;
//        return newest;
//    }
//
//    public Position<E> first() {
//        return position(header.getNext());
//    }
//
//    public Position<E> last() {
//        return position(trailer.getPrev());
//    }
//
//    public Position<E> before(Position<E> p) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        return position(node.getPrev());
//    }
//
//    public Position<E> after(Position<E> p) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        return position(node.getNext());
//    }
//
//    public Position<E> addFirst(E e) {
//        return addBetween(e, header, header.getNext());
//    }
//
//    public Position<E> addLast(E e) {
//        return addBetween(e, trailer.getPrev(), trailer);
//    }
//
//    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        return addBetween(e, node.getPrev(), node);
//    }
//
//    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        return addBetween(e, node, node.getNext());
//    }
//
//    public E set(Position<E> p, E e) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        E answer = node.getElement();
//        node.setElement(e);
//        return answer;
//    }
//
//    public E remove(Position<E> p) throws IllegalArgumentException {
//        Node<E> node = validate(p);
//        Node<E> predecessor = node.getPrev();
//        Node<E> successor = node.getNext();
//        predecessor.setNext(successor);
//        successor.setPrev(predecessor);
//        size--;
//        E answer = node.getElement();
//        node.setElement(null);
//        node.setNext(null);
//        node.setPrev(null);
//        return answer;
//    }
//}
//
//interface Tree<E> {
//    Position<E> root();
//    int numChildren(Position<E> p)  throws IllegalArgumentException;
//    Position<E> parent(Position<E> p) throws IllegalArgumentException;
//    boolean isInternal(Position<E> p) throws IllegalArgumentException;
//    boolean isExternal(Position<E> p) throws IllegalArgumentException;
//    Iterable<Position<E>> positions();
//    boolean isEmpty();
//    int size();
//    boolean isRoot(Position<E> p) throws IllegalArgumentException;
//    Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;
//}
//
//
//
//abstract class AbstractTree<E> implements Tree<E>{
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
//        return numChildren(p) == 0;
//    }
//    public boolean isInternal(Position<E> p) throws IllegalArgumentException {
//        return numChildren(p) > 0;
//    }
//    public boolean isRoot(Position<E> p) throws IllegalArgumentException {
//        return p == root();
//    }
//    public int depth(Position<E> p){
//        if (isRoot(p)) { return 0; }
//        return 1 + depth(parent(p));
//    }
//    public int height(Position<E> p) {
//        int h = 0;
//        for (Position<E> c: children(p)){
//            h = Math.max(h, 1 + height(c));
//        }
//        return h;
//    }
//    // preorder traversal
//    public Iterable<Position<E>> preorder(){
//        List<Position<E>> list = new ArrayList<>();
//        if (!isEmpty()){
//            preorderHelper(root(),list);
//        }
//        return list;
//    }
//    private void preorderHelper(Position<E> p, List<Position<E>> list){
//        list.add(p);
//        for (Position<E> c : children(p)){
//            preorderHelper(c,list);
//        }
//    }
//    public Iterable<Position<E>> postorder(){
//        List<Position<E>> list = new ArrayList<>();
//        if (!isEmpty()) {
//            postorderHelper(root(),list);
//        }
//        return list;
//    }
//    private void postorderHelper(Position<E> p, List<Position<E>> list){
//        for (Position<E> c : children(p)){
//            postorderHelper(c,list);
//        }
//        list.add(p);
//    }
//    public Iterable<Position<E>> breadFirst(){
//        Queue<Position<E>> queue = new LinkedQueue<>();
//        queue.enqueue(root());
//        List<Position<E>> list = new ArrayList<>();
//        while (!queue.isEmpty()){
//            Position<E> el = queue.dequeue();
//            list.add(el);
//            for (Position<E> p : children(el)){
//                queue.enqueue(p);
//            }
//        }
//        return list;
//    }
//}
//
//
//interface BinaryTree<E> extends Tree<E>{
//    Position<E> left(Position<E> p) throws IllegalArgumentException;
//    Position<E> right(Position<E> p) throws IllegalArgumentException;
//    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
//}
//
//abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
//    public Position<E> sibling(Position<E> p){
//        if (parent(p) == null) { return null; }
//        if (p == left(parent(p))) { return right(parent(p)); }
//        else { return left(parent(p)); }
//    }
//    public int numChildren(Position<E> p) throws IllegalArgumentException {
//        int count = 0;
//        if (left(p) != null) {
//            count++;
//        }
//        if (right(p) != null) {
//            count++;
//        }
//        return count;
//    }
//    public Iterable<Position<E>> children(Position<E> p){
//        List<Position<E>> list = new ArrayList<>();
//        if (left(p) != null) {
//            list.add(p);
//        }
//        if (right(p) != null) {
//            list.add(p);
//        }
//        return list;
//    }
//    public Iterable<Position<E>> inorder(){
//        List<Position<E>> list = new ArrayList<>();
//        if (!isEmpty()) {
//            inorderHelper(root(),list);
//        }
//        return list;
//    }
//    private void inorderHelper(Position<E> p,List<Position<E>> list) {
//        if (left(p) != null) {
//            inorderHelper(left(p),list);
//        }
//        list.add(p);
//        if (right(p) != null) {
//            inorderHelper(right(p),list);
//        }
//    }
//}
//class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
//
//    private static class Node<E> implements Position<E> {
//        private E element;
//        private Node<E> parent;
//        private Node<E> left;
//        private Node<E> right;
//
//        public Node(E element, Node<E> parent, Node<E> left, Node<E> right){
//            this.element = element;
//            this.parent = parent;
//            this.left = left;
//            this.right = right;
//        }
//
//        public E getElement() { return element; }
//        public Node<E> getParent() { return parent; }
//        public Node<E> getLeft() { return left; }
//        public Node<E> getRight() { return right; }
//
//        public void setElement(E e) { this.element = element; }
//        public void setParent(Node<E> parent) { this.parent = parent; }
//        public void setLeft(Node<E> left) { this.left = left; }
//        public void setRight(Node<E> right) { this.right = right; }
//
//    }
//
//    // util
//    private Node<E> createNode(E element, Node<E> parent, Node<E> left,Node<E> right) {
//        return new Node<>(element,parent,left,right);
//    }
//    private Node<E> validate(Position<E> p) throws IllegalArgumentException{
//        if (!(p instanceof Node)) { throw new IllegalArgumentException("Wrong Node");}
//        Node<E> node = (Node<E>) p;
//        if (node.getParent() == node) { throw new IllegalArgumentException("p is not in the tree anymore");}
//        return node;
//    }
//
//    private Node<E> root = null;
//    private int size = 0;
//
//    public LinkedBinaryTree() {}
//
//    public int size() { return size; }
//
//    public Position<E> root() {
//        return root;
//    }
//    public Position<E> parent(Position<E> p) throws IllegalArgumentException{
//        Node<E> node = validate(p);
//        return node.getParent();
//    }
//    public Position<E> left(Position<E> p) throws IllegalArgumentException{
//        Node<E> node = validate(p);
//        return node.getLeft();
//    }
//    public Position<E> right(Position<E> p) throws IllegalArgumentException{
//        Node<E> node = validate(p);
//        return node.getRight();
//    }
//    public Position<E> addRoot(E e) throws IllegalStateException{
//        if (!isEmpty()) { throw new IllegalStateException("Tree is not empty:"); }
//        root = createNode(e,null,null,null);
//        size = 1;
//        return root;
//    }
//    public Position<E> addLeft(Position<E> p, E e) throws IllegalStateException{
//        Node<E> parent = validate(p);
//        if (parent.getLeft() != null) { throw new IllegalStateException("p already has a left child");}
//        Node<E> child = new Node<>(e,parent,null,null);
//        parent.setLeft(child);
//        size++;
//        return child;
//    }
//    public Position<E> addRight(Position<E> p,E e) throws IllegalStateException{
//        Node<E> parent = validate(p);
//        if (parent.getRight() != null ) { throw new IllegalStateException("p already has a right child"); }
//        Node<E> child = createNode(e,parent,null,null);
//        parent.setRight(child);
//        size++;
//        return child;
//    }
//    public E set(Position<E> p, E e) throws IllegalStateException{
//        Node<E> node = validate(p);
//        E answer = node.getElement();
//        node.setElement(e);
//        return answer;
//    }
//    public E remove(Position<E> p) throws IllegalStateException{
//        Node<E> node = validate(p);
//        if (numChildren(p) == 2) { throw new IllegalStateException("p has two children"); }
//        Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());
//        if (child != null) {
//            child.setParent(node.getParent());
//        }
//        if (node == root()){
//            root = child;
//        }else {
//            Node<E> parent = node.getParent();
//            if (node == parent.getLeft()){
//                parent.setLeft(child);
//            }else {
//                parent.setRight(child);
//            }
//        }
//        size--;
//        E answer = node.getElement();
//        node.setElement(null);
//        node.setRight(null);
//        node.setLeft(null);
//        node.setParent(node);
//        return answer;
//    }
//    public void attach(Position<E> p, LinkedBinaryTree<E> T1, LinkedBinaryTree<E> T2)throws IllegalStateException{
//        Node<E> node = validate(p);
//        if (isInternal(p)) { throw new IllegalStateException("p must be a leaf"); }
//        size += T1.size() + T2.size();
//        if (!T1.isEmpty()){
//            T1.root.setParent(node);
//            node.setLeft(T1.root);
//            T1.root = null;
//            T1.size = 0;
//        }
//        if (!T2.isEmpty()) {
//            T2.root.setParent(node);
//            node.setRight(T2.root);
//            T2.root = null;
//            T2.size = 0;
//        }
//    }
//
//    private class ElementIterator implements Iterator<E> {
//        Iterator<Position<E>> posIterator = positions().iterator();
//        public boolean hasNext() { return posIterator.hasNext(); }
//        public E next() { return posIterator.next().getElement(); }
//        public void remove() { posIterator.remove(); }
//    }
//    public  Iterator<E> iterator() { return new ElementIterator(); }
//    public Iterable<Position<E>> positions() { return inorder(); }
//
//    //TODO
//    public void Modify(){
//        if (!isEmpty()){
//            modifyHelper(root());
//        }
//    }
//    public void modifyHelper(Position<E> p){
//        for (Position<E> c : children(p)){
//            modifyHelper(c);
//        }
//        if(right(p) != null) {
//            Integer sum = inorderSum(right(p),(int)p.getElement());
//            set(p,(E)sum);
//        }
//
//    }
//    public int inorderSum(Position<E> p,int sum){
//        if(left(p) != null){
//            inorderSum(left(p),sum);
//        }
//        sum += (int)p.getElement();
//        if (right(p) != null) {
//            inorderSum(right(p),sum);
//        }
//        return sum;
//    }
//}
//
//
//interface Entry<K,V> {
//    K getKey();
//    V getValue();
//}
//
//interface PriorityQueue<K,V> {
//    int size();
//    boolean isEmpty();
//    Entry<K,V> insert(K key,V value) throws IllegalArgumentException;
//    Entry<K,V> min();
//    Entry<K,V> removeMin();
//}
//
//class DefaultComparator<E> implements Comparator<E> {
//    public int compare(E a, E b) throws ClassCastException {
//        return ((Comparable<E>)a).compareTo(b);
//    }
//}
//
//abstract class AbstractPriorityQueue<K,V> implements PriorityQueue<K,V> {
//    public static class PQEntry<K,V> implements Entry<K,V> {
//        private K k;
//        private V v;
//        public PQEntry(K key,V value) {
//            k = key;
//            v = value;
//        }
//        public K getKey() { return k; }
//        public V getValue() { return v; }
//
//        protected void setKey(K key) { k = key; }
//        protected void setValue(V value) { v = value; }
//    }
//
//    private Comparator<K> comp;
//
//    protected AbstractPriorityQueue( Comparator<K> c) { comp = c; }
//    protected AbstractPriorityQueue() {this(new DefaultComparator<>());}
//
//    protected int compare(Entry<K,V> a, Entry<K,V> b) {
//        return comp.compare(a.getKey(),b.getKey());
//    }
//    protected boolean checkKey(K key) throws IllegalArgumentException {
//        try{
//            return (comp.compare(key,key) == 0);
//        }catch (ClassCastException e) {
//            throw new IllegalArgumentException("Incompatible key");
//        }
//    }
//
//    public boolean isEmpty() { return size() == 0; }
//}
//
//class UnsortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V>{
//    private LinkedPositionalList<Entry<K,V>> list = new LinkedPositionalList<>();
//
//    public UnsortedPriorityQueue() { super();}
//    public UnsortedPriorityQueue(Comparator<K> comp) { super(comp);}
//
//    private Position<Entry<K,V>> findMin(){
//        Position<Entry<K,V>> small = list.first();
//        for (Position<Entry<K,V>> walk : list.positions()){
//            if (compare(walk.getElement(),small.getElement())< 0){
//                small = walk;
//            }
//        }
//        return small;
//    }
//    public Entry<K,V> insert(K key,V value) throws IllegalArgumentException {
//        checkKey(key);
//        Entry<K,V> newest = new PQEntry<>(key,value);
//        list.addLast(newest);
//        return newest;
//    }
//    public Entry<K,V> min() {
//        if (list.isEmpty()) { return null; }
//        return findMin().getElement();
//    }
//    public Entry<K,V> removeMin() {
//        if (list.isEmpty()) { return null; }
//        return list.remove(findMin());
//    }
//    public int size() { return list.size(); }
//}
//
//
//class SortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {
//    private LinkedPositionalList<Entry<K,V>> list = new LinkedPositionalList<>();
//
//    public SortedPriorityQueue(Comparator<K> comp) {super(comp);}
//    public SortedPriorityQueue() { super(); }
//    public int size() { return size(); }
//
//    public Entry<K,V> min() {
//        if (list.isEmpty()) { return null; }
//        return list.first().getElement();
//    }
//    public Entry<K,V> removeMin() {
//        if (list.isEmpty()) { return null; }
//        return list.remove(list.first());
//    }
//    public Entry<K,V> insert(K key,V value) throws IllegalArgumentException{
//        checkKey(key);
//        Entry<K,V> newest = new PQEntry<>(key,value);
//        Position<Entry<K,V>> walk = list.last();
//        while (walk != null && compare(newest,walk.getElement()) < 0){
//            walk = list.before(walk);
//        }
//        if (walk == null) {
//            list.addFirst(newest);
//        }else {
//            list.addAfter(walk,newest);
//        }
//        return newest;
//    }
//}
//
//class HeapPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {
//
//    protected ArrayList<Entry<K,V>> heap = new ArrayList<>();
//
//    public HeapPriorityQueue() { super();}
//    public HeapPriorityQueue(Comparator<K> comp) {super(comp);}
//
//    protected int parent(int j) { return (j - 1) / 2; }
//    protected int left(int j) { return 2*j + 1; }
//    protected int right(int j) { return 2*j + 2; }
//    protected boolean hasLeft(int j) { return left(j) < heap.size(); }
//    protected boolean hasRight(int j) { return right(j) < heap.size(); }
//
//    protected void swap(int i,int j) {
//        Entry<K,V> temp = heap.get(i);
//        heap.set(i,heap.get(j));
//        heap.set(j,temp);
//    }
//    protected void upheap(int j){
//        while (j > 0){
//            int p = parent(j);
//            if (compare(heap.get(j),heap.get(p)) >= 0) { break; }
//            swap(j,p);
//            j = p;
//        }
//    }
//    protected void downHeap(int j) {
//        while (hasLeft(j)) {
//            int leftIndex = left(j);
//            int smallChildIndex = leftIndex;
//            if (hasRight(j)){
//                int rightIndex = right(j);
//                if (compare(heap.get(leftIndex),heap.get(rightIndex)) > 0){
//                    smallChildIndex = rightIndex;
//                }
//            }
//            if (compare(heap.get(smallChildIndex), heap.get(j)) >= 0) {
//                break;
//            }
//            swap(j,smallChildIndex);
//            j = smallChildIndex;
//        }
//    }
//
//    public int size() { return heap.size(); }
//    public Entry<K,V> min() {
//        if (heap.isEmpty()) { return null; }
//        return heap.get(0);
//    }
//    public Entry<K,V> insert(K key,V value) throws IllegalArgumentException {
//        checkKey(key);
//        Entry<K,V> newest = new PQEntry<>(key,value);
//        heap.add(newest);
//        upheap(heap.size() - 1);
//        return newest;
//    }
//    public Entry<K,V> removeMin() {
//        if (heap.isEmpty()) { return null; }
//        Entry<K,V> answer = heap.get(0);
//        swap(0,heap.size() - 1);
//        heap.remove(heap.size() - 1);
//        downHeap(0);
//        return answer;
//    }
//}
//
//
//
//
