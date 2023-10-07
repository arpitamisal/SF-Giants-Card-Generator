/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"


public final class Club extends Organization {
    
    //
    // Instance Data Fields
    //
    
    private String name;
    private String shortName;
    private int establishedIn;
    private String colors;
    private String ballPark;
    private int worldSeriesTitles;
    private int nlPennants; 
    private int divisionTitles;
    private int wildCardBerths;

    //
    // Constructors
    //
    
    public Club() {
    }   
    
    public Club(String club){
        this.name = club;
    }
    
    public Club(String name, String shortName,int establishedIn,String colors, String ballPark, int worldSeriesTitles,
           int nlPennants, int divisionTitles, int wildCardBerths){
        this.name = name;
        this.shortName = shortName;
        this.establishedIn = establishedIn;
        this.colors = colors;
        this.ballPark = ballPark;
        this.worldSeriesTitles = worldSeriesTitles;
        this.nlPennants = nlPennants;
        this.divisionTitles = divisionTitles;
        this.wildCardBerths = wildCardBerths;
    }
    
    //
    // Static Methods
    //
    
    public static String getOfficialSong() {
        return " Take Me out to the Ball Game ";
    }
    
    //
    // Instance Methods
    //
     
    public String getname(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String name = this.name;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            name = language.getTranslation(name);  
        }
        return name;
    }
    public String getshortName(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String shortName = this.shortName;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            shortName = language.getTranslation(shortName);  
        }
        return shortName;        
    }
    public int getestablishedIn(){
        return this.establishedIn;        
    }
    public String getcolors(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String colors = this.colors;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            colors = language.getTranslation(colors);  
        }
        return colors;
    }
    public String getballPark(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String ballPark = this.ballPark;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            ballPark = language.getTranslation(ballPark);  
        }
        return ballPark;
    }
    public int getworldSeriesTitles(){
        return this.worldSeriesTitles;
    }
    public int getnlPennants(){
        return this.nlPennants;
    }
    public int getdivisionTitles(){
        return this.divisionTitles;
    }
    public int getwildCardBerths(){
        return this.wildCardBerths;
    }

    
    //
    // Additional Instance Methods
    //
    
    public void setname(String name){
        this.name = name;
    }
    public void setshortName(String shortName){
        this.shortName = shortName;
    }
    public void setestablishedIn(int establishedIn){
        this.establishedIn = establishedIn;
    }
    public void setcolors(String colors){
        this.colors = colors;
    }
    public void setballPark(String ballPark){
        this.ballPark = ballPark;
    }
    public void setworldSeriesTitles(int worldSeriesTitles){
        this.worldSeriesTitles = worldSeriesTitles;
    }
    public void setnlPennants(int nlPennants){
        this.nlPennants = nlPennants;
    }    
    public void setdivisionTItles(int divisionTitles){
        this.divisionTitles = divisionTitles;
    }
    public void setwildCardBerths(int wildCardBerths){
        this.wildCardBerths = wildCardBerths;
    }
    public void displayAbout(){
    }
    
    public void displayMission(){
    }
    
    //
    // Language
    //
}