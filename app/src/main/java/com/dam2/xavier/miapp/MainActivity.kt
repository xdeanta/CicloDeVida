package com.dam2.xavier.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado","estoy en onCreate")
    }
    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en onResume")
    }
    override fun onStop() {
        super.onStop()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","La app, pasa a segundo plano")
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","La app fue pausada")
    }
    override fun onDestroy() {
        super.onDestroy()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","La app fue descartada")
    }
}