package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var MessageTextView: TextView
    lateinit var NameEditText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MessageTextView = findViewById<TextView>(R.id.MessageTextView)
        var NameEditText = findViewById<EditText>(R.id.NameEditText)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            if(NameEditText.text.isNotEmpty()){
                MessageTextView.text = "Hello" + NameEditText.text

            }
            else{
                MessageTextView.text = "No name entered"
            }
        }
    }


}