import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome Warrior! what is your name?");
        String charName = scan.nextLine();
//        System.out.println("charName = " + charName);
        System.out.println("Would you like to go on an adventure " + charName + "?");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("Awesome sauce! Here is your first challenge!");
            //entering betsy stats
            System.out.println("Betsy the Spider\n");
            int attackPoints = 8;
            int betsyHp = 50;
            System.out.println("Betsy's attack is " + attackPoints + ".\n");
            System.out.println("Betsy's Hitpoints are " + betsyHp + ".\n");
            System.out.println("Betsy the Spider: Your mother was a hamster and " +
                    "your father smelt of elderberries!\n");

            int heroAtk = 10;
            int heroHp = 100;
            int potions = 3;
            int potionIncrease = 20;
            System.out.println(charName + ", your health is " + heroHp + " and your trusty stick does "
                    + heroAtk + " damage! BOOYAH!");
            System.out.println("You have " + potions + " potions\n");

            
            System.out.println("Prepare for Battle!!!");

            System.out.println("What would you like to do?\n" +
                    "1.Hit him with the stick\n" +
                    "2.Drink the magic Elixir\n" +
                    "3.Run for youe life!!!\n");
            String playerOption = scan.nextLine();
            
            while(heroHp >= 0){
                if(playerOption.equalsIgnoreCase("1")){
                    betsyHp = betsyHp - heroAtk;
                    System.out.println("You did " + heroAtk + " damage!, Bestsy Health is at " + betsyHp);
                    break;
                    
                } else if(playerOption.equalsIgnoreCase("2")){
                    System.out.println("You drank a potion and gained" + potionIncrease + " health");
                    heroHp = heroHp + potionIncrease;
                    System.out.println("Hero HP is at " + heroHp);
                    break;
                }
            }





        } else {
            System.out.println("FATALITY!!!");
        }
     }

//     public static String giantSpider() {
//        String name = "Betsy";
//        int betsyAttk = 8;
//        int betsyHP = 50;
//         System.out.println(name);
//
//     }

}
