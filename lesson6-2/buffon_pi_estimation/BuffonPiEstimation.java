// BlueJ project: lesson6/buffon_pi_estimation

// Estimates pi using the Compte de Buffon's needle dropping method
// Take a 1 inch needle. Repeatedly drop it on a sheet of
// ruled paper whose lines are 2 inches apart
// tries / hits = an approximation of pi

import java.util.Random;
import java.util.Scanner;

public class BuffonPiEstimation
{
    public static void main(String[] args)
    {
        System.out.println("Buffon Pi Estimation");
        System.out.println("Enter the number of tries: ");
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();        
        double hits=0;

        Random generator = new Random(42);
       
        for (int i=0;i<tries;i++) {
            double yLow=generator.nextDouble()*2;
            double angle=generator.nextDouble()*180;
        	double yHigh=yLow+Math.sin(Math.toRadians(angle));
        	if (yHigh>=2) hits++;
    	}
    	double piEstimate=tries/hits;
        System.out.println(piEstimate);
    }
}
