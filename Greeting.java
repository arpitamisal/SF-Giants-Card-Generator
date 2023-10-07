/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Greeting.java
 * Author: Duc Ta
 * Author: Arpita Misal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.
public sealed interface Greeting permits Person {
    public static final String GREETING = Greeting.getPhrase(0);
    public default void sayGreeting() {
        this.sayGreeting(GREETING);
    }

    public abstract void sayGreeting(String string);

    private static String getPhrase(int i) {
        return Messenger.getConfig().getLanguage().getGreetingPhrase(i);
    }
}

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//