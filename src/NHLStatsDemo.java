/**
 * This class is the demo class that runs the program.
 * It accepts input from the user and runs the specified file.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */


//importing
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class NHLStatsDemo {

    public static void main(String[] args) throws IOException {

        //Scanner is used.
        Scanner keyboard = new Scanner(System.in);

        //Printing
        System.out.print("Enter the filename to read from: ");

        //Asking the user for the file that needs to be read in.
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        NHLStats nhlStats = new NHLStats();

        //Creating variables of type String to get the name, position and team name.
        String name, position, teamName;

        //Creating variables of type int to get the number of games played, goals scored, assists, penalty minutes
        // goal shots and winning goals.
        int gamesPlayed, goalsScored, assists, penaltiesMinutes, goalShots, winningGoals;
        NHLStats nhlStats1 = null;

        String line = null;

        //A loop is used.
        //String tokenizer is used. This is used to parse the line's components.
        while (inputFile.hasNext()) {
            line = inputFile.nextLine();
            StringTokenizer token = new StringTokenizer(line, "\t");
            PlayerRecord playRec = new PlayerRecord(token.nextToken(), token.nextToken(), token.nextToken(),
                    Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()),
                    Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()));
            nhlStats.add(playRec);

        }

        inputFile.close();

        //Output
        //Printing the results summary
        //This is printing the player with the highest points and their teams.
        System.out.println("Players with highest points and their teams:");
        nhlStats.mostPoints();

        //This is printing the most aggressive players, their teams and their positions.
        System.out.println("Most aggressive players, their teams and their positions:");
        nhlStats.mostPenaltyMinutes();

        //This is printing the most valuable players and their teams.
        System.out.println("Most valuable players and their teams:");
        nhlStats.mostWinningGoals();

        //This is printing the most promising players and their teams.
        System.out.println("Most promising players and their teams:");
        nhlStats.mostGoalShots();

        //This is printing the teams that had the most number of penalty minutes.
        System.out.println("Teams that had the most number of penalty minutes:");
        nhlStats.sumPenaltyMinutes();

        //This is printing the teams that had the most number of game winning goals.
        System.out.println("Teams that had the most number of game winning goals:");
        nhlStats.sumWinningGoals();

    }
}
