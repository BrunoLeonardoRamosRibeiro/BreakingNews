package com.louzeiroribeiro.breakingnews.features.about

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.louzeiroribeiro.breakingnews.platform.Platform

@Composable
fun AboutScreen(
    onBackPressed: () -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(makeItems()) { item ->
            AboutComponent(
                title = item.first,
                subtitle = item.second,
                onBackPressed = onBackPressed,
            )
        }
    }
}

@Composable
private fun AboutComponent(
    title: String,
    subtitle: String,
    onBackPressed: () -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = title,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = subtitle,
            color = Color.Blue
        )
    }

    Spacer(modifier = Modifier.height(16.dp))

    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
        onClick = {
            onBackPressed.invoke()
        },
        modifier = Modifier.border(
            width = 2.dp,
            color = Color.Black,
            shape = RoundedCornerShape(3.dp)
        )
    ) {
        Text("Voltar")
    }

    HorizontalDivider()
}

private fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    return listOf(
        Pair("Sistema Operacional", "${platform.osName} ${platform.osVersion}"),
        Pair("Dispositivo", platform.deviceModel),
    )
}