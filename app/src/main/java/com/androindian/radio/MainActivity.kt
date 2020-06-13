package com.androindian.radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radiogroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId==R.id.radioButton){
                Toast.makeText(this@MainActivity,"aaa",Toast.LENGTH_LONG).show()
            }else if(checkedId==R.id.radioButton2){
                Toast.makeText(this@MainActivity,"xyz",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity,"zzz",Toast.LENGTH_LONG).show()
            }
        }
    }
}
