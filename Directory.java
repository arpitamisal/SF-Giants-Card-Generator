/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Directory.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Directory {

    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    
    public Directory() {
    }

    //
    // Static Methods
    //
    
    public String getPath(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String path = Config.getDefaultLogDirectoryPath() ;        
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            path = language.getTranslation(path);  
        }
        return path;
    }
    
    //
    // Instance Methods
    //

    //
    // Language
    //
}
