package jedigalaxy;

public class Player {
    private long collectedStars;
    private int row;
    private int col;


    public Player() {
        this.collectedStars = 0;

    }

    public long getCollectedStars() {
        return collectedStars;
    }

    public void setCollectedStars(int collectedStars) {
        this.collectedStars += collectedStars;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int[] row) {
        this.row = row[0];
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int[] col) {
        this.col = col[1];
    }
    public void setCol(int col) {
        this.col = col;
    }
    public  void playerMove(Galaxy galaxy, Player player) {
        while ((player.getRow() >= 0 && player.getCol() < galaxy.getCol())) {
            if (player.getRow() < galaxy.getRow() && player.getCol() >= 0 && player.getCol() < galaxy.getCol()) {
                player.setCollectedStars(galaxy.galaxyPointofStar(player.getRow(), player.getCol()));
            }

            player.setRow(player.getRow() - 1);
            player.setCol(player.getCol() + 1);

        }
    }
}


