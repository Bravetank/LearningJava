package arrays_exercises;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] payments = {
                {100,200,300},
                {150,100,150},
                {200,400,600},
                {300,600,900},
                {250,350,450} };

        System.out.println("Jan \tFeb \tMarch");
        for(int row = 0; row < payments.length; row++){
            for(int col = 0; col < payments[0].length; col++){
                System.out.print("£"+ payments[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
