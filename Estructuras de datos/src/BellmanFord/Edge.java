package BellmanFord;

public class Edge {
	
	private double weight;
    private Vertex startVertex;
    private Vertex  targetVertex;
    
    
    
	public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}
	
	
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the startVertex
	 */
	public Vertex getStartVertex() {
		return startVertex;
	}
	/**
	 * @param startVertex the startVertex to set
	 */
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	/**
	 * @return the targetVertex
	 */
	public Vertex getTargetVertex() {
		return targetVertex;
	}
	/**
	 * @param targetVertex the targetVertex to set
	 */
	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
    
    
}
