/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

// Importet pattern enum so every time it is used here it will not be required
// to write 'pattern."PATTERN".value'
//import static exercicios.desafio02.Pattern.*;
import java.util.Random;

/**
 *
 * @author Erick-S
 */

// Should receive a (random) value between 1 and 6 and generate a char[3][3]
// array with the faces of a die
// TODO: function to print something based on the die and value, and not
// fixed values?
public class desafio02 {
    
    /*
    
     * Dice faces, where ' is null:
    
     * 1
    
        [ ' ' ' ]
        [ ' X ' ]
        [ ' ' ' ]
    
     * 2
    
        [ X ' ' ]
        [ ' ' ' ]
        [ ' ' X ]
    
     * 3
    
        [ X ' ' ]
        [ ' X ' ]
        [ ' ' X ]
    
     * 4
    
        [ X ' X ]
        [ ' ' ' ]
        [ X ' X ]
    
     * 5
    
        [ X ' X ]
        [ ' X ' ]
        [ X ' X ]
    
     * 6
    
        [ X ' X ]
        [ X ' X ]
        [ X ' X ]
    
     * Different method to print faces: arrays for rows:
     * there are 5 different rows that the dice use:
     * can make the patterns of 0 to 6 in square dice faces.
    
     * [ ' ' ' ] || Empty
     * [ ' X ' ] || Middle
     * [ X ' X ] || Double
     * [ X ' ' ] || Left
     * [ ' ' X ] || Right
    
     * OR
     
     * there are 6 different columns that the dice use:
     * can make the patters of 0 to 9 in square dice faces.
    
     * [ ' ' ' ] || Empty
     * [ ' X ' ] || Middle
     * [ X ' X ] || Double
     * [ X X X ] || Fill
     * [ X ' ' ] || Up
     * [ ' ' X ] || Down
    
     * Usage of rows[]
    
     * die[X] = rowArray;
    
     * switch(value)
     * case X:
     *      die[0] = patternY;
     *      die[1] = patternY;
     *      die[2] = patternY;
    
     * Usage of columns[]
    
     * //fill the column?
     * int column = 0;
     * for(int row = 0; var < die[column].length; row++){
     *     die[column][row] = pattern[row];
     * }
    
     * OR
    
     * create another dimension of array with all the faces EX:
     * char die[6][3][3] // for a six sided die
     * die[0]: // die 1
     * [ . . . ]
     * [ . X . ]
     * [ . . . ]
     * ...
    
     */
    
    // The different row patterns
//    static char[][] patterns = 
//        {
//            {'.', '.', '.'}, // pattern[0] == Empty line
//            {'.', 'X', '.'}, //pattern[1] == Middle eye
//            {'X', '.', 'X'}, //pattern[2] == Double eyes
//            {'X', '.', '.'}, //pattern[3] == Left eye
//            {'.', '.', 'X'} //pattern[4] == Right eye
//        };
    
    // enum to name the value of the patterns
//    enum Pattern {
//        EMPTY(0), MIDDLE(1), DOUBLE(2), LEFT(3), RIGHT(4);
//        
//        private final int value;
//        
//        Pattern(int value){
//            this.value = value;
//        }
//    }
    
