package fr.efrei.util;

public class Helper
{
    public static boolean isNullOrEmpty(String s)
    {
        if ((s == null)||(s.isEmpty()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isZero(int s)
    {
        if ((s == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String generateId() {
        String id = new String ("");
        return id;
    }

    public static boolean isNullOrEmpty(int s)
    {
        if ((s == 0)||(s.isEmpty()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isNullOrEmpty(boolean s)
    {
        if ((s == null)||(s.isEmpty()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

