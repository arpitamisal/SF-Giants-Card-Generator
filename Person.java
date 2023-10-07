/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
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
public sealed abstract class Person implements Greeting permits Student, Player, President, GeneralManager, Manager {

    //
    // Instance Data Fields
    //
    
    private String firstName;
    private String lastName;
    

    //
    // Constructors
    //
    public Person() {
    }

    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Instance Methods
     
    public String getfirstName(){
        return this.firstName;
    }
    
    public String getlastName(){
        return this.lastName;
    }
    
    public void setfirstName(String firstNm){
        this.firstName = firstNm;
    }
    
    public void setlastName(String lastNm){
        this.lastName = lastNm;
    }
    
    //
    // Language
    //

    //
    // @override
    //
    
    public String toString(){
        return "Name: ." + firstName + " " + lastName;
    }
    
}