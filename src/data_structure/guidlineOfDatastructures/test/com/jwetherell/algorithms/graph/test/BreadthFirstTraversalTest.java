package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.graph.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Graph;
import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.graph.BreadthFirstTraversal;

public class BreadthFirstTraversalTest {

    private static final byte[][]                       adjacencyMatrix = new byte[4][4];
    static {
        // v0
        adjacencyMatrix[0][1] = 1;
        adjacencyMatrix[0][2] = 1;
        // v1
        adjacencyMatrix[1][2] = 1;
        // v2
        adjacencyMatrix[2][0] = 1;
        adjacencyMatrix[2][3] = 1;
        // v3
        adjacencyMatrix[3][3] = 1;
    }

    @Test
    public void test0() {
        final int[] result = BreadthFirstTraversal.breadthFirstTraversal(4, adjacencyMatrix, 2);
        Assert.assertTrue(result[0]==2);
        Assert.assertTrue(result[1]==0);
        Assert.assertTrue(result[2]==3);
        Assert.assertTrue(result[3]==1);
    }

    @Test
    public void test1() {
        final int[] result = BreadthFirstTraversal.breadthFirstTraversal(4, adjacencyMatrix, 0);
        Assert.assertTrue(result[0]==0);
        Assert.assertTrue(result[1]==1);
        Assert.assertTrue(result[2]==2);
        Assert.assertTrue(result[3]==3);
    }

    private static final List<Graph.Vertex<Integer>>    vertices    = new ArrayList<Graph.Vertex<Integer>>();
    private static final List<Graph.Edge<Integer>>      edges       = new ArrayList<Graph.Edge<Integer>>();

    private static final Graph.Vertex<Integer>          v0          = new Graph.Vertex<Integer>(0);
    private static final Graph.Vertex<Integer>          v1          = new Graph.Vertex<Integer>(1);
    private static final Graph.Vertex<Integer>          v2          = new Graph.Vertex<Integer>(2);
    private static final Graph.Vertex<Integer>          v3          = new Graph.Vertex<Integer>(3);

    static {
        vertices.add(v0);
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);

        edges.add(new Graph.Edge<Integer>(0, v0, v1));
        edges.add(new Graph.Edge<Integer>(0, v0, v2));
        edges.add(new Graph.Edge<Integer>(0, v1, v2));
        edges.add(new Graph.Edge<Integer>(0, v2, v0));
        edges.add(new Graph.Edge<Integer>(0, v2, v3));
        edges.add(new Graph.Edge<Integer>(0, v3, v3));
    }

    private static final Graph<Integer>                 graph       = new Graph<Integer>(Graph.TYPE.DIRECTED, vertices, edges);

    @Test
    public void test2() {
        final Graph.Vertex<Integer>[] result = BreadthFirstTraversal.breadthFirstTraversal(graph, v2);
        Assert.assertTrue(result[0].getValue()==2);
        Assert.assertTrue(result[1].getValue()==0);
        Assert.assertTrue(result[2].getValue()==3);
        Assert.assertTrue(result[3].getValue()==1);
    }

    @Test
    public void test3() {
        final Graph.Vertex<Integer>[] result = BreadthFirstTraversal.breadthFirstTraversal(graph, v0);
        Assert.assertTrue(result[0].getValue()==0);
        Assert.assertTrue(result[1].getValue()==1);
        Assert.assertTrue(result[2].getValue()==2);
        Assert.assertTrue(result[3].getValue()==3);
    }
}

