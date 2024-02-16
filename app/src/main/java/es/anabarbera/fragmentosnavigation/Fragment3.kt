package es.anabarbera.fragmentosnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class Fragment3 : Fragment() {
    val args:Fragment3Args by  navArgs()
    private lateinit var textViewParam23: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //creamos variable para llamar al fragmento
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        val botonnav31 = view.findViewById<Button>(R.id.button31)
        val botonnav32 = view.findViewById<Button>(R.id.button32)
        textViewParam23 = view.findViewById(R.id.textViewParam23)

        botonnav31.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment3Directions.actionFragment3ToFragment1()
            findNavController().navigate(action)
        }
        botonnav32.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment3Directions.actionFragment3ToFragment2("¡PELIGRO! ¡PELIGRO!")
            findNavController().navigate(action)
        }
        if(savedInstanceState == null) {
            Log.i("PARAMETRO1: ", args.provincia.toString())
            val param = args.provincia.toString()
            //para verlo en el textview
            textViewParam23.text=param
        }

        return view
    }
}