package com.learnjava.corejava.sequence;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SequenceTest {
	

	Sequence s;
	String input = null;
	List<List<Integer>> result;
	List<List<Integer>> expectedResult;
	
	@BeforeEach
	public void init() {
		s = new Sequence();
	}
	
	@Test
	public void testSequenceNullInput() {
		result = s.findSequences(input);
		assertTrue(result.isEmpty());
		
	}
	
	@Test
	public void testSequenceValidString() {
		
		input = "hgfh gfhg hgfhg";
		result = s.findSequences(input);
		assertTrue(result.isEmpty());
		
	}
	
	@Test
	public void testSequenceValidSequence() {
		
		input = "4 5 6 8";
		result = s.findSequences(input);
				
		assertTrue(!result.isEmpty());
		
		expectedResult = new ArrayList<>();
		expectedResult.add(Arrays.asList(4,5,6));
		
		assertTrue(result.size()==1 && result.get(0).size()==3);
		assertThat(result.get(0), is(expectedResult.get(0)));
		
	}
	
	
	
	@Test
	public void testSequenceValidSequenceAlphaNumericChars() {
		
		input = "4 5 6 8 a 3 5 ! 1 2 3";
		result = s.findSequences(input);
				
		assertTrue(!result.isEmpty());
		
		expectedResult = new ArrayList<>();
		expectedResult.add(Arrays.asList(4,5,6));
		expectedResult.add(Arrays.asList(1,2,3));
		
		
		assertTrue(result.size()==2);
		assertThat(result.get(0), is(expectedResult.get(0)));
		assertThat(result.get(1), is(expectedResult.get(1)));
		
	}

}
