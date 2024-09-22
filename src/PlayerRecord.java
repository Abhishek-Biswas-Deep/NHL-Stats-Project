/**
 * This class is acting as an object. It is creating all the necessary variables that is used later.
 * Getters and Setters are also used to get and set the appropriate methods.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */


public class PlayerRecord {

    //instance variables
    private String name;
    private String position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltiesMinutes;
    private int goalShots;
    private int winningGoals;

    //constructor
    public PlayerRecord (String name, String position, String teamName, int gamesPlayed, int goalsScored, int assists,
                         int penaltiesMinutes, int goalShots, int winningGoals) {
        this.name = name;
        this.position = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltiesMinutes = penaltiesMinutes;
        this.goalShots = goalShots;
        this.winningGoals = winningGoals;
    }

    //This is a toString
    public String toString() {
        return name + "\t" + position + "\t" + teamName + "\t" + gamesPlayed + "\t" + goalsScored + "\t" + assists + "\t"
        + penaltiesMinutes + "\t" + goalShots + "\t" + winningGoals + "\t" + "\n";
    }

    //This method overrides the equals method in the Object class
    public boolean equals (PlayerRecord other) {
        return (name.equals(other.getName()) && position.equals(other.getPosition()) && teamName.equals(other.getTeamName()) &&
        gamesPlayed == other.getGamesPlayed() && goalsScored == other.getGoalsScored() && assists == other.getAssists() &&
        penaltiesMinutes == other.getPenaltiesMinutes() && goalShots == other.getGoalShots() && winningGoals == other.getWinningGoals());
    }

    //Getters
    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenaltiesMinutes() {
        return penaltiesMinutes;
    }

    public int getGoalShots() {
        return goalShots;
    }

    public int getWinningGoals() {
        return winningGoals;
    }

    public int getPoints() {
        return goalsScored + assists;
    }
}
