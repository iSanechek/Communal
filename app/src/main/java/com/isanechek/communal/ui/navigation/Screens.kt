package com.isanechek.communal.ui.navigation

sealed class Screens(val name: String) {
    object PaymentsList : Screens("payments_list")
    object CreatePayment : Screens("create_payment")
}