package com.derech.hashem
import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.Button
class ProtectionActivity : Activity() {
 private val handler=Handler(Looper.getMainLooper())
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); setContentView(R.layout.activity_protection); val b=findViewById<Button>(R.id.backButton); b.isEnabled=false; handler.postDelayed({b.isEnabled=true},2000); b.setOnClickListener{finish()} }
 @Suppress("DEPRECATION") override fun onBackPressed() {}
}
