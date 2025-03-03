import java.util.LinkedList;
import java.util.List;

public class ThingList
{
    private Node head;

    public ThingList()
    {
        this.head = null;
    }

    public void add(Thing t)
    {
        Node newNode = new Node(t);
        newNode.next = head;
        head = newNode;
    }

    public void moveAll()
    {
        Node present = head;
        while(present != null)
        {
            present.data.move();
            present = present.next;
        }
    }

    public void printAll()
    {
        Node present = head;
        while(present != null)
        {
            System.out.println(present.data.row + " " + present.data.col + " " + present.data.lab);
            present = present.next;
        }
        System.out.println("done");
        System.out.flush();
    }

}
