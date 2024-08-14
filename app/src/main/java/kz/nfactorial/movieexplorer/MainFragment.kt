package kz.nfactorial.movieexplorer

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Lifecycle", "MainFragment: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "MainFragment: onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Lifecycle", "MainFragment: onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "MainFragment: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "MainFragment: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "MainFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "MainFragment: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Lifecycle", "MainFragment: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "MainFragment: onDestroy")
    }
}