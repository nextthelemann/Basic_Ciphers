public class test{
	public static void main(String args[]) {
		String message = args[0];
		String k = args[1];
		int shift = Integer.parseInt(k);
		char characters[] = message.toCharArray();
		int newcharacters[] = new int[characters.length];
		for(int i = 0; i < characters.length; i++) {
			 newcharacters[i] = (int)characters[i] + shift;
			 int temp = (int)characters[i];
			 
				if(newcharacters[i] > 122) {			//lowercase
			 	newcharacters[i] -= 26;
			 }
			 else if(newcharacters[i] > 90 && temp < 91 && temp > 64) {		//uppercase
			 	newcharacters[i] -= 26;
			 }
			 else if(newcharacters[i] == 32 + shift) {
			 	newcharacters[i] = 32;
			 }
			 characters[i] =(char)newcharacters[i];
			 String newmessage = new String(characters);
			 System.out.print(characters[i]);
		}
		
		
		

		//int newcharacters = (int)characters[0];
		//System.out.println(newcharacters);


		//int y = (int)characters[0];
		//int z = y + k;
		//System.out.println((char)z);
		

	}
}