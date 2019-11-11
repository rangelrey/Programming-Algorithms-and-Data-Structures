
public class CalvNode
{  
    private boolean isSelfBald = true;
    private boolean isPartnerBald = false;

    public CalvNode(boolean self, boolean partner){
        this.isSelfBald= self;
        this.isPartnerBald = partner;
    
    }
    
    public boolean getChildGen(boolean isMan){

        if ( isMan)
            return this.isSelfBald ||  this.isPartnerBald;
        else 
            return this.isSelfBald &&  this.isPartnerBald;

        //return this.isSelfMan ? this.isSelfBald ||  this.isPartnerBald : this.isSelfBald &&  this.isPartnerBald 
    }


public static void  main(){

System.out.println("Go!");
    
    CalvNode ruye = new CalvNode(true,false);
    
    System.out.println(ruye.getChildGen(true));
        System.out.println(ruye.getChildGen(false));

    
    


}
}
