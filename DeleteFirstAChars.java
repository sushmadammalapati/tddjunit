package com.epam.DemoTddJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteFirstAChars {

	/*TODO list for my feature
	 * 1. 1 char:ABCD =>BCD
	 * 2. 2 chars:AACD=>CD
	 * 3. 3 chars:BACD=>BACD
	 * 4. 4 chars:BBAA=>BBAA
	 * 5. chars:AABAA=>BAA
	 * 5. empty char:" "=> " "
	 */
	DeletingA d;
	@BeforeEach
	void setup() {
		d=new DeletingA();
	}
	@Test
	void testRemoveCharsAt1() {
		assertEquals("BCD",d.removingA("ABCD"));
	}
	@Test
	void testRemoveCharsAt2() {
		assertEquals("CD",d.removingA("AACD"));
	}
	@Test
	void testRemoveChars() {
		assertEquals("BACD",d.removingA("BACD"));
	}
	@Test
	void testRemoveCharsAt3() {
		assertEquals("BBAA",d.removingA("BBAA"));
				}
	@Test
	void testRemoveCharsAt22() {
		assertEquals("BAA",d.removingA("AABAA"));
				}
	@Test
	void testRemoveCharacterEmpty() {
		assertEquals(" ",d.removingA(" "));
				}

}
