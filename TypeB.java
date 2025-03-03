import java.util.Random;

public class TypeB extends Thing
{
    public int timeSinceLast;
    public TypeB()
    {
        this.isTypeB = true;
    }

    // Override
    public void move()
    {
        timeSinceLast++;
        if(timeSinceLast==10)
        {
            timeSinceLast=0;
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

            step();
        }
    }
}
