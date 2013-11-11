public class Game 
{
    private static Team homeTeam;
    private static Team awayTeam;

    private static int homeScore;
    private static int awayScore;

    public static void Initialize()
    {
        homeTeam = new Team ("FF7", "Cloud  ", "Aerith ", "Cid    ", "Yuffie ", "Vincent");
        awayTeam = new Team ("FFX", "Tidus  ", "Yuna   ", "Auron  ", "Rikku  ", "Wakka  ");

        homeScore = 0;
        awayScore = 0;
    }
    public static void homeTeamScore()
    {
	int hScore = homeScore;
	homeScore = ++hScore;
    }
    public static void awayTeamScore()
    {
	int aScore = awayScore;
	awayScore = ++aScore;
    }
    public static void Print()
    {
        System.out.println(homeTeam + "\nHome Score:" + homeScore + "\n\n\t\t  VS\n\n"
                         + awayTeam + "\nAway Score:" + awayScore);
    }
}