/*
 * @author Ömer Zeyveli
 * LeetCode User Name: Riive
 * Leetcode Question 9: Palindrome Number.
 */

class Solution {
    public static boolean isPalindrome(int x) {
        // It's not palindrome if its negative.
        if(x < 0){
            return false;
        }
        int temp = x; // Temp value of x.
        int reverse = 0; // Reverse of x.
        // Reversing x by, adding modulus 10 of temp to reverse and dividing temp by 10 until temp is 0;
        while(temp > 0){
            reverse*=10;
            reverse += temp % 10;
            temp /= 10;
        }
        // Is palindrome?
        if(x == reverse){
            return true;
        }
        return false;
    }
}
