package com.example.whatsapplib


import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat.startActivity


class Whatsapp(val context: Context,val phoneNumber: String, val messageContent: String) {

    init {
        sentMsg()
    }

    fun sentMsg() {
        try {
            val sendIntent = Intent("android.intent.action.MAIN")
            sendIntent.component = ComponentName("com.whatsapp", "com.whatsapp.Conversation")
            sendIntent.putExtra("jid", "$phoneNumber@s.whatsapp.net")
            sendIntent.putExtra(Intent.EXTRA_TEXT, messageContent)
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.type = "text/plain"
            sendIntent.setPackage("com.whatsapp")

            startActivity(context, sendIntent, null)
        } catch (e: Exception) {
            Log.e("error", "error unable to open WhatsApp")
        }
    }
}
