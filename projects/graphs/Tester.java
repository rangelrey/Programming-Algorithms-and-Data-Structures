
public class Tester
{
    public void main() {
        Graph<Integer> graph = new Graph<> ();
        GNode<Integer> node1 = graph.addNode (1);
        GNode<Integer> node2 = graph.addNode (2);
        GNode<Integer> node3 = graph.addNode (3);
        GNode<Integer> node4 = graph.addNode (4);
        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node1, node4);
        graph.addUndirectedLink (node2, node4);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);
    }
}
