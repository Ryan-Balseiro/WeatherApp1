package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.weatherapp.view.TodayFragment
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    var currentTempInt = 0

    fun initViews(){
        //header views
        val settings: Button = findViewById(R.id.btn_settings)
        val currentTemp: TextView = findViewById(R.id.tv_current_temp)
        val location: TextView = findViewById(R.id.tv_location)
        val condition: TextView = findViewById(R.id.tv_condition)
        val headerContainer: LinearLayout = findViewById(R.id.header_container)

        //fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,TodayFragment())
            .commit()
    }

    private fun setupUI(view: View){
        //val currentTemp = view.findViewById<TextView>(R.id.tv_current_temp)
        view.findViewById<Button>(R.id.btn_settings).setOnClickListener {
            //updateDisplay(view)
            //open settings fragment
        }
    }

    private fun updateDisplay(view: View) {
        //view.findViewById<TextView>(R.id.edit_text).text = counter.toString()
        changeBackground(view)
    }

    private fun changeBackground(view: View) {
        val currentTemp = view.findViewById<TextView>(R.id.tv_current_temp)
        //var body = view.background //(R.id.cl_body)
        currentTempInt = currentTemp.text.toString().toInt()
        if (currentTempInt < 60){
            //display cool temp
            //view.background =
        }
        else{
//            display warm temp
        }
    }
}