package com.pakt_games.unittestexamples.example1

import com.google.common.truth.Truth
import org.hamcrest.CoreMatchers
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class NegativeNumberValidatorTest {


    var SUT: NegativeNumberValidator? = null

    @Before
    fun setUp() {
        SUT = NegativeNumberValidator()
    }
    @Test
    fun positiveNumberisNegative() {
        val result=SUT!!.isNegative(1)
        Truth.assertThat(result).isFalse()

    }

    @Test
    fun negativeNumberisNegative() {
        val result=SUT!!.isNegative(-1)
        Truth.assertThat(result).isTrue()

    }
    @Test
    fun notrNumberisNegative() {
        val result=SUT!!.isNegative(0)
        Truth.assertThat(result).isFalse()
    }

}