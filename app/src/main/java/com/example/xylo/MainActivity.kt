package com.example.xylo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xylo.ui.theme.XyloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxSize()
                    .padding(horizontal = 2.dp)

            ) {
                Button(onClick = { /*TODO*/ }) {
                Text("Rain")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("Fireplace")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("Ocean")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("Busy Cafe")
                }

            }
            }
        }
    }


