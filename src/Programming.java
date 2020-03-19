import java.util.Scanner;

public class Programming {
	
	
}
	public void countRepetitionOfString() {
		
		
		System.out.println("Please input some text");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		    int number = 0 ;
		    for (int i = 0; i < word.length(); i++){
		        for (int j = 0; j < word.length(); j++) {
		            if(word.charAt(i)==word.charAt(j)){
		                number++;
		            }
		        }   
		        System.out.println(word.charAt(i)+"  "+number);

}
}
	}