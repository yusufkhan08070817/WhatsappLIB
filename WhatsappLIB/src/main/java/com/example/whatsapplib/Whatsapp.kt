package com.example.whatsapplib

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat.startActivity

class Whatsapp(val phoneNumber: String, val context: Context) {
init {
    sentMsg()
}
    fun sentMsg() {
       try {
           val sendIntent = Intent("android.intent.action.MAIN")
           sendIntent.component = ComponentName("com.whatsapp", "com.whatsapp.Conversation")
           sendIntent.putExtra("jid", "$phoneNumber@s.whatsapp.net")

           startActivity(context, sendIntent, null)
       }catch (e:Exception)
       {
           Log.e("error","error unable to open whatsapp")}

         }
}