package com.example.unittesting

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // this method run before every unit test function so you can use it in (initialize)
    @Before
    fun beforeRun() {
        //init
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    //this method expected the true result 5+3 = 8
    // if some thing else you will get an testing faild
    @Test
    fun sum_test() {
        val operations = Operations()
        val result = operations.sum(5.0, 3.0)
        assertEquals("is not correst", 8.0, result, 0.0)
    }
}