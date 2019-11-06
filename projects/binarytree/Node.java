public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node (T data) {     // <1>
        this.data = data;

        this.leftChild = null;
        this.rightChild = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void  setLeftChild(Node<T> node){
        leftChild = node;
    }

    public void  setRightChild(Node<T> node){
        rightChild = node;
    }

    public String toString(){
        return "Data: " + data.toString();  
    }

    public int countNodes () {
        int sum = 0;
        System.out.println ("Counting nodes for node: " + this.data);
        sum += 1;                           // <1>
        if (leftChild != null) {            // <2>
            sum += leftChild.countNodes ();   // <3>
        }
        if (rightChild != null) {           // <4>
            sum += rightChild.countNodes ();  // <5>
        }

        return sum;
    }

}