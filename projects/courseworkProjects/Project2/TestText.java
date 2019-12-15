public class TestText extends TestFramework
{
    public static void main(){
    
    Text holocaust = new Text("Explanation of the murder, torture and violence in concentration camps in WW2", "7");
        
    testEqualStrings(holocaust.getContent(),"Explanation of the murder, torture and violence in concentration camps in WW2");
    
    testEqualStrings(holocaust.getTitle(), "7");
}
    
}
