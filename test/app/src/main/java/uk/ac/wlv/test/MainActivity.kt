package uk.ac.wlv.test

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Afficher une page web
        //showWebPage()

        // appeler un numéro
        callMe()
    }

    fun showWebPage(){
        val chemin: Uri = Uri.parse("http://www.google.fr")
        val naviguer = Intent(Intent.ACTION_VIEW, chemin)
        startActivity(naviguer)
    }

    fun callMe() {
        val numero: Uri = Uri.parse("tel:0123456789")
        val appeler = Intent(Intent.ACTION_CALL, numero)
        startActivity(appeler)
    }
}
