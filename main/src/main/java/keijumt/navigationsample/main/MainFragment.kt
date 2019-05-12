package keijumt.navigationsample.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_main.view.bottom_navigation_view

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val host = childFragmentManager.findFragmentById(R.id.main_nav_host)
        val controller = NavHostFragment.findNavController(requireNotNull(host))
        NavigationUI.setupWithNavController(view.bottom_navigation_view, controller)

        return view
    }


}
