package com.virpalasinhchavda.mad_practical_4_21012011013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Registratiopage : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
    }

    fun homepage(view: View) {
        var intent = Intent(this,homepage::class.java)
        startActivity(intent)
    }
}
