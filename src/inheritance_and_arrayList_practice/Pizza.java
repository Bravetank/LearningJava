package inheritance_and_arrayList_practice;

import java.util.ArrayList;

public abstract class Pizza implements Comparable {
    public static final int smallDiam = 12;
    public static final int medDiam = 14;
    public static final int lgDiam = 16;
    public static final int xlgDiam = 18;
    public double[] price = {10.00, 12.00, 14.00, 16.00};
    public double cost;
    public String type; //Regular or Sicilian
    public ArrayList<String> toppings = new ArrayList<>();
    int size; //Customer enters S, M, L or X. We convert to size then use switch to figure out Diameter & Cost. Not sure why we need diameter???


    public Pizza(){
        type = "pizza";
    } //Default

    public Pizza(int size){
        switch(size){
            case smallDiam:cost = price[0];
                size = smallDiam;
                break;
            case medDiam:cost = price[1];
                size = medDiam;
                break;
            case lgDiam:cost = price[2];
                size = lgDiam;
                break;
            case xlgDiam:cost = price[3];
                size = xlgDiam;
                break;
             default:
                 System.out.println("invalid size");
                 break;
        }
    }

    public abstract void getToppings(); //Implemented in the subclass

    @Override
    public int compareTo(Object T) { //We don't use this compareTo method???
        Pizza pizzaT = (Pizza) T;
        if (this.size > pizzaT.size){
            return 1;
        } else if (this.size == pizzaT.size) {
                return 0;
            } else {
                return -1;
            }
        }

        public void printString(){
            String topping = "";
            if (toppings.size() == 0) {
                topping = "no topping selected";
            } else {
                for(int i=0; i < toppings.size(); i++){
                    topping += toppings.get(i) + ", ";
                }
            }
            System.out.printf("Your order costs: £%5.2f and your toppings are %s", cost, toppings);
        }
}
