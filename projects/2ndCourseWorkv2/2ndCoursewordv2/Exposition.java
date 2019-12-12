public abstract class Exposition
{
    String title;

    public Exposition (String title){this.title= title;}
    public String getTitle() {return title;}
    public abstract String getContent();
    
    
    public String toString(){return this.title;}
}
