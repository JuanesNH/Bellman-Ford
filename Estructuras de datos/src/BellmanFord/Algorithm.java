package BellmanFord;

import java.util.List;

public class Algorithm {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Algorithm(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}
	
	public void shortestPath(Vertex sourceVertex, Vertex targetVertex) {
		
		sourceVertex.setMinDistance(0);
		
		for(int i = 0; 1 < this.vertexList.size()-1;i++) {
			
			for(Edge edge : this.edgeList) {
				
				if (edge.getStartVertex().getMinDistance() == Double.MAX_VALUE) continue;
				
				Vertex v = edge.getStartVertex();
				Vertex u = edge.getTargetVertex();
				
				double newDistance = v.getMinDistance() + edge.getWeight();
				
				if(newDistance < u.getMinDistance() ) {
					
					u.setMinDistance(newDistance);
					u.setPreviousVertex(v);
					
					
				}
				
			}
		}
		
		for (Edge edge : this.edgeList) {
			if ( edge.getStartVertex().getMinDistance() != Double.MAX_VALUE ) {
				if( hasCycle(edge) ) {
					System.out.println("There is a negative cycle...");
				}
			}
		}
		
	}

	private boolean hasCycle(Edge edge) {
	   return ( edge.getStartVertex().getMinDistance() + edge.getWeight() ) < edge.getTargetVertex().getMinDistance();
	   
	}
	

}
