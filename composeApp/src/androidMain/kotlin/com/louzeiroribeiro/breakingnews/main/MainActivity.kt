package com.louzeiroribeiro.breakingnews.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.louzeiroribeiro.breakingnews.ui.BreakingNewsCard
import com.louzeiroribeiro.breakingnews.ui.BreakingNewsTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun ComponentsPreview() {
   BreakingNewsTopBar ( onClick = {})

    BreakingNewsCard(
        title = "5 things to konw about the 'sex'",
        author = "Matt Fox",
        date = "Sunday, 9 may 2025"
    )
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}