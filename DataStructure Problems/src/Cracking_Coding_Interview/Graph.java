package Cracking_Coding_Interview;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	public Vertex[] vertices;
	int no_vertices = 0;
	int no_edges = 0;
	private GraphType graphtype;
	
	Graph(int Vertices, GraphType type) {
		this.no_vertices = Vertices;
		this.graphtype = type;
		vertices = new Vertex[Vertices];
		for (int i = 0;i<Vertices;i++) {
			vertices[i] = new Vertex();
		}
	}

	public Vertex[]	 returnArray()
	{
		return vertices;
	}
	
	void addedges(Vertex v1, Vertex v2) {
		//vertices = new Vertex[6];
		if (graphtype==GraphType.Directed) {
			v1.addadjacent(v2);
			no_edges++;
		}
		else {
			v1.addadjacent(v2);
			v2.addadjacent(v1);
			no_edges += 2;
		}
		
		
	}
	
	Vertex[] getVertices() {
		return vertices;
	}

	Vertex getVertex(int i) {
		return vertices[i];
	}
}

