public class Node<T>
{ T data;
    Node leftChild;
    Node rightChild;

    public Node(T data){
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;   
    }

    public Node getLeftChild(){
        return leftChild;}

    public Node getRightChild(){
        return rightChild;   
    }
    
    public T getData(){
     return data;   
    }
    
      // a mutator method for the left child
    public void setLeftChild (Node<T> node) {
        leftChild = node;
    }

    // a mutator method for the right child
    public void setRightChild (Node<T> node) {
        rightChild = node;
    }

    public static void main(){
        Node<String> a = new Node<>("d");
        
    }
    
    public int countNodes(){
        int sum =0;
        sum++;
        if (leftChild!=null){
           
           sum += leftChild.countNodes();
        }
        
         if (rightChild!=null){
            sum++;
           sum += rightChild.countNodes();
        }
        
        return sum;

    }
    
    public String toString()
    { return "Data "+data.toString();
        
    }
}
