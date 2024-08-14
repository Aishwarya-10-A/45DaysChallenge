/*Problem statement
Write a function that calculates the corresponding day of the week for any particular date in the past or future.

For example, for the date 28th August 2020 happens to be Friday. Hence the expected output will be Friday.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10 ^ 5
1 <= Day <= 31
1 <= Month <= 12
1 <= Year <= 2,000,000

Time Limit : 1 sec.
Sample Input 1 :
4
28 8 2020
20 4 2033
29 2 1920
27 4 1999
Sample Output 1 :
Friday
Wednesday
Sunday
Tuesday
Explanation to Sample Input 1 :
It's Friday on 28th August 2020
It's Wednesday on 20th April 2033
It's Sunday on 29th February 1920
It's Tuesday on 27th April 1999
Sample Input 2:
1
28 2 1994
Sample Output 2 :
Monday
Explanation to Sample Input 2 :
It's Monday on 28th February 1994
 */

/*
    Time Complexity : O(1)
    Space Complexity : O(1)  
*/

public class Solution
{

	public static String dayOfTheWeek(int day, int month, int year)
    {

	    // Array Storing Names of Days in correct order of Modulo 7.
	    String daysName[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	    // Number of Days Passed till Month 0,1,2....11 ignoring leap years.
	    int noOfDaysPassedTillMonth[] = {0,   31,  59,  90,  120, 151, 181, 212, 243, 273, 304, 334};

	    // Total Number of Days Passed till current Day Ignoring Leap Year.
	    int totalNoOfDaysPassed = 365 * (year - 1) + noOfDaysPassedTillMonth[month - 1] + day;

	    // Ajdusting Year if Leap Day of this year is not Passed.
	    if (month <= 2)
        {
	        year--;
	    }

	    // Caculating and adding lead days.
	    int leapDaysPassed = (year / 4) - (year / 100) + (year / 400);
	    totalNoOfDaysPassed += leapDaysPassed;

	    return daysName[totalNoOfDaysPassed % 7];

	}
}