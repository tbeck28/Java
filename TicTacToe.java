import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe {

    public static void main(String[] args){

        /*

        need to have a method to end the game whe1er player wins or win the board gets filled up
        need to have a way to check the progress of the game, where symbols are drawn and how many symbols
        are occupying a row/column
        probably use a normal array with 2 dimensions

        tips from the video:

        Methods:

        runGame = the game loop
        initializeGame = sets the cells of the 2d array to spaces
        printCurrentBoard = print whatever is in the current board
        getUserInput = gets the user input, and if valid, sets the game board accordingly
        cellAlreadyOccupied = returns true if a given cell(by row X column) is already occupied
        getWinner = returns an "x" or "o" if there is a clear winner, or " " a space is there is no winner yet, this can be optional
        isboardfull = returns if the board is full or not

        general details about main in programming

        keep the main class barebones, should just call the run game loop
        focus on one method at a time

        would i be using string methods to separate the two indexes?
        
         */


        // runningGame();
               

        initializeGame();
        
    } // end of main


    // building the board

    public static void runningGame(){

        boolean active = true;

        while(active){

            
            // fill with game function
            

            
        }
        
    }

    public static void initializeGame(){
        // i will possibly have to change the method type on this one, i think this method will deal with also placing the xs, and os
        // i should not have to, i should only be calling this method when i am setting up a 

        // turn this into a string
        
        int[][] newBoard = new int[3][3]; 

        for(int x = 0; x < newBoard.length;x++){
            for(int y = 0; y < newBoard[x].length;y++){
                newBoard[x][y] = 1;
            }}

            for(int[] arr: newBoard){
                for(int num: arr){
                    System.out.print(num + " ");
                }
                System.out.println();
            }

    } // end of initializeGame method
    

    public static void Board(){

        // hmm next thought is how the hell to i make these like, indexable?
        // how do i give these positions
        // use string methods probably
        // to use string methods i would have to assign values to the parts of the board
        // come back to this part when things are clear

        
    }
    
    
} // end of public class
