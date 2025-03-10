import java.util.Random;

public class TypeC extends Thing
{
    // make spiral
    private Random rand = new Random(System.currentTimeMillis());
    // 0:right, 1:left
    protected int chosenDirection = rand.nextInt(2);
    // Change of total steps
    protected int change = 1;
    // Total number of steps in current direction
    protected int totalSteps = 1;
    // Number of steps that need to be taken in current direction before a change of direction
    protected int leftOverSteps = 1;

    // Override
    public void move()
    {
        if(leftOverSteps==0)
        {
            if(change % 2==0)
            {
                totalSteps++;
            }
            // turn Right
            if(chosenDirection == 0)
            {
                dir = (dir + 1) % 4;
            }
            // turn Left
            else if(chosenDirection ==1)
            {
                dir = (dir + 3) % 4;
            }
            leftOverSteps = totalSteps;
            change++;
        }
        step();
        leftOverSteps--;
    }
    
}
