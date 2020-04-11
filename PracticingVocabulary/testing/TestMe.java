package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestMe {
	private ArrayList<String> myDefList = new ArrayList<String>();
	//<def key, word value>
	private HashMap<String, String> vocabMap = new HashMap<String, String>();

	public TestMe() {

	}

	public void addToDict(String definition, String word) {
		vocabMap.put(definition, word);
		myDefList.add(definition);
	}

	public String getRandomDef()
	{
		Random random = new Random();
		int randomIndex = random.nextInt(myDefList.size());
		return myDefList.get(randomIndex);
	}
	public boolean isGuessCorrect(String givenDef, String userGuess) {
		if((vocabMap.get(givenDef).equals(userGuess))) {
			return true;
		}
		return false;
	}

	public String printKeys() {
		for (String key : vocabMap.keySet()) {
			System.out.println(key);
		}
		return null;
	}

}//TestMe
