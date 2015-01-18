package Cracking_Coding_Interview;



public class GraphSimple {
	int V;				 // number of Vertices in Graph
	int E;				 // number of edges in Graph
	int[][] adjMatrix;   // adjacent matrix which holds all edges in 2d integer array
	GraphType graphtype; // GraphType can be directed or undirected
	
	/**
	 * 
	 * @param Vertices total number of Vertices
	 * @param Edges total number of Edges
	 * @param type of Graph
	 */
	GraphSimple(int Vertices, int Edges, GraphType type) {
		this.V = Vertices;
		this.E = Edges;
		this.graphtype = type;
		adjMatrix = new int[V][V];
	}
	
	/**
	 * 
	 * @param Vertices total number of Vertices
	 * @param type of Graph
	 */
	GraphSimple(int Vertices, GraphType type) {
		this.V = Vertices;
		this.graphtype = type;
		adjMatrix = new int[V][V];
	}
	
	void addEdges(int v1,int v2) {
		if (graphtype == GraphType.Directed) {
			adjMatrix[v1][v2] = 1;
		}
		else {
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
	}
	
}

