package com.carita.feliz.saruman

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Instanciamos los componentes gráficos del menú ambientado
        val btnIrAudio = findViewById<Button>(R.id.btnIrAudio)
        val btnIrVideo = findViewById<Button>(R.id.btnIrVideo)
/*
        // 2. Evento del Bloque de Audio (Práctica 1)
        btnIrAudio.setOnClickListener {
            // Nota para los alumnos: Cambiar por la actividad correspondiente de vuestro taller de Audio
            val intent = Intent(this, AudioActivity::class.java)
            startActivity(intent)
        }*/

        // 3. Evento del Bloque de Vídeo / WebView (Práctica 2 - Palantír)
        btnIrVideo.setOnClickListener {
            val intent = Intent(this, video::class.java)
            startActivity(intent)
        }
    }
}