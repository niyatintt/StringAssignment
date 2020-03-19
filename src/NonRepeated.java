
public class NonRepeated {
	
	public static void printFirstNonRepeatedCharacter(String a){

        for (int i=0; i<a.length(); i++) {

            String newString = a.substring(i+1);

            if (  !(  newString.contains(""+a.charAt(i)) )    ){

                System.out.println(a.charAt(i));

                return;

            }

        }

    }
}
