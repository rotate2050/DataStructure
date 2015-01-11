package Cracking_Coding_Interview;

import java.util.LinkedList;

public class Tree_2 {

	public static boolean search(Graph g,Vertex start,Vertex end) {  
        LinkedList<Vertex> q = new LinkedList<Vertex>();
        for (Vertex u : g.getVertices()) {
            u.state = NodeState.Unvisited;
        }
        start.state = NodeState.Visiting;
        q.add(start);
        Vertex u;
        while(!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
	            for (Vertex v : u.getadjacent()) {
	                if (v.state == NodeState.Unvisited) {
	                    if (v == end) {
	                        return true;
	                    } else {
	                        v.state = NodeState.Visiting;
	                        q.add(v);
	                    }
	                }
	            }
	            u.state = NodeState.Visited;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6,GraphType.Directed);
		
		g.addedges(g.vertices[0], g.vertices[1]);
		g.addedges(g.getVertex(0), g.getVertex(2));
		g.addedges(g.getVertex(0), g.getVertex(3));
		g.addedges(g.getVertex(3), g.getVertex(4));
		g.addedges(g.getVertex(3), g.getVertex(1));
		Vertex start = g.getVertex(0);
		Vertex end = g.getVertex(5);
		System.out.println(search(g, start, end));
	}

}
