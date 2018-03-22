package probability_algorithm_example;

import java.util.Arrays;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        System.out.println("Probability of Drawing 3 marbles of the same color-");
        System.out.println("100 trials: " + marbleSimulation(100));
        System.out.println("1000 trials: " + marbleSimulation(1000));
        System.out.println("10000 trials: " + marbleSimulation(10000));
    }


    public static String marbleSimulation(int numTrials)
    {
        final int B = 1;
        final int W = 2;

        double number = 0.0;
        double result = 0.0;

        for (int t = 0; t < numTrials; t++)
        {
            //Everytime we run the trial this goes up by 1
            result++;


            //int array (bowl)
            int[] bowl =
            { B, B, B, W, W, W};

            //int array drawMarbles (size 3)
            int[] drawMarbles = new int[3];

            //Drawing 3 loop
            for (int draw = 0; draw < 3; draw++)
            {
                //Random index between 1-6 (bowl length * Math.random()). Cast to int.
                int index = (int) (Math.random() * bowl.length);

                //Pushes to drawMarbles array (position = draw = 0 to 2) the random index selection from bowl
                drawMarbles[draw] = bowl[index];

                //Now reduces bowl size by 1 (as one marble removed)
                int[] newBowl = new int[bowl.length - 1];

                int j = 0;

                //Loops through old bowl
                for (int i = 0; i < bowl.length; i++)
                {
                    //Checks if i selected is the same as the index already selected. Ignores if it is
                    if (i == index)
                    {
                        continue;
                    }

                    //Puts everything bar index already used for drawMarble into newBowl
                    newBowl[j] = bowl[i];

                    //Moves j position up by 1 so next marble into new position
                    j++;
                }
                //replaces bowl with newBowl (ie one less marble)
                bowl = newBowl;
            }

            //if in bowl 1st marble == 2nd marble and 2nd marble == 3 (ie all the same colour)
            if (drawMarbles[0] == drawMarbles[1] && drawMarbles[1] == drawMarbles[2])
            {
                //Adds this to number
                number++;
               // System.out.println("winner");
            }
            //System.out.println(Arrays.toString(drawMarbles));
        }

        //Returns number of same number/result
        return "Results: " + (number / result);
    }
}