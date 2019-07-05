package jedigalaxy;

public class Galaxy {
    private  int[][] galaxy ;
    private  int row;
    private  int col;



    public Galaxy(int row,int col) {

        this.row=row;
        this.col= col;

        int[][] matrix = new int[this.row][this.col];
        int value = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                matrix[i][j] = value++;
            }
        }
        this.galaxy = matrix;
    }

    public int[][] getGalaxy() {
        return galaxy;
    }

    public  int getLength(){
        return galaxy.length;
    }

   public void setGalaxyStars(int row,int col,int value){
        this.galaxy[row][col] = value;
   }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int galaxyPointofStar(int row,int col){

        return this.galaxy[row][col];
    }

}
