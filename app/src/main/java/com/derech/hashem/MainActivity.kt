package com.derech.hashem
import android.app.Activity
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main)
  findViewById<Button>(R.id.accessibilityButton).setOnClickListener { startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)) }
  findViewById<Button>(R.id.adminButton).setOnClickListener { startActivity(Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN).apply { putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, ComponentName(this@MainActivity, HashemDeviceAdminReceiver::class.java)); putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, getString(R.string.device_admin_description)) }) }
 }
}
