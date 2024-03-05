package mx.edu.tecmm.moviles.ejercicio5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener  {

    lateinit var txtTitulo: TextView
    lateinit var SPLennguajes: Spinner
    lateinit var txtDescricion: TextView
    val lenguajes = arrayOf("PHP","KOTLIN","JAVASCRIPT","RUBY","C","SHIFT")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtTitulo = findViewById(R.id.txtTitulo)
        SPLennguajes = findViewById(R.id.SPLennguajes)
        txtDescricion = findViewById(R.id.txtDescricion)

        // crear una adaptador
        val adaptador = ArrayAdapter (this, android.R.layout.simple_spinner_item,lenguajes)

        SPLennguajes.adapter = adaptador
        SPLennguajes.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Log.v("app Spiner", "Selecione uno")
        val lenguaje = lenguajes [position]
        txtTitulo.text = lenguaje

        val descripcion = when(lenguaje){
            "PHP" -> "Es un lenguaje para el backend de las paginas"
            "Kotlin" -> " este es un Lenguaje para moviles"
            "JavaScript" -> "Este esp para funcion o logica de paginas web"
            "RUBY" -> " Su principal característica es su simplicidad, ya que con Ruby se pueden desarrollar aplicaciones web escribiendo menos código que con otros frameworks y con una configuración mínima."
            "C" -> "crear sofware de sitemas como sitemas y controladores"
            "SHIFt" -> "nose q ase"

            else -> "No se a definido"
        }


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}