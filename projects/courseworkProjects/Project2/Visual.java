public class Visual extends Exposition implements Contentable
{   String content;
    public Visual (String content, String title) {
        super(title);
        this.content = content;
        }
    public String getContent() {return this.imageProcess(content);}
    // our fake function that processes video/pictures to extract the relevant content
    public String imageProcess(String content){return this.content;}
}