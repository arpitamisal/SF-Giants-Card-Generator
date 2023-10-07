/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class QuestionAnswer {

    //
    // Instance Data Fields
    //
     
    private static String[] questions = {
    "Which type of class has 'protected' constructors?",
    "What type of method did Java 8 add to 'interface'?",
    "What new keyword did Java 13 add to 'switch' statement?",
    "In Java 15, what keyword pairs with 'sealed'?",
    "Giants in Spanish?",
    "Take me out to the...?"};
    
    private static String[] answers = {
    "Abstract",
    "Default",
    "Yield",
    "permits",
    "Gigantes",
    "Ball Game"};

    //
    // Constructors
    //
    
    public QuestionAnswer() {
    }

    //
    // Instance Method
    //

    public String[] getQuestions(){
        return this.questions;
    }
    public String[] getAnswers(){
        return this.answers;
    }
    
    //
    // Language
    //

    //
    // Override
    
}