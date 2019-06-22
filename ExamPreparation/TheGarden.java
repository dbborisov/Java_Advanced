package ExamPreparation;

import java.util.Scanner;

public class TheGarden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowSize = Integer.parseInt(scanner.nextLine());
        int lettuce = 0;
        int potatoes = 0;
        int carrots = 0;
        int harmed = 0;

        String[][] matrix = new String[rowSize][];

        for (int row = 0; row < rowSize; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String line = "";
        while (!"End of Harvest".equals(line = scanner.nextLine())) {
            String[] command = line.split(" ");

            if (command[0].equals("Harvest")) {
                int row = Integer.parseInt(command[1]);
                int col = Integer.parseInt(command[2]);
                if (isInBound(matrix, row, col)) {
                    String harve = matrix[row][col];
                    if(harve.equals(" ")){
                        continue;
                    }
                    if (harve.equals("L")) {
                        lettuce++;

                    } else if (harve.equals("P")) {
                        potatoes++;
                    } else if (harve.equals("C")) {
                        carrots++;
                    }
                    matrix[row][col] = " ";
                }

            } else if (command[0].equals("Mole")) {
                int row = Integer.parseInt(command[1]);
                int col = Integer.parseInt(command[2]);
                String move = command[3];

                if (isInBound(matrix, row, col)) {
//                    boolean isEmpty = false;

                    if (move.equals("up")) {
                        while (isInBound(matrix,row,col)){
                            String forHarve =matrix[row][col];
                            if(!forHarve.equals(" ")){
                                harmed++;
                            }
                            matrix[row][col] =" ";
                            row -=2;

                        }

                    } else if (move.equals("down")) {
                        while (isInBound(matrix,row,col)){
                            String forHarve =matrix[row][col];
                            if(!forHarve.equals(" ")){
                                harmed++;
                            }
                            matrix[row][col] =" ";
                            row +=2;

                        }
                    } else if (move.equals("left")) {
                        while (isInBound(matrix,row,col)){
                            String forHarve =matrix[row][col];
                            if(!forHarve.equals(" ")){
                                harmed++;
                            }
                            matrix[row][col] =" ";
                            col -=2;

                        }
                    } else if (move.equals("right")) {
                        while (isInBound(matrix,row,col)){
                            String forHarve =matrix[row][col];
                            if(!forHarve.equals(" ")){
                                harmed++;
                            }
                            matrix[row][col] =" ";
                            col +=2;

                        }
                    }
                }

            }

        }

        printMatrix(matrix);
        System.out.println(String.format("Carrots: %d%nPotatoes: %d%nLettuce: %d%nHarmed vegetables: %d%n", carrots, potatoes, lettuce,harmed));
    }

    private static boolean isInBound(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && matrix[row].length > col;
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

}
