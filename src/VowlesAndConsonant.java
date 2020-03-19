
public class VowlesAndConsonant {

    public static void printNumbVowelsAndConsonants(String a){

        int vowelsCount = 0;

        int consonantsCount = 0;



        for (int i=0; i<a.length(); i++){

            if (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')

                vowelsCount++;

            else consonantsCount++;

        }

        System.out.println(vowelsCount + " vowels and " + consonantsCount + " consonants");

    }



}
