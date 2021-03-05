import java.util.ArrayList;
import java.util.List;

public class Spacefloor {

  private Replyer[][] floor;

  public Spacefloor(int rows, int cols) {
    floor = new Replyer[rows][cols];

  }

  public int GetColumns() {
    return floor[0].length;

  }

  public int GetRows() {
    return floor.length;

  }

  public Replyer getReplyer(int row, int col) {
    return floor[row][col];

  }

  public void SetReplyer(int row, int col, Replyer x) {
    floor[row][col] = x;

  }

  public boolean checkavailableSpace(int row, int col)
  {
               
       if( ((row-1)>=0)&& floor[row-1][col]!=null)
       {
         return true;
       }else if(row+1<this.GetRows()&&floor[row+1][col]!=null){
         return true;
       }else if( (col-1>=0)&& floor[row][col-1]!=null){
         return true;
       }else if((col+1)<this.GetColumns()&&floor[row][col+1]!=null){
         return true;
       }
       else
       return false;

       }

}
