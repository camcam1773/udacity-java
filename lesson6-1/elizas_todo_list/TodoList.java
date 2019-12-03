// Bluej project: lesson6/elizas_todo_list
// Video: A More Complicated To Do List

// Actually, Elizas todo list should look like this:
// 1. Eat
// 2. Sleep
// 3. Eat
// 4. Sleep
// 5. Eat
// 6. Sleep
public class TodoList
{
    public static void main(String[] args)
    {
        for (int counter = 1; counter <= 6; counter++)
        {
            System.out.println(counter + ". Eat");
            counter++;
            System.out.println(counter + ". Sleep");
        }
    }
}
