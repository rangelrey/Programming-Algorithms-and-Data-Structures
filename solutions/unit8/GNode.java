  public class GNode<T> {
    private T value;
    private List<GNode<T>> links;

    public GNode (T value) {
      this.value = value;
      links = new List<GNode<T>> ();
    }
    
    public T getValue () {
        return value;
    }

    public void addLink (GNode<T> to) {
      links.join (to);
    }

    public void removeLink (GNode<T> to) {
        links.deleteItem (to);
    }
    
    // the node has neighbours if its links are not empty
    public boolean hasNeighbours () {
        return !links.isEmpty ();
    }
    
    // returns the first link
    // -- assumes the list of links is not empty
    public GNode<T> firstLink () {
        return links.get (0);
    }
    
    public int countNodes (List<GNode<T>> visited) {
        int sum = 0;
        
        if (!visited.contains(this)) {
            visited.join (this);
            sum += 1;
        }
        
        for (int i=0; i<links.size(); i += 1) {
            GNode<T> child = links.get(i);
            if (!visited.contains(child)) {
                sum += child.countNodes (visited);
            }
        }
        
        return sum;
    }
  }