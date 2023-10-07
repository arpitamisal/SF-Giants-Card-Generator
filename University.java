/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    
    //
    // Static Data Fields
    //
    
    private String name;
    private String address;
    
    //
    // Instance Data Fields
    //
    
    private String mottoLatin;
    private String mottoEnglish;
    private String type;
    private int establishmentYr;
    private String location;
    private String colors;
    private String nickname;
    private String mascot;
    private String website;
    
    //
    // Constructors
    //
    
    public University() {
    }
    
    public University(String university) {
        this.name = university;
    }

    public University(String name, String address, String mottoLatin, String mottoEnglish, String type, int establishmentYr,
    String location, String colors, String nickname, String mascot, String website){
        this.name = name;
        this.address = address; 
        this.mottoLatin = mottoLatin;
        this.mottoEnglish = mottoEnglish;
        this.type = type;
        this.establishmentYr = establishmentYr; 
        this.location = location;
        this.colors = colors;
        this.nickname = nickname; 
        this.mascot = mascot;
        this.website = website;
    }
    
    //
    // Static Methods
    // 
    
    
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
    public String getaddress(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String address = this.address;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            address = language.getTranslation(address);  
        }  
        return address;        
    }
    public String getmottoLatin(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String mottoLatin = this.mottoLatin;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            mottoLatin = language.getTranslation(mottoLatin);  
        }  
        return mottoLatin;       
    }
    public String getmottoEnglish(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String mottoEnglish = this.mottoEnglish;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            mottoEnglish = language.getTranslation(mottoEnglish);  
        }  
        return mottoEnglish;        
    }
    public String gettype(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String type = this.type;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            type = language.getTranslation(type);  
        }  
       return type;
    }
    public int getestablishmentYr(){
        return this.establishmentYr;
    }
    public String getlocation(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String location = this.location;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            location = language.getTranslation(location);  
        }  
        return location;
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
    public String getnickname(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String nickname = this.nickname;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            nickname = language.getTranslation(nickname);  
        }  
        return nickname;
    }
    public String getmascot(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String mascot = this.mascot;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            mascot = language.getTranslation(mascot);  
        }  
        return mascot;
    }
     public String getwebsite(){
        Config config = Messenger.getConfig();
        Language language = config.getLanguage();
        String website = this.website;
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            website = language.getTranslation(website);  
        }  
        return website;
    }
     
    //
    // Additional Methods
    //
     
    public void setname(String name){
        this.name = name;
    }
    public void setaddress(String address){
        this.address = address;
    }
     public void setmottoLatin(String mottoLatin){
        this.mottoLatin = mottoLatin;
    }
    public void setmottoEnglish(String mottoEnglish){
        this.mottoEnglish = mottoEnglish;
    }
    public void settype(String type){
        this.type = type;
    }
    public void setestablishmentYr(int establishmentYr){
        this.establishmentYr = establishmentYr;
    }
    public void setlocation(String location){
        this.location = location;
    }
    public void setcolors(String colors){
        this.colors = colors;
    }
    public void setnickname(String nickname){
        this.nickname = nickname;
    }    
    public void setmascot(String mascot){
        this.mascot = mascot;
    }
    public void setwebsite(String website){
        this.website = website;
    }
    
    //
    // Language
    //

    //
    // Override
    //
    
    public void displayAbout(){
    }
    public void displayMission(){
    }
    
}