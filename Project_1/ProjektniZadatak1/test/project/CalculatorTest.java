package project;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import myExceptions.DivisionByZeroException;
import myExceptions.NotSupportedOperationException;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

class CalculatorTest {
	Calculator cal = new Calculator();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cal.setCurrentValue(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCalculator() {
		assertThat(cal, is(notNullValue()));
	}
	
	@ParameterizedTest
	@MethodSource("testCalculateNormalParametrized")
	void testCalculateNormal(Double value, char operator, Double setBefore, Double result) throws DivisionByZeroException, NotSupportedOperationException{
		cal.setCurrentValue(setBefore);
		cal.calculate(value, operator);

		System.out.println(cal.getCurrentValue());
		assertThat(result, is(cal.getCurrentValue()));
	}
	
	private static Stream<Arguments> testCalculateNormalParametrized(){
		return Stream.of(
				Arguments.of(7.0, '+', 0.0, 7.0),
				Arguments.of(-7.0, '-', 0.0, 7.0),
				Arguments.of(120.22, '*', 2.5, 300.55),
				Arguments.of(12.55, '/', 50.2, 4.0)
		);
	}
	
	@Test
	void testCalculateException_1() throws NotSupportedOperationException, DivisionByZeroException {
		Exception e = assertThrows(
				DivisionByZeroException.class,
				() -> cal.calculate(0.0, '/'));
				
		assertThat(e, is(instanceOf(DivisionByZeroException.class)));
		
		cal.setCurrentValue(0.0);
		cal.calculate(1.0, '/');
		assertThat(0.0, is(cal.getCurrentValue()));
	}
	
	@ParameterizedTest
	@MethodSource("testCalculateException_2Parametrized")
	void testCalculateException_2(Double value, char operator, Double result) throws NotSupportedOperationException, DivisionByZeroException{
		Exception e = assertThrows(
				NotSupportedOperationException.class,
				() -> cal.calculate(value, operator));
				
		assertThat(e, is(instanceOf(NotSupportedOperationException.class)));
	}
	
	private static Stream<Arguments> testCalculateException_2Parametrized(){
		return Stream.of(
				Arguments.of(3.0, '8', 0.0),
				Arguments.of(95.4, '_', 0.0)
		);
	}
}
