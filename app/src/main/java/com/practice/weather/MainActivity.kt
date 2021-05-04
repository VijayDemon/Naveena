package com.practice.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.practice.weather.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Screentheme)
        setContentView(R.layout.activity_main)

         val navController :NavController = this.findNavController(R.id.mainfilefragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
     }

    override fun onSupportNavigateUp(): Boolean {
        val navController:NavController = this.findNavController(R.id.mainfilefragment)
        return navController.navigateUp()
    }

}