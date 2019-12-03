//hw04_07
/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    /*
     * Gets the letter grade associated with this numberic grade
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */

    public String getLetterGrade(int grade) {
        if (grade<60) return "F";
        else if (grade<70) return "D";
        else if (grade<80) return "C";
        else if (grade<90) return "B";
        else return "A";
    }
}

/*The American grading system generally matches numeric grades to letter grades as so:

90 - 100 : A
80 - 89 : B
70 - 79 : C
60 - 69 : D

Anything below a score of 60 gets matched to a letter grade of F. */
