package BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Edge> adjacenciesList;
	private double minDistance = Double.MAX_VALUE;
	private Vertex previousVertex; // predecessor

	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}

	public void addEdge(Edge edge) {
		this.adjacenciesList.add(edge);
	}

	/**
	 * @return the visited
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * @param visited the visited to set
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * @return the minDistance
	 */
	public double getMinDistance() {
		return minDistance;
	}

	/**
	 * @param minDistance the minDistance to set
	 */
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	/**
	 * @return the previusVertex
	 */
	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	/**
	 * @param previuosVertex the previusVertex to set
	 */
	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	/**
	 * @return the adjacenciesList
	 */
	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	public String toString() {
		return this.name;
	}

	

	



}
