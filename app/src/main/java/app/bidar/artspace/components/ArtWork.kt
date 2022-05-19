package app.bidar.artspace.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.bidar.artspace.R


//spaces
/**
 * Component that represents an empty space layout, whose size can be defined using
 * [Modifier.shadow], [Modifier.padding] and [Modifier.border] modifiers.
 *
 * @sample androidx.compose.foundation.layout.samples.SpacerExample
 *
 * @param modifier modifiers to set to this spacer
 */


@Composable
fun ArtworkWall (
    @DrawableRes img: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(16.dp)
            .shadow(1.dp)
            .border(BorderStroke(3.dp, Color(R.color.border)))
        //.height(600.dp)
    ) {
        Image(

            painter = painterResource(id = img),
            contentDescription = null,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}


@Composable
@Preview
fun ArtWorkPreview() {
    ArtworkWall(img = R.drawable.takhte_jamshid)
}