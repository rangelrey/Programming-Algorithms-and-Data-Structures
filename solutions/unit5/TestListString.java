
public class TestListString
{
    public static void main (String[] args) 
    {
        ListString ls = new ListString ();

        System.out.println ("Empty list: " + ls);

        ls.join ("first item");
        ls.join ("middle item");
        ls.join ("last item");

        System.out.println ("Full list: " + ls);

        ls.insert ("second item", 1);

        System.out.println ("Revised list: " + ls);

    }
}
