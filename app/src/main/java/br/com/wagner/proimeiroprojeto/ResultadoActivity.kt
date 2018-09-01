package br.com.wagner.proimeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
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
                tvIMC.setText("magreza")
                setImage(R.drawable.magreza)
            }
            in 17.1..18.5 -> {
                tvIMC.setText("Abaixo do peso")
                setImage(R.drawable.abaixo)
            }
            in 18.6..24.9 -> {
                tvIMC.setText("Peso Ideal")
                setImage(R.drawable.ideal)
            }
            in 25.0..29.9 -> {
                tvIMC.setText("Levemente acima do peso")
                setImage(R.drawable.sobre)
            }
            in 30.0..34.9 -> {
                tvIMC.setText("Obesidade 1")
                setImage(R.drawable.obesidade)
            }
            in 34.5..39.9 -> {
                tvIMC.setText("Pbesidade 2")
                setImage(R.drawable.obesidade)
            }
            else -> {
                tvIMC.setText("Obesidade 3")
                setImage(R.drawable.obesidade)
            }
        }
    }

    fun setImage(resourceID: Int) {
        ivIMC.setImageDrawable(ContextCompat.getDrawable(this, resourceID))
    }

}



