/*
 * @author Ömer Zeyveli
 * Leetcode User Name: Riive
 * Leetcode Question 1716: Calculate Money in Leetcode Bank.
 */
class Solution {
    // sum of consecutive numbers formula ==> (a + z) * 2 / n.
    // a = min, z = max, n = number of terms.
    public static int totalMoney(int n) {
        int sum = 0; // Sum.
        int division = n / 7; // Number of weeks.
        int remain = n % 7; // extra days of the week which is below 7.

        // Sum of numbers 1 to 7 are 28, we multiply it with number of weeks.
        sum += (division * 28) 
        // If the "n" is not a multiple of 7 we calculate the remaining days with "sum of consecutive numbers" formula.
        + ((division + 1 + remain + division) * remain) / 2;
        
        // If the number of weeks is more than 1, an arithmatically increasing value is added starting from the 2nd week.
        // For example, 7 for the second week, 14 for the third etc.
        if (division > 1) {
            sum += ((7 + (division - 1) * 7) * (division - 1)) / 2;
        }
        return sum;
    }
}
