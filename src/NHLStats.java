/**
 * This class has unordered list and necessary methods to implement and run the NHLStatsDemo.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

//importing the collections and hashmap
import java.util.Collections;
import java.util.HashMap;

public class NHLStats {

    //This is a field that is an unordered List of type PlayerRecord
    private List<PlayerRecord> playerRecord;

    //constructor
    public NHLStats() {
        playerRecord = new List<PlayerRecord>();
    }

    //This is an add method.
    //It adds the player.
    public void add (PlayerRecord playRec) {
        playerRecord.add(playRec);
    }

    //This is a method that displays the player with most points.
    //If more than one player has the most points, this method displays all the players and the teams.
    //The for loop is used to loop through the size and get the most points.
    public void mostPoints() {
        int maxPoints = playerRecord.first().getPoints();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            PlayerRecord nextPlayerRecord = playerRecord.next();
            if(nextPlayerRecord.getPoints() > maxPoints) {
                maxPoints = nextPlayerRecord.getPoints();
            }
        }

        //This is getting the next player.
        //The conditions are checking if the player has the most points or not and then their respective team is printed.
        PlayerRecord nextPlayer = playerRecord.first();
        for(int j = 0; j < playerRecord.size(); j++) {
            if(nextPlayer.getPoints() == maxPoints) {
                System.out.println(nextPlayer.getName() + " " + nextPlayer.getTeamName());
            }
            nextPlayer = playerRecord.next();
        }

    }

    //This method displays the name, team name, and position for the player who was the most aggressive.
    //Most aggressive means the player who has the most penalty minutes.
    //This method also displays the other players who also has the most penalty minutes.
    //The for loop is used to loop through and check the next player.
    public void mostPenaltyMinutes() {
        int maxPenaltyMinutes = playerRecord.first().getPenaltiesMinutes();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            PlayerRecord nextPlayerRecord = playerRecord.next();
            if(nextPlayerRecord.getPenaltiesMinutes() > maxPenaltyMinutes) {
                maxPenaltyMinutes = nextPlayerRecord.getPenaltiesMinutes();
            }
        }

        //The for loop is looping through and get the player with the most penalty minutes.
        PlayerRecord nextPlayer = playerRecord.first();
        for(int j = 0; j < playerRecord.size(); j++) {
            if(nextPlayer.getPenaltiesMinutes() == maxPenaltyMinutes) {
                System.out.println(nextPlayer.getName() + " " + nextPlayer.getTeamName() + " " + nextPlayer.getPosition());
            }
            nextPlayer = playerRecord.next();
        }
    }

    //This method displays the player with the most game winning goals.
    //This method also displays the other players who have the greatest number of game winning goals.
    //The for loop is used to get the size and check if the player has the most winning goals or not.
    public void mostWinningGoals() {
        int mostGoals = playerRecord.first().getWinningGoals();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            PlayerRecord nextPlayerRecord = playerRecord.next();
            if(nextPlayerRecord.getWinningGoals() > mostGoals) {
                mostGoals = nextPlayerRecord.getWinningGoals();
            }
        }

        //The loop checks if the other player has the most winning goals or not.
        PlayerRecord nextPlayer = playerRecord.first();
        for(int j = 0; j < playerRecord.size(); j++) {
            if(nextPlayer.getWinningGoals() == mostGoals) {
                System.out.println(nextPlayer.getName() + " " + nextPlayer.getTeamName());
            }
            nextPlayer = playerRecord.next();
        }
    }

    //This method displays the name and team name for the player who has the most shots on goal.
    //The player who has the most shots on goals is considered as the most promising player.
    //This method also displays the other player who has the greatest number of shots.
    //The for loop checks the expected player and checks if the player has the most shots or not.
    public void mostGoalShots() {
        int mostShots = playerRecord.first().getGoalShots();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            PlayerRecord nextPlayerRecord = playerRecord.next();
            if(nextPlayerRecord.getGoalShots() > mostShots) {
                mostShots = nextPlayerRecord.getGoalShots();
            }
        }

        //This loop does the looping and returns the other player who has the most shots.
        PlayerRecord nextPlayer = playerRecord.first();
        for(int j = 0; j < playerRecord.size(); j++) {
            if(nextPlayer.getGoalShots() == mostShots) {
                System.out.println(nextPlayer.getName() + " " + nextPlayer.getTeamName());
            }
            nextPlayer = playerRecord.next();
        }
    }

    //This method displays the team name for the team that has the most penalty minutes.
    //Most penalty minutes is sum of all penalty minutes.
    //Here hash map is used.
    //The loop is looping through and checks if the team has the most penalty minutes or not.
    //This method also displays the other team who also has the greatest number of penalty minutes.
    public void sumPenaltyMinutes() {
        HashMap<String, Integer> maps = new HashMap<>();
        PlayerRecord playRecord = playerRecord.first();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            if(maps.get(playRecord.getTeamName()) == null) {
                maps.put(playRecord.getTeamName(), playRecord.getPenaltiesMinutes());
            } else {
                maps.replace(playRecord.getTeamName(), maps.get(playRecord.getTeamName()) + playRecord.getPenaltiesMinutes());
            }
            playRecord = playerRecord.next();
        }

        int number = Collections.max(maps.values());
        for(String e : maps.keySet()) {
            if(maps.get(e) == number) {
                System.out.println(e);
            }
        }
    }

    //This method displays the team name for the team that had the most game winning goals.
    //This method also does the summation of all the game winning goals for all players on a team.
    //Here again hash map is used.
    //The loop does the looping and checks the necessary conditions to get the team and summation.
    public void sumWinningGoals() {
        HashMap<String, Integer> maps = new HashMap<>();
        PlayerRecord playRecord = playerRecord.first();
        for(int i = 0; i < playerRecord.size()-1; i++) {
            if(maps.get(playRecord.getTeamName()) == null) {
                maps.put(playRecord.getTeamName(), playRecord.getWinningGoals());
            } else {
                maps.replace(playRecord.getTeamName(), maps.get(playRecord.getTeamName()) + playRecord.getWinningGoals());
            }
            playRecord = playerRecord.next();
        }
        int number = Collections.max(maps.values());
        for(String e : maps.keySet()) {
            if(maps.get(e) == number) {
                System.out.println(e);
            }
        }
    }

}
