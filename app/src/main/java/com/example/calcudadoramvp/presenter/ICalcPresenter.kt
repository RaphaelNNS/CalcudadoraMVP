package com.example.calculadoramvc.presenter

import android.widget.TextView

interface ICalcPresenter {

    fun showError(s: String)

    fun updateVisor(s: String)
}