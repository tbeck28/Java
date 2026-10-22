import java.util.Scanner;

public class Scratchpaper {

    
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        String input;


        int[][] newBoard = new int[3][3];  // creating a 3d array, 3 rows, 3 columns

        // for(int x = 0; x < newBoard.length;x++){ // 
        //     for(int y = 0; y < newBoard[x].length;y++){
        //         newBoard[x][y] = 1;
        //     }}

        //     for(int[] arr: newBoard){
        //         for(int num: arr){
        //             System.out.print(num + " ");
        //         }
        //         System.out.println();
        //     } // end of for loop
            
            // lets try to use user input to add to the array
            // to get both inputs take the numbers, convert them to strings, separate them using the string methods, then convert them back to a number and assign values accordinly
            
            System.out.println("To select a move, enter your first number, then space, type yout second number");
            input = user.nextLine(); //THIS IS A STRING NOT AN INT!

            System.out.println(input.getClass());

            // assignments for array position should be done up here before turning it into an int, use string methods
             String x;
             String y;

            // convert the string into a int
            // int userin = 1;
            
            int y = Integer.parseInt(input);
            System.out.println(y + 5); // this comes back as an int
            
            // int x;
            
            // x = input.charAt(0);
            // y = input.charAt(1);
            // System.out.println(x);
            // System.out.println(y);

            
            // while(userin > 0){


                // newBoard[x][y] = 1;
                // System.out.println(newBoard);

                
            // }

            
    } // end of main
    
}

/*

check in summary:

so my plan is that i can take user input, then split the 2 numbers that im given into an x and y and assign them to the 3d array
to keep a user from making the same move i can create an array of previous values that have been used, i just need to figure out
how to check each value in the carray

 */