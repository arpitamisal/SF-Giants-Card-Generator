/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Card {

    //
    // Instance Data Fields
    //
    
    private ChatSession chatsession =  new ChatSession();
    private int artSize = 0;     // Please change artSize, if needed, to get an identical output
    private String artFont =  ""; // Please change artFont, if needed, to get an identical output
    
    //
    // Constructors
    //
    
    public Card() {
    }
    
    //
    // Instance Methods
    //
    
    public void printCard(){
        for(int i = 0; i < chatsession.getNumOfCards(); i++){
            try {
                SFGiantsCardGenerator.generateSFGiantsCard(chatsession.getRecipient().get(i), chatsession.getMessgeToReci().get(i) , 
                        chatsession.getfirstName(), chatsession.getEmail(), chatsession.getArtSymbol().get(i), this.artSize, this.artFont);
                System.out.println("");

            } catch (Exception ex) {
                Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //
    // Additional Instance Methods
    //
    
    //
    // Language
    //

}
