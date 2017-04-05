package com.program.datastructure.graphs2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<V> {
	// Vertex i.e; V gets mapped to all the connecting nodes
	Map<V, List<Node<V>>> adjacencyList;
	int verticalCount;
	int edgeCount;

	public Graph() {
		super();
		this.adjacencyList = new HashMap<>();
	}

	/**
	 * Add a new node for the given vertex. Vertex to node connection forms
	 * Edge.
	 * 
	 * @param vertex
	 * @param node
	 */
	public void addNewNode(V vertex, Node<V> node) {
		List<Node<V>> nodes = adjacencyList.get(vertex);
		if (nodes == null || nodes.isEmpty()) {
			nodes = new ArrayList<Node<V>>();
			nodes.add(node);
		} else {
			nodes.add(node);
		}
		adjacencyList.put(vertex, nodes);
	}

	public boolean hasRelationship(V v1, V v2) {
		if (v1 == null && v2 == null) {
			return true;
		}
		if (v1 != null && v2 == null) {
			return true;
		}

		if (v1 == null && v2 != null) {
			return false;
		}

		List<Node<V>> nodes = null;

		if (adjacencyList.containsKey(v1)) {
			nodes = adjacencyList.get(v1);
			if (nodes != null && !nodes.isEmpty()) {
				for (Node<V> node : nodes) {
					if (node.getName().equals(v2)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public void print() {
		Set<V> vertices = adjacencyList.keySet();
		for (V v : vertices) {
			System.out.println(v + "----" + adjacencyList.get(v));
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Graph<String> graph = new Graph<String>();
		graph.addNewNode("Bangalore", new Node<String>("SFO", 10));
		graph.addNewNode("Bangalore", new Node<String>("HongKong", 50));
		graph.addNewNode("Bangalore", new Node<String>("LA", 70));
		graph.addNewNode("LA", new Node<String>("SFO", 20));
		graph.addNewNode("HongKong", new Node<String>("LA", 10));

		graph.print();
		
		System.out.println("Path between Bangalore and LA exist ??");
		System.out.println(graph.hasRelationship("Bangalore", "LA"));
		
		System.out.println("Main method ended");
	}
}
