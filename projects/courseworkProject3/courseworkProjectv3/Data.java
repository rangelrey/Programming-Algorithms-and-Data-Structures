public class Data 
{
    private String region;
    private String adText;

    public Data (String region,  String adText) {
        this.region = region;

        this.adText = adText;
    }

    public String getRegion() {
        return region;
    }


    public String getAdText() {
        return adText;
    }
    
    public String toString() 
    {   String concat;
        concat = this.region +": \"" +this.adText +"\"";
        
        return concat;
    }
    
    
    
}
