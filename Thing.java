public class Thing 
{
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';

    public void move();

    public void step() 
    {
        // change of direction of column
        final int[] dc = {0, 1, 0, -1};
        // change of direction of row
        final int[] dr = {1, 0, -1, 0};

        // update position
        row += dr[dir];
        col += dc[dir];
    }
}
