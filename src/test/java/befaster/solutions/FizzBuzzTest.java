/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package befaster.solutions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;

/**
 *
 * @author robert_damian
 */
public class FizzBuzzTest {
    @Test
    public void dividesBy3() {
        assertThat(FizzBuzz.fizzBuzz(9), equalTo("fizz"));
    
    }
    @Test
    public void dividesBy5() {
        assertThat(FizzBuzz.fizzBuzz(10), equalTo("buzz"));
    }
    
    @Test
    public void dividesBy3And5() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }
    
    @Test
    public void dividesByNeither() {
        assertThat(FizzBuzz.fizzBuzz(7), equalTo("7"));
    }
    
    @Test
    public void contains3() {
        assertThat(FizzBuzz.fizzBuzz(31), equalTo("fizz"));
    }
    
    @Test
    public void contains5() {
        assertThat(FizzBuzz.fizzBuzz(52), equalTo("buzz"));
    }
    
    @Test
    public void contains5AndDividesBy3() {
        assertThat(FizzBuzz.fizzBuzz(51), equalTo("fizz buzz"));
    }
    
    @Test
    public void contains3AndDividesBy3() {
        assertThat(FizzBuzz.fizzBuzz(33), equalTo("fizz deluxe"));
    }
    
    @Test
    public void testIsDeluxe() {
        assert FizzBuzz.isDeluxe(33);
    }
    
    @Test
    public void testIsNotDeluxe() {
        assert !FizzBuzz.isDeluxe(5);
    }
    
    @Test
    public void testIsNotDeluxeMultiDigit() {
        assert !FizzBuzz.isDeluxe(51);
    }
    
    @Test
    public void testFizzBuzzDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(555), equalTo("fizz buzz deluxe"));
    }
    
    @Test
    public void justDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(77), equalTo("deluxe"));
    }
}
