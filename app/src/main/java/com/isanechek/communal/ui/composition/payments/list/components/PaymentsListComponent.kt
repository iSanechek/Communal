package com.isanechek.communal.ui.composition.payments.list.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.isanechek.communal.data.debug.DebugData

@Composable
fun PaymentsListComponent(paddingValues: PaddingValues) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(paddingValues), content = {
        val data = DebugData.paymentsData
        items(data) { item ->
            PaymentsListItemComponent(item)
        }
    })
}