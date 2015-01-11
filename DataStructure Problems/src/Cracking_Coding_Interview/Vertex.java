package Cracking_Coding_Interview;

import java.util.ArrayList;

public class Vertex {
	String nodename;
    NodeState state;
	private ArrayList<Vertex> adjacent = new ArrayList<Vertex>();
	
	ArrayList<Vertex> getadjacent() {
		return this.adjacent;
	}
	
	NodeState getNodeState() {
		return this.state;
	}
	void addadjacent(Vertex v) {
		this.adjacent.add(v);
	}
}

