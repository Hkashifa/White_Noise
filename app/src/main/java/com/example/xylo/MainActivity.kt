package com.example.xylo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xylo.ui.theme.XyloTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    //.border(5.dp)
                    .padding(5.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)

            )

               {  Box(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp),
                       onClick = { /* do something */ },

                ) {
                    Imagecard(
                        painter = painterResource(id = R.drawable.cafe),
                        contentDescription = "Cafe",
                        title = "Busy Cafe"
                    )

                }
                   Spacer(modifier = Modifier.height(50.dp))
                   Box(modifier = Modifier
                       .fillMaxWidth(0.5f)
                       .padding(16.dp)
                   ) {
                       Imagecard(
                           painter = painterResource(id = R.drawable.fireplace),
                           contentDescription = "Fireplace",
                           title = "Fireplace"
                       )

                   }
                   Box(modifier = Modifier
                       .fillMaxWidth(0.5f)
                       .padding(16.dp)
                   ) {
                       Imagecard(
                           painter = painterResource(id = R.drawable.ocean),
                           contentDescription = "Ocean",
                           title = "Ocean"
                       )

                   }
                   Box(modifier = Modifier
                       .fillMaxWidth(0.5f)
                       .padding(16.dp)
                   ) {
                       Imagecard(
                           painter = painterResource(id = R.drawable.rain),
                           contentDescription = "Rain",
                           title = "Rain"
                       )

                   }
            //val painter = painterResource(id = R.drawable.cafe)
            //val description = "Cafe"
            //val title = "Busy Cafe"

            }
        }
    }


@Composable
fun Imagecard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
    ){
    Card(
        modifier = modifier.fillMaxWidth().clickable{ },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,

    ){
        Box(modifier = Modifier.height(200.dp))
        {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f

                    )
                )

            ){

            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            contentAlignment = Alignment.BottomStart)
            {
                Text(title, style = androidx.compose.ui.text.TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
                )
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun DefaultPreview()
{
    XyloTheme{

    }

    }
}


