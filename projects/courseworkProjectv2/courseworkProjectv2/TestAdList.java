
public class TestAdList
{
    public static void main(){
        
     Data ad0 = new Data("UK", "FR", "ad0text");   
        Data ad1 = new Data("FR", "UK", "ad1text");
        Data ad2 = new Data("FR", "BE", "ad2text");
        Data ad3 = new Data("US", "US", "ad3text");
        Data ad4 = new Data("IN", "IN", "ad4text");
        Data ad5 = new Data("US", "US", "ad5text");
        Data ad6 = new Data("UK", "BE", "ad6text"); 
        Data ad7 = new Data("UK", "FR", "ad7text"); 
        Data ad8 = new Data("UK", "UK", "ad8text"); 
        Data ad9 = new Data("Europe", "Europe", "ad9text"); 
        Data ad10 = new Data("Europe", "Europe", "ad10text"); 
        Data ad11 = new Data("Europe", "Europe", "ad11text"); 
        Data ad12 = new Data("Europe", "Europe", "ad12text"); 
        Data ad13 = new Data("America", "America", "ad13text"); 
        Data ad14 = new Data("Asia", "Asia", "ad14text"); 
        Data ad15 = new Data("Asia", "Asia", "ad15text"); 

        AdList startingList = new AdList();
        AdList worldList = new AdList();
        AdList europeList = new AdList();
        AdList asiaList = new AdList();
        AdList americaList = new AdList();
        AdList ukList = new AdList();
        AdList frList = new AdList();
        AdList nlList = new AdList();
        AdList usList = new AdList();
        AdList inList = new AdList();
        AdList beList = new AdList();
        AdList brList = new AdList();

     
        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
        startingList.join(ad3);
        startingList.join(ad4);
        startingList.join(ad5);
        startingList.join(ad7);
        startingList.join(ad8);
        startingList.join(ad9);
        startingList.join(ad10);
        startingList.join(ad11);
        startingList.join(ad12);
        startingList.join(ad13);
        startingList.join(ad14);
        startingList.join(ad15);    
        
        
        
       startingList.showAdList();
        
    }
    
    
}
