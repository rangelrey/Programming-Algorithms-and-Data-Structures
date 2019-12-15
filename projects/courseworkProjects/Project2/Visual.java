public class Visual extends Exposition implements Contentable
{   String content;
    public Visual (String content, String title) {
        super(title);
        this.content = content;
        }
    public String getContent() {return this.imageProcess(content);}
    
    public String imageProcess(String content){return this.content;}
}