// BlueJ project: lesson9/scene4
/*
   TODO: Dogs should be moveable.
   They move one pixel downwards every second.
*/

public class Dog implements Drawable,Moveable
{
    private Picture pic;
    private Text name;

    public Dog(int x, int y, String file)
    {
        pic = new Picture(file);
        pic.translate(x, y);
        name = new Text(x, y + pic.getHeight(),
                        file.substring(0, file.indexOf(".")));
    }

    public void draw()
    {
        pic.draw();
        name.draw();
    }
    
    public void move(int seconds) {
        final int SPEED = 1;
        pic.translate(0, SPEED*seconds);
        name.translate(0, SPEED*seconds);
    }
}
