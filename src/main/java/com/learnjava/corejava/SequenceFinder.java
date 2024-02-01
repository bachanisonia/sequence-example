package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.learnjava.corejava.sequence.Sequence;

public class SequenceFinder {

	public static void main(String[] args) {

		String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
		
		Sequence seq = new Sequence();
		seq.findSequences(input);
		
	}

}
