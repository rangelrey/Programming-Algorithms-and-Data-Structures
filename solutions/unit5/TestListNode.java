
public class TestListNode
{
    // this method returns a listnode, so you can examine the list structure
    public static ListNode test () {
        ListNode lastItem = new ListNode (null, "last item");       
        ListNode middleItem = new ListNode (lastItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");   

        return firstItem;
    }

    // this method shows the effect of joining an item to the list
    public static void test2 () {
        ListNode lastItem = new ListNode (null, "last item");
        ListNode middleItem = new ListNode (lastItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");
        System.out.println ("Start list: " + firstItem.toString ());

        ListNode myList = firstItem;
        myList.join ("new last item");
        System.out.println ("New list: " + myList.toString ());   
    }   

    // this method shows the effect of set/get
    public static void test3 () {
        ListNode lastItem = new ListNode (null, "last item");
        ListNode middleItem = new ListNode (lastItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");
        System.out.println ("Start list: " + firstItem.toString ());

        System.out.println ("Item at index 1: " + firstItem.get (1));
        firstItem.set("changed value", 1);
        System.out.println ("New list: " + firstItem.toString ());   
    }
    
        // this method shows the effect of inserting and deleting an item to the list
    public static void test4 () {
        ListNode lastItem = new ListNode (null, "last item");
        ListNode middleItem = new ListNode (lastItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");
        System.out.println ("Start list: " + firstItem.toString ());

        ListNode myList = firstItem.insert ("New Item", 1);
        System.out.println ("New list: " + myList.toString ());  
        
        myList.delete (1);
        System.out.println ("Revised list: " + myList.toString ());
    } 
}
