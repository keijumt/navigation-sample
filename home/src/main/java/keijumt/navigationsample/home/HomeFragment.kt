package keijumt.navigationsample.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import keijumt.navigationsample.home.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )

        binding.buttonAlert.setOnClickListener {
            findNavController().navigate(R.id.alert_dialog)
        }

        return binding.root
    }
}
