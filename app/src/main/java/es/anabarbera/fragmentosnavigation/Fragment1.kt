package es.anabarbera.fragmentosnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

import com.airbnb.lottie.LottieAnimationView


class Fragment1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //creamos variable para llamar al primer fragmento
        val root = inflater.inflate(R.layout.fragment_1, container, false)

        val imageViewXena = root.findViewById<ImageView>(R.id.imageViewXena)
        val imageViewConan = root.findViewById<ImageView>(R.id.imageViewConan)

        imageViewXena.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment1Directions.actionFragment1ToFragment2(1)
            findNavController().navigate(action)
        }
        imageViewConan.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment1Directions.actionFragment1ToFragment2(2)
            findNavController().navigate(action)
        }

        return root
    }
}