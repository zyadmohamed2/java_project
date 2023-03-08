import java.util.Scanner;
import java.util.function.BiConsumer;


public class abdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int buying;
        boolean virtical = false;
        int []arrym = new int[10];
        int cont = 0 ;
        int suum = 0;
        String s;
        int kilos;
        System.out.println("Select the product number you want to purchase");
        System.out.println("1 - cow's milk = 18$");
        System.out.println("2 - noodles = 20$");
        System.out.println("3 - My apple pound is = 24$");
        System.out.println("4 - Carrot Pounds = 10$");
        System.out.println("5 - pounds tomato = 15$");
        System.out.println("6 - Pound Orange = 5$");
        System.out.println("7 - pounds of my meat is = 280$");
        System.out.println("8 - My chickens are = 100$");
        System.out.println("9 - pound frozen chicken = 80$");
        System.out.println("10 - pounds of frozen meat = 100$");
        System.out.println("0 - exit");
        System.out.println("Choose the appropriate number for you from the list");
        do{
            System.out.print("Enter the number: ");
            buying = input.nextInt();
            System.out.println("how many kilos");
            kilos = input.nextInt();
            buying *= kilos;

            if(buying < 0 || buying > 10){
                System.out.println("You have entered a number that does not exist. Enter a number between 0 and 10");
                virtical = true;
            }
            else if (buying == 0){
                virtical = false;
            }
            else if(buying != 0){
                
                virtical = true;
            }
            if (buying == 1)
            {
                System.out.println("You have bought cow's milk, enter $18");


            }
            else if (buying == 2)
            {
                System.out.println("You have bought noodles. Enter 20$");
            }
            else if (buying == 3)
            {
                System.out.println("You have purchased an apple bond. Enter the amount of 24$");
            }
            else if (buying == 4)
            {
                System.out.println("You have purchased a Carrot Bond, enter the amount of 10$");
            }
            else if (buying == 5)
            {
                System.out.println("You have purchased a tomato bond. Enter the amount of 15$");
            }
            else if (buying == 6)
            {
                System.out.println("You have purchased an orange bond. Enter the amount of 5$");
            }
            else if (buying == 7)
            {
                System.out.println("You have purchased a beef bond. Enter the amount of 280$");
            }
            else if (buying == 8)
            {
                System.out.println("You have bought my chicken bond. Enter 100$");
            }
            else if (buying == 9)
            {
                System.out.println("You have bought a frozen chicken bond. Enter the amount of 80$");
            }
            else if (buying == 10)
            {
                System.out.println("You have purchased a frozen beef bond. Enter 100$");
            }
            else
                System.out.println("not found older");
            if (buying == 1){
                arrym[cont] = 18;
            }
            else if (buying == 2){
                arrym[cont] = 20;
            }
            else if (buying == 3){
                arrym[cont] = 24;
            }
            else if (buying == 4){
                arrym[cont] = 10;
            }
            else if (buying == 5){
                arrym[cont] = 15;
            }
            else if (buying == 6){
                arrym[cont] = 5;
            }
            else if (buying == 7){
                arrym[cont] = 280;
            }
            else if (buying == 8){
                arrym[cont] = 100;
            }
            else if (buying == 9){
                arrym[cont] = 80;
            }
            else if (buying == 10){
                arrym[cont] = 100;
            }

            cont++;
            if(cont >= 10){

                virtical = false;
            }
        }while(virtical);
        for(int i = 0 ; i < arrym.length ; i++){
            suum += arrym[i];
        }
        System.out.println("Your bill is equal = " + suum);
        System.out.println("Do you want to see the products you have purchased? yes or no");
        s = input.next();
        if(s.equals("yes")){
            for(int i = 0 ; i < arrym.length ; i++){
                if(arrym[i] > 0){
                    if (arrym[i] == 18){
                        System.out.println("1 - cow's milk = 18$");
                    }
                    else if (arrym[i] == 20){
                        System.out.println("2 - noodles = 20$");
                    }
                    else if (arrym[i] == 24){
                        System.out.println("3 - My apple pound is = 24$");
                    }
                    else if (arrym[i] == 10){
                        System.out.println("4 - Carrot Pounds = 10$");
                    }
                    else if (arrym[i] == 15){
                        System.out.println("5 - pounds tomato = 15$");
                    }
                    else if (arrym[i] == 5){
                        System.out.println("6 - Pound Orange = 5$");
                    }
                    else if (arrym[i] == 280){
                        System.out.println("7 - pounds of my meat is = 280$");
                    }
                    else if (arrym[i] == 100){
                        System.out.println("8 - My chickens are = 100$");
                    }
                    else if (arrym[i] == 80){
                        System.out.println("9 - pound frozen chicken = 80$");
                    }
                    else if (arrym[i] == 100){
                        System.out.println("10 - pounds of frozen meat = 100$");
                    }
                }
            }
        }
        else if(s.equals("no")){
            System.out.println("ok");
            System.out.println("We are pleased to deal with you");
        }

    }
}