
//CS210(c) F2017
//Liam,Thompson
//this program prints the "Fight song" provided by the Java textbook.

public class FightSong {
    public static void main(String[] args) {
        goTeam();
        println("");
        //repeats the chorus twice.
        for (int i = 0; i < 2; i++) {
            chorus();
            println("");
        }
        goTeam();
    }

    /**
     * prints the "go, team, go!" portion of the song.
     */
    public static void goTeam() {
        println("Go, team, go!");
        println("You can do it.");
    }

    /**
     * prints the "you're the best" portion of the song.
     */
    public static void yourBest() {
        println("You're the best,");
        println("In the west.");
    }

    /**
     * prints the songs chorus.
     */
    public static void chorus() {
        goTeam();
        yourBest();
        goTeam();
    }

    /**
     * shorthand print method.
     * @param string a string of text.
     */
    public static void println(String string) {
        System.out.println(string);
    }
}

