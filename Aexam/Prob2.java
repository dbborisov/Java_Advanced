package Aexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;

        int size = Integer.parseInt(scanner.nextLine());
        int spaceShipRow = 0;
        int spaceShipCol = 0;
        List<Integer> holes = new ArrayList<>();


        String[][] matrix = new String[size][size]; //read the matrix row

        for (int row = 0; row < size; row++) {    //add matrix rows
            matrix[row] = scanner.nextLine().split("");
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col].equals("S")) {
                    spaceShipRow = row;
                    spaceShipCol = col;
                } else if (matrix[row][col].equals("O")) {
                    holes.add(row);
                    holes.add(col);
                }

            }
        }

        boolean isAlive = true;

        while (points < 50 && isAlive) {

            String move = scanner.nextLine();

            if (move.equals("up")) {

                if (isInBound(matrix, spaceShipRow - 1, spaceShipCol)) {
                    int star = 0;
                    if (matrix[spaceShipRow - 1][spaceShipCol].matches("[0-9]+")) {
                        star = Integer.parseInt(matrix[spaceShipRow - 1][spaceShipCol]);
                        points += star;
                    }
                    if (matrix[spaceShipRow - 1][spaceShipCol].equals("O")) {
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        matrix[spaceShipRow - 1][spaceShipCol] = "-";
                        holes.remove((spaceShipRow));
                        holes.remove((spaceShipCol));
                        spaceShipRow = holes.get(0);
                        spaceShipCol = holes.get(1);
                        matrix[spaceShipRow][spaceShipCol] = "S";
//                        int tempRol = holes.get(0);

                    } else {

                        matrix[spaceShipRow][spaceShipCol] = matrix[spaceShipRow - 1][spaceShipCol] = "S";
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        spaceShipRow -= 1;
                    }


                } else {
                    isAlive = false;
                    matrix[spaceShipRow][spaceShipCol] = "-";
                    break;
                }
//                    printMatrix(matrix);
//                    System.out.println();


            } else if (move.equals("left")) {
                if (isInBound(matrix, spaceShipRow, spaceShipCol - 1)) {
                    int star = 0;
                    if (matrix[spaceShipRow][spaceShipCol - 1].matches("[0-9]+")) {
                        star = Integer.parseInt(matrix[spaceShipRow][spaceShipCol - 1]);
                        points += star;
                    }
                    if (matrix[spaceShipRow][spaceShipCol - 1].equals("O")) {
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        matrix[spaceShipRow][spaceShipCol - 1] = "-";
                        holes.remove((spaceShipRow));
                        holes.remove((spaceShipCol));
                        spaceShipRow = holes.get(0);
                        spaceShipCol = holes.get(1);
                        matrix[spaceShipRow][spaceShipCol] = "S";
//                        int tempRol = holes.get(0);

                    } else {
                        matrix[spaceShipRow][spaceShipCol] = matrix[spaceShipRow][spaceShipCol - 1] = "S";
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        spaceShipCol -= 1;
                    }


                } else {
                    isAlive = false;
                    matrix[spaceShipRow][spaceShipCol ] = "-";
                    break;
                }

//                printMatrix(matrix);
//                System.out.println();
//                printField(field);

            } else if (move.equals("right")) {

                if (isInBound(matrix, spaceShipRow, spaceShipCol + 1)) {
                    int star = 0;
                    if (matrix[spaceShipRow][spaceShipCol + 1].matches("[0-9]+")) {
                        star = Integer.parseInt(matrix[spaceShipRow][spaceShipCol + 1]);
                        points += star;
                    }
                    if (matrix[spaceShipRow][spaceShipCol + 1].equals("O")) {
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        matrix[spaceShipRow][spaceShipCol + 1] = "-";
                        holes.remove((spaceShipRow));
                        holes.remove((spaceShipCol));
                        spaceShipRow = holes.get(0);
                        spaceShipCol = holes.get(1);
                        matrix[spaceShipRow][spaceShipCol] = "S";
//                        int tempRol = holes.get(0);

                    } else {
                        matrix[spaceShipRow][spaceShipCol] = matrix[spaceShipRow][spaceShipCol + 1] = "S";
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        spaceShipCol += 1;

                    }

                } else {
                    isAlive = false;
                    matrix[spaceShipRow][spaceShipCol ] = "-";
                    break;
                }
//                printMatrix(matrix);
//                System.out.println();
//                printField(field);

            } else if (move.equals("down")) {
                if (isInBound(matrix, spaceShipRow + 1, spaceShipCol)) {
                    int star = 0;
                    if (matrix[spaceShipRow + 1][spaceShipCol].matches("[0-9]")) {
                        star = Integer.parseInt(matrix[spaceShipRow + 1][spaceShipCol]);
                        points += star;
                    }
                    if (matrix[spaceShipRow + 1][spaceShipCol].equals("O")) {
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        matrix[spaceShipRow + 1][spaceShipCol] = "-";
                        holes.remove((spaceShipRow));
                        holes.remove((spaceShipCol));
                        spaceShipRow = holes.get(0);
                        spaceShipCol = holes.get(1);
                        matrix[spaceShipRow][spaceShipCol] = "S";
//                        int tempRol = holes.get(0);

                    } else {
                        matrix[spaceShipRow][spaceShipCol] = matrix[spaceShipRow + 1][spaceShipCol] = "S";
                        matrix[spaceShipRow][spaceShipCol] = "-";
                        spaceShipRow += 1;
                    }


                } else {
                    isAlive = false;
                    matrix[spaceShipRow ][spaceShipCol] = "-";
                    break;
                }
//                printMatrix(matrix);
//                System.out.println();
            }


        }
        if (!isAlive) {
            System.out.println("Bad news, the spaceship went to the void.");
        } else {
            System.out.println("Good news! Stephen succeeded in collecting enough star power!");
        }
        System.out.println(String.format("Star power collected: %d", points));
        printMatrix(matrix);

        System.out.println();


    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }

    private static boolean isInBound(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col;
    }
}
