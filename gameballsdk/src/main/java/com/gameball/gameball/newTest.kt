package com.gameball.gameball


import androidx.compose.material.Text
import androidx.compose.runtime.Composable


class newTest(private val name: String) {

    fun greet(): String{
        return "Hello, $name"
    }


}

@Composable
fun hello(name: String){
    Text(text=name)
}