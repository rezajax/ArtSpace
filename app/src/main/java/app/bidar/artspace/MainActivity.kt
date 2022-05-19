package app.bidar.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.bidar.artspace.components.ArtworkDescriptor
import app.bidar.artspace.components.ArtworkWall
import app.bidar.artspace.components.DisplayController
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

    var rem by remember { mutableStateOf(0)}


    val data: ArtData = if (rem == 1) {
        ArtData(
            title = stringResource(id = R.string.tagh),
            desc = stringResource(id = R.string.ker),
            date = stringResource(id = R.string.dateOfKer),
            img = R.drawable.tagh_bostan_2
        )
    } else {
        ArtData(
            title = stringResource(id = R.string.jamshid),
            desc = stringResource(id = R.string.fars),
            date = stringResource(id = R.string.dateOfFars),
            img = R.drawable.takhte_jamshid
        )
    }

    BoxWithConstraints {
        if (maxWidth < 600.dp) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(1f))

                //wall place
                ArtworkWall(
                    img = data.img
                )

                Spacer(modifier = Modifier.weight(1f))

                //Desc Place
                ArtworkDescriptor(
                    title = data.title,
                    desc = data.desc,
                    date = data.date
                )

                //btn place
                DisplayController(
                    rem = {rem = it}
                )

            }
        }


        // large screen
        if (maxWidth >= 600.dp) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.weight(.1f))


                ArtworkWall(
                    img = data.img,
                    //modifier = Modifier.weight(.5f, fill = true).fillMaxWidth(fraction = .5f),
                    //modifier = Modifier.width(600.dp).height(600.dp)
                )
                Spacer(modifier = Modifier.weight(.1f))




                //Spacer(modifier = Modifier.weight(1f))

                ArtworkDescriptor(
                    title = data.title,
                    desc = data.desc,
                    date = data.date,
                    //modifier = Modifier.width(700.dp)
                )



                //btn place
                DisplayController(
                    rem = {rem = it}
                )

                //Spacer(modifier = Modifier.weight(0.1f))

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

