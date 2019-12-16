public class AllTestsRunner
    // in this class we run all tests at once. 
    //note that the student is aware of more testing sophisicated methods but it is using this module level complexity
{   //notice that some tests have some print statements inbetween, this is done for pure visualization purposes
    public static void main(){
    System.out.println("\n- Testing Tree class");    
    TestTree.main();
    System.out.println("\n- Testing TreeNode class"); 
    TestTreeNode.main();
    System.out.println("\n- Testing ListNode class"); 
    TestListNode.main();
    System.out.println("\n- Testing List class"); 
    TestList.main();
    System.out.println("\n- Testing Data class"); 
    TestData.main();
    System.out.println("\n- Testing ClassifyAds class"); 
    TestClassifyAds.main();
        
        
        
        
    }
}
