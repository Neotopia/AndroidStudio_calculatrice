package uk.ac.wlv.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var clickButton: Button
    private lateinit var computeButton: Button
    private lateinit var textViewNbClick: TextView
    private var nbClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewNbClick = findViewById(R.id.text_view_nb_click)

        clickButton = findViewById(R.id.btn_click_me)
        clickButton.setOnClickListener {
            nbClick++
            val newText = "Nombre de clicks : $nbClick"
            textViewNbClick.setText(newText)
            if(nbClick >= 5){
                clickButton.isEnabled = false
                clickButton.isClickable = false
            }
        }

        computeButton = findViewById(R.id.btn_compute)
        computeButton.setOnClickListener {
            val intent = Intent(baseContext, ComputeActivity::class.java)
            startActivity(intent)
        }


    }



}