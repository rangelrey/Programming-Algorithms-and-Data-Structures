public abstract class Exposition
{   //parent class of audible, text & visual
    //shares the common method getTitle() since get title is common for all subclasses
    // titles are always text
    String title;

    public Exposition (String title){this.title= title;}
    public String getTitle() {return title;}
    public abstract String getContent();
    
    
    public String toString(){return this.title;}
}
