package com.learnjava.corejava.sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
	
	public List<List<Integer>> findSequences(String input)
	{
		
		if (input == null) {
		
			return new ArrayList<>();
		}
		
		Integer prev = null;
		Integer curr = null;

		//String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";

		String[] splitInput = input.split(" ");

		List<Integer> sequence = new ArrayList<>();

		List<List<Integer>> sequences = new ArrayList<>();


		System.out.println("The original String input is " + input);
		System.out.println("The split String is "+ Arrays.toString(splitInput));

		for (String s: splitInput) {

			//System.out.println(s);
			try { 
				curr = Integer.parseInt(s);

				//System.out.println(curr);

				// All iterations except the first
				if (prev != null) {

					// IT is a Sequence of nos

					if (curr - prev == 1) {
						sequence.add(curr);
						prev = curr;
					}
					// Not a sequence of nos
					else {
						if (sequence.size() > 1) {

							sequences.add(sequence);
						}

						sequence = new ArrayList<>();
						prev = curr;
						sequence.add(prev);

					}

				}
				// First Iteration
				else {
					prev = curr;
					sequence.add(prev);
				}
				//sequence.stream().forEach(System.out::println);
				//prev = curr;
				//sequence.add(prev);

			}
			catch(NumberFormatException e) {

				if (sequence.size() > 1) {
					sequences.add(sequence);
				}
				sequence = new ArrayList<>();
				prev = null;
				//e.printStackTrace();
			}
		

		}

		// After the last iteration
		if (sequence.size() > 1) {
			sequences.add(sequence);
		}
		
		for (List<Integer> lst : sequences) {

			//System.out.println("The sequences identified are " + lst);

		}

		sequences.stream().forEach(System.out::println);
		
		return sequences;
	}

}
