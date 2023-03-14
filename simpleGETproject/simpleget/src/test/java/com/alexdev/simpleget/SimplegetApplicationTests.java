package com.alexdev.simpleget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;


class SimplegetApplicationTests {

	Calculator underTest = new Calculator();
	@Test
	public void ItShouldAddNumbers() {

		//given
		Integer one = 20;
		Integer two = 30;

		//when
		Integer result = underTest.add(one,two);
		//then
		Integer expected = 50;
		assert(result).equals(expected);
	}
	class Calculator{
		int add(int a, int b){
			return a + b;
		}
	}

}
