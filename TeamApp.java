public class TeamApp {
    public static void main(String[] args) { 
        printTeamInfo();
        printWelcome();
        System.out.println("Our team application");
        System.out.println("Welcome from Student A and B!!"); 
        printGoodbye();
    }

    public static void printWelcome() {
        System.out.println("Welcome to our application!");
    }

    public static void printGoodbye() {
       System.out.println("Thanks for using our application!");
    }
    public static void printTeamInfo() {
        System.out.println("Created by the CS 67 team");
    }
}
