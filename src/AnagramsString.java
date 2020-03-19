
public class AnagramsString {
	
	public static boolean isAnagram(String a, String b){

        int sameString = 0;

        if (a.length() == b.length()){

            for (int i=0; i<a.length(); i++){



                for (int j=0; j<b.length(); j++){

                    if (a.charAt(i) == b.charAt(j)){

                        sameString++;

                        break;

                    }

                }

            }

        }

        if (a.length() == sameString) return true;

        else return false;

    }

}
