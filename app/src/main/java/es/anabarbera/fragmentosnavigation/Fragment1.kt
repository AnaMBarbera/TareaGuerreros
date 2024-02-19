package es.anabarbera.fragmentosnavigation

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

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
            showAlertDialog(action, "Xena")
        }
        imageViewConan.setOnClickListener {
            //llamamos a la acción (no al fragmento)
            val action = Fragment1Directions.actionFragment1ToFragment2(2)
            showAlertDialog(action, "Conan")
        }
        return root
    }
    private fun showAlertDialog(action:NavDirections , eleccion:String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("SELECCION DEL GUERRERO")
            .setMessage("¿Seguro que quieres seleccionar a $eleccion?")
            .setCancelable(false) // Evita que el usuario cierre el diálogo haciendo clic fuera de él o presionando el botón de retroceso
            .setPositiveButton("Aceptar") { dialog, _ ->
// Acción cuando se hace clic en el botón "Aceptar"
                findNavController().navigate(action)
                dialog.dismiss() // Cierra el diálogo
            }
            .setNegativeButton("Cancelar") { dialog, _ ->
// Acción cuando se hace clic en el botón "Cancelar"
                dialog.dismiss() // Cierra el diálogo
            }
            .show()
    }
}