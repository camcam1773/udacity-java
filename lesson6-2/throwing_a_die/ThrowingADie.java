// lesson6/throwing_a_die
// A program that simulates tossing a die 100 times. 
// It prints the number of times you roll a 6. 

import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        // This line nitializes the generator and gives it 42 as a "seed." 
        // The generator will generate a sequence of numbers that
        // look random, but if you create another generator and seed 
        // it with 42, it will generate the same sequence. 
        // DO NOT CHANGE THIS LINE
        Random generator = new Random(42);
        int sixes=0;
        
        for (int i=0;i<100;i++) {
            int die=generator.nextInt(6)+1;
            if (die==6) {
                sixes++;
            }
        }
        System.out.println(sixes);
        // YOUR CODE HERE
        // Use a loop to roll a die 100 times. 
        // Count how many sixes you see, and print the number of
        // 6's at the end. 
        // Hint: if you're not sure how to simulate rolling a die, 
        // check out the fact sheet on generating random numbers. 
        
    }
}
