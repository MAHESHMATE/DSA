/*
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".

Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
 

Constraints:

1 <= num.length <= 105
num only consists of digits and does not contain any leading zeros.
 */

public class largestOddNumberInString {
    static private String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i--) { //checking digits from the last character moving toward the first
            if(Character.getNumericValue(num.charAt(i)) % 2 != 0) { //converted character to integer, if the number is odd
                return num.substring(0, i+1); //return the string from starting index to that number index
            }
        }
        return ""; // if no odd number found empty string is return
    }
    public static void main(String[] args) {
        String num = "6585746";
        System.out.println("The given string is: " + num);
        System.out.println("The largest odd number in string is: " + largestOddNumber(num));
    }
}

/*
 * Time complexity: O(n) (where n is the length of the string)
 * Space complexity: O(0) (no extra space is used)
 */