    public static void main(String args[]){
        
        // values from {0...5}+1, so {1...6}
        int randomValue = new Random().nextInt(6)+1;
        
        // die face
        char[][] die = new char[3][3];

        char[][][] dies = {
            {   // Die face value 1
                {'.','.','.'},
                {'.','X','.'},
                {'.','.','.'}
            },
            {   // Die face value 2
                {'X','.','.'},
                {'.','.','.'},
                {'.','.','X'}
            },
            {   // Die face value 3
                {'X','.','.'},
                {'.','X','.'},
                {'.','.','X'}
            },
            {   // Die face value 4
                {'X','.','X'},
                {'.','.','.'},
                {'X','.','X'}
            },
            {   // Die face value 5
                {'X','.','X'},
                {'.','X','.'},
                {'X','.','X'}
            },
            {   // Die face value 6
                {'X','.','X'},
                {'X','.','X'},
                {'X','.','X'}
            }
        };
        
        // with array of patterns, this is not needed
        // Creates an empty die
//        for(int row = 0; row < die.length; row++){
//            for(int column = 0; column < die[row].length; column++){
//                die[row][column] = '.'; // Fill empty spaces with ' character
//            }
//        }

        //DEBUG
        //randomValue = 6;

        switch(randomValue){
            default:
                System.out.println("An error ocurred! Invalid value!");
                System.exit(0);
                break;
            case 1:
                die = dies[0];
                break;
            case 2:
                die = dies[1];
                break;
            case 3:
                die = dies[2];
                break;
            case 4:
                die = dies[3];
                break;
            case 5:
                die = dies[4];
                break;
            case 6:
                die = dies[5];
                break;
        }
        
        // Instead of creating the pattern in the switch case, it will be
        // returned from the patterns array, utilizing the pattern enum as
        // a guide
//        switch(randomValue){
//            default:
//                System.out.println("An error ocurred! Invalid value!");
//                System.exit(0);
//                break;
//            case 1:
//                // pattern. ommited because of the import of the enum Pattern
//                die[0] = patterns[/*Pattern.*/EMPTY.value];
//                die[1] = patterns[MIDDLE.value];
//                die[2] = patterns[EMPTY.value];
//                break;
//            case 2:
//                die[0] = patterns[LEFT.value];
//                die[1] = patterns[EMPTY.value];
//                die[2] = patterns[RIGHT.value];
//                break;
//            case 3:
//                die[0] = patterns[LEFT.value];
//                die[1] = patterns[MIDDLE.value];
//                die[2] = patterns[RIGHT.value];
//                break;
//            case 4:
//                die[0] = patterns[DOUBLE.value];
//                die[1] = patterns[EMPTY.value];
//                die[2] = patterns[DOUBLE.value];
//                break;
//            case 5:
//                die[0] = patterns[DOUBLE.value];
//                die[1] = patterns[MIDDLE.value];
//                die[2] = patterns[DOUBLE.value];
//                break;
//            case 6:
//                die[0] = patterns[DOUBLE.value];
//                die[1] = patterns[DOUBLE.value];
//                die[2] = patterns[DOUBLE.value];
//                break;
//        }
        
     
        // switch case with hardcoded patterns
        // Requires the array to be initialized, otherwise it will be empty
        // (Unless you want the other spaces to be empty characters, wich can
        // cause some of the patterns to break).
//        switch(randomValue){
//            default: 
//                System.out.println("An error ocurred! Invalid value!");
//                System.exit(0);
//            case 1:
//                die[1][1] = 'X';
//                break;
//            case 2:
//                die[0][0] = 'X';
//                die[2][2] = 'X';
//                break;
//            case 3:
//                die[0][0] = 'X';
//                die[1][1] = 'X';
//                die[2][2] = 'X';
//                break;
//            case 4:
//                die[0][0] = 'X';
//                die[2][0] = 'X';
//                die[0][2] = 'X';
//                die[2][2] = 'X';
//                break;
//            case 5:
//                die[0][0] = 'X';
//                die[2][0] = 'X';
//                die[1][1] = 'X';
//                die[0][2] = 'X';
//                die[2][2] = 'X';
//                break;
//            case 6:
//                die[0][0] = 'X';
//                die[1][0] = 'X';
//                die[2][0] = 'X';
//                die[0][2] = 'X';
//                die[1][2] = 'X';
//                die[2][2] = 'X';
//                break;
//        }
        
        System.out.printf("The random value is: %d\nThe die:\n", randomValue);
        
        // Prints the array
        for(char[] column : die){
            System.out.print("[");
            for(int row = 0;row < column.length; row++){
                System.out.print(" "+column[row]);
            }
            System.out.println(" ]");
        }
        
    }
    
}