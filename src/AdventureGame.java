import java.util.Scanner;

public class AdventureGame {



    public static void main(String[] args) {
        System.out.println("______________________     ____________  ___ ______________________________________________     _______________________________\n" +
                "7      77  7  77     7=====7  _  77    \\ 7  V  77     77     77      77  7  77  _  77     7=====7     77  _  77        77     7\n" +
                "!__  __!|  !  ||  ___!=====|  _  ||  7  ||  |  ||  ___!|  _  |!__  __!|  |  ||    _||  ___!=====|   __!|  _  ||  _  _  ||  ___!\n" +
                "==7  |==|     ||  __|======|  7  ||  |  ||  !  ||  __|_|  7  |==7  7==|  |  ||  _ \\ |  __|_=====|  !  7|  7  ||  7  7  ||  __|_\n" +
                "==|  |==|  7  ||     7=====|  |  ||  !  ||     ||     7|  |  |==|  |==|  !  ||  7  ||     7=====|     ||  |  ||  |  |  ||     7\n" +
                "==!__!==!__!__!!_____!=====!__!__!!_____!!_____!!_____!!__!__!==!__!==!_____!!__!__!!_____!=====!_____!!__!__!!__!__!__!!_____!\n" +
                "                                                                                                                               ");
        System.out.println("___ __ ______________   ___________________________________     ___ __ _________________________     ___________     ____________________________     ______________________________________\n" +
                "7  V  V  77     77  7   7     77     77        77     77  7     7  V  V  77  7  77  _  77      7     7  77     7     7  7  77     77  7  77  _  7     7     77  _  77        77     77     7\n" +
                "|  |  |  ||  ___!|  |   |  ___!|  7  ||  _  _  ||  ___!|  |     |  |  |  ||  !  ||  _  |!__  __!     |  ||  ___!     |  !  ||  7  ||  |  ||    _|     |  _  ||  _  ||  _  _  ||  ___!!__!  |\n" +
                "|  !  !  ||  __|_|  !___|  7___|  |  ||  7  7  ||  __|_!__!     |  !  !  ||     ||  7  |  7  7       |  |!__   7     !_   _!|  |  ||  |  ||  _ \\      |  7  ||  7  ||  7  7  ||  __|_   !__!\n" +
                "|        ||     7|     7|     7|  !  ||  |  |  ||     7____     |        ||  7  ||  |  |  |  |       |  |7     |      7   7 |  !  ||  !  ||  7  |     |  |  ||  |  ||  |  |  ||     7   ____\n" +
                "!________!!_____!!_____!!_____!!_____!!__!__!__!!_____!7__7     !________!!__!__!!__!__!  !__!       !__!!_____!      !___! !_____!!_____!!__!__!     !__!__!!__!__!!__!__!__!!_____!   7__7\n" +
                "                                                                                                                                                                                            ");
        Scanner scan = new Scanner(System.in);
        String charName = scan.nextLine();
        System.out.println("Would you like to go on an adventure, " + charName + "?");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            System.out.println("Awesome sauce! Here is your first challenge!");
            //entering betsy stats
            String monster1 = "Betsy the Spider";
            System.out.println(monster1 + ".\n");
            int attackPoints = 8;
            int betsyHp = 50;
            System.out.println(monster1 + "'s attack is " + attackPoints + ".\n");
            System.out.println(monster1 + "'s Hitpoints are " + betsyHp + ".\n");
            System.out.println(monster1 + ": Your mother was a hamster and " +
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
            System.out.println(monster1 + "'s hitpoints have reached 0.");
            System.out.println("You have defeated " + monster1 + ".");

//                System.out.println("Would you like to play again?");
//                System.out.println("Would you like to take on the next challenger?");

        } else {
            System.out.println("But... but... okay bye...");
        }
    }

    public static void battleSystem(int attack,int myHp, int potion,int potionInc, int atkPoints, int betsyHp ){
        Scanner scan = new Scanner(System.in);
        String monster1 = "Betsy the Spider";
        System.out.println("What would you like to do?\n" +
                "1.Hit him with the stick\n" +
                "2.Drink the magic Elixir\n" +
                "3.Run for your life!!!\n");
        String playerOption = scan.nextLine();

        while(betsyHp > 0){
            if(playerOption.equalsIgnoreCase("1")){
                System.out.println("You did " + attack + " damage!, " + monster1 + "'s health is at " + betsyHp +"\n");
                betsyHp = betsyHp - attack;
                if (betsyHp < 0) {
                    System.out.println(monster1 + " has been violently beaten to death with a stick.");
                }
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
            } break;
        }
    }
}

