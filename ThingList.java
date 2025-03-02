import java.util.LinkedList;
import java.util.List;

public class ThingList
{
    private List<Thing> things;

    public ThingList()
    {
        things = new LinkedList<>();
    }

    public void add(Thing t)
    {
        things.add(t);
    }

    public void moveAll()
    {
        for(Thing t : things)
        {
            t.move();
        }
    }

    public void printAll()
    {
        for(Thing t : things)
        {
            System.out.println(t.row + " " + t.col + " " + t.lab);
        }
        System.out.println("done");
        System.out.flush();
    }

}
