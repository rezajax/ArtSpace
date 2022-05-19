package app.bidar.artspace.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.bidar.artspace.R


@Composable
fun ArtworkDescriptor(
    title: String,
    desc: String,
    date: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
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
                text = title,
                fontSize = 25.sp,

                )
            Row {
                Text(
                    modifier = Modifier
                        .padding(0.dp),
                    text = desc,
                    fontWeight = FontWeight.Bold
                )
                
                //Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.width(1.dp))
                Text(
                    modifier = Modifier
                        .padding(0.dp),
                    text = date,
                )
            }

        }

    }
}


@Preview
@Composable
fun ArtworkDescriptorPreview() {
    ArtworkDescriptor(title = "this is test title", desc = "this is test for description: ", date = "2022")
}

@Preview(name= "with Resource String", showBackground = true)
@Composable
fun ArtworkDescriptorPreviewWhitStringRes() {
    ArtworkDescriptor(
        title = stringResource(id = R.string.jamshid),
        desc = stringResource(id = R.string.fars),
        date = stringResource(id = R.string.dateOfFars)
    )
}