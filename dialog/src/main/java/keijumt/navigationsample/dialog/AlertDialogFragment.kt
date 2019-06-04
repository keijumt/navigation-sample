package keijumt.navigationsample.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class AlertDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("AlertDialog")
            .setMessage("Message")
            .setPositiveButton("OK") { _, _ -> }
            .setNegativeButton("CANCEL") { _, _ -> }
            .create()
    }
}