public class Players
{
    private String Player;
    private String Position;

    public Players(String pl, String po)
    {
        Player = pl;
        Position = po;
    }
    public String toString()
    {
        return Player + "\nPosition: " + Position;
    }
}