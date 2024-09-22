<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI2110
### NHL Stats Project
This Java project manages and analyzes NHL player statistics. It provides functionality to track player performance, calculate various metrics, and identify top performers in different categories.

#### Features
- Store and manage individual player records
- Calculate player points (goals + assists)
- Identify players with the highest points
- Find the most aggressive players (highest penalty minutes)
- Determine the most valuable players (most game-winning goals)
- Identify the most promising players (most shots on goal)
- Calculate team statistics (total penalty minutes and game-winning goals)

#### Classes
##### PlayerRecord
This class represents an individual player's record, including:
- Name
- Position
- Team name
- Games played
- Goals scored
- Assists
- Penalty minutes
- Goal shots
- Winning goals


#### To run this project:
1. Compile all Java files.
2. Run the NHLStatsDemo class.
3. When prompted, enter the filename containing the NHL stats data.
4. The program will analyze the data and display various statistics.

#### Sample input and output
```
Enter the filename to read from: src/nhlstats.txt
Players with highest points and their teams:
St.Louis TB
Most aggressive players, their teams and their positions:
Clowe NYR RW
Ott BUF C
Most valuable players and their teams:
Carter LA
Most promising players and their teams:
Ovechkin WSH
Teams that had the most number of penalty minutes:
BOS
Teams that had the most number of game winning goals:
PIT

Process finished with exit code 0
```
