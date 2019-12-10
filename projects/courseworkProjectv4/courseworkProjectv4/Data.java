public class Data<T> 
{
    private String region;
    private T dataItem;

    public Data (String region,  T dataItem) {
        this.region = region;

        this.dataItem = dataItem;
    }

    public String getRegion() {
        return this.region;
    }

    public T getDataItem() {
        return dataItem;
    }

    public String toString() 
    {   String concat;
        return concat = this.region +": \"" +this.dataItem +"\"";

    }

    
}
