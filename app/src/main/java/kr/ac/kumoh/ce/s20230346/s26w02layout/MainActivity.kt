package kr.ac.kumoh.ce.s20230346.s26w02layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.ce.s20230346.s26w02layout.ui.theme.S26W02LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S26W02LayoutTheme {
                MainScreen()
            //    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            //        Greeting(
            //            name = "Android",
            //            modifier = Modifier.padding(innerPadding)
            //        )
            //    }
            }
        }
    }
}
@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//        Greeting(
//            name = "반갑습니다",
//            modifier = Modifier.padding(innerPadding)
//        )
        MyLinearLayout(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun MyLinearLayout(modifier: Modifier =Modifier) {
    Column(modifier = modifier) {
        Text(text = "안녕하세요",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
                .fillMaxWidth(),
                textAlign = TextAlign.Center,
        )
        Row {
            Text(
                text = "금오공대",
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(8.dp)
                    .weight(1f),
                textAlign = TextAlign.Center,
            )
            Text(
                text = "앱프",
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(8.dp)
                    .weight(2f),
                textAlign = TextAlign.Center,
            )
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/
