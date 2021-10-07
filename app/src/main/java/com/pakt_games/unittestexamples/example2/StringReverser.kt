package com.pakt_games.unittestexamples.example2

import java.lang.StringBuilder

class StringReverser {
    fun reverse(string: String): String {
        val sb = StringBuilder()
        for (i in string.length - 1 downTo 0) {
            sb.append(string[i])
        }
        return sb.toString()
    }
}