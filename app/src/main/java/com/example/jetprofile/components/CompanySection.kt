package com.example.jetprofile.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "エンジニア株式会社",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "エンジニア部",
            color = Color.Gray,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Label(icon = Icons.Default.Email, text = "Email")

        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "oniremon@gmail.com", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))

        Divider(
            modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
            thickness = 2.dp
        )
    }
}