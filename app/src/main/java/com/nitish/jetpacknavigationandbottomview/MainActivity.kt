package com.nitish.jetpacknavigationandbottomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.nitish.jetpacknavigationandbottomview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var navController : NavController
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        navController=findNavController(R.id.fragment_container_view_tag)

        binding.bottomNavigation.setOnItemSelectedListener {
            if (it.itemId==R.id.home)
            {
                navController.navigate(R.id.firstFragment)
            }
            else if (it.itemId== R.id.profile){
                navController.navigate(R.id.secondFragment)
            }
            return@setOnItemSelectedListener true
        }
    }
}