# Hang-Man

This is a multi-class project simulating the classic Hangman game.

Each class does a different thing. 

HngManPannel

-crates the graphics and keyboard from where the user chooses the letters

-creates a mouseListener to get information on what letter is being clicked

- send the value for evalution and updates the wins or losses

HngManStrings 
-Stores the words the user needs to check 
-Randomly choses a word with in the word array
-Transforms the chossen string into a character array
-Evaluates whether the letter chossen is in the char array
-Updates the hang man graphic if the word that is chosen is incorrect

HngManFrame
-Creates a Frame that will display the HngManPannel
-Adds a window istener that will prompt the user to exit or continue playing

HngManGame
-The main class from where the rest of the code is executed


