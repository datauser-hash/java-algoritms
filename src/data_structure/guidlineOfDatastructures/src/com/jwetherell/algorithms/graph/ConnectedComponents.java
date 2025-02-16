package data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Graph;
import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Graph.Edge;
import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Graph.Vertex;
import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Graph;

/**
 * In graph theory, a connected component (or just component) of an undirected graph is a subgraph in which any two vertices are connected to each 
 * other by paths, and which is connected to no additional vertices in the supergraph. A vertex with no incident edges is itself a connected 
 * component. A graph that is itself connected has exactly one connected component, consisting of the whole graph.
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Connected_component_(graph_theory)">Connected Components (Wikipedia)</a>
 * <br>
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class ConnectedComponents {

    private ConnectedComponents() { }

    /**
     * Finds the connected components subsets of the Graph.
     * 
     * @param g Graph to find connected components.
     * @return List of connected components in the Graph.
     */
    public static final <T extends Comparable<T>> List<List<Graph.Vertex<T>>> getConnectedComponents(Graph<T> graph) {
        if (graph == null)
            throw new IllegalArgumentException("Graph is NULL.");

        if (graph.getType() != Graph.TYPE.DIRECTED)
            throw new IllegalArgumentException("Cannot perform a connected components search on a non-directed graph. graph type = "+graph.getType());

        final Map<Graph.Vertex<T>,Integer> map = new HashMap<Graph.Vertex<T>,Integer>();
        final List<List<Graph.Vertex<T>>> list = new ArrayList<List<Graph.Vertex<T>>>();

        int c = 0;
        for (Graph.Vertex<T> v : graph.getVertices())
            if (map.get(v) == null)
                visit(map, list, v, c++);
        return list;
    }

    private static final <T extends Comparable<T>> void visit(Map<Graph.Vertex<T>,Integer> map, List<List<Graph.Vertex<T>>> list, Graph.Vertex<T> v, int c) {
        map.put(v, c);

        List<Graph.Vertex<T>> r = null;
        if (c == list.size()) {
            r = new ArrayList<Graph.Vertex<T>>();
            list.add(r);
        } else {
            r = list.get(c);
        }
        r.add(v);

        if (v.getEdges().size() > 0) {
            boolean found = false;
            for (Graph.Edge<T> e : v.getEdges()) {
                final Graph.Vertex<T> to = e.getToVertex();
                if (map.get(to) == null) {
                    visit(map, list, to, c);
                    found = true;
                }
                if (found)
                    break;
            }
        }
    }
}
