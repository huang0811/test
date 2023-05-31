package tw.edu.pu.s1100393.yuci

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.s1100393.yuci.ui.theme.黃鈺慈Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            黃鈺慈Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "作者:資管二A 黃鈺慈",
            fontSize = 15.sp,
        )
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            alpha = 0.7f,
            modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    黃鈺慈Theme {
        Greeting("Android")
    }
}