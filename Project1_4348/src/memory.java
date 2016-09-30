/**
 * Created by tien on 9/18/2016.
 */

import java.io.*;
import java.util.*;



public class memory {
    // array in memory
    public static int[] memorystack;
    public static int memoryIndex;
    //create scanner for user input for read write or error
   public  static Scanner in = new Scanner(System.in);
    // Scanner for filePath
   public static Scanner scanFilePath = new Scanner(new File(filePath));
   // static Scanner theScanner = new Scanner(System.in);
    public static int memaddress, info;
    public static memorystack = new int[2000];
    public static int memoryIndex = 0;




    public static void main(String[] args)
{
        // handle input parameter.
        if (args.length < 1 || args.length > 2) {
            System.out.println(" Missing input file. EX: example1.txt");
            System.exit(1);
        }

        // END of  handle input parameter trigger ===============================================

//Decide input for write read error
        while (in.hasNextLine())
          {
            String theLine = in.nextLine();
            char caseRWE = theline.charAt(0);
            switch(caseRWE)
               {
                 case 'e' :
                    System.exit(1);
                     break;
                case 'r':
                 memaddress = Integer.parseInt(theLine.substring(1));
                 System.out.println(read(memaddress));
                    break;
                case 'w' :
                String[] parameters = theLine.substring(1).split(",");
                memaddress = Integer.parseInt(parammeters[0];
                info = Integer.parseInt(parameters[1]);
                writeinfo(memaddress, info);
                    break;
             }
          }
        in.close();
        }
// Setup & load commands from instruction file and set path for the file
        public static void initialmemoryaddress(String filePath)
    {
        while(scanFilePath.hasNextLine())
        {
            String nextLine = scanFilePath.nextLine().trim();
        if (nextLine.length() < 1)
            continue;
        if(line.charAt(0) == '.')
        {
            memoryIndex =Integer.parseInt(nextLine.substring(1).split"\\s+")[0]);
            continue;
        }
        if (nextLine.charAt(0)) < '0' line.charAt(0) >'9')
        continue;
        String[] splitspace = nextLine.split("\\s+");
        if (splitspace.length < '1')
            continue;
        else
            memorystack[memoryIndex++ = Integer.parseInt(split[0]);
        }
    scanFilePath.close();
    }
    public static void write(int memaddress, int info)
    {
        log("Write" + info + " -> " + memaddress);
        memorystack[memaddress] =  info;
    }
    public static int read(int memaddress)
{
    log("read" + memaddress + " : " +memory[memaddress]);
    return memorystack[memaddress]
}

}

