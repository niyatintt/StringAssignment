
public class StringRecursionAndIteration {
	public static String reverseStringRecursion(String a){

        if (a.length() == 0){

            return "";

        }

        else return reverseStringRecursion(a.substring(1)) + a.charAt(0);

    }

    // Q4

    public static String reverseStringIteration(String a){

        String newString = "";

        for (int i=a.length()-1; i>=0; i--){

            newString += a.charAt(i);

        }

        return newString;

    }

}
