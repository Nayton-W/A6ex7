package com.example.a6ex7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showPopup (v: View) {
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.opcoes, popup.menu)
        popup.show()

        popup.setOnMenuItemClickListener(this)

    }

    override fun onMenuItemClick(p0: MenuItem?): Boolean{
        if (p0!= null)
            if(p0.itemId == R.id.mnuFechar)
                finish()
        return true
    }


}