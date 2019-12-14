public class TestFramework
{ //This class contains the common test methods
    public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   
            System.out.println("Test was successful!");
        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    } 

    public static void testEqualData (Data result, Data expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

    public static void testEqualInt (int result, int expected) {
        if (result == expected) {   // Since int is not an object, we cannot use the method equals and in strings
            System.out.println("Test was successful!");
        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

    public static void testEqualLists (List result, List expected){
        if (result.size()==expected.size()){
            for (int i=0; i<result.size(); i++){
                if (!result.get(i).equals(expected.get(i))){
                    System.out.println ( "Error: the result " + result + " does not equal the expected " + expected);
                    break;
                };
            }
            System.out.println("Test was successful");
        }
        else {

            System.out.println ( "Error: the result " + result + " does not equal the expected " + expected);
        }}

    public static void testEqualBooleans (boolean result, boolean expected) {
        if (result == expected) {
            System.out.println("The test was successful");
        } else {
            System.out.println ( "Error: the result " + result + " does not equal the expected " + expected);
        }
    }
    
    public static void testEqualTreeNodes (TreeNode result, TreeNode expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

}
