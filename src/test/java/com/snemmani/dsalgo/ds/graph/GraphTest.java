package com.snemmani.dsalgo.ds.graph;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class GraphTest {
    Graph graph = null;

    @Before
    public void setUp() {
        graph = new Graph(6);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
    }

    @Test
    public void testToString() {
        System.out.println(graph.toString());
        assertTrue(graph.toString().contains("2"));
    }
}
