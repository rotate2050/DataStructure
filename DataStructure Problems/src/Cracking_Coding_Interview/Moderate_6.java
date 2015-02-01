package Cracking_Coding_Interview;

public class Moderate_6 {

	String[] unit = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	String[] tens = {"Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String[] tensother = {"Ten","Twenty","Thiry","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	
	String numbersInWords(int number) {
		String inwords = new String();
		if (number <= 9) {
			if (number==0) {
				return "";
			}
			else {
				return unit[number - 1];
			}
		}
		else if ((number > 9) && (number <= 99)) {
			if (number < 20) {
				int index = number % 10;
				return tens[index - 1];
			}
			else {
				int index = number / 10;
				return tensother[index - 1] + " " + numbersInWords(number % 10);
			}
		}
		else  if ((number > 99)&&(number <= 999)) {
			int index = number / 100;
			return (unit[index - 1] + " Hundred " + numbersInWords(number % 100));
		}
		
		else  if ((number > 999)&&(number <= 9999)) {
			int index = number / 1000;
			return (unit[index - 1] + " Thousand " + numbersInWords(number % 1000));
		}
		
		else  if ((number > 9999)&&(number <= 99999)) {
			if (number < 20000) {
				int index = number / 1000;
				return (tens[index - 11] + " Thousand " + numbersInWords(number % 1000));
			}
			else {
				int index = number / 1000;
				int reminder = number % 1000;
				return numbersInWords(index) + " Thousand " + numbersInWords(reminder);
			}
		}
		
		else  if ((number > 99999)&&(number <= 999999)) {
			int index = number / 100000;
			return (unit[index - 1] + " Lakh " + numbersInWords(number % 100000));
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moderate_6 test = new Moderate_6();
		String inwords = test.numbersInWords(55000);
		System.out.println(inwords);
	}

}
