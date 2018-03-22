package inheritance_and_arrayList_practice;

import java.util.Scanner;

public class Regular extends Pizza {

    public Regular(){
    }

    public Regular(int size){
        super(size);
        this.type = "Regular";
    }


    @Override
    public void getToppings() {  //Why wouldn't this be in main? We repeat the code in Sicilian.
        Scanner in = new Scanner(System.in);
        System.out.println("How many toppings do you want?");
        int numToppings = in.nextInt();
        in.nextLine();
        while (numToppings > 4){
            System.out.println("You are only allowed 4 toppings");
            System.out.println("How many toppings do you want");
            numToppings = in.nextInt();
            in.nextLine();
        } for(int i=0; i < numToppings; i++){
            System.out.println("Enter topping: ");
            String topping = in.nextLine();
            toppings.add(topping);
            cost += 2.00;

        }

    }

}
