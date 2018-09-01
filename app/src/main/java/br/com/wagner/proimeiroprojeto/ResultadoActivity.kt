package br.com.wagner.proimeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
import br.com.wagner.proimeiroprojeto.extension.format
import br.com.wagner.proimeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

        calcularIMC(peso.toDouble(), altura.toDouble())


    }

    private fun calcularIMC(peso: Double, altura: Double) {
        val imc = peso / (altura * altura)
        when (imc){
            in 0..17 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.magreza)
                tvIMCDescricao.text = "Magreza"
            }
            in 17.1..18.5 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.abaixo)
                tvIMCDescricao.text = "Abaixo do peso"
            }
            in 18.6..24.9 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.ideal)
                tvIMCDescricao.text = "Peso Ideal"
            }
            in 25.0..29.9 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.sobre)
                tvIMCDescricao.text = "Sobrepeso"
            }
            in 30.0..34.9 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.obesidade)
                tvIMCDescricao.text = "Obesidade grau I"
            }
            in 34.5..39.9 -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.obesidade)
                tvIMCDescricao.text = "Obesidade grau II"
            }
            else -> {
                tvIMC.text = imc.format(0)
                setImage(R.drawable.obesidade)
                tvIMCDescricao.text = "Obesidade grau III"
            }
        }
    }

    fun setImage(resourceID: Int) {
        ivIMC.setImageDrawable(ContextCompat.getDrawable(this, resourceID))
    }

}



