/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Receipt.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;

public final class Receipt {

    //
    // Static Data Fields
    //
      
    private static ChatSession chatsession = new ChatSession();
    
    private static Quiz quiz = new Quiz();
    
    private static String recieptFilePath = "./src/assignment02PartB/log/Receipt-ARPITA-MISAL-AMISAL@SFSU.EDU.log";
    
    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Receipt() {
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //

    public void makeRecieptLog(){
        try{
            FileOutputStream recieptFile = new FileOutputStream(new File(this.recieptFilePath), false);
            PrintWriter recieptWrite = new PrintWriter(recieptFile);
            
            recieptWrite.write("");
            
            recieptWrite.write("-".repeat(70) + "\n" + "-".repeat(22) +
            " SF GIANTS THANK YOU " + "-".repeat(27) + "\n" + "-".repeat(70) + "\n" +
            " ".repeat(44) + " powered by CSC 220 @ SFSU \n");

            recieptWrite.write(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - Transaction started.\n");
            
            recieptWrite.write("\n");
            
            recieptWrite.write(chatsession.getPlayer().getfirstName() + " " + chatsession.getPlayer().getlastName() + ", " + chatsession.getPlayer().getnumber() + " | SAN FRANCISCO GIANTS\n");
            
            recieptWrite.write(chatsession.getUserName() + ", " + chatsession.getEmail().toUpperCase() + " | SAN FRANCISCO STATE UNIVERSITY\n");
            
            recieptWrite.write(chatsession.getNumOfCards() + "\n");
            
            recieptWrite.write(Language.getGreetingPhrase(0) + "\n");
            
            for(int i = 0; i < chatsession.getNumOfCards(); i++){
                recieptWrite.write(chatsession.getRecipient().get(i) + "\n");
                 recieptWrite.write(chatsession.getArtSymbol().get(i) + "\n"); 
                recieptWrite.write(chatsession.getMessgeToReci().get(i) + "\n");
                recieptWrite.write(Language.getGreetingPhrase(0) + "\n");
            }
            
            if(quiz.getScore() >= 5){
                recieptWrite.write("*** PASSED quiz. Got FREE TICKETS. ***\n");
            }
            recieptWrite.write("\n");
            
            recieptWrite.write(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - Transaction ended.\n");
            
            recieptWrite.close();
            recieptFile.close();
            
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    //
    // Additional Methods
    //

    //
    // Language
    //
}