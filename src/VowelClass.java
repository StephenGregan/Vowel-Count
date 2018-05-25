
public class VowelClass {

	public static void main (String [] args) 
	{
		String check = "A regular expression is a sequence of characters that describes or matches a given ammount of text";
		
		char [] arr = check.toCharArray();
		int counterA = 0;
		int countera = 0;
		int counterO = 0;
		int countero = 0;
		int counterE = 0;
		int countere = 0;
		int  counterI = 0;
		int counteri = 0;
		int counterU = 0;
		int counteru = 0;
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == 65) {
				counterA++;
				System.out.println("A found at index : " + i);
			}else if(arr[i] == 97) {
				countera++;
				System.out.println("a found at index : " + i);
			}else if(arr[i] == 79) {
				counterO++;
				System.out.println("O found at index : " + i);
			}else if(arr[i] == 111) {
				countero++;
				System.out.println("o found at index : " + i);	
			}else if(arr[i] == 69) {
				counterE++;
				System.out.println("E found at index : " + i);
			}else if(arr[i] == 101) {
				countere++;
				System.out.println("e found at index : " + i);
			}else if(arr[i] == 73) {
				counterI++;
				System.out.println("I found at index : " + i);
			}else if(arr[i] == 105) {
				counteri++;
				System.out.println("i found at index : " + i);
			}else if(arr[i] == 85) {
				counterU++;
				System.out.println("U found at index : "  + i);
			}else if (arr[i] == 117){
				counteru++;
				System.out.println("u found at index : "  + i);
				
			}
				
		}
	
	}
	
}
