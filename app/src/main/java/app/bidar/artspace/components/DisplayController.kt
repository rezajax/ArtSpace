package app.bidar.artspace.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DisplayController(
    rem: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
        //.align(alignment = Alignment.End)
        //.align(Alignment.CenterHorizontally)
    ) {

        Button(
            onClick = { rem(0) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Previous")
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {rem(1)},
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Next")
        }


    }

}
