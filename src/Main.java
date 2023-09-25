import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Battle simulator");
        var player1 = new Player();
        characterName(player1);

        System.out.println("Welcome "+player1.name+" to the battle showdown!");
        System.out.println("");

        loadingDelay();

        playerClass(player1);//get player class

        while(!startGame(player1)) {

        }
        System.out.println("Entering the Showdown...");

        loadingDelay();


    }

    public static void characterName(Player player1){
        System.out.println("Enter character name: ");
        player1.name = reader.nextLine();


    }

    public static void playerClass(Player player1){
        System.out.println("Select a class");
        System.out.println("1.Warrior");
        System.out.println("2.Mage");
        System.out.println("3.Summoner");
        System.out.println("4.Gunslinger");
        int playerClass = reader.nextInt();
        System.out.print("You selected ");

        switch (playerClass){
            case 1:
                System.out.print("warrior");
                player1.warrior = true;
                player1.physicalAttack+=5;
                player1.defense+=10;
                break;
            case 2:
                System.out.print("mage");
                player1.mage = true;
                player1.magicAttack+=15;
                break;
            case 3:
                System.out.print("summoner");
                player1.summoner=true;
                player1.summonDamage+=10;
                player1.defense+=5;
                break;
            case 4:
                System.out.print("gunslinger");
                player1.gunslinger=true;
                player1.rangedAttack+=10;
                player1.speed+=5;
                break;

        }
        System.out.println(" ");
    }

    public static boolean startGame(Player player1){
        System.out.println("Hey "+ player1.name+" are you ready to enter the world of Battle?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int start = reader.nextInt();
        if(start == 1){
            return true;
        }
        else {
            System.out.println("That's alright, Let me know when your ready");
            return false;
        }
    }

    public static void loadingDelay(){
        //delay
        try {
            // Adding a 3-second delay (3000 milliseconds)
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // Handle the exception
            e.printStackTrace();
        }

    }
}

