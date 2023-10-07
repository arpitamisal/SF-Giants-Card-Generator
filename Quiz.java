/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;

public final class Quiz {

    //
    // Instance Data Fields
    //
    int quizCount;
    //
    // Constructors
    //
    
    public Quiz() {
    }

    //
    // Instance Methods
    //

    public void printQuiz(){

        QuestionAnswer quesans = new QuestionAnswer();
        String[] answers = quesans.getAnswers();
        Scanner input = new Scanner(System.in);
        quizCount = 0;
        for (int i = 0; i < 6; i++) {
            ChatSession chatsession = new ChatSession();
            System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + " " + Language.getQuestionPhrase(i));
            System.out.print(Color.changeColor(chatsession.getUserName()) + ": ");
            String ans = input.nextLine();
            
            if(ans.equalsIgnoreCase(answers[i])){
                System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + " " + Language.getGreetingPhrase(36));
                quizCount++;
            }
            else{
                System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + " " + Language.getGreetingPhrase(37));
            }
        }
        if(quizCount >= 5){
            System.out.println(Language.getGreetingPhrase(40));
        }
        else{
            System.out.println(Language.getGreetingPhrase(39));
        }
    }
    
    
    public int getScore(){
        return quizCount;
    }
    
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
    
}