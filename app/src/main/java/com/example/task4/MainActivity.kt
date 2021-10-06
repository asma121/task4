package com.example.task4

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var ed:EditText
    lateinit var button1: Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed=findViewById(R.id.editTextTextPersonName2)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)

        button1.setOnClickListener {
            val alertDialog=AlertDialog.Builder(this)
            alertDialog.setMessage("Good Morning")
            alertDialog.setTitle("hello")
            alertDialog.setPositiveButton("close", DialogInterface.OnClickListener{
                    dialog, id -> null
            })
            alertDialog.show()
        }

        button2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("abc","${ed.text}")
            startActivity(intent)

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        return super.onPrepareOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                Toast.makeText(applicationContext,"item clicked",Toast.LENGTH_LONG).show()
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }
}