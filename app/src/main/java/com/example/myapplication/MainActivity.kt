package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.chint.microbreakbluetooth.MainActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    findViewById<View>(R.id.btn_start).setOnClickListener { startMicrobreakBluetoothActivity() }
  }

  fun startMicrobreakBluetoothActivity() {
    val intent = Intent(this, MainActivity::class.java)

    startActivity(intent)
  }
}
