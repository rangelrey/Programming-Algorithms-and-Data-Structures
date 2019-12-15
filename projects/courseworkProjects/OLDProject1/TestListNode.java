
public class TestListNode extends TestFramework
{
    public static void main(){

        // create ads
        Data<String> ad0 = new Data("IN",  "ad0text");
        Data<String> ad1 = new Data("IN", "ad1text"); 
        Data<String> ad2 = new Data("IN", "ad2text"); 

        // instantiatel list
        ListNode ListNode2 = new ListNode(null, ad2);
        ListNode ListNode1 = new ListNode(ListNode2, ad1);
        ListNode ListNode0 = new ListNode(ListNode1, ad0);

        testEqualListNode(ListNode0.getNext(), ListNode1);

        ListNode0.setNext(ListNode2); 
        testEqualListNode(ListNode0.getNext(), ListNode2);
        
        Data a = (Data) ListNode0.getItem();
        
        testEqualData(a,ad0);
        

    }

    
}
   
