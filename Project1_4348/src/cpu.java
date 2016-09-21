/**
 * Created by tien on 9/18/2016.
 */

import java.util.*;
import java.io.*;
public class cpu {
    public int sp = 1000;
    public int pc, ir, ac, x, y = 0;
    public BufferedReader in;
    public BufferedWriter out;

    public static void main(String[] args) throws IOException{
        public buffer(InputStream input, OutputStream output){
         String in = new BufferedReader(new InputStreamReader(input));
         String out = new BufferedReader(new InputStreamReader(output));
}

        public void instructions(int instructions, int oprt) {
        switch (instructions) {

            case 1: // Load the value into the AC
                ac = oprt;
                break;
            case 2: // Load the value at the address into the AC
                ac = read.op;
                break;
            case 3: //Load the value from the address found in the given address into the AC
                //(for example, if LoadInd 500, and 500 contains 100, then load from 100).
                break;
            case 4: //Load the value at (address+X) into the AC
                // (for example, if LoadIdxX 500, and X contains 10, then load from 510).
                break;
            case 5: //Load the value at (address+Y) into the AC
                break;
            case 6: //Load from (Sp+X) into the AC (if SP is 990, and X is 1, load from 991).
                break;
            case 7: //Store the value in the AC into the address
                break;
            case 8:// Gets a random int from 1 to 100 into the AC
                break;
            case 9:// If port=1, writes AC as an int to the screen
                //If port=2, writes AC as a char to the screen
                break;
            case 10:// Add the value in X to the AC
                break;
            case 11:// Add the value in Y to the AC
                break;
            case 12:// Subtract the value in X from the AC
                break;
            case 13:// Subtract the value in Y from the AC
                break;
            case 14:// Copy the value in the AC to X
                break;
            case 15:// Copy the value in X to the AC
                break;
            case 16:// Copy the value in the AC to Y
                break;
            case 17:// Copy the value in Y to the AC
                break;
            case 18:// Copy the value in AC to the SP
                break;
            case 19:// Copy the value in AC to the SP
                break;
            case 20:// Jump to the address
                break;
            case 21:// Jump to the address only if the value in the AC is zero
                break;
            case 22:// Jump to the address only if the value in the AC is not zero
                break;
            case 23:// Push return address onto stack, jump to the address
                break;
            case 24:// Pop return address from the stack, jump to the address
                break;
            case 25:// Increment the value in X
                break;
            case 26:// Decrement the value in X
                break;
            case 27:// Push AC onto stack
                break;
            case 28:// Pop from stack into AC
                break;
            case 29:// Return from system call
                break;
            case 30:// End execution
                break;


        }
    }
}
}