public class GNode<T> {
    private T data;
    private List<GNode<T>> links;
    public GNode (T data) {
        this.data = data;
        links = new List<GNode<T>> ();
    }
    public T getData () {return data;}

    public List<GNode<T>> getLinks(){ return links;}
    public void addLink (GNode<T> to) {
        links.join (to);
    }

    public void removeLink (GNode<T> to) {
        links.deleteItem (to);
    }

    public void disconnect(){
        List<GNode<T>> newLinks = new List<GNode<T>> ();
        this.links = newLinks;
    }
    // the node has neighbours if its links are not empty
    public boolean hasNeighbours () {
        return !links.isEmpty ();
    }// returns the first link
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
    public int getDegree(){
        return links.size();}

    public String toString(){
        Exposition exposition = (Exposition) this.getData();
        String title= (String) exposition.getTitle();
        return title;
    }



}