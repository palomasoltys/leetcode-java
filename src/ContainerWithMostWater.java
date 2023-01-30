public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7})); //49
    }

    static int maxArea(int[] arr) {
        // All pairs of the n lines define a rectangle with a height given by the shorter line and a width given by the distance between the lines. Return the area of the rectangle with the largest area."

        //create a maxArea variable and initialize it to 0
        int maxArea = 0;
        //create 2 pointers, left and right (0 and len of the arr - 1)
        int left = 0;
        int right = arr.length - 1;
        int shorter = 0;
        //iterate while right is greater than left
        while(right > left) {
            //get the current area (the height is gonna be the smallest el and width is the diff between right and left
            if(arr[right] <= arr[left]) {
                shorter = arr[right];
            } else {shorter = arr[left];}
            var area = (shorter * (right - left));
            //update to maxArea
            maxArea = Math.max(maxArea, area);
            //if arr[right] >= arr[left] increment left
            if(arr[right] >= arr[left]) {
                left++;
            } else {
                //if arr[left] > arr[right] decrement right+
                right--;
            }
        }
        //return maxArea
        return maxArea;



    }
}
