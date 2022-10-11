package com.akacoll.calculator

import junit.framework.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    private val calc = Calculator()

    @Test
    fun add_two_numbers() {
        val expected = 4
        val value = calc.add(2,2)
        assertEquals(value, expected)
    }

    @Test
    fun subtract_two_numbers() {
        val expected = 8
        val value = calc.subtract(10,2)
        assertEquals(value, expected)
    }

    @Test
    fun multiply_two_numbers() {
        val expected = 4
        val value = calc.multiply(2,2)
        assertEquals(value, expected)
    }

    @Test
    fun divide_two_numbers() {
        val expected = 4
        val value = calc.divide(8,2)
        assertEquals(value, expected)
    }

    @Test
    fun check_if_number_is_even() {
        val expected = true
        val value = calc.isEven(18)
        assertEquals(value, expected)
    }

    @Test
    fun exp_number() {
        val expected = 8.0
        val value = calc.exp(2,3)
        assertEquals(value, expected)
    }

    @Test
    fun check_if_number_is_prime() {
        val expected = true
        val value = calc.isPrime(7669)
        assertEquals(value, expected)
    }
}