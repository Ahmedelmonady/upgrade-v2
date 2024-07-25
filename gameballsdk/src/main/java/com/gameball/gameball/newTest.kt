package com.gameball.gameball

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


class newTest(private val name: String) {

    fun greet(): String{
        return "Hello, $name"
    }

    @Composable
    fun hello(){
        Text(text=greet())
    }
}