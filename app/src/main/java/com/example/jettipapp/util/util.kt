package com.example.jettipapp.util

fun calculateTotalTip(totalBill: Double, tipPercentage: Int): Double {
    return if (totalBill > 1 && totalBill.toString().trim().isNotEmpty())
        (totalBill * tipPercentage) / 100 else 0.0

}

fun calculateTotalPerPerson(totalBill: Double, splitBy: Int, tipPercentage: Int): Double {
    val bill = calculateTotalTip(totalBill, tipPercentage) + totalBill
    return bill / splitBy

}