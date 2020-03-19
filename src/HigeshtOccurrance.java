
public class HigeshtOccurrance {
	public static char printHighestOccurringChar(String a){
	
	int maxOccur=0;

    char maxOccurredChar = ' ';



    for (int i=0; i<a.length(); i++){

        int currentLetterOccurrences = 0;

        char currentChar = a.charAt(i);



        for (int j=0; j<a.length(); j++){

            if (a.charAt(j)==currentChar)

                currentLetterOccurrences ++;

        }

        if (currentLetterOccurrences > maxOccur){

            maxOccur = currentLetterOccurrences;

            maxOccurredChar = currentChar;

        }

    }

    return maxOccurredChar;

}
	public static void main(String[] args) {
		HigeshtOccurrance obj=new HigeshtOccurrance();
		obj.printHighestOccurringChar("efregtrhtrhryyjtyjyyyyyyy");
	}

}
