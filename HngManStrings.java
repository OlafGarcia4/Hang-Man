package HANGMANGAME;

import java.util.Arrays;
// to play the game go to HngManGame.java
public class HngManStrings {
    public String[] words = new String[]{"terminator", "star wars", "hobbit", "star trek", "futurama", "java","the force","jedi","darth vader",
            "padawan","yoda","anakin","obiwan","ewoks", "souron","one ring","elves"}; //bank of words
    int wrongGuess;
    public String wordtemp;
    public char[] wordBlocker = {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
    public char[] wordLetters;
    char[] charArray;

    boolean winOrlose;
    boolean wrongLetter;
    boolean usedLetter;


    public void wordPicking(){//randomizer and replacer for the words to be displayed
        wordtemp =words[(int) (Math.random()*words.length)];
        wordLetters = wordtemp.toCharArray();
        charArray = wordtemp.toCharArray();

        for(int i = 0; i <charArray.length; i++){
            wordLetters[i] = wordBlocker[i];
        }
    }
    public void cheking(char ch){//check whether the letter that is chosen equal to a letter in the chosen word
                                    //evaluates when the all the letters are correct or if the attempts are increasing
        usedLetter = false;
        wrongLetter = false;

        for(int i = 0; i<charArray.length; i++) {   //taking the length of the array of the we evalutae the following
            if (charArray[i] == ch) {           // if character chosen equals a letter of the word then
                wordLetters[i] = ch;            //we set the character to the  position at index i in the blocked strings
                if (wrongLetter == false) {     // then we check is the letter is false
                    wrongLetter = true;         // then we set wrongletter to true
                }                               //else
                if (wordBlocker[i] == ch) {     // if the letter equals the same at array then we set used letter to true
                    usedLetter = true;
                }
            }
        }
        if (wrongLetter == false){     // if the wrong letter is equal to false, then we increase the wrong count
            wrongGuess++;
            if(usedLetter==true){   //however if the usedletter is true then we reduce the wrong count
                wrongGuess--;
            }
        }
        winOrlose = Arrays.equals(charArray,wordLetters);


    }
}