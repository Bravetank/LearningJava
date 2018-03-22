package inheritance_and_arrayList_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaShopMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.nextLine();

        Pizza pizza1 = new Regular();
        String response = "y";
        ArrayList<Pizza> pizzas = new ArrayList<>();

        while (response.equals("y")) {

            System.out.println("What type of pizza do you want? Regular or Sicilian?");
            String type = in.nextLine();

            //This could be refactored as there is repetition here - the only thing that's different is Regular or Sicilian?

            if (type.equalsIgnoreCase("Regular")) {
                System.out.println("What size pizza? S, M, L, X");
                String size = in.nextLine();
                if (size.equalsIgnoreCase("S")) {
                    pizza1 = new Regular(12);
                } else if (size.equalsIgnoreCase("M")) {
                    pizza1 = new Regular(14);
                } else if (size.equalsIgnoreCase("L")) {
                    pizza1 = new Regular(16);
                } else if (size.equalsIgnoreCase("X")) {
                    pizza1 = new Regular(18);
                }
                pizza1.getToppings();
                pizzas.add(pizza1);

            } else {
                System.out.println("What size pizza? S, M, L, X");
                String size = in.nextLine();
                if (size.equalsIgnoreCase("S")) {
                    pizza1 = new Sicilian(12);
                } else if (size.equalsIgnoreCase("M")) {
                    pizza1 = new Sicilian(14);
                } else if (size.equalsIgnoreCase("L")) {
                    pizza1 = new Sicilian(16);
                } else if (size.equalsIgnoreCase("X")) {
                    pizza1 = new Sicilian(18);
                }
                pizza1.getToppings();
                pizzas.add(pizza1);
            }

            System.out.println("Do you want to order another pizza? y/n");
            response = in.nextLine();
        }

            for(Pizza p: pizzas) {
                p.printString();
                System.out.println();

            }
        }
    }






