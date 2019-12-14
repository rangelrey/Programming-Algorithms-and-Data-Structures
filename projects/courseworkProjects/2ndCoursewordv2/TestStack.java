
public class TestStack extends TestFramework
{
    public static void main(){
    
    Stack newStack = new Stack();
    
    newStack.push("a");

    //test if the string "a" was added into the stack
    testEqualBooleans (newStack.isEmpty(),false);
    newStack.push("b");
    //test if we pop the last item that was added
    testEqualStrings((String) newStack.pop(),"b");
    

    
}
    
}
