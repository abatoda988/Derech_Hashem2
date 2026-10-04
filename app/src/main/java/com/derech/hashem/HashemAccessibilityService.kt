package com.derech.hashem
import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.view.accessibility.AccessibilityEvent
class HashemAccessibilityService : AccessibilityService() {
 private val blockedPackages=setOf("com.android.settings","com.google.android.packageinstaller")
 override fun onAccessibilityEvent(event: AccessibilityEvent?) { if(event==null)return; val p=event.packageName?.toString()?:return; if((event.eventType==AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED||event.eventType==AccessibilityEvent.TYPE_WINDOWS_CHANGED)&&p in blockedPackages) startActivity(Intent(this,ProtectionActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)) }
 override fun onInterrupt()=Unit
}
