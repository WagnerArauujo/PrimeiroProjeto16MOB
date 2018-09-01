package br.com.wagner.proimeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.extras.getString("PESO")
        val altura = intent.extras.getString("ALTURA")

        Toast.makeText(this,
                peso,
                Toast.LENGTH_SHORT).show()

    }
}
