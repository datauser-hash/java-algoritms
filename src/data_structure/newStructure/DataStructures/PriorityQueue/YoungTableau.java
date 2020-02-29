package data_structure.newStructure.DataStructures.PriorityQueue;

import data_structure.newStructure.DataStructures.DefaultComparator;
import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.Comparator;

public class YoungTableau<E> {


    private int capacity;
    private int[][] table;
    private int size = 0;
    private Pair<Integer,Integer> lastRow = new Pair<>(0,0);
    private Pair<Integer,Integer> lastColumn = new Pair<>(0,0);
    private Comparator<E> comp = new DefaultComparator<>();

    // constructors
    public YoungTableau(int capacity){
        this.capacity = capacity;
        table = new int[capacity][capacity];
    }
    public YoungTableau(){
        this(1);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    private void amortize(){
        int newCapacity = capacity + 1;
        int[][] table2 = new int[newCapacity][newCapacity];
        int i = 0, j = 0;
        for (i = 0;i < capacity; i++){
            for (j = 0; j < capacity; j++){
                table2[i][j] = table[i][j];
            }
        }
        table = table2;
    }

    public void insert(int element){
        if (isEmpty()){
            table[0][0] = element;
            size++;
            return;
        }
        if (size == capacity * capacity){
            amortize();
        }
        for (int i = 0; i < capacity; i++){
            for (int j = 0; j < capacity; j++){
                if (table[i][j] == git ){
                    table[i][j] = element;
                    insertFixup(i,j);
                    size++;
                    return;
                }
            }
        }
    }

    public void insertFixup(int i, int j){
        while (i >= 0 || j >= 0){
            int up = i - 1;
            int left = j - 1;

            int d = i; // keep original row
            int f = j; // keep original column
            if (up >= 0 && comp.compare(table[i-1][j], table[i][j]) > 0){
                i = i - 1;
            }
            if (left >= 0 && comp.compare(table[i][j - 1],table[i][j]) > 0){
                j = j-1;
                i = d; // if change happened then restored
            }
            // case 1 change with up
            if (d != i){
                E tmp = table[i][j];
                table[i][j] = table[d][f];
                table[d][f] = tmp;
            }else if (f != j){
                E tmp = table[i][j];
                table[i][j] = table[d][f];
                table[d][f] = tmp;s
            }else{
                break;
            }
        }
    }


    public void printTable(){
        for (int i = 0; i < capacity; i++){
            for (int j = 0; j < capacity; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        YoungTableau<Integer> tab = new YoungTableau<>(3);

        tab.insert(3);
        tab.printTable();
        System.out.println();
        tab.insert(7);
        tab.printTable();
        tab.insert(2);
        System.out.println();
        tab.insert(8);
        tab.printTable();
        tab.insert(4);
        System.out.println();
        tab.insert(1);
        tab.printTable();
        tab.insert(6);
        System.out.println();
        tab.insert(5);

        tab.printTable();
    }
}
