import java.util.Scanner;

public class AdventureGame {


    public static void main(String[] args) {
        System.out.println("Welcome Warrior! what is your name?");
        Scanner scan = new Scanner(System.in);
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
            System.out.println("Prepare for Battle!!!");

            int heroAtk = 10;
            int heroHp = 100;
            int potions = 3;
            int potionIncrease = 20;
            System.out.println(charName + ", your health is " + heroHp + " and your trusty stick does "
                    + heroAtk + " damage! BOOYAH!");
            System.out.println("You have " + potions + " potions\n");
            battleSystem(heroAtk, heroHp, potions, potionIncrease, attackPoints, betsyHp);
            System.out.println("Would you like to play again?");
            System.out.println("Would you like to play again?");






             } else {
                 System.out.println("FATALITY!!!");
        }
     }

     public static void battleSystem(int attack,int myHp, int potion,int potionInc, int atkPoints, int betsyHp ){
        Scanner scan = new Scanner(System.in);
//         int attackPoints = 8;
//         int betsyHp = 50;
//         int heroAtk = 10;
//         int heroHp = 100;
//         int potions = 3;
//         int potionIncrease = 20;
         System.out.println("What would you like to do?\n" +
                 "1.Hit him with the stick\n" +
                 "2.Drink the magic Elixir\n" +
                 "3.Run for your life!!!\n");
         String playerOption = scan.nextLine();

         while(betsyHp > 0){
             if(playerOption.equalsIgnoreCase("1")){
                 betsyHp = betsyHp - attack;
                 System.out.println("You did " + atkPoints + " damage!, Bestsy Health is at " + betsyHp +"\n");
                 battleSystem(attack,myHp,potion,potionInc,atkPoints,betsyHp);

             } else if(playerOption.equalsIgnoreCase("2")){
                 potion = potion - 1;
                 System.out.println("You drank a potion and gained" + potionInc + " health , you have " + potion + "left\n");
                 myHp = myHp + potionInc;
                 System.out.println("Hero HP is at " + myHp);
                 battleSystem(attack,myHp,potion,potionInc,atkPoints,betsyHp);
             } else if(playerOption.equalsIgnoreCase("3")){
                 System.out.println("You can't run!\n");
                 battleSystem(attack,myHp,potion,potionInc,atkPoints,betsyHp);
             } else{
                 System.out.println("Not a valid response try again\n");
                 battleSystem(attack,myHp,potion,potionInc,atkPoints,betsyHp);
             }
         }

     }


}
