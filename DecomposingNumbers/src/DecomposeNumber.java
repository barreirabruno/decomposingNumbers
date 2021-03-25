import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DecomposeNumber {
	public static List<Integer> calculation(int maxDigit) {
		List<Integer> storeNumbers = new ArrayList<Integer>();
		List<Integer> numbersSumTo21 = new ArrayList<Integer>();
		System.out.println("[INPUT INTEGER]: " + maxDigit);
		for(int index = 0; index <= maxDigit; index++) {
			System.out.println("[GENERATING NUMBER " + index + "] " + index + " [ADDING TO A LIST]");
			storeNumbers.add(index);
		}
		List<String> formedNumbers = new ArrayList<String>();
		
		for(int index = 0; index <= 9999; index++) {
			String result = "";
			for(int i = 0; i <= 3; i++) {
				Integer randomNumFromList = getRandomElement(storeNumbers);
				result += randomNumFromList.toString();
			}
			formedNumbers.add(result);
		}
		
		for(int index = 0; index <= formedNumbers.size()-1; index++) {
			int count = 0;
			int sum = 0;
			while(count <= formedNumbers.get(index).length()-1) {
				Integer number = Character.getNumericValue(formedNumbers.get(index).charAt(count));
				sum += number;
				if(sum == 21) {
					numbersSumTo21.add(Integer.parseInt(formedNumbers.get(index)));
				}
				count++;
			}
		}
		
		System.out.println(numbersSumTo21);
		
		return numbersSumTo21;
 	}
	
	private static int getRandomElement(List<Integer> list) {
			Random rand = new Random();
			return list.get(rand.nextInt(list.size()));
	}
}
