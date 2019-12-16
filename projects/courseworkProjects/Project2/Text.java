public class Text extends Exposition implements Contentable
{   String content;
    public Text (String content, String title) {
        super(title);
        this.content = content;
        }
        
        //we need this info to determine whether the exposition contains contnent that the user wants to avoid or not
    public String getContent() {return this.naturalLanguageProcessing(content);}
    
    // our fake function that processes text to extract the relevant content
    public String naturalLanguageProcessing(String content){return this.content;}
}