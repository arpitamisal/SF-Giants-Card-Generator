/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: LogFileDriver.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//

public final class LogFileDriver {

    //
    // Constructors
    //
    private LogFileDriver() {
    }

    //
    // Static Methods
    //
    public static void run() {
        System.out.println("\n\n\n");
        LogFileDriver.sleep(3);
        System.out.println();
        System.out.println("-".repeat(80));
        System.out.println("-".repeat(10) + " LogFileDriver " + "-".repeat(10));
        System.out.println("-".repeat(10) + " checking log files ...");
        System.out.println("-".repeat(80));

        String dir = Config.getDefaultLogDirectoryPath();
        for (String fileName : (new File(dir)).list()) {
            System.out.println("\n\n\n");
            LogFileDriver.sleep(5);
            System.out.println("\n" + "*".repeat(80) + "\n" + "*".repeat(80));
            System.out.println("*** Reading file:  " + fileName);
            System.out.println("*** Relative path: " + dir + fileName);
            System.out.println("** ");
            System.out.println("* ");
            readFile(dir+fileName);
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("***");
            System.out.println("*".repeat(80) + "\n" + "*".repeat(80));
        }

        //
        // Other tests
        //
    }
    private static void readFile(String filePath) {
        java.io.File file = new java.io.File(filePath);
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        } finally {
            //
        }
    }
    private static void sleep(int seconds) {
        for (int i = 0; i < seconds; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        }
    }
}

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//