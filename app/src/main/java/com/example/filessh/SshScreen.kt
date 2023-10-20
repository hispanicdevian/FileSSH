package com.example.filessh

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
    fun SshScreen(){
    Box(modifier = Modifier
        .fillMaxSize(),
        Alignment.Center
    ){

        Column {
            Alignment.CenterHorizontally
            Alignment.CenterVertically
            
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text(text = "Select File")
            }
            Spacer(modifier = Modifier.height(20.dp))

                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Send CPS")

            }
        }
    }
}