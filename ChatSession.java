/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class ChatSession {

    //
    //  Static Data Fields
    //    
    
    private static String userName; 
    private static String firstName;
    private static String email;
    private static int numberOfCards;
    private static ArrayList<String> recipient = new ArrayList<String>();
    private static ArrayList<Character> artSymbol = new ArrayList<Character>(); 
    private static ArrayList<String> messageToReci = new ArrayList<String>();
    private static Player player;
    
    //
    // Instance Data Fields
    //
    
    private Club club;
    private University university;
    
    //
    // Constructors
    //
    
    public ChatSession() {
    }
    
    public ChatSession(Club club, University university) {
         this.club = club;
         this.university = university;
    }    

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() {
        
        // Chat Session Starting Statement
        System.out.println(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - " + Language.getGreetingPhrase(6) );
        System.out.println("");
        System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + Language.getGreetingPhrase(3) + Language.getGreetingPhrase(4) + Language.getGreetingPhrase(5));
        System.out.println(Language.getGreetingPhrase(0));
        
        // Club Section
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(1), this.sfGiants.getname());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(2), this.sfGiants.getshortName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(3), this.sfGiants.getestablishedIn());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(4), Language.getGreetingPhrase(29) + Language.getGreetingPhrase(30) + Language.getGreetingPhrase(31) + Language.getGreetingPhrase(32));
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(5), this.sfGiants.getballPark());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(6), this.sfGiants.getworldSeriesTitles());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(7), this.sfGiants.getnlPennants());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(8), this.sfGiants.getdivisionTitles());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(9), this.sfGiants.getwildCardBerths());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(10), this.owner.getowners());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(11), this.president.getfirstName() + " "  + this.president.getlastName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(12), this.generalManager.getfirstName() + " "  + this.generalManager.getlastName());
        System.out.printf("%-25s %-50s %n",Language.getClubPhrase(13), this.manager.getfirstName() + " "  + this.manager.getlastName());
        System.out.println(Language.getClubPhrase(14));
        
        // User Information Section
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print(this.sfGiants.getshortName() + Language.getGreetingPhrase(7) + Language.getGreetingPhrase(9));
        String userName = input.nextLine();
        this.userName = userName;
        System.out.print(this.sfGiants.getshortName() + Language.getGreetingPhrase(8) + Language.getGreetingPhrase(9));
        String userSchoolEmail = input.nextLine();
        this.email = userSchoolEmail;
        System.out.print(Color.changeColor(userName) + ": "+Language.getGreetingPhrase(12));
        
        // University Section
        System.out.println("");
        System.out.println(Language.getUniversityPhrase(12));
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(1), this.sfsu.getname()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(2), this.sfsu.getmottoLatin()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(3), this.sfsu.getmottoEnglish()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(4), this.sfsu.gettype()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(5), this.sfsu.getestablishmentYr()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(6), this.sfsu.getlocation()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(7), this.sfsu.getaddress()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(8), Language.getGreetingPhrase(33) + Language.getGreetingPhrase(34)); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(9), this.sfsu.getnickname()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(10), this.sfsu.getmascot()); 
        System.out.printf("%-25s %-50s %n", Language.getUniversityPhrase(11), this.sfsu.getwebsite()); 
        System.out.println(Language.getUniversityPhrase(12)); 
        
        // CHOOSE A PLAYER (EXTRA CREDIT)
        System.out.println("Please Choose a Player (Enter the corresponding number): ");
        System.out.println("[1] - José Álvarez        [11] - Caleb Baragar       [21] - Jake McGee         [31] - Evan Longoria");
        System.out.println("[2] - Joey Bart           [12] - Tyler Beede         [22] - Randy Rodríguez    [32] - Jason Vosler");
        System.out.println("[3] - Jaylin Davis        [13] - Anthony DeSclafani  [23] - Tyler Rogers       [33] - Austin Dean");
        System.out.println("[4] - John Brebbia        [14] - Camilo Doval        [24] - Gregory Santos     [34] - Mauricio Dubón");
        System.out.println("[5] - Tommy La Stella     [15] - Jarlin García       [25] - Logan Webb         [35] - Heliot Ramos");
        System.out.println("[6] - Kervin Castro       [16] - Sean Hjelle         [26] - Alex Wood          [36] - Darin Ruf");
        System.out.println("[7] - Alex Cobb           [17] - Dominic Leone       [27] - Curt Casali        [37] - Austin Slater");
        System.out.println("[8] - Steven Duggar       [18] - Zack Littell        [28] - Brandon Belt       [38] - LaMonte Wade Jr.");
        System.out.println("[9] - Brandon Crawford    [19] - Sammy Long          [29] - Thairo Estrada     [39] - Mike Yastrzemski");
        System.out.println("[10] - Hunter Harvey      [20] - Yunior Marte        [30] - Wilmer Flores      ");
        System.out.print(Color.changeColor(userName) + ": ");
        int chosenPlayer = input.nextInt();
        if(chosenPlayer == 1){this.player = this.joséÁlvarez;}
        else if(chosenPlayer == 2){this.player = this.joeyBart;}
        else if(chosenPlayer == 3){this.player = this.jaylinDavis;}
        else if(chosenPlayer == 4){this.player = this.johnBrebbia;}
        else if(chosenPlayer == 5){this.player = this.tommyLaStella;}
        else if(chosenPlayer == 6){this.player = this.kervinCastro;}
        else if(chosenPlayer == 7){this.player = this.alexCobb;}
        else if(chosenPlayer == 8){this.player = this.stevenDuggar;}
        else if(chosenPlayer == 9){this.player = this.brandonCrawford;}
        else if(chosenPlayer == 10){this.player = this.hunterHarvey;}
        else if(chosenPlayer == 11){this.player = this.calebBaragar;}
        else if(chosenPlayer == 12){this.player = this.tylerBeede;}
        else if(chosenPlayer == 13){this.player = this.anthonyDeSclafani;}
        else if(chosenPlayer == 14){this.player = this.camiloDoval;}
        else if(chosenPlayer == 15){this.player = this.jarlinGarcía;}
        else if(chosenPlayer == 16){this.player = this.seanHjelle;}
        else if(chosenPlayer == 17){this.player = this.dominicLeone;}
        else if(chosenPlayer == 18){this.player = this.zackLittell;}
        else if(chosenPlayer == 19){this.player = this.samLong;}
        else if(chosenPlayer == 20){this.player = this.yuniorMarte;}
        else if(chosenPlayer == 21){this.player = this.jakeMcGee;}
        else if(chosenPlayer == 22){this.player = this.randyRodríguez;}
        else if(chosenPlayer == 23){this.player = this.tylerRogers;}
        else if(chosenPlayer == 24){this.player = this.gregorySantos;}
        else if(chosenPlayer == 25){this.player = this.loganWebb;}
        else if(chosenPlayer == 26){this.player = this.alexWood;}
        else if(chosenPlayer == 27){this.player = this.curtCasali;}
        else if(chosenPlayer == 28){this.player = this.brandonBelt;}
        else if(chosenPlayer == 29){this.player = this.thairoEstrada;}
        else if(chosenPlayer == 30){this.player = this.wilmerFlores;}
        else if(chosenPlayer == 31){this.player = this.evanLongoria;}
        else if(chosenPlayer == 32){this.player = this.jasonVosler;}
        else if(chosenPlayer == 33){this.player = this.austinDean;}
        else if(chosenPlayer == 34){this.player = this.mauricioDubón;}
        else if(chosenPlayer == 35){this.player = this.heliotRamos;}
        else if(chosenPlayer == 36){this.player = this.darinRuf;}
        else if(chosenPlayer == 37){this.player = this.austionSlater;}
        else if(chosenPlayer == 38){this.player = this.laMonteWadeJr;}
        else if(chosenPlayer == 39){this.player = this.mikeYastrzemski;}
        else{this.player = this.busterPosey;}
        
        this.connectChatters();
        
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(0), this.player.getfirstName() + " " + this.player.getlastName());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(1), this.player.getclub());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(2), this.player.getposition());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(3), this.player.getnumber());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(4), this.player.getbats());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(5), this.player.getthrowS());
        System.out.printf("%-25s %-50s %n", Language.getPlayerPhrase(6), this.player.getmlbDebut());
        System.out.println(Language.getPlayerPhrase(7));
        
        this.sleep(5);
        
        this.chat();
        
    }
    
    // Dialing section
    private static void sleep(int seconds) {
        for (int i = 0; i < seconds; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".  ");
        }
    }
    
    private void connectChatters() {
        // Connecting Chatters Section
        System.out.println("");
        System.out.println(this.sfGiants.getshortName() + Language.getGreetingPhrase(13) +  Language.getGreetingPhrase(14));
        this.sleep(5);
        System.out.println("");
        System.out.println(Language.getUniversityPhrase(12)); 
    }
    
    private void chat() {

        Scanner input = new Scanner(System.in);
        System.out.println("");
        
//      Buster Posey, 28: Hello Duc. C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!
        int index = userName.indexOf(" ");
        String firstName = userName.substring(0, index);
        this.firstName = firstName;
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": "
                +  Language.getGreetingPhrase(10) + firstName + ". " + Language.getGreetingPhrase(11) );

