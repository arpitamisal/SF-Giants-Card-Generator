/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Timer {

    //
    // Static Data Fields
    //
    
    private static String timeZone;
    private static Config config = Messenger.getConfig();
    private static Language language = config.getLanguage();
    
    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    
    public Timer() {
        this.timeZone = Config.getDefaultTimeZone();
    }

    public Timer(String time){
        this.timeZone = time;
    }
    
    //
    // Static Methods
    //
    
    public static String getTimeZoneFormatted(){
        
        String userTime = "";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
   
        if(timeZone.equalsIgnoreCase("PST") | timeZone.equalsIgnoreCase("Pacific Standard")){
            userTime = "Pacific Standard Time in Day Light Saving";
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
            //System.out.println(timeZone + ": " + dateFormat.format(new Date()));
        } 
        
        else if(timeZone.equalsIgnoreCase("CST") | timeZone.equalsIgnoreCase("Central Standard Time")){
            userTime = "Central Standard Time in Day Light Saving";
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
            //System.out.println(timeZone + ": " + dateFormat.format(new Date()));
        } 
        
        else if(timeZone.equalsIgnoreCase("EST") | timeZone.equalsIgnoreCase("Eastern Standard")){
            userTime = "Eastern Standard Time in Day Light Saving";
            dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
            //System.out.println(timeZone + ": " + dateFormat.format(new Date()));
        }
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            userTime = language.getTranslation(userTime);  
        }
        return userTime;
    }
    
    //
    // Additional Static Methods
    //

    public static Timer setTimeZonePreference(){
        
        String phrase = "Time Zone: ";
        if(!(language.getLanguage().equalsIgnoreCase("english"))){
            phrase = language.getTranslation(phrase);  
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print(phrase);
        String userInput = input.nextLine();
        while(!(userInput.equalsIgnoreCase("pst") || userInput.equalsIgnoreCase("est") || userInput.equalsIgnoreCase("cst"))){
            System.out.println("Time Zone: INVALID time zone. Please enter your time zone.");
            System.out.print(phrase);
            userInput = input.nextLine();
        }
        Timer timer = new Timer(userInput);
        return timer;      
    }
    
    //
    // Instance Methods
    //
    
    public static String getcurrentTime(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss [SSSS");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
    public static String getAMPM(){
        SimpleDateFormat formatter= new SimpleDateFormat("aa");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
   public static String getshortForm(){
       if(Timer.getTimeZoneFormatted().equals("Pacific Standard Time in Day Light Saving")){
           return "PST";
       }
       else if(Timer.getTimeZoneFormatted().equals("Central Standard Time in Day Light Saving")){
           return "CST";
       }
       else {
           return "EST";
       }   
    }
   
    //
    // Additional Instance Methods
    //

    //
    // Language
    //

}