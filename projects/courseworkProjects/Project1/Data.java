public class Data<T> 
{   // this class' purpose is storage
    // it stores the region of the element (ad, node...) and a generic Item 
    private String region;
    private T dataItem;

    public Data (String region,  T dataItem) {
        this.region = region;
        this.dataItem = dataItem; // will be used as a string for the adtext creation or as a list in the treenode
    }

    public String getRegion() {
        return this.region;
    }

    public T getDataItem() {
        return dataItem;
    }
    //we do a special print to be more visible
    public String toString() 
    {   String concat;
        return concat = this.region +": \"" +this.dataItem +"\"";

    }

    
}
