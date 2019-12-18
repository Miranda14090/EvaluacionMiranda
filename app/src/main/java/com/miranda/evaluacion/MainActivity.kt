package com.miranda.evaluacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.game_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.pizza_ole -> {

                pizza()

                true
            }
            R.id.pasteleria_miri -> {
                pastel()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun pastel() {
        val fragmento2 = pasteleria()
        val manager=supportFragmentManager
        val transaction=manager.beginTransaction()
        transaction.replace(R.id.contenedor, fragmento2)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun pizza() {

        val fragmento1 = pizzeria()
        val manager=supportFragmentManager
        val transaction=manager.beginTransaction()
        transaction.replace(R.id.contenedor, fragmento1)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
