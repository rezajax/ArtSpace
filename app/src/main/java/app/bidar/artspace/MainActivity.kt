package app.bidar.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.bidar.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}




@Composable
fun ArtSpaceApp() {

    BoxWithConstraints {
        if (maxWidth < 600.dp) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(1f))

                Card(
                    modifier = Modifier//.fillMaxWidth(.5f).fillMaxHeight(.5f)
                        .padding(16.dp)
                        .shadow(1.dp)
                        .border(BorderStroke(3.dp, Color(R.color.border)))
                    //.height(600.dp)
                ) {
                    Image(

                        painter = painterResource(id = R.drawable.tagh_bostan_2),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(16.dp)

                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .shadow(clip = true, elevation = 2.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                        // .fillMaxWidth(.5f).fillMaxHeight(.5f)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp),
                            text = "Tagh Bostan",
                            fontSize = 25.sp,

                            )
                        Row() {
                            Text(
                                modifier = Modifier
                                    .padding(0.dp),
                                text = "Kermanshah ",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                modifier = Modifier
                                    .padding(0.dp),

                                text = "(1991)",

                                )
                        }

                    }

                }


                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.End)
                        .align(Alignment.CenterHorizontally)
                ) {

                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                        Text(text = "Previous")
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                        Text(text = "Next")
                    }


                }


            }
        }

        if (maxWidth >= 600.dp) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                //Spacer(modifier = Modifier.weight(1f))

                Card(
                    modifier = Modifier//.fillMaxWidth(.5f).fillMaxHeight(.5f)
                        .padding(16.dp)
                        .shadow(1.dp)
                        .border(BorderStroke(3.dp, Color(R.color.border)))
                        .weight(1f)
                ) {
                    Image(

                        painter = painterResource(id = R.drawable.takhte_jamshid),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(16.dp)
                            .wrapContentWidth()
                            .width(700.dp)

                    )
                }

                //Spacer(modifier = Modifier.weight(1f))

                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .shadow(clip = true, elevation = 2.dp)
                        .weight(.3f)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                         //.fillMaxWidth(.5f).fillMaxHeight(.5f)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(0.dp),
                            text = "Tagh Bostan",
                            fontSize = 25.sp,

                            )
                        Row() {
                            Text(
                                modifier = Modifier
                                    .padding(0.dp),
                                text = "Kermanshah ",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                modifier = Modifier
                                    .padding(0.dp),

                                text = "(1991)",

                                )
                        }

                    }

                }


                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.End)
                        .align(Alignment.CenterHorizontally)
                ) {

                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                        Text(text = "Previous")
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
                        Text(text = "Next")
                    }


                }


            }
        }
    }

}


@Preview(name = "With background", showBackground = true)
@Preview(name= "dark")

@Preview(showSystemUi = true)

@Preview(showBackground = true, name= "tablet 3", heightDp = 600, widthDp = 900)
@Preview(showBackground = true, name= "tablet 3", heightDp = 900, widthDp = 600)

@Preview(showBackground = true, name= "tablet 7", heightDp = 1200, widthDp = 1920)
@Preview(showBackground = true, name= "tablet 10", heightDp = 1600, widthDp = 2560)



@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}

