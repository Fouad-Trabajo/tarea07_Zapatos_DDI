package com.fouadaha.tarea07zapatos

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fouadaha.tarea07zapatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        functions()
    }

    private fun functions() {
        binding.apply {
            buttonSend.setOnClickListener {
                Toast.makeText(this@MainActivity, "Bottón 'enviar' pulsado", Toast.LENGTH_SHORT).show()
            }
            offerButton.setOnClickListener {
                Toast.makeText(this@MainActivity, "Bottón 'hacer una oferta' pulsado", Toast.LENGTH_SHORT).show()
            }
            buyButton.setOnClickListener {
                Toast.makeText(this@MainActivity, "Bottón 'comprar' pulsado", Toast.LENGTH_SHORT).show()
            }
            textMoreInformation.setOnClickListener {
                Toast.makeText(this@MainActivity, "Bottón 'Más' pulsado", Toast.LENGTH_SHORT).show()
            }

            checkbox.setOnCheckedChangeListener{ checkBox, isChecked ->
                val likes = checkBox.text.toString().split(" ")[0].toIntOrNull() ?: 0
                if(isChecked){
                    checkBox.text = "${likes + 1} likes"
                }else{
                    checkBox.text = "${likes - 1} likes"

                }
            }
        }
    }
}