package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners()  {
        val clickableViews : List<View> = listOf(
            findViewById(R.id.box_one_text),
            findViewById(R.id.box_two_text),
            findViewById(R.id.box_three_text),
            findViewById(R.id.box_four_text),
            findViewById(R.id.box_five_text) ,
            findViewById(R.id.constraint_layout) ,
            findViewById(R.id.green_btn) ,
            findViewById(R.id.red_btn) ,
            findViewById(R.id.yellow_btn)
            )
        for (item in clickableViews) {
            item.setOnClickListener() {makeColoured(it)}
        }
    }

    private fun makeColoured(view:View)  {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.RED)
            R.id.box_five_text -> view.setBackgroundColor(Color.GREEN)

            R.id.green_btn -> box_three_text.setBackgroundResource(R.color.myGreen)
            R.id.red_btn -> box_four_text.setBackgroundResource(R.color.myRed)
            R.id.yellow_btn -> box_five_text.setBackgroundResource(R.color.myYellow)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }

}