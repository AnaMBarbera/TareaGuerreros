package es.anabarbera.fragmentosnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import com.airbnb.lottie.LottieAnimationView


class Fragment1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //creamos variable para llamar al primer fragmento
        val root = inflater.inflate(R.layout.fragment_1, container, false)

        val botonnav = root.findViewById<Button>(R.id.button1)
        val btnAnimado=root.findViewById<LottieAnimationView>(R.id.btnAnimado)
        botonnav.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment1Directions.actionFragment1ToFragment2("Valor argumento 1 (name)")
            findNavController().navigate(action)
        }
        btnAnimado.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment1Directions.actionFragment1ToFragment2("Valor argumento del primer fragmento (name)")
            findNavController().navigate(action)
        }

        return root
    }
}