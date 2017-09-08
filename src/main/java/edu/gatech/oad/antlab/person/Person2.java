package edu.gatech.oad.antlab.person;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		//Random rand = new Random();
		//int number = rand.nextInt(input.length() - 1);

		List<Character> chars = new ArrayList<Character>();
		for(char c:input.toCharArray()){
			chars.add(c);
		}
		StringBuilder result = new StringBuilder(input.length());
		while(chars.size() != 0){
			int randPicker = (int)(Math.random() * chars.size());
			result.append(chars.remove(randPicker));
		}
		return result.toString();
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
