public class GraphNode<T> {
    private T value;
    private List<GraphNode<T>> links;

    public GraphNode (T value) {
      this.value = value;
      links = new List<GraphNode<T>> ();
    }
    
    public T getValue () {
        return value;
    }

    public void addLink (GraphNode<T> to) {
      links.join (to);
    }

    public void removeLink (GraphNode<T> to) {
        links.deleteItem (to);
    }
    
    // the node has neighbours if its links are not empty
    public boolean hasNeighbours () {
        return !links.isEmpty ();
    }
    
    // returns the first link
    // -- assumes the list of links is not empty
    public GraphNode<T> firstLink () {
        return links.get (0);
    }
    
    public int countNodes (List<GraphNode<T>> visited) {
        int sum = 0;
        
        if (!visited.contains(this)) {
            visited.join (this);
            sum += 1;
        }
        
        for (int i=0; i<links.size(); i += 1) {
            GraphNode<T> child = links.get(i);
            if (!visited.contains(child)) {
                sum += child.countNodes (visited);
            }
        }
        
        return sum;
    }
  }
