package com.igotit.calendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.mnu_about -> showAbout()
            R.id.mnu_search -> showSearch()
            android.R.id.home -> onBackPressed()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    fun showAbout(){
        Toast.makeText(this,"about clicked",Toast.LENGTH_LONG).show()
        val licenses = "Panda Soft 1.0.0"
        /*Intent(applicationContext,AboutActivity::class.java).apply {
            putExtra(APP_NAME,getString(appname))
        }*/
    }
    fun showSearch(){
        Toast.makeText(this,"search clicked",Toast.LENGTH_LONG).show()
    }
}
