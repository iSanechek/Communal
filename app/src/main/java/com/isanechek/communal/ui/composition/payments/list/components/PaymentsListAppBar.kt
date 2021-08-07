package com.isanechek.communal.ui.composition.payments.list.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun PaymentsListAppBar(title: String) {
    TopAppBar(title = {
        Text(text = title)
    })
}