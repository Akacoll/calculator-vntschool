package com.akacoll.calculator

import kotlin.math.pow

class Calculator {
    fun add(num1: Int, num2: Int) = num1 + num2
    fun subtract(num1: Int, num2: Int) = num1 - num2
    fun multiply(num1: Int, num2: Int) = num1 * num2
    fun divide(num1: Int, num2: Int) = num1 / num2
    fun isEven(num: Int) = num % 2 == 0
    fun exp(num1: Int, num2: Int) = num1.toDouble().pow(num2)
    fun isPrime(num: Int): Boolean {
        var flag = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                flag = false
            }
        }
        return flag
    }
}