package com.wizbizagent.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WizBizAgentApp()
        }
    }
}

@Composable
fun WizBizAgentApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "🚀 Welcome to WizBizAgent",
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 22.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { /* TODO: Add navigation later */ }) {
                Text("Get Started")
            }
        }
    }
}
