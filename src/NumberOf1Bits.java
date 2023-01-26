public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(-3)); //31

    }

//    Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
//    Note: Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be
//    given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation
//    is the same, whether it is signed or unsigned.

    static int hammingWeight(int n) {
        //convert n to binary
        var st = Integer.toBinaryString(n);
        //create a count variable
        int count = 0;
        //iterate through the string
        for(var ch: st.toCharArray()) {
            //if ch is equal to 1, increment count
            if(ch == '1') {count++;}
        }
        return count;
        //return count
    }
}
