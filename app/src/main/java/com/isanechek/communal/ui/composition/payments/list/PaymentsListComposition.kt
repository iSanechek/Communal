package com.isanechek.communal.ui.composition.payments.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.isanechek.communal.R
import com.isanechek.communal.ui.composition.payments.list.components.PaymentsFAB
import com.isanechek.communal.ui.composition.payments.list.components.PaymentsListAppBar
import com.isanechek.communal.ui.composition.payments.list.components.PaymentsListComponent

@Composable
fun PaymentsListComposition(fabClick: () -> Unit) {
    Scaffold(Modifier.fillMaxSize(), topBar = {
        PaymentsListAppBar(title = stringResource(id = R.string.app_name))
    }, floatingActionButton = {
        PaymentsFAB(fabClick)
    }, floatingActionButtonPosition = FabPosition.End) {
        PaymentsListComponent(paddingValues = it)
    }
}