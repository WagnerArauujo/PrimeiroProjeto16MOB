package br.com.wagner.proimeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        Toast.makeText(this,
                "Estoy aqui",
                Toast.LENGTH_SHORT).show()

    }
}
