package arrays_exercises;

public class MultiDimArray2 {

    public static void main(String[] args) {

        String [][] capitals = new String[3][2];
        capitals[0][0] = "Wales";
        capitals[0][1] = "Cardiff";

        capitals[1][0] = "England";
        capitals[1][1] = "London";

        capitals[2][0] = "Scotland";
        capitals[2][1] = "Edinburgh";

        for(int i = 0; i < capitals.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(capitals[i][0])
                    .append(" is ")
                    .append(capitals[i][1]);
            System.out.println(sb);

        }
    }
}
