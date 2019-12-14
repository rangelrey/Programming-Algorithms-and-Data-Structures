
public class methodTesting
{
    public static void main(){
        //we create the ads (the data)
     
     Data ad0 = new Data("UK", "FR", "ad0text");   
     Data ad1 = new Data("FR", "UK", "ad1text");
     Data ad2 = new Data("FR", "BE", "ad2text");
     Data ad3 = new Data("US", "US", "ad3text");
        //we create the lists
     AdList list1 = new AdList();
     AdList subListToRemove = new AdList();
     
        // we join the ads into the list
     list1.join(ad0);
     list1.join(ad1);
     list1.join(ad2);
     list1.join(ad3);
     
     subListToRemove.join(ad0);
     subListToRemove.join(ad1);
     subListToRemove.join(ad2);
     
     
     System.out.println("\n The main list: "+list1);
     System.out.println("\n The list to remove: "+subListToRemove);
      System.out.println("\n The1st node of the main list: "+list1.getListNodeAd());
      System.out.println("\n The 3rd node of the list to remove: "+subListToRemove.getListNodeAd().getNext().getNext());
     

     System.out.println("Before deletion \n" +list1 +"\n \n");
     
     //list1.deleteItem(listNodetest);
     
     //System.out.println(list1.getListNodeAd());
   
     
     list1.deleteSubList(subListToRemove);
     
     System.out.println("After deletion of sublist \n" +list1);
     
        
    }
}
