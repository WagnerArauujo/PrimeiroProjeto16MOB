package br.com.wagner.proimeiroprojeto.extension

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)