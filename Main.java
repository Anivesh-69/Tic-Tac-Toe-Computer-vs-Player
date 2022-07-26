package com.company1;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGameWithComputer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        //printBoard(board);
        printBoardWithNum();
        while (true) {
            playerTurn(board, scanner);
            if (isGameFinished(board)){
                break;
            }
            printBoard(board);

            computerTurn(board);
            if (isGameFinished(board)){
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }


    private static boolean isGameFinished(char[][] board) {

        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }

        if (hasContestantWon(board, 'O')) {
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }

        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("game status: Draw!");
        return true;
    }


    private static boolean hasContestantWon(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }


    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int compMove;

        while (true) {

            if(board[0][0] == 'X' && board[0][1] == 'X'){
                compMove=3;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][0] == 'X' && board[0][2] == 'X'){
                compMove=2;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][0] == 'X' && board[1][1] == 'X'){
                compMove=9;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][0] == 'X' && board[2][2] == 'X'){
                compMove=5;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][0] == 'X' && board[1][0] == 'X'){
                compMove=7;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][0] == 'X' && board[2][0] == 'X'){
                compMove=4;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][0] == 'X' && board[1][1] == 'X'){
                compMove=6;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][0] == 'X' && board[1][2] == 'X') {
                compMove = 5;
                if (isValidMove(board, Integer.toString(compMove))) {
                    break;
                }
            }

            if(board[2][0] == 'X' && board[1][0] == 'X'){
                compMove=1;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][2] == 'X' && board[0][2] == 'X'){
                compMove=9;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }}
            if(board[1][2] == 'X' && board[2][2] == 'X'){
                compMove=3;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][2] == 'X' && board[1][0] == 'X'){
                compMove=4;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][2] == 'X' && board[0][0] == 'X'){
                compMove=1;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][2] == 'X' && board[1][0] == 'X'){
                compMove=7;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][2] == 'X' && board[2][0] == 'X'){
                compMove=5;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][1] == 'X' && board[2][1] == 'X'){
                compMove=6;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][1] == 'X' && board[2][1] == 'X'){
                compMove=5;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[0][1] == 'X' && board[1][1] == 'X'){
                compMove=8;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][1] == 'X' && board[2][1] == 'X'){
                compMove=2;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][1] == 'X' && board[2][0] == 'X'){
                compMove=3;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[1][1] == 'X' && board[2][2] == 'X'){
                compMove=1;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[2][0] == 'X' && board[2][1] == 'X'){
                compMove=9;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            if(board[2][0] == 'X' && board[2][2] == 'X'){
                compMove=8;
                if(isValidMove(board, Integer.toString(compMove))){
                    break;
                }

            }
            else if(board[2][2] == 'X' && board[2][1] == 'X') {
                compMove = 7;
            }


            else{compMove = rand.nextInt(9) + 1;
            }
            if (isValidMove(board, Integer.toString(compMove))) {
                break;
            }
        }
        System.out.println("Computer chose " + compMove);
        placeMove(board, Integer.toString(compMove), 'O');
    }


    private static boolean isValidMove (char[][] board, String position) {
        return switch (position) {
            case "1" -> (board[0][0] == ' ');
            case "2" -> (board[0][1] == ' ');
            case "3" -> (board[0][2] == ' ');
            case "4" -> (board[1][0] == ' ');
            case "5" -> (board[1][1] == ' ');
            case "6" -> (board[1][2] == ' ');
            case "7" -> (board[2][0] == ' ');
            case "8" -> (board[2][1] == ' ');
            case "9" -> (board[2][2] == ' ');
            default -> false;
        };
    }

    private static void playerTurn(char[][] board, Scanner scanner) {
        String PlayerMove;
        while (true) {
            System.out.println("Enter Your Move:");
            PlayerMove = scanner.nextLine();
            if (isValidMove(board, PlayerMove)){
                break;
            } else {
                System.out.println(PlayerMove + " is not a valid move.");
            }
        }
        placeMove(board, PlayerMove, 'X');
    }


    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(":(");
        }
    }




    private static void printBoard(char[][] board) {
        System.out.print((board[0][0]));
        System.out.print("|");
        System.out.print((board[0][1]));
        System.out.print("|");
        System.out.println((board[0][2]));
        System.out.print((board[1][0]));
        System.out.print("|");
        System.out.print((board[1][1]));
        System.out.print("|");
        System.out.println((board[1][2]));
        System.out.print((board[2][0]));
        System.out.print("|");
        System.out.print((board[2][1]));
        System.out.print("|");
        System.out.println((board[2][2]));

    }

    private static void printBoardWithNum() {

        System.out.print("1|");
        System.out.println("2|3");
        System.out.print("4|");
        System.out.println("5|6");
        System.out.print("7|");
        System.out.println("8|9");

    }
}

