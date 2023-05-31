package com.example.chenyouhua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chenyouhua.ui.theme.CHENYOUHUATheme
import kotlin.reflect.typeOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CHENYOUHUATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    personal("資工二A 陳宥樺")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(){
        Text(text = "Hello $name!")
    }
}

@Composable
fun personal(name: String){
    Column (){
        Text(text = "作者: $name",textAlign = TextAlign.Center, modifier = Modifier.width(1000.dp))
        Image(painter = painterResource(id = R.drawable.map), contentDescription = "地圖")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CHENYOUHUATheme {
        Greeting("Android")
    }
}