package com.program.datastructure.graphs1;

public class Edge<V> {
	private Vertex<V> source;
	private Vertex<V> destination;
	int weight;

	public Edge(Vertex<V> source, Vertex<V> destination, int weight) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public Vertex<V> getSource() {
		return source;
	}

	public void setSource(Vertex<V> source) {
		this.source = source;
	}

	public Vertex<V> getDestination() {
		return destination;
	}

	public void setDestination(Vertex<V> destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source + ", destination=" + destination + ", weight=" + weight + "]";
	}

}
