package br.com.wagner.proimeiroprojeto.extension

import android.widget.EditText

fun EditText.meuclear() = this.setText("")

fun EditText.value() = this.text.toString()