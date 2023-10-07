/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;

public class StdOutStdErrTee extends OutputStream {
   
    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    private String stdOutFilePath = "./src/assignment02PartB/log/StandardOut.log";
    private String stdErrFilePath = "./src/assignment02PartB/log/StandardErr.log";
    private OutputStream[] streamsToConsoleToFile;
    private static PrintStream realSysOut = System.out;
    private static PrintStream realSysErr = System.err;

    //
    // Constructors
    //

    public StdOutStdErrTee() {
    
    }
     
    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
        this.streamsToConsoleToFile = new OutputStream[2];
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }

    //
    // Instance Methods
    //

    public void startLog() {
        try {
            FileOutputStream stdOutFile = new FileOutputStream(new File(this.stdOutFilePath));
            FileOutputStream stdErrFile = new FileOutputStream(new File(this.stdErrFilePath));

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void stopLog() {
        System.setOut(realSysOut);
        System.setErr(realSysErr);
    }
    
    //
    // Additional Methods
    //
    
    public String getStdOutFilePath(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String path = this.stdOutFilePath;        
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            path = language.getTranslation(path);  
        }
        return path;
    }
    public String getStdErrFilePath(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String path = this.stdErrFilePath;        
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            path = language.getTranslation(path);  
        }
        return path;
    }
    
    //
    // Language
    //

    //
    // Override
    //
    
   public void write(int b) throws IOException {
        for (OutputStream out : this.streamsToConsoleToFile) {
            out.write(b);
            out.flush();
        }
    }
}