import java.util.*;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> q = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int count = 0;
        q.push(new Pair(row, column));
        Pair currentPair;
        while (q.size()>0){
            currentPair = q.pop();
            if (pixels[currentPair.getRow()][currentPair.getCol()] == 0){
                count++;

            pixels[currentPair.getRow()][currentPair.getCol()] = count;
            if (currentPair.getRow()>0)
            q.push(new Pair(currentPair.getRow()-1, currentPair.getCol()));
            if (currentPair.getCol()<9)
            q.push(new Pair(currentPair.getRow(), currentPair.getCol()+1));
            if (currentPair.getRow()<9)
            q.push(new Pair(currentPair.getRow()+1, currentPair.getCol()));
            if (currentPair.getCol()>0)
            q.push(new Pair(currentPair.getRow(), currentPair.getCol()-1));
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}