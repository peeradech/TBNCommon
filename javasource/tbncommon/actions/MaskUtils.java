package tbncommon.actions;

import org.apache.commons.lang3.StringUtils;

public class MaskUtils
{
    public static String maskString(String strText, int start, int end, char maskChar)
            throws Exception
    {

        if (strText == null || strText.equals(""))
            return "";

        if (start < 0)
            start = 0;

        if (end > strText.length())
            end = strText.length();

        if (start > end)
            throw new Exception("End index cannot be greater than start index");

        int maskLength = end - start;

        if (maskLength == 0)
            return strText;

        String strMaskString = StringUtils.repeat(maskChar, maskLength);

        return StringUtils.overlay(strText, strMaskString, start, end);
    }

    public static String maskEmailAddress(String strEmail, char maskChar) throws Exception
    {

        String[] parts = strEmail.split("@");

        //mask first part
        String strId = "";
        if (parts[0].length() < 4)
            strId = maskString(parts[0], 0, parts[0].length(), '*');
        else
            strId = maskString(parts[0], 1, parts[0].length() - 1, '*');

        //now append the domain part to the masked id part
        return strId + "@" + parts[1];
    }
}
