package ExamPreparation;

import java.util.Scanner;

public class HelenAbduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int energy = Integer.parseInt(scanner.nextLine());

        int size = Integer.parseInt(scanner.nextLine());
        int parisRow = 0 ;
        int parisCol = 0;
        int helenaRow = 0;
        int helenaCol  = 0;

        String[][] field = new String[size][size]; //read the matrix row


        for (int row = 0; row < size; row++) {    //add matrix rows
            field[row] = scanner.nextLine().split("");
        }

        //helena and paris position in matrix
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(field[row][col].equals("P")){
                    parisRow = row;
                    parisCol = col;
                }
                if(field[row][col].equals("H")){
                    helenaRow = row;
                    helenaCol = col;
                }
            }
        }
//        boolean isEscape = false;
//    if(helenaCol==parisCol&&helenaRow == parisRow){
//        isEscape=true;
//    }

        boolean isParisAlive = true;


        while (isParisAlive){
            String[] input = scanner.nextLine().split("\\s+");
            String move = input[0];
            int rowSparta = Integer.parseInt(input[1]);
            int colSparta = Integer.parseInt(input[2]);
            if(rowSparta>=0 && rowSparta<size&& colSparta>=0&& colSparta<size) {
                field[rowSparta][colSparta] = "S";
            }

            if(move.equals("up")){

                    if(parisRow>0) {
                        String enemy = field[parisRow-1][parisCol];
                        if(enemy.equals("S")){
                            energy-=2;
                        }
                        field[parisRow][parisCol] = field[parisRow - 1][parisCol] = "P";
                        field[parisRow][parisCol] = "-";
                        parisRow -= 1;
                    }
//                    printField(field);
//                    System.out.println();
                    energy--;

            }else if(move.equals("left")){
                if(parisCol>0) {
                    String enemy = field[parisRow][parisCol - 1];
                    if(enemy.equals("S")){
                        energy-=2;
                    }
                    field[parisRow][parisCol] = field[parisRow][parisCol - 1] = "P";
                    field[parisRow][parisCol] = "-";
                    parisCol -= 1;
                }
//                printField(field);
                energy--;
            }else if(move.equals("right")){
                if(parisCol<size-1) {
                    String enemy = field[parisRow][parisCol + 1];
                    if(enemy.equals("S")){
                        energy-=2;
                    }
                    field[parisRow][parisCol] = field[parisRow][parisCol + 1] = "P";
                    field[parisRow][parisCol] = "-";
                    parisCol += 1;
                }
//                printField(field);
                energy--;
            }else if(move.equals("down")){
                if(parisRow>size-1) {
                    String enemy = field[parisRow+1][parisCol];
                    if(enemy.equals("S")){
                        energy-=2;
                    }
                    field[parisRow][parisCol] = field[parisRow + 1][parisCol ] = "P";
                    field[parisRow][parisCol] = "-";
                    parisRow += 1;
                }
//                printField(field);
                energy--;
            }
//            if(parisRow == rowSparta && parisCol == colSparta){
//                field[parisRow][parisCol] = "P";
//                energy-=2;
//            }
             if( parisRow == helenaRow && parisCol == helenaCol){
                field[parisRow][parisCol] = "-";
                System.out.println("Paris has successfully abducted Helen! "+"Energy left: "+ energy);

                printField(field);
                break;
            }
             if(energy <= 0){
                isParisAlive =false;
                field[parisRow][parisCol] = "X";
            }


        }
        if(!isParisAlive){
            System.out.println(String.format("Paris died at %d;%d.",parisRow,parisCol));
            printField(field);
        }

    }

    private static void printField(String[][] field) {
        for (int r = 0; r < field.length ; r++) {
            for (int c = 0; c < field[r].length ; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();
        }
    }

}
