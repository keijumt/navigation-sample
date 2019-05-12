package keijumt.navigationsample.launcher


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlin.concurrent.thread

class LauncherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_launcher, container, false)

        thread {
            Thread.sleep(1000)
            requireActivity().runOnUiThread {
                findNavController().navigate(R.id.action_fragment_launcher_to_fragment_main)
            }
        }
        return view
    }
}
