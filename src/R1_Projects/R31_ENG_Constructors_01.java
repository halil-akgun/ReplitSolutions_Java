package R1_Projects;

import java.util.Scanner;

/*
Write a Scrabble Game for two person
 Rules
OK== 1- At the beginning Ask first R1_Projects.Player enter a word for starting game
OK 2- Then change the player ask new player if given word is valid or not
OK		i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3
OK     ii) If new player  does not accept the word as valid, then print "Invalid word, player X(Current player) won the game" and finish the game

OK  3- Ask to users if user want to continue game or not
OK     i) If player want to continue,
OK      ask user a letter to add to word
OK      and ask user side to add (beginning or end)
OK       then add letter to word and run step 2

OK    ii) If player does not want to continue
  then print "Game Finished" and print points  and winner
 */
class Player {
    String name;
    String str;
    int score;

    public Player(String name) {
        this.name = name;
    }
}

public class R31_ENG_Constructors_01 {
    static String strStatic = "";
    //    static String guess = "";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n************************************  Scrabble Game  ************************************\n");

        System.out.print("Enter the name of the first player: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Enter the name of the second player: ");
        Player player2 = new Player(scanner.nextLine());

        System.out.println("It's " + player1.name + "'s turn.");
        System.out.print("Enter a word: ");
        player1.str = scanner.next();
        strStatic = player1.str;
        System.out.println("It's " + player2.name + "'s turn.");
        System.out.print("Guess " + player1.name + "'s word: ");
        player2.str = scanner.next();
        check(player1, player2);

        String select;

        while (true) {
            System.out.print("Press 'y' to continue, press any key to finish: ");
            select = scanner.next();
            if (!select.equalsIgnoreCase("y")) break;
            addLetter(player1);
            addLetter(player2);
            strStatic = player1.str;
            check(player1, player2);
        }
        System.out.println("\n*****************************************************************************************");
        System.out.println("Scores; " + player1.name + ": " + player1.score + " - " + player2.name + ": " + player2.score);
        System.out.println("\n*****************************************************************************************");
        if (player1.score > player2.score)
            System.out.println("**********************************    WINNER: " + player1.name + "    **********************************");
        else
            System.out.println("**********************************    WINNER: " + player2.name + "    **********************************");
        System.out.println("*****************************************************************************************");
    }

    static void check(Player player1, Player player2) {
        System.out.println(player1.name + "'s word: " + player1.str);
        System.out.println(player2.name + "'s guess: " + player2.str);
        if (player1.str.equalsIgnoreCase(player2.str)) {
            player2.score += player1.str.length();
            System.out.println("Right guess. Scores; " + player1.name + ": " + player1.score + " - " + player2.name + ": " + player2.score);
        } else {
            player1.score += player1.str.length();
            player2.str = strStatic;
            System.out.println("Wrong guess. Scores; " + player1.name + ": " + player1.score + " - " + player2.name + ": " + player2.score);
        }
    }


    static void addLetter(Player player) {
        String add;
        String letter;
        System.out.println("It's " + player.name + "'s turn.");
        System.out.print("Add a letter to the word (" + strStatic + ") : ");
        letter = scanner.next().substring(0, 1);
        boolean isValid = true;
        while (isValid) {
            System.out.print("Press 1 to add to the beginning of the word, press 2 to add it to the end: ");
            add = scanner.next();
            switch (add) {
                case "1" -> {
                    player.str = letter + player.str;
                    isValid = false;
                }
                case "2" -> {
                    player.str = player.str + letter;
                    isValid = false;
                }
                default -> System.out.println("Incorrect entry!");
            }
        }
    }
}
