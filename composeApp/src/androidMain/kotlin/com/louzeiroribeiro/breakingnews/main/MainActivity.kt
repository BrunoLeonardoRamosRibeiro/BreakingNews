package com.louzeiroribeiro.breakingnews.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.louzeiroribeiro.breakingnews.ui.card.BreakingNewsCard
import com.louzeiroribeiro.breakingnews.ui.header.DetailsHeaderSection
import com.louzeiroribeiro.breakingnews.ui.top.BreakingNewsTopBar

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
    Column {
        BreakingNewsTopBar(onClick = {})

        BreakingNewsCard(
            title = "5 things to konw about the 'sex'",
            author = "Matt Fox",
            date = "Sunday, 9 may 2025"
        )

        DetailsHeaderSection()
    }

}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}