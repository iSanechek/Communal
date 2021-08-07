package com.isanechek.communal.ui.composition.payments.create

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CreatePaymentComposition(popUp: () -> Unit) {
    Scaffold(Modifier.fillMaxSize(), topBar = {
        TopAppBar(title = { Text(text = "Создать платеж") },
            navigationIcon = {
                IconButton(popUp) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back_btn")
                }
            })
    }) {

    }
}