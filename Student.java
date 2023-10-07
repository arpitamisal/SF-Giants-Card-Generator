/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Student extends Person {

    //
    // Instance Data Fields
    //
    
    private String firstName;
    private String lastName;
    
    //
    // Constructors
    //
    
    public Student() {
    }

    public Student(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //
    // Instance Methods
    //
    
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
    // Additional Methods
    //
    
    public String toString(){
        return "Name: ." + firstName + " " + lastName;
    }
    
    //
    // Language
    //

    //
    // Override
    //
    
    public void sayGreeting(String string){
    }
}