package buu.s59160937.carparker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import buu.s59160937.carparker.R.layout.activity_main
import buu.s59160937.carparker.databinding.ActivityMainBinding
data class Account(var user: String, var password: String)
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }


}
