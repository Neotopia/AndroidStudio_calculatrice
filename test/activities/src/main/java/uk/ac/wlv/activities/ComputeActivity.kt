package uk.ac.wlv.activities

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ComputeActivity: AppCompatActivity() {

    private lateinit var editTextNumberOne: EditText
    private lateinit var editTextNumberTwo: EditText
    private lateinit var calculerButton: Button
    private lateinit var resultatTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compute_activity)

        resultatTextView = findViewById(R.id.resultat)

        calculerButton = findViewById(R.id.btn_calculer)
        calculerButton.setEnabled(false)
        calculerButton.setOnClickListener{
            val sum: Int = (Integer.parseInt(editTextNumberOne.getText().toString()) + Integer.parseInt(editTextNumberTwo.getText().toString()))
            resultatTextView.setText("Résultat : ${sum.toString()}")
        }

        editTextNumberOne = findViewById(R.id.field_1)
        editTextNumberOne.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (TextUtils.isEmpty(s.toString().trim()) || (TextUtils.isEmpty(editTextNumberTwo.getText().toString().trim()))){
                    calculerButton.setEnabled(false)
                } else {
                    calculerButton.setEnabled(true)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })

        editTextNumberTwo = findViewById(R.id.field_2)
        editTextNumberTwo.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (TextUtils.isEmpty(s.toString().trim()) || (TextUtils.isEmpty(editTextNumberOne.getText().toString().trim()))) {
                    calculerButton.setEnabled(false)
                } else {
                    calculerButton.setEnabled(true)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })

    }
}