package com.example.sample.composecountup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sample.composecountup.ui.theme.SampleComposeCountUpTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleComposeCountUpTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // TODO:カウントップのための変数を定義する

                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(color = Color.Green)
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Count Up : count",
                            fontSize = 50.sp,
                            modifier = Modifier.align(
                                Alignment.Center
                            )
                        )

                        Button(
                            onClick = {
                                // TODO:カウントップを実行する
                            },
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 16.dp)
                        ) {
                            Text("カウントアップ")
                        }
                    }
                }
            }
        }
    }
}
