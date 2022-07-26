# Tic-Tac-Toe-Computer-vs-Player

DONE BY: ANIVESH SINGH GURJER
ROLL NO.: 2020CSB1071

Instructions to be followed while playing Tic Tac Toe:

1.TicTacToeWithComputer:

1) The program will provide 3x3 grid with numbers written inside it from 1 to 9.
                             
                          Example:   1|2|3
                                     4|5|6
                                     7|8|9
(NOTE: The box with numbers will be provided at the start of the game so player have to remember the position of the numbers.) 
                        
2) The player will be given symbol 'X' for playing and player will play first move.

3) The computer will be given symbol 'O' for playing and computer will play after player    plays first move.

4) Instruction on how to type number in terminal:enter the number in the next line of 
"Enter Your Move:". 
Example: You will see following in the terminal

1|2|3
4|5|6
7|8|9
Enter Your Move:
1              <--------------------- type number in this line.




5) When it is player's turn, if you type the respective number in the terminal, 'X' will    occupy that position. Ex: 

i) If player types "1" in terminal then,

                                  X|_|_ 
                                  _|_|_
                                   | |  
ii) The computer will play 2nd move randomly or smartly (depending on the situation)

                                  X|_|_ 
                                  _|_|_
                                   |O|  

iii) suppose the player types "2" in terminal then,

                                  X|X|_ 
                                  _|_|_
                                   |O|  

iv) the computer will play next move,

                                  X|X|O
                                  _|_|_
                                   |O|  

And The program ends when the game is won by either player or the game is a draw.

6) Winning condition of game is: 

i) The player who succeeds in placing three respective marks in a horizontal, vertical, or diagonal row wins the game.
   Example:
                  X|X|O           X|X|O
                  X|_|_     or    _|X|_
                  X|O|O           O|O|X
                                     

ii) if computer manages to get three 'O' vertically, horizontally or diagonally then computer wins.
    Example:         
                  X|X|O           X|X|O
                  _|X|O     or    X|O|_
                  X|O|O           O|O|X


7) Draw condition of game is: when all the squares have been filled with no winner
                                  X|X|O
                                  O|X|X
                                  X|O|O

2. TicTacToePvP:

1) The program will provide 3x3 grid with numbers written inside it from 1 to 9.
                             
                          Example:   1|2|3
                                     4|5|6
                                     7|8|9

(NOTE: The box with numbers will be provided at the start of the game so players have to remember the position of the numbers.) 

2) The player 1 will be given symbol 'X' for playing and player 1 will play first move.

3) The player 2 will be given symbol 'O' for playing and player will play after player 1 playes his/her move.

4) Rest of the instructions are same as the instructions given in TicTacToeWithComputer.
