package pl.mczyzewski;

public class MinutesToYearsAndDaysCalculator
{

public static void printYearAndDays(long minutes)
{
    if(minutes < 0)
    {
        System.out.println("Invalid Value");
    }
        long year = minutes / 525600;
        long remainderOfYear = minutes % 525600;


    System.out.println(minutes + " min = " + year + "y and "+ remainderOfYear + "d");
}

}
