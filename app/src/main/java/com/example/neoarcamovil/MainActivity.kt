package com.example.neoarcamovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.neoarcamovil.ui.theme.NeoArcaMovilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeoArcaMovilTheme {
                ProductCard("Android", 100.0)
            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun MainActivityPreview() {
    NeoArcaMovilTheme {
        ProductCard("Android", 100.0)
    }
}