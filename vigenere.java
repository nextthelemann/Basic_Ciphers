public class vigenere {
	public static void main(String args[]) {
		String message = args[0];
		String codeword = args[1];
		char key[] = codeword.toCharArray();
		char characters[] = message.toCharArray();
		int newcharacters[] = new int[characters.length];
		for(int i = 0; i < characters.length; i++) {
			char newkey = key[i % codeword.length()];
			int shift = newkey - 96;
			newcharacters[i] = (int)characters[i] + shift;
			int temp = (int)characters[i];

				if(newcharacters[i] > 122) {		//shift for lowercase
					newcharacters[i] -= 26;
				}
				else if(newcharacters[i] > 90 && temp < 91 && temp > 64) {		//shift for uppercase
					newcharacters[i] -= 26;
				}
				else if(newcharacters[i] == 32 + shift) {			//makes sure it keeps a space a space
					newcharacters[i] = 32;
				}
				characters[i] =(char)newcharacters[i];
				String newmessage = new String(characters);
				System.out.print(characters[i]);
		}









	}
}