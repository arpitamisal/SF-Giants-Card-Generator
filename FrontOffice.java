/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: FrontOffice.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.
public final class FrontOffice {

    //
    // Instance Data Fields
    //

    private static President president = new President();
    private static Manager manager = new Manager();
    private static GeneralManager generalmanager = new GeneralManager();
    
    //
    // Constructors
    //
    
    public FrontOffice() {
    }

    //
    // Instance Methods
    //
    
    public President getPresident(){
        return president;
    }
    public Manager getManager(){
        return manager;
    }
    public GeneralManager getGeneralManager(){
        return generalmanager;
    }

    //
    // Language
    //
}