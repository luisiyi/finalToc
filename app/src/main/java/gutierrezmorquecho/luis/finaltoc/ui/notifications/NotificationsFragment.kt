package gutierrezmorquecho.luis.finaltoc.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import gutierrezmorquecho.luis.finaltoc.Material_extra_arte_actividades
import gutierrezmorquecho.luis.finaltoc.R
import gutierrezmorquecho.luis.finaltoc.Registro
import gutierrezmorquecho.luis.finaltoc.Restablecer_contrasena
import gutierrezmorquecho.luis.finaltoc.databinding.FragmentNotificationsBinding
import kotlinx.android.synthetic.main.fragment_notifications.*
import kotlinx.android.synthetic.main.fragment_notifications.view.*

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
/*
        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
 */

        val myIntent = Intent(activity, Material_extra_arte_actividades::class.java)
        requireActivity().startActivity(myIntent)
        /*
        val nav = Navigation.createNavigateOnClickListener(R.id.nav_notification_to_arteActividades)
        root.findViewById<Button>(R.id.botonarte)?.setOnClickListener {
            nav.onClick(it)
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}