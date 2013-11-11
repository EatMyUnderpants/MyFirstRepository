public class Team
{
    private Players P1;
    private Players P2;
    private Players P3;
    private Players P4;
    private Players P5;

    private String TeamName;

    public Team(String Name, String Player1, String Player2, String Player3,
            String Player4, String Player5)
    {
        TeamName = Name;
        P1 = new Players (Player1, "Soldier");
        P2 = new Players (Player2, "Summoner");
        P3 = new Players (Player3, "Knight");
        P4 = new Players (Player4, "Ninja");
        P5 = new Players (Player5, "Paladin");
    }
    public String toString()
    {
        return "\t\t " + TeamName + "\n\nPlayer1: " + P1 + "\nPlayer2: " + P2 +
                          "\nPlayer3: " + P3 + "\nPlayer4: " + P4 +
                          "\nPlayer5: " + P5;
    }
}