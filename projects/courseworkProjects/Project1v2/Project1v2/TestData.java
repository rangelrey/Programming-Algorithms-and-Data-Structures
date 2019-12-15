public class TestData extends TestFramework{
        public static void main(){
        //Class instantiation. We create 2 Data Objects i.e 2 ads
        Data<String> ad0 = new Data("UK","ad0text");   
        Data<String> ad1 = new Data("FR","ad1text");

        //Check if get methods work properly:
        testEqualStrings(ad0.getRegion(),"UK");
        testEqualStrings(ad1.getDataItem(),"ad1text");

    }

}
