public class StringManip
{
    /** Takes a string str and returns a new string * with all spaces removed.
     */
    public static String removeSpaces(String str)
    {
        String noSpace = "";
        for (int i=0; i<str.length(); i++) {
            if (!str.substring(i, i+1).equals(" ")) {
                noSpace += str.substring(i, i+1);
            }
        }
        return noSpace;
    }


    /** Takes a string str and returns a new string
     * with the characters reversed, as described in part (a). */
    public static String reverseString(String str)
    { /* to be implemented in part (a) */
        String str_noSpace = removeSpaces(str);
        String temp_string = "";
        for (int a = str_noSpace.length()-1; a>=0;a--)
        {
            temp_string+= str_noSpace.substring(a,a+1);
        }
        return temp_string;
    }


    /** Determines whether str is a palindrome and prints a message
     * indicating the result, as described in part (b).
     * Precondition: str contains only lowercase letters and spaces.
     */
    public static void palindromeChecker(String str)
    { /*to be implemented in part (b) */

        if (reverseString(str).equals(removeSpaces(str))){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

    }

    }

