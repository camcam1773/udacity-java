//In this exercise we are going to manipulate images with the Picture class. We are
//studying 2D arrays so we will work with the 2D int array that is returned by
//Picture's getGraylevels method. This method is dicussed at the end of lesson 7.3.
//Each element of the array coresponds to a pixel in the image. The color has been
//transformed from an RGB color to a gray scale value.

//The Picture class also has a constructor that takes a 2D int array as a parameter.
//You will use that, too.

//Your task is to complete the two methods in the PictureUtil. Notice these are static methods.
//They do not act on instance variables of the PictureUtil class. In fact, the class has no
//instance data.

//Here is a description of the methods

//private static Picture grayAndFlipLeftToRight( Picture pic) :
//- This method converts the image into a 2D array of gray scale values and then flips it
//left to right. That is, an object that was facing left will now be facing right.
//The elements on the left most column will be swapped with those in the right-most column
//and so on. Manipulate the elements in the array so that the first column is swapped with
//the last column and the second column is swapped with the next to the last and so on.
//Do not make a second array.
//Then call the Picture constructor that takes a 2D int array and return the picture.

//private static Picture grayAndRotate90( Picture pic):
//- This method converts the image into a 2D array of gray scale values and then rotates it
//90 degrees clockwise (lays it on its right side) To do this, create a new array where
//the number of columns in the original array becomes the number of rows in the new array
//and the number of rows in the original becomes the number of colums. Then copy the elements
//from the first array into the proper place in the second array so that the image is
//rotated 90 degrees clockwise. The first row will become the last column
//[0][0] -> [0][numberOfColums - 1]

//There is a skeleton project for this problem that contains the graphics classes you will
//need, the tester, and the image used by the tester

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 8 - Question 1" for some tips on 
// how to begin.

/**
 * Methods to manipulate the Picture class
 */
public class PictureUtil
{
    /*
     * Gets a version of the given Picture in gray scale and flipped left to right
     * @param pic the Picture to convert to gray scale and flip
     * @return a version of the original Picture in gray scale and flipped
     * left to right.
     */
    public static Picture grayAndFlipLeftToRight( Picture pic)
    {
        // get a gray scale version
        // flip it left to right
        // create and return the new Picture
        int[][] pixels=pic.getGrayLevels();
        for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[0].length/2; j++)
            {
                int temp=pixels[i][j];
                pixels[i][j]=pixels[i][pixels[0].length-1-j];
                pixels[i][pixels[0].length-1-j]=temp;
            }
        }
        Picture pic2 = new Picture(pixels);
        return pic2;
    }

    /**
     * Gets a version of the given Picture in gray scale and rotated 90 degrees clockwise
     * @param pic the Picture to convert to gray scale and rotate 90 degrees clockwise
     * @return a version of the original Picture in gray scale and rotated 90 degrees clockwise
     */
    public static Picture grayAndRotate90( Picture pic)
    {
        // TODO get a gray scale version
        // TODO make a new array where the first row of the original becomes the last
        // column of the new array
        int[][] pixels=pic.getGrayLevels();
        int[][] pix2=new int[pixels[0].length][pixels.length];
        for (int i = 0; i < pix2.length; i++)
        {
            for (int j = 0; j < pix2[0].length; j++)
            {                
                pix2[i][j]=pixels[pix2[0].length-1-j][i];                
            }
        }
        Picture pic2 = new Picture(pix2);
        return pic2;
    }

}
