/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
    
    private String firstName;
    private String lastName;
    private String club;
    private String position;
    private int number; 
    private String bats;
    private String throwS; 
    private int mlbDebut;
    
    //
    // Constructors
    //
    
    public Player() {
    }
    
    public Player(String firstName, String lastName, String club, String position, int number, String bats,String throwS,int mlbDebut){
        this.firstName = firstName;
        this.lastName = lastName;
        this.club = club;
        this.position = position;
        this.number = number; 
        this.bats = bats; 
        this.throwS = throwS;
        this.mlbDebut = mlbDebut;
    }
    
    //
    // Instance Methods
    //
    
    public String getfirstName(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String firstName = this.firstName;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           firstName = language.getTranslation(firstName);  
        }
        return firstName;
    }
    public String getlastName(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String lastName = this.lastName;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           lastName = language.getTranslation(lastName);  
        }
        return lastName;
    }
    public String getclub(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String club = this.club;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           club = language.getTranslation(club);  
        }
        return club;
    }
    public String getposition(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String position = this.position;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           position = language.getTranslation(position);  
        }
        return position;
    }
    public int getnumber(){
        return this.number;
    }
    public String getbats(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String bats = this.bats;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           bats = language.getTranslation(bats);  
        }
        return bats;
    }
    public String getthrowS(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String throwS = this.throwS;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
           throwS = language.getTranslation(throwS);  
        }
        return throwS;
    }
    public int getmlbDebut(){
        return this.mlbDebut;
    }
    
    //
    // Additional Instance Methods
    //
    
    public void setfirstName(String firstNm){
        this.firstName = firstNm;
    }
    public void setlastName(String lastNm){
        this.lastName = lastNm;
    }
    public void setclub(String cl){
        this.club = cl;
    }
    public void setposition(String pos){
        this.position = pos;
    }
    public void setnumber(int num){
        this.number = num;
    }
    public void setbats(String bat){
        this.bats = bat;
    }
    public void setthrowS(String thr){
        this.throwS = thr;
    }
    public void setmlbDebut(int debutYr){
        this.mlbDebut = debutYr;
    }
    public String getname(){
        return firstName + " " + lastName;
    }
    public String toString(){
        return "Player: " + firstName + " " + lastName + "\nClub: " + club +
               "\nPosition: " + position + "\nNumber: " + number + "\nBats: " +
                bats + "\nThrows: " + throwS + "\nMLB Debut: " + mlbDebut;
    }
    
    //
    // Language
    //

    
    //
    // @Override
    //
    
    public void sayGreeting(String string){
    }
}
