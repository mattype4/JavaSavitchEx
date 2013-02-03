package chapter8;

public class SubstitutionCipher implements MessageEncoder,MessageDecoder {
	private int shift;
	
	public SubstitutionCipher(){
		shift = 0;
	}
	
	public SubstitutionCipher(int theShift){
		shift = theShift;
	}
	
	public String decode(String cipherText){
		String newText = "";
		for (int i=0; i<cipherText.length(); i++){
			newText += (char)(cipherText.charAt(i)-shift);
		}
		return newText;
	}
	
	public String encode(String plainText){
		String newText = "";
		for (int i=0; i<plainText.length(); i++){
			newText += (char)(plainText.charAt(i)+shift);
		}
		return newText;
	}
}
