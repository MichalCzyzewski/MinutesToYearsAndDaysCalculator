package pl.mczyzewski;

public class MinutesToYearsAndDaysCalculator
{

    public static void printYearsAndDays(long minutes)
    {
        if (minutes <= 0)
        {
            System.out.println("Invalid Value");
        } else
        {

            long year = minutes / 525600;
            long days = minutes % 525600 / 1440;

            if (year >= 1)
            {

                System.out.println(minutes + " min = " + year + " y and " + days + " d");
            } else
            {

                days = minutes / 1440;
                System.out.println(minutes + " min = " + year + " y and " + days + " d");
            }
        }
    }

}
