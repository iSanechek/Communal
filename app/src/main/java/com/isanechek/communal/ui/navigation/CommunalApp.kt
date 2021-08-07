package com.isanechek.communal.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.isanechek.communal.ui.composition.payments.create.CreatePaymentComposition
import com.isanechek.communal.ui.composition.payments.list.PaymentsListComposition
import com.isanechek.communal.ui.theme.CommunalTheme

@Composable
fun CommunalApp() {
    val navController = rememberNavController()
    CommunalTheme {
        NavHost(navController = navController, startDestination = Screens.PaymentsList.name) {
            composable(route = Screens.PaymentsList.name) {
                PaymentsListComposition {
                    navController.navigate(Screens.CreatePayment.name)
                }
            }

            composable(Screens.CreatePayment.name) {
                CreatePaymentComposition {
                    navController.popBackStack()
                }
            }
        }
    }
}