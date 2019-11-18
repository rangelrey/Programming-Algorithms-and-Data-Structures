public class GNode<T> {
private T value;
private List<GNode<T>> links;
public GNode (T value) {
this.value = value;
links = new List<GNode<T>> ();
}
public void addLink (GNode<T> to) {
links.join (to);
}

public boolean isEven () {
int n = links.size ();
return n%2 == 0;
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