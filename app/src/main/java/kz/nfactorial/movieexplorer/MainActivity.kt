package kz.nfactorial.movieexplorer

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainerView

class MainActivity : FragmentActivity(R.layout.main_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "MainActivity: onCreate")
        val container = findViewById<FragmentContainerView>(R.id.container)
        supportFragmentManager.beginTransaction().add(container, MainFragment(), "MainFragment").commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "MainActivity: onDestroy")
    }
}