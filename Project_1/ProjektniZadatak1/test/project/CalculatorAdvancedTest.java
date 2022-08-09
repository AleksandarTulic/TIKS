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

import myExceptions.NotSupportedOperationException;
import myExceptions.NumberNotInAreaException;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CalculatorAdvancedTest {
	private CalculatorAdvanced calAdvanced = new CalculatorAdvanced(); 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		calAdvanced.setCurrentValue(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculatorAdvanced() {
		assertThat(calAdvanced, is(notNullValue()));
	}

	/*
	 * THIS PART IS FOR: calculateAdvanced
	 * */

	@ParameterizedTest
	@MethodSource("testCalculateAdvanced_Parametrized")
	void testCalculateAdvanced(char action, Double setBefore, Double result) throws NumberNotInAreaException, NotSupportedOperationException {
		calAdvanced.setCurrentValue(setBefore);
		calAdvanced.calculateAdvanced(action);
		
		assertThat(calAdvanced.getCurrentValue(), is(result));
	}
	
	private static Stream<Arguments> testCalculateAdvanced_Parametrized(){
		return Stream.of(
				Arguments.of('3', 2.451, 8.0),
				Arguments.of('0', 0.0, 1.0),
				Arguments.of('!', 9.23, 362880.0),
				Arguments.of('5', 5.0, 3125.0),
				Arguments.of('9', 10.991, 1000000000.0),
				Arguments.of('!', 8.99, 40320.0)
		);
	}
	
	@Test
	void testCalculateAdvancedExceptions1() throws NumberNotInAreaException, NotSupportedOperationException{
		calAdvanced.setCurrentValue(10.0);
		calAdvanced.calculateAdvanced('!');
		assertThat(calAdvanced.getCurrentValue(), is(3628800.0));
		
		calAdvanced.setCurrentValue(1.0);
		calAdvanced.calculateAdvanced('!');
		assertThat(calAdvanced.getCurrentValue(), is(1.0));
		
		calAdvanced.setCurrentValue(0.0);
		calAdvanced.calculateAdvanced('!');
		assertThat(calAdvanced.getCurrentValue(), is(1.0));
	}
	
	@ParameterizedTest
	@MethodSource("testCalculateAdvancedExceptions1_Parametrized")
	void testCalculateAdvancedExceptions1(Double setBefore) throws NumberNotInAreaException, NotSupportedOperationException {
		calAdvanced.setCurrentValue(setBefore);
		Exception e = assertThrows(
				NumberNotInAreaException.class,
				() -> calAdvanced.calculateAdvanced('!'));
				
		assertThat(e, is(instanceOf(NumberNotInAreaException.class)));
	}
	
	private static Stream<Arguments> testCalculateAdvancedExceptions1_Parametrized(){
		return Stream.of(
				Arguments.of(11.0),
				Arguments.of(-1.0)
		);
	}
	
	@ParameterizedTest
	@MethodSource("testCalculateAdvancedExceptions2_Parametrized")
	void testCalculateAdvancedExceptions2(char action) throws NumberNotInAreaException, NotSupportedOperationException {
		Exception e = assertThrows(
				NotSupportedOperationException.class,
				() -> calAdvanced.calculateAdvanced(action));
				
		assertThat(e, is(instanceOf(NotSupportedOperationException.class)));
	}
	
	private static Stream<Arguments> testCalculateAdvancedExceptions2_Parametrized(){
		return Stream.of(
				Arguments.of((char)('!'-1)),
				Arguments.of((char)('!'+1)),
				Arguments.of((char)('0'-1)),
				Arguments.of((char)('9'+1))
		);
	}
	
	/*
	 * THIS PART IS FOR: calculateAdvanced
	 * */
	
	@ParameterizedTest
	@MethodSource("testHasCharacteristic_Parametrized")
	void testhasCharacteristic(char value, Double setBefore, Boolean flag) throws NumberNotInAreaException, NotSupportedOperationException{
		calAdvanced.setCurrentValue(setBefore);
		
		assertThat(flag, is(calAdvanced.hasCharacteristic(value)));
	}
	
	private static Stream<Arguments> testHasCharacteristic_Parametrized(){
		return Stream.of(
				Arguments.of('A', 371.99, true),
				Arguments.of('A', 407.11877, true),
				Arguments.of('A', 369.001, false),
				Arguments.of('P', 8128.22, true),
				Arguments.of('P', 1.07, false),
				Arguments.of('P', 497.36, false)
		);
	}
	
	@ParameterizedTest
	@MethodSource("testHasCharacteristicException1_Parametrized")
	void testhasCharacteristic_Exception1(char value, Double setBefore) throws NumberNotInAreaException, NotSupportedOperationException{
		calAdvanced.setCurrentValue(setBefore);
		Exception e = assertThrows(
				NumberNotInAreaException.class,
				() -> calAdvanced.hasCharacteristic(value));
				
		assertThat(e, is(instanceOf(NumberNotInAreaException.class)));
	}
	
	private static Stream<Arguments> testHasCharacteristicException1_Parametrized(){
		return Stream.of(
				Arguments.of('A', 0.47112),
				Arguments.of('P', -1.22)
		);
	}
	
	@ParameterizedTest
	@MethodSource("testHasCharacteristicException2_Parametrized")
	void testhasCharacteristic_Exception2(char value, Double setBefore) throws NumberNotInAreaException, NotSupportedOperationException{
		calAdvanced.setCurrentValue(setBefore);
		Exception e = assertThrows(
				NotSupportedOperationException.class,
				() -> calAdvanced.hasCharacteristic(value));
				
		assertThat(e, is(instanceOf(NotSupportedOperationException.class)));
	}
	
	private static Stream<Arguments> testHasCharacteristicException2_Parametrized(){
		return Stream.of(
				Arguments.of((char)('A'-1), 9.45),
				Arguments.of((char)('A'+1), 4.11),
				Arguments.of((char)('P'+1), 9.18),
				Arguments.of((char)('P'-1), 7.71)
		);
	}
}
