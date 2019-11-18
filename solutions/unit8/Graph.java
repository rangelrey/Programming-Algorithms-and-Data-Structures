public class Graph<T> {
    private List<GNode<T>> nodes;

    public Graph () {
        nodes = new List<GNode<T>> ();
    }

    public GNode<T> addNode (T value) {
        GNode<T> newNode = new GNode<> (value);
        nodes.join (newNode);
        return newNode;
    }

    public void addUndirectedLink (GNode<T> from, GNode<T> to) {
        from.addLink (to);
        to.addLink (from);
    }
    
    public void addDirectedLink (GNode<T> from, GNode<T> to) {
        from.addLink (to);
    }

    public void removeUndirectedLink (GNode<T> from, GNode<T> to) {
        from.removeLink (to);
        to.removeLink (from);
    }

    public int size () {
        if (nodes.size () > 0) {
            return nodes.get(0).countNodes (new List<GNode<T>> ());
        } else {
            return 0;
        }
    }

    // Returns an Eulerian Circuit
    // -- uses Hierholzer's algorithm
    // -- always uses first node when given a choice, so deterministic
    //    (exercise: modify the 'get(0)' and 'firstLink' steps to return
    //     a random node)
    public List<T> getCircuit () {
        Stack<GNode<T>> stack = new Stack<> ();
        List<T> circuit = new List<> ();

        if (nodes.size () > 0) {
            GNode<T> v = nodes.get (0); // take the first node
            while (v.hasNeighbours () || !stack.isEmpty ()) {
                if (v.hasNeighbours ()) {
                    stack.push (v);
                    GNode<T> w = v.firstLink ();
                    removeUndirectedLink (v, w);
                    v = w;
                } else {
                    circuit.join (v.getValue ());
                    v = stack.pop ();
                }
            }
        }

        return circuit;
    }
    

}