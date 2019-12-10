public class Text extends Exposition implements Contentable
{   String content;
    
    public Text (String content, String title) {
        super(title);
        
        this.content = content;
        }

    public String getContent() {return this.naturalLanguageProcessing(content);}
    
    public String naturalLanguageProcessing(String content){return this.content;}

}