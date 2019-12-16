public class Audible extends Exposition implements Contentable
{   String content;  
    public Audible (String content, String title) {
        super(title);   
        this.content = content;
        }
    public String getContent() {return this.speechRecognition(content);}
    // our fake function that processes audio to extract the relevant content
    public String speechRecognition(String content){return this.content;}
}
