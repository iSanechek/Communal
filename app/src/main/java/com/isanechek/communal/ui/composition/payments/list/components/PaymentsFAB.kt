package com.isanechek.communal.ui.composition.payments.list.components

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable

@Composable
fun PaymentsFAB(onClick: () -> Unit) {
    FloatingActionButton(onClick) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "add_payments")
    }
}