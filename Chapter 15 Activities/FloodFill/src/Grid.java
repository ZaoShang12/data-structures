import java.util.*;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> q = new Stack<>();
    int count = 1;
    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        q.push(new Pair(row, column));
        while(!q.isEmpty()){
            Pair p = q.pop();
            int r = p.getRow();
            int c = p.getColumn();
           
            if(within(r, c) && pixels[r][c] == 0){
               
                pixels[r][c] = count++;
                
                genCoord(r, c);
            }
           

        }
    }
    private boolean within(int row, int col){
        if(row >= 0 && row < 10 && col >= 0 && col < 10){
            return true;
        }
        return false;
    }
    private void genCoord(int row, int col){
        if (within(row, col - 1) && pixels[row][col - 1] == 0) q.push(new Pair(row, col - 1)); // Left (West)
        if (within(row - 1, col) && pixels[row - 1][col] == 0) q.push(new Pair(row - 1, col)); // Up (North)
        if (within(row + 1, col) && pixels[row + 1][col] == 0) q.push(new Pair(row + 1, col)); // Down (South)
        if (within(row, col + 1) && pixels[row][col + 1] == 0) q.push(new Pair(row, col + 1)); // Right (East)
        
      
        
    }
    
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%3d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
