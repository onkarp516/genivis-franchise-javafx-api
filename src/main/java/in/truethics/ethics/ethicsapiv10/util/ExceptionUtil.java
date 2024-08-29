package in.truethics.ethics.ethicsapiv10.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {
    /**
     * @param e Accept the exception
     * @return the exception in string with stringwriter format
     * @author kirankumar.gadagi
     */
    public static String getExceptionString(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
