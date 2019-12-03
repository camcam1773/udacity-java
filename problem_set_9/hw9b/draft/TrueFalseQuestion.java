// You are going to add a true/false type question to the question heirachy. Call it
// TrueFalseQuestion
//
// When the quiz is displayed, we want this text to preceed the question.
//     Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.
//
// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.
//
// You will need to override three methods although not everyone will override the
// exact same three methods
//
// You will not need to add instance variables
//
//For the draft, make the changes necessary to prepend the question submitted bu the user with
//    Answer True or False:
//
public class TrueFalseQuestion extends Question
{   
    public void display(){
       	System.out.print("Answer True or False: ");
       	super.display();
    }
    public void setAnswer(String a){
        super.setAnswer(a.substring(0, 1).toLowerCase() );
    }
    public boolean checkAnswer(String a) {
        if (a.length()==1 || a.length()==5) return super.checkAnswer(a.substring(0, 1).toLowerCase());
        else return false;
    }
}
