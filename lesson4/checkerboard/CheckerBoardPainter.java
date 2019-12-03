// BlueJ project: lesson4/checkerboard
// Video: Checkerboard

public class CheckerBoardPainter
{
    /**
     * Computes the color of a square on a checkerboard.
     * The top left corner is blue.
     * Spaces are red(1) if one of the coordinates is even and the other is odd
     * Spaces are blue(0) if both coordinates are even
     * Spaces are blue if both coordinates are odd
     * 
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint
     */
    public int getColor(int row, int col)
    {
        int r=0;
        if (row%2==0&&col%2==0) {
            r=0;
        }
        
        else if (row%2==1&&col%2==1) {
            r=0;
        }
        else if ((row%2)+(col%2)==1) {
            r=1;
        }
        return r;
    }
}
