package com.snemmani.dsalgo.ds.graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph(int size) {
        this.adjacencyList = new ArrayList<ArrayList<Integer>>(size);
        for(int index=0; index<size; index++) {
            this.adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(Integer element1, Integer element2) {
        adjacencyList.get(element1).add(element2);
        adjacencyList.get(element2).add(element1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int index=0; index<adjacencyList.size(); index++) {
            builder.append("Adj List for Vertex: "+ index + " ");
            builder.append("head ");
            for (int index2=0; index2<adjacencyList.get(index).size(); index2++) {
                builder.append(" -> " +  adjacencyList.get(index).get(index2));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
