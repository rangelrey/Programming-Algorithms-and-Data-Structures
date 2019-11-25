public class Data 
{
    private String origin;
    private String destination;
    private String ad;

    public Data (String origin,  String destination, String ad) {
        this.origin = origin;
        this.destination = destination;
        this.ad = ad;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getAd() {
        return ad;
    }
    
    public String toString() 
    {   String concat;
        concat = this.origin +"-" +this.destination+": \"" +this.ad +"\"";
        
        return concat;
    }
    
    
    
}
