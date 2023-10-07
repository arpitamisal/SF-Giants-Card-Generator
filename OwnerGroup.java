/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class OwnerGroup extends Organization{
    
    //
    // Data fields
    //
    
    private static String owners;
   
    //
    // Constructors
    //
    
    public OwnerGroup() {
    }

    public OwnerGroup(String owners){
        this.owners = owners; 
    }
    
    //
    // Instance Methods
    //
    
    public void displayAbout(){
    }
    public void displayMission(){
    }
    public String getowners(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String owners = this.owners;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            owners = language.getTranslation(owners);  
        }
        return owners;
    }
    public void setowners(String owners){
        this.owners = owners;
    }
    
    //
    // Override
    //
    
}