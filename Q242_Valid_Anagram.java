/*
 * @author Ömer Zeyveli
 * User Name: Riive
 * Leetcode Question 242: Valid Anagram
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        // Arrays to hold the number of each character in strings.
        int[] sArr = new int[26];
        int[] tArr = new int[26]; 
        
        // Filling the arrays.
        sArr = charFiller(s, sArr);
        tArr = charFiller(t, tArr);

        // Checking if arrays are equal.
        if(Arrays.equals(sArr, tArr)){
            return true;
        }
        return false;
    }

    public int[] charFiller (String s, int[] arr){
        int sLen = s.length(); // Length of string.

        // Loop that puts every letter in its spesific index on array.
        // In unicode decimal value of "a" is 97. There are 26 characters in English alphabet.
        // Loop's index starts from 0 = a, and ends on 25 = z.
        for(int i = 0; i < sLen; i++){
            arr[(int)(s.charAt(i)) - 97]++;
        }
        return arr;
    }
}
