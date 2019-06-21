package ExamPreparation;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class HelenaAbduction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        int parisRow = 0;
        int parisCol = 0;
        int helenaRow = 0;
        int helenaCol =0;

        String[][] matrix = new String[size][size];
        //fiel matrix
        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine();
            if(line.contains("P")){
                parisRow = row;
                parisCol = line.indexOf("P");
            }
            if(line.contains("H")){
                helenaRow = row;
                helenaCol = line.indexOf("H");
            }
            matrix[row]=line.split("");
        }

        //movement

        boolean isAbducted = false;
        while (energy>0 && !isAbducted){

            energy--;
            String[] line = scanner.nextLine().split("\\s+");
            String command = line[0];
            int enemyRow = Integer.parseInt(line[1]);
            int enemyCol = Integer.parseInt(line[2]);

            matrix[enemyRow][enemyCol] = "S";
            
            if(command.equals("up")){
                if(isInBound(matrix,parisRow-1,parisCol)){
                    if(matrix[parisRow-1][parisCol].equals("S")){
                        energy-=2;
                    }
                    if(matrix[parisRow-1][parisCol].equals("H")){
                        isAbducted=true;
                    }
                    matrix[parisRow][parisCol]="-";
                    parisRow--;
                    matrix[parisRow][parisCol] = "P";

                }

            }else if(command.equals("down")){
                if(isInBound(matrix,parisRow+1,parisCol)){
                    if(matrix[parisRow+1][parisCol].equals("S")){
                        energy-=2;
                    }
                    if(matrix[parisRow+1][parisCol].equals("H")){
                        isAbducted=true;
                    }
                    matrix[parisRow][parisCol]="-";
                    parisRow++;
                    matrix[parisRow][parisCol] = "P";

                }
            }else if(command.equals("left")){
                if(isInBound(matrix,parisRow,parisCol-1)){
                    if(matrix[parisRow][parisCol-1].equals("S")){
                        energy-=2;
                    }
                    if(matrix[parisRow][parisCol-1].equals("H")){
                        isAbducted=true;
                    }
                    matrix[parisRow][parisCol]="-";
                    parisCol--;
                    matrix[parisRow][parisCol] = "P";

                }
            }else if(command.equals("right")){
                if(isInBound(matrix,parisRow,parisCol+1)){
                    if(matrix[parisRow][parisCol+1].equals("S")){
                        energy-=2;
                    }
                    if(matrix[parisRow][parisCol+1].equals("H")){
                        isAbducted=true;
                    }
                    matrix[parisRow][parisCol]="-";
                    parisCol++;
                    matrix[parisRow][parisCol] = "P";

                }
            }



        }


        if(isAbducted ){
            matrix[parisRow][parisCol] = "-";
            System.out.println("Paris has successfully abducted Helen! Energy left: "+energy);
        }else{
            matrix[parisRow][parisCol]= "X";
            System.out.printf("Paris died at %d;%d.%n",parisRow,parisCol);
        }
        printMatrix(matrix);


    }

    private static boolean isInBound(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col;
    }


    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