//      Buster Posey, 28: SAN FRANCISCO STATE UNIVERSITY. Way to go!
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": " +
                Color.changeColor(Language.getGreetingPhrase(18)) + ". " + Language.getGreetingPhrase(19));

//      Duc Ta: Thank you, Posey! Nice to e-meet you here!      
        System.out.print(Color.changeColor(userName) + ": ");
        String userAnswer = input.nextLine();
        
//      Buster Posey, 28: Likewise, Duc. Very nice chatting w/ you. 
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " 
                +  Language.getGreetingPhrase(15) + Language.getGreetingPhrase(16) +  " " + firstName + "." + Language.getGreetingPhrase(17));
        
//      Buster Posey, 28: How many SF Giants Thank You cards would you like to order?
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " 
                + Language.getGreetingPhrase(20));
        
        // CARDS SECTION 
        // NUMBER OF CARDS
        
        for(int i = 3 ; i >= 0 ;i--){ 
            try{
                System.out.print(Color.changeColor(userName) + ": ");
                int numberOfCards = input.nextInt();
                this.numberOfCards = numberOfCards;
                break;
            } catch(InputMismatchException ex){
                System.out.println("Please enter an INTEGER. "  + i + " tries left.");
                System.err.println(ex);
                System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " 
                + Language.getGreetingPhrase(20));
                input.nextLine();
            }
        }

        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", " + this.player.getnumber() + ": " + Language.getGreetingPhrase(22));
        System.out.println(Language.getGreetingPhrase(23));
        
        input.nextLine();

        for(int i = 1; i <= numberOfCards; i++){
            System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " +  Language.getGreetingPhrase(24)  + i  + ": " );
            System.out.print(Color.changeColor(userName) + ": [1] ");
            String reci = input.nextLine();
            recipient.add(reci); 

            System.out.print(Color.changeColor(userName) + ": [2] ");
            char symbol = input.nextLine().charAt(0);
            artSymbol.add(symbol);

            System.out.print(Color.changeColor(userName) + ": [3] ");
            String message = input.nextLine();
            messageToReci.add(message);
        }
        
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": "+ Language.getGreetingPhrase(26) + Language.getGreetingPhrase(16) + " " + firstName + ". " + Language.getGreetingPhrase(25));
        System.out.println("");
        
        // THANK YOU SECTION 
        Card card = new Card();
        card.printCard();
        
        // ENDING OF CHAT SESSION 
        System.out.print(Color.changeColor(userName) + ": ");
        String endingInput = input.nextLine();
        System.out.println(this.player.getfirstName() + " " + this.player.getlastName() + ", "  + this.player.getnumber() + ": " + Language.getGreetingPhrase(27) + Language.getGreetingPhrase(16) + " " + firstName + ". " +  Language.getGreetingPhrase(28));
        System.out.println("");
        
        // RUN QUIZ SECTION 
        this.runQuiz();
        
        // END END
        this.stopChatSession();
        
        Receipt receipt = new Receipt();
        receipt.makeRecieptLog();
        
    } 
    
    private void runQuiz() {
        System.out.println(Language.getGreetingPhrase(1) + Language.getGreetingPhrase(2) + " " + Language.getGreetingPhrase(38));
        Quiz quiz = new Quiz(); 
        quiz.printQuiz();
    }
    
    private void stopChatSession() {
        // Chat Session Ending Statement
        System.out.println(Timer.getcurrentTime() + " ms] " + Timer.getAMPM() + " " + Timer.getshortForm() + " - " + Language.getGreetingPhrase(21) );

    }
    
    public void runChatSession() {
        this.startChatSession();
    }

        
    public  ArrayList<String> getRecipient(){
        return this.recipient;
    }
    public  ArrayList<Character> getArtSymbol(){
        return this.artSymbol;
    }
    public  ArrayList<String> getMessgeToReci(){
        return this.messageToReci;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getfirstName(){
        return this.firstName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getNumOfCards(){
        return this.numberOfCards;
    }
    public Player getPlayer(){
        return this.player;
    }
    
    // 
    //  OBJECTS
    // 
      
    Club sfGiants = new Club("San Francisco Giants", "SF Giants", 1883, "Orange, Black, Gold, Cream", 
        "Oracle Park", 8, 23, 8, 3);
    University sfsu = new University("San Francisco State University", "1600 Holloway Avenue, San Francisco, CA 94132", 
                                      "Experientia Docet", "Experience Teaches", "Public", 1899, "San Francisco, California, United States",
                                      "Purple, Gold", "Gators", "Gator", "www.sfsu.edu");
    OwnerGroup owner = new OwnerGroup("San Francisco Baseball Associates LLC");
    President president = new President("Farhan", "Zaidi");
    GeneralManager generalManager = new GeneralManager("Scott", "Harris");
    Manager manager = new Manager("Gabe", "Kapler");
   
    Player busterPosey = new Player("Buster", "Posey", "San Francisco Giants", "Catcher", 28, "Right", "Right", 2009);
    Player joséÁlvarez = new Player("José", "Álvarez", "San Francisco Giants", "Pitcher", 48, "Left", "Left", 2013);
    Player joeyBart  = new Player("Joey", "Bart", "San Francisco Giants", "Catcher", 60, "Right", "Right", 2020);
    Player jaylinDavis  = new Player("Jaylin", "Davis", "San Francisco Giants", "Outfielder", 49, "Right", "Right", 2019);
    Player johnBrebbia  = new Player("John", "Brebbia", "San Francisco Giants", "Pitcher", 59, "Left", "Right", 2017);
    Player tommyLaStella   = new Player("Tommy", "La Stella",  "San Francisco Giants", "Second baseman / Third baseman", 18, "Left", "Right", 2014);
    Player kervinCastro  = new Player("Kervin", "Castro", "San Francisco Giants", "Relief pitcher", 76, "Right", "Right", 2021);
    Player alexCobb  = new Player("Alex" , "Cobb", "San Francisco Giants", "Pitcher", 53, "Right", "Right", 2011);
    Player stevenDuggar  = new Player("Steven", "Duggar", "San Francisco Giants", "Outfielder", 6, "Left", "Left", 2018);
    Player brandonCrawford  = new Player("Brandon", "Crawford", "San Francisco Giants", "Shortstop", 35, "Left", "Right", 2011);
    Player hunterHarvey  = new Player("Hunter", "Harvey", "San Francisco Giants", "Pitcher", 23, "Right", "Right", 2019);
    Player calebBaragar = new Player("Caleb", "Baragar", "San Francisco Giants", "Pitcher", 45, "Right", "Left", 2020);
    Player tylerBeede = new Player("Tyler", "Beede",  "San Francisco Giants", "Pitcher", 38, "Right", "Right", 2018);
    Player anthonyDeSclafani = new Player("Anthony", "DeSclafani", "San Francisco Giants", "Pitcher", 26,"Right", "Right", 2014 );
    Player camiloDoval = new Player("Camilo", "Doval",  "San Francisco Giants", "Relief pitcher",75 ,"Right", "Right", 2021 );
    Player jarlinGarcía= new Player("Jarlin", "García", "San Francisco Giants", "Relief pitcher", 66, "Right", "Left", 2017);
    Player seanHjelle = new Player("Sean", "Hjelle", "San Francisco Giants",  "Pitcher", 21, "Right", "Right", 2018);
    Player dominicLeone = new Player("Dominic", "Leone", "San Francisco Giants", "Pitcher", 52, "Right", "Right", 2014 );
    Player zackLittell = new Player("Zack", "Littell", "San Francisco Giants", "Pitcher", 46, "Right", "Right", 2018);
    Player samLong = new Player("Sam", "Long", "San Francisco Giants", "Pitcher", 73, "Left", "Left", 2021);
    Player yuniorMarte = new Player("Yunior", "Marte", "San Francisco Giants", "Pitcher", 28, "Right", "Right", 2021);
    Player jakeMcGee = new Player("Jake", "McGee", "San Francisco Giants", "Pitcher", 17, "Left", "Left", 2010);
    Player randyRodríguez = new Player("Randy", "Rodríguez","San Francisco Giants", "Pitcher", 29,"Right", "Right", 2017);
    Player tylerRogers = new Player("Tyler", "Rogers", "San Francisco Giants", "Pitcher", 71,"Right", "Right", 2019);
    Player gregorySantos = new Player("Gregory", "Santos","San Francisco Giants", "Pitcher", 78,"Right", "Right", 2021 );
    Player loganWebb = new Player("Logan", "Webb", "San Francisco Giants",  "Pitcher", 62,"Right", "Right", 2019 );
    Player alexWood = new Player("Alex", "Wood", "San Francisco Giants", "Pitcher", 57,"Right", "Left", 2013);
    Player curtCasali = new Player("Curt", "Casali", "San Francisco Giants", "Catcher / First baseman", 2,"Right", "Right", 2014 );
    Player brandonBelt = new Player("Brandon", "Belt", "San Francisco Giants", "First baseman / Left fielder", 9, "Left", "Left", 2011);
    Player thairoEstrada = new Player("Thairo", "Estrada", "San Francisco Giants", "Infielder", 39, "Right", "Right", 2019 );
    Player wilmerFlores = new Player("Wilmer", "Flores", "San Francisco Giants", "Infielder", 41, "Right", "Right", 2013);
    Player evanLongoria = new Player("Evan", "Longoria", "San Francisco Giants", "Third baseman", 10,"Right", "Right", 2008);
    Player jasonVosler = new Player("Jason", "Vosler", "San Francisco Giants", "Infielder / Outfielder", 32, "Left", "Right", 2021);
    Player austinDean = new Player("Austin", "Dean" , "San Francisco Giants", "Left fielder", 74, "Right", "Right", 2018);
    Player mauricioDubón = new Player("Mauricio", "Dubón" , "San Francisco Giants", "Shortstop / Second baseman / Center fielder", 1,  "Right", "Right", 2019);
    Player heliotRamos = new Player("Heliot", "Ramos" , "San Francisco Giants", "Outfielder", 80,  "Right", "Right", 2017);
    Player darinRuf = new Player("Darin", "Ruf" , "San Francisco Giants", "Outfielder / First baseman", 33,  "Right", "Right", 2017);
    Player laMonteWadeJr = new Player("LaMonte", "Wade Jr." , "San Francisco Giants", "Outfielder / First baseman", 31,"Left", "Left", 2019);
    Player mikeYastrzemski = new Player("Mike", "Yastrzemski", "San Francisco Giants", "Right fielder / Center fielder", 5, "Left", "Left", 2019);
    Player austionSlater = new Player("Austin", "Slater", "San Francisco Giants", "Outfielder", 13, "Right", "Right", 2017);
        
    //
    // Language
    //
} 