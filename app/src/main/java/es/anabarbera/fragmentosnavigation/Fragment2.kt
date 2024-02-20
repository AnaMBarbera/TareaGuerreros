package es.anabarbera.fragmentosnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs

class Fragment2 : Fragment() {
    val args:Fragment2Args by  navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val guerrero = view.findViewById<ImageView>(R.id.guerrero)

        if(savedInstanceState == null) {
            Log.i("1", args.idGuerrero.toString())
            val param = args.idGuerrero.toString()
            if(param=="1"){
                guerrero.setImageResource(R.drawable.xena)
            }
            else {
                guerrero.setImageResource(R.drawable.conan)
            }
        }
        return view
    }
}