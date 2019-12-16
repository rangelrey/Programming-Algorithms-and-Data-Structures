
public class TestListNode extends TestFramework
{
    public static void main(){

        // create ads
        Data<String> ad0 = new Data<String>("IN",  "ad0text");
        Data<String> ad1 = new Data<String>("IN", "ad1text"); 
        Data<String> ad2 = new Data<String>("IN", "ad2text"); 

        // instantiatel list
        ListNode<Data> ListNode2 = new ListNode(null, ad2);
        ListNode<Data> ListNode1 = new ListNode(ListNode2, ad1);
        ListNode<Data> ListNode0 = new ListNode(ListNode1, ad0);

        testEqualListNode(ListNode0.getNext(), ListNode1);

        ListNode0.setNext(ListNode2); 
        testEqualListNode(ListNode0.getNext(), ListNode2);
        
        
        testEqualData(ListNode0.getItem(), ad0);
        

    }

    
}
   
