package com.example.rapidfloatingbotton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.getbase.floatingactionbutton.FloatingActionButton
import com.getbase.floatingactionbutton.FloatingActionsMenu


class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mMainButton: FloatingActionsMenu
    lateinit var mEdit: FloatingActionButton
    lateinit var mSearch: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMainButton = findViewById(R.id.multiple_actions_down)
        mMainButton.setOnClickListener(this)
        mSearch = findViewById(R.id.search)
        mSearch.setOnClickListener(this)
        mEdit = findViewById(R.id.edit)
        mEdit.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.edit -> Toast.makeText(this, "edit", Toast.LENGTH_SHORT).show()
            R.id.search ->  Toast.makeText(this, "search", Toast.LENGTH_SHORT).show()
        }
    }

}
