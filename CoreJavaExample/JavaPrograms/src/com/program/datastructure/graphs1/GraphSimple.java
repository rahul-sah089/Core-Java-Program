package com.program.datastructure.graphs1;

import java.util.List;

public class GraphSimple<V> {
	private List<Vertex<V>> vertices;
	private List<Edge<V>> edges;

	public List<Vertex<V>> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex<V>> vertices) {
		this.vertices = vertices;
	}

	public List<Edge<V>> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge<V>> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return "GraphSimple [vertices=" + vertices + ", edges=" + edges + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edges == null) ? 0 : edges.hashCode());
		result = prime * result + ((vertices == null) ? 0 : vertices.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphSimple other = (GraphSimple) obj;
		if (edges == null) {
			if (other.edges != null)
				return false;
		} else if (!edges.equals(other.edges))
			return false;
		if (vertices == null) {
			if (other.vertices != null)
				return false;
		} else if (!vertices.equals(other.vertices))
			return false;
		return true;
	}

}
