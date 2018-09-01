package br.com.wagner.proimeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.wagner.proimeiroprojeto.extension.meuclear
import br.com.wagner.proimeiroprojeto.extension.value
import br.com.wagner.proimeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btLimpar.setOnClickListener {
            inputPeso.meuclear()
            inputAltura.meuclear()
        }

        btCalcular.setOnClickListener {
            chamarTelaResultado()
        }

    }

    private fun chamarTelaResultado() {
        val telaResultadoIntent = Intent(this, ResultadoActivity::class.java)
        telaResultadoIntent.putExtra( ConstantesExtra.KEY_PESO, inputPeso.value())
        telaResultadoIntent.putExtra( ConstantesExtra.KEY_ALTURA, inputAltura.value())
        startActivity(telaResultadoIntent)
    }
}
