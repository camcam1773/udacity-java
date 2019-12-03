// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double totalScores;
    private int numScores;
    private double lowest;
        
    public HomeworkScores()
    {
        totalScores = 0;
        numScores = 0;
        lowest=100;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        totalScores+=score;
        numScores++;
        if (score<lowest) lowest=score;
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (numScores>1) return (totalScores-lowest);
        else if(numScores==1) return totalScores;
        else return 0;
        
    } 
}
