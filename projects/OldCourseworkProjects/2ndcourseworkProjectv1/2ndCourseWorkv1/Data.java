public class Data<T> 
{
    private String string;
    private int integer;

    public Data (String string,  int integer) {
        this.string = string;

        this.integer = integer;
    }

    public String getString() {
        return this.string;
    }

    public int getInteger() {
        return integer;
    }

    public String toString() 
    {   String concat;
        return concat = this.string +": \"" +this.integer +"\"";

    }

    
}
