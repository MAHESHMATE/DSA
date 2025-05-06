/*
Problem Statement: Given a string s, reverse the words of the string.

Example 1:
Input: s=”this is an amazing program”
Output: “program amazing an is this”

Example 2:
Input: s=”This is decent”
Output: “decent is This”
 */


/*
import java.util.*;

class palindromeCheck {
    public static void main(String[] args) {
        String s = "I am a software engineer";
        System.out.print("Before reversing words: ");
        System.out.println(s);
        s += " "; //space is added at the end so that last word gets processed in the loop

        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i=0; i<s.length(); i++) { //loop iterates through each character of the string
            if (s.charAt(i) == ' ') {
                st.push(str); //if ' ' is found, the word collected in str is pushed onto the stack
                str = ""; //str is reset to an empty string to build the next word
            } else {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1) {
            //words are popped from the satck and added to ans
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); //the last word should't have space after it
        System.out.print("After reversing words: ");
        System.out.println(ans);
    }
}

Time Complexity: O(N), Traversing the entire string
Space Complexity: O(N), Stack and ans variable
*/

//OPTOMIZED APPROACH

/* 
import java.io.*;

class palindromeCheck {
    static private String result( String s) {
        //initialized left & right pointers
        int left = 0; // left is used to iterate through string
        int right = s.length() - 1;

        String temp = ""; //holds the current word
        String ans = ""; //holds the final reversed sentense

        while (left <= right) { //this loop iterates from left to right over the string
            char ch = s.charAt(left);
            if (ch != ' ') { //if character is not a space
                temp += ch; // add it to the temp
            } else if (ch == ' ') { //if character is a space
                if (!ans.equals("")) {
                    ans = temp + " " + ans; //the word temp is inserted in front of ans
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        if (!temp.equals("")) { //handling the last word which doesn't end with space also added
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "I am learning react";

        System.out.print("Before reversing words: ");
        System.out.println(s);

        System.out.print("After reversing words: ");
        System.out.println(result(s));
    }
}

Time Complexity: O(N), N~length of string
Space Complexity: O(1), Constant Space
*/