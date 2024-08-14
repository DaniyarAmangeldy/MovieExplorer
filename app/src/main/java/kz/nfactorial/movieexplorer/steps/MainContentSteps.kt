package kz.nfactorial.movieexplorer.steps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kz.nfactorial.movieexplorer.R

// Step 1. Create Text
@Composable
fun MainContent() {
    Text(
        text = "Hello World!",
        style = MaterialTheme.typography.titleLarge,
        color = Color.Gray
    )
}

// Step 2. Pack to Box
@Composable
fun MainContentStep2() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Hello World!",
            style = MaterialTheme.typography.titleLarge,
            color = Color.Gray
        )
    }
}

// Step 3. Add Button with Column
@Composable
fun MainContentStep3() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
        ) {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Hello World!",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Gray
            )
            Button(
                onClick = { /* Add Action here */ },
                colors = ButtonDefaults.buttonColors(contentColor = Color.Magenta),
            ) {
                Text(
                    text = "Click me!",
                    style = MaterialTheme.typography.titleLarge,
                )
            }
        }
    }
}

// Step 4. Add Button Action
@Composable
fun MainContentStep4() {
    val text = remember { mutableStateOf("Hello World!") }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
        ) {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = text.value,
                style = MaterialTheme.typography.titleLarge,
                color = Color.Gray
            )
            Button(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(contentColor = Color.Magenta),
                onClick = { text.value = "You Click Button!" },
            ) {
                Text(
                    text = "Click me!",
                    style = MaterialTheme.typography.titleLarge,
                )
            }
        }
    }
}

// Step 5. Add Image
@Composable
fun MainContentStep5() {
    val text = remember { mutableStateOf("Hello World!") }
    val imageResource = remember { mutableStateOf(R.drawable.cat_unclicked) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
        ) {
            Image(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                painter = painterResource(imageResource.value),
                contentDescription = "cat_image",
            )
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = text.value,
                style = MaterialTheme.typography.titleLarge,
                color = Color.Gray
            )
            Button(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(contentColor = Color.Magenta),
                onClick = {
                    text.value = "You Click Button!"
                    imageResource.value = R.drawable.cat_clicked
                },
            ) {
                Text(
                    text = "Click me!",
                    style = MaterialTheme.typography.titleLarge,
                )
            }
        }
    }
}