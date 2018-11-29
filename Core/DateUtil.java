//620101718,620103417

package Core;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * DateFunctions provides some static methods that are useful in
 * processing and handling dates
 */

class DateUtil{


    /* ********************** Date Parsers ************************* */

    /**
     * Returns a string representation Today's Date in the format yyyy-MM-DD.
     * MM   - 2 digit representation of the Month of the year eg, 02
     * dd   - 2 digit representation of the day of the Month, eg, 09
     * yyyy - 4 digit representation year, eg 1982
     *
     * @return a string representation of the of today's date.
     */
    public static String today(){
        Calendar today  = Calendar.getInstance();
        today.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
                  today.get(Calendar.DAY_OF_MONTH), 0, 0, 1);

        return new SimpleDateFormat(
                "yyyy-dd-MM", Locale.ENGLISH).format(
                    Calendar.getInstance().getTime());
    }

    /**
     * Returns a Date object corresponding to the input format specified
     * A default format is yyyy-MM-dd. An overloaded version of this method
     * provides handling for that format.
     *
     * @param dateStr   a string representation of the date to be converted
     * @param format    the format that the input date string is in
     *
     * MM   - 2 digit representation of the Month of the year eg, 02
     * dd   - 2 digit representation of the day of the Month, eg, 09
     * yyyy - 4 digit representation year, eg 1982
     * 
     * @return          the parsed date object corresponding to the given date string.
     * @see             java.text.SimpleDateFormat
     */
    private static Date stringToDate(String dateStr, String format) {
        try {
            return new SimpleDateFormat(format,
                                             Locale.ENGLISH).parse(dateStr);

        } catch (java.text.ParseException e) {

            e.printStackTrace();
            return null;
        }
    }

}