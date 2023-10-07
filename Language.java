/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

import java.util.Scanner;

public final class Language {
   
    //
    // Instance Data Fields
    //
    
    private static String language;
    
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    
    private static String[] questions = {
    "Which type of class has 'protected' constructors?",
    "What type of method did Java 8 add to 'interface'?",
    "What new keyword did Java 13 add to 'switch' statement?",
    "In Java 15, what keyword pairs with 'sealed'?",
    "Giants in Spanish?",
    "Take me out to the...?"};
    
    private static String[] configPhrases = {
        "----------------------------------------------------------------------",
        "Language:", 
        "Time Zone:",
        "Color Sequences:",
        "Standard Output Log:",  
        "Standard Error Log:", 
        "Receipt Log:", 
        "Receipt-*-*.log", 
        "Default University:", 
        "Default Club: "};
    
    private static String[] clubPhrases = { 
        Config.getDefaultClub(), 
        "Club:", "Short Name:", 
        "Established in:","Colors:", 
        "Ballpark:", 
        "World Series Titles:", 
        "NL Pennants:", 
        "Division Titles:", 
        "Wild Card Berths:", 
        "Owners:", 
        "President:", 
        "General Manager:", 
        "Manager:",
        "----------------------------------------------------------------------" };
    
    private static String[] universityPhrases = { 
        Config.getDefaultUniversity(), 
        "Official Name:", 
        "Motto in Latin:", 
        "Motto in English:", 
        "Type:", 
        "Year of Establishment:", 
        "Location:",
        "Address:",
        "Colors:", 
        "Nickname:", 
        "Mascot:", 
        "Website:", 
        "----------------------------------------------------------------------" };
    
    private static String[] greetingPhrases = {
        "----------------------------------------------------------------------", 
        "SF Giants",  
        ":", 
        " Welcome to the", 
        " SAN FRANCISCO GIANTS", 
        "!", 
        "Chat Session Started.", 
        ": Your first name and last name,",
        ": Your school email address,",
        " please: ",
        " Hello ",
        " C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!",
        "Welcome to my university!",
        " : Thank you.", 
        " We are connecting you with our player...", 
        " Likewise" ,
        ",", 
        " Very nice chatting w/ you.", 
        "SAN FRANCISCO STATE UNIVERSITY", 
        "Way to go!", 
        "How many SF Giants Thank You cards would you like to order? ", 
        " Chat session ended.",
        " In 3 lines, please provide",
        "    [1] Recipeint name\n" +
        "    [2] Art Symbol (a character)\n" +
        "    [3] Message to recipient",
        " Card #",
        "Please confirm your order:",
        "Thanks",
        "Thank you again",
        "See you at your graduation ceremony!",
        "Orange,",
        " Black",
        ", Gold",
        ", Cream",
        "Purple, ", 
        "Gold",
        "Chat session ended.",
        "Correct!",
        "Oops...",
        " *** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _",
        "____ Please try again at your graduation ceremony. ____",
        "*** Congrats! You won FREE TICKETS to SF GIANTS Games ***",
        "Language: UNSUPPORTED language. Please enter your language.",
        "Language: English, Chinese, French, Spanish, Alien"}; // 42
    
    private static String[] playerPhrases = {
        "Player:",
        "Club:", 
        "Position:",
        "Number:", 
        "Bats", 
        "Throws", 
        "MLB Debut:", 
        "----------------------------------------------------------------------"}; 
    
    //
    // Constructors
    //
    
    public Language(){
        this.language = Config.getDefaultLanguage(); //Default
    }
    
    public Language(String language) {
        this.language = language.toUpperCase();        
        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }
    }

    //
    // Static Methods
    //
    
    public static Language setLanguagePreference() {
        Scanner input = new Scanner(System.in);
        System.out.print("Language: ");
        String userLanguage = input.nextLine();
        
        while(!(userLanguage.equalsIgnoreCase("english") || userLanguage.equalsIgnoreCase("alien") || userLanguage.equalsIgnoreCase("Chinese")
                || userLanguage.equalsIgnoreCase("French") || userLanguage.equalsIgnoreCase("Spanish"))){
            System.out.println(getGreetingPhrase(41));
            System.out.println(getGreetingPhrase(42));
            System.out.print("Language: ");
            userLanguage = input.nextLine();
        }
        Language language = new Language(userLanguage);
        return language;
    }
    public static void displayAppHeader(){
        System.out.println(Config.getOfficialAppHeader());
    }
    public static String getConfigPhrase(int i){
       return configPhrases[i];
    }
    public static String getClubPhrase(int i){
        return clubPhrases[i];
    }
    public static String getUniversityPhrase(int i){
       return universityPhrases[i];
    }
     public static String getGreetingPhrase(int i){
       return greetingPhrases[i];
    }
    public static String getPlayerPhrase(int i){
        return playerPhrases[i];
    }
    public static String getQuestionPhrase(int i){
        return questions[i];
    }
    public static String getAlienSound(){
        return defaultAlienSound;
    }
     
    //
    // Additional Static Methods
    //

    public static void populateChinesePhrases(){
        if (language.equalsIgnoreCase("Chinese")){
            // For future implementation
        }
    }
    public static void populateFrenchPhrases(){
        if (language.equalsIgnoreCase("French")){
            // For future implementation
        }
    }
    public static void populateSpanishPhrases(){
        if (language.equalsIgnoreCase("Spanish")){
            // For future implementation
        }
    }
    public static void populateYourLanguagePhrases(){
        if (language.equalsIgnoreCase("YourLanguage")){
            // For future implementation
        }
    }
     public static void populateEnglishPhrases(){
        if (language.equalsIgnoreCase("English")){
            // For future implementation
        }
     }
    
    //
    // Instance Methods
    //
     
    public String getLanguage(){
        if(language.equalsIgnoreCase("alien")){
            return getAlienSound();
        }
        return language;
    } 
    public String getTranslation(String phrase){
         if(this.language.equalsIgnoreCase("alien")){
            return getAlienSound();
         }
         return " "; 
    }
    public void populateAlienPhrases(){
        for(int i = 0; i < configPhrases.length; i++){
            configPhrases[i] = this.defaultAlienSound;
        }
        for(int i = 0; i < clubPhrases.length; i++){
            clubPhrases[i] = this.defaultAlienSound;
        }
        for(int i = 0; i < universityPhrases.length; i++){
            universityPhrases[i] = this.defaultAlienSound;
        }
        for(int i = 0; i < greetingPhrases.length; i++){
            greetingPhrases[i] = this.defaultAlienSound;
        }
        for(int i = 0; i< playerPhrases.length; i++){
             playerPhrases[i] = this.defaultAlienSound;
        }
        for(int i = 0; i< questions.length; i++){
             questions[i] = this.defaultAlienSound;
        }
    }
    
    //
    // Language
    //
  
}