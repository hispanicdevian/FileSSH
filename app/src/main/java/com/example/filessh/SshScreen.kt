package com.example.filessh

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SshScreen() {
    var text by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = { Text("Enter Text") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp))
            Spacer(modifier = Modifier.height(10.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Center // Center the row horizontally
            ) {
                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Select File")
                }
                    Spacer(modifier = Modifier.width(20.dp)
                )
                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Send CPS")
                }
            }
        }
    }
}
