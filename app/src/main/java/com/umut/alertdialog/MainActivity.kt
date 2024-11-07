package com.umut.alertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Activity Context => this
        // Application Context => applicationContext

        Toast.makeText( this,"merhaba", Toast.LENGTH_SHORT).show()
    }

    fun save(view: View){
        val alert =AlertDialog.Builder(this@MainActivity)
        alert.setTitle("title")
        alert.setMessage("message")
        alert.show()
    }

}

private fun AlertDialog.Builder.setNegativeButtonIcon(s: String) {



}
