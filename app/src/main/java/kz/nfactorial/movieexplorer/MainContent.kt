package kz.nfactorial.movieexplorer

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MainContent() {
    Text(
        text = "Hello World!",
        style = MaterialTheme.typography.titleLarge,
        color = Color.Gray
    )
}