/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Color {

    //
    // Static Data Fields
    //
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    //
    // Instance Data Fields
    //
       
    //
    // Constructors
    //
    
    public Color() {
    }

    //
    // Static Methods
    //

    public static String changeColor(String string){
        return ANSI_PURPLE_BACKGROUND + ANSI_YELLOW + string + ANSI_RESET;
    }
    
    //
    // Instance Methods
    //
    
    public String getColorSequences(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String colorSequences = Config.getDefaultColorSequences();
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            colorSequences = language.getTranslation(colorSequences);  
        }
        return colorSequences;
    }
    
    //
    // Language
    //
}