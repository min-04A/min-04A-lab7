import java.util.Random;

public class TypeA extends Thing
{
    public void move()
    {
        Random rand = new Random(System.currentTimeMillis());
        int i = rand.nextInt(3);
        // 0:straight, 1:right, 2:left

        if(i==1)
        {
            dir = (dir + 1) % 4;
        }
        
        else if (i==2)
        {
            dir = (dir + 3) % 4;
        }
    }
}
