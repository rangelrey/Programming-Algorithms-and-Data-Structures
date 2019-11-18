
public class Tester
{
        public static void main(String[] args){
            
            SortedTree<String> tree = new SortedTree<> ();

        tree.add ("A");
        tree.add ("B");
        tree.add ("C");
        tree.add ("D");
        tree.add ("E");

        tree.showTree();
        System.out.println(tree.size ());
         
    }
    

        
    
    
}
