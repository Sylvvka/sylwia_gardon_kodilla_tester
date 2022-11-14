public class LeapYear {
    public static void main(String[] args) {
        int randomYear = 2023;

        boolean leap = false;

        if(randomYear % 4 == 0)
        {
            if( randomYear % 100 == 0)
            {
                if ( randomYear % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else {
            leap = false;
        }

        if(leap==true)
            System.out.println(randomYear + " to jest rok przestępny.");
        else
            System.out.println(randomYear + " to nie jest rok przestępny.");

    }
}
