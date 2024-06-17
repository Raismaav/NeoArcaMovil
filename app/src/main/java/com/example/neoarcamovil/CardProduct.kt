package com.example.neoarcamovil

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neoarcamovil.ui.theme.NeoArcaMovilTheme

@Composable
fun ProductCard(name: String, price: Double) {
    Column(modifier = Modifier
        .padding(16.dp)
        .clip(RoundedCornerShape(16.dp))
        .background(Color(0xFFFFFFFF))
        .padding(8.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProductIcon()
        ProductAdd()
        ProductText(name, price)
    }
}

@Composable
fun ProductIcon() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Product icon",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ProductAdd() {
    Row(modifier = Modifier
        .padding(8.dp)
        .clip(RoundedCornerShape(32.dp))
        .background(Color(0xFFE8234D))
        .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.baseline_remove_24),
            contentDescription = "Product icon",
            modifier = Modifier
        )
        Text(
            text = "Agregar al carrito",
            modifier = Modifier.padding(horizontal = 32.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_add_24),
            contentDescription = "Product icon",
            modifier = Modifier
        )
    }
}

@Composable
fun ProductText(name: String, price: Double) {
    Text(
        text = name,
        fontSize = 20.sp,
        modifier = Modifier.padding(8.dp)
    )

    Text(
        text = "\$$price",
        fontSize = 16.sp,
        modifier = Modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {
    NeoArcaMovilTheme {
        ProductCard("Android", 100.0)
    }
}