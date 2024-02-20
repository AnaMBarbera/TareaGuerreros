package es.anabarbera.fragmentosnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar=findViewById<BottomNavigationView>(R.id.idBottonNav)

          bottomBar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.atras -> {
                    // Lógica para retroceder a la vista anterior
                    onBackPressed()
                    true
                }

                R.id.home -> {
                    // Lógica para ir al inicio
                    val intent = Intent(this, MainActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
    }
}