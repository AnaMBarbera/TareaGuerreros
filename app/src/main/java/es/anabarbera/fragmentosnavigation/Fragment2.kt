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

class Fragment2 : Fragment() {
    val args:Fragment2Args by  navArgs()
    private lateinit var textViewParam:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //si queremos utilizar un textView para ver el parámetro
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        textViewParam = view.findViewById(R.id.textViewParam)

        val botonnav = view.findViewById<Button>(R.id.button21)

        botonnav.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment2Directions.actionFragment2ToFragment3("parámetro provincia")
            findNavController().navigate(action)
        }

        if(savedInstanceState == null) {
            Log.i("PARAMETRO1: ", args.name.toString())
            val param = args.name.toString()
            //para verlo en el textview
            textViewParam.text=param
        }


        return view
        //return inflater.inflate(R.layout.fragment_2, container, false)
    }
}