/**
 * Created by tien on 9/18/2016.
 */

import java.io.*;
import java.util.*;



public class memory {
    // array in memory
    public static int[] memorystack;
    //create scanner for user input
    static Scanner theScanner = new Scanner(System.in);
    static public int memaddress, info;


    public static void main(String[] args) {
        // handle input parameter.
        if (args.length < 1 || args.length > 2) {
            System.out.println(" Missing input file. EX: example1.txt");
            System.exit(1);
        }

        // END of  handle input parameter trigger ===============================================

        while (theScanner.hasNextLine()) {
            String theLine = theScanner.nextLine();

        }


    }
}

