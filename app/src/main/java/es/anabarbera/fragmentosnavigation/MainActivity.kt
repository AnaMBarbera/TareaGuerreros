package es.anabarbera.fragmentosnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomnavigation.BottomNavigationView



private lateinit var navController: NavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     // navController = Navigation.findNavController(this, R.id.idContenedor)
       val bottomBar=findViewById<BottomNavigationView>(R.id.idBottonNav)

          bottomBar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.atras -> {
                    // Lógica para retroceder a la vista anterior
                    onBackPressed()
                    true
                }

                /*R.id.home -> {
                    // Lógica para ir al inicio

                }*/

                else -> false
            }
        }
    }
}