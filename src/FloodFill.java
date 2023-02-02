public class FloodFill {

    public static void main(String[] args) {
//        An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
//        You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
//        To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting
//        pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those
//        pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
//        Return the modified image after performing the flood fill.
    }


//    Create a helper function that takes in the current row and column, the target color, and the replacement color as parameters.
//    Within the function, first check if the current row or column is out of bounds of the image or
//    if the current pixel color is not equal to the target color. If either is true, return.
//    Otherwise, set the current pixel color to the replacement color.
//    Call the helper function recursively on the pixels above, below, to the left, and to the right of the current pixel, with the same target and replacement color.
//    Call the helper function with the initial starting row and column, target color, and replacement color.
//    Return the modified image.

    static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) {return image;}
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr-1, sc, color, newColor); //top
        fill(image, sr+1, sc, color, newColor); //down
        fill(image, sr, sc-1, color, newColor); //left
        fill(image, sr, sc+1, color, newColor); //right
    }
}


