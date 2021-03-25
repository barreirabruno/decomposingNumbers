import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DecomposeNumber {
	public static List<Integer> calculation(int maxDigit) {
		List<Integer> storeNumbers = new ArrayList<Integer>();
		List<Integer> numbersSumToTwnetyOne = new ArrayList<Integer>();
		List<String> FourDigitNumbers = new ArrayList<String>();
		for(int index = 0; index <= maxDigit; index++) {
			storeNumbers.add(index);
		}
		for(int index = 0; index <= 9999; index++) {
			String result = "";
			for(int i = 0; i <= 3; i++) {
				Integer randomNumFromList = getRandomElement(storeNumbers);
				result += randomNumFromList.toString();
			}
			FourDigitNumbers.add(result);
		}
		
		for(int index = 0; index <= FourDigitNumbers.size()-1; index++) {
			int count = 0;
			int sum = 0;
			while(count <= FourDigitNumbers.get(index).length()-1) {
				Integer number = Character.getNumericValue(FourDigitNumbers.get(index).charAt(count));
				sum += number;
				if(sum == 21) {
					numbersSumToTwnetyOne.add(Integer.parseInt(FourDigitNumbers.get(index)));
				}
				count++;
			}
		}
		
		return numbersSumToTwnetyOne;
 	}
	
	private static int getRandomElement(List<Integer> list) {
			Random rand = new Random();
			return list.get(rand.nextInt(list.size()));
	}
}
