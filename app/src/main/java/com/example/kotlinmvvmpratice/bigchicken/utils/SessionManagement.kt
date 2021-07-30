package com.example.kotlinmvvmpratice.bigchicken.utils

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import com.example.kotlinmvvmpratice.bigchicken.core.ui.activities.LoginActivity
import java.util.*

class SessionManagement(var _context: Context) {

    lateinit var prefs: SharedPreferences
    var editor: SharedPreferences.Editor? = null
    var PRIVATE_MODE = 0

    //Store Data
    fun createLoginSession(id: String?, name: String?, identity: String?) {
        editor!!.putBoolean(IS_LOGIN, true)
        editor!!.putString(KEY_ID, id)
        editor!!.putString(KEY_NAME, name)
        editor!!.putString(KEY_IDENTITY, identity)
        editor!!.commit()
    }

    fun checkLogin() {
        if (!isLoggedIn()) {
            val loginsucces = Intent(_context, LoginActivity::class.java)
            loginsucces.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

            // Add new Flag to start new Activity
            loginsucces.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            _context.startActivity(loginsucces)
        }
    }

    //Store And Use Data

    //Store And Use Data
    fun getUserDetails(): HashMap<String, String?>? {
        val user = HashMap<String, String?>()
        user[KEY_ID] = prefs.getString(KEY_ID, null)
        user[KEY_NAME] = prefs.getString(KEY_NAME, null)
        user[KEY_IDENTITY] = prefs.getString(KEY_IDENTITY, null)
        return user
    }


    fun logoutSession() {
        editor!!.clear()
        editor!!.commit()
        val logout = Intent(_context, LoginActivity::class.java)
        logout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        // Add new Flag to start new Activity
        logout.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        _context.startActivity(logout)
    }

    // Get Login State
    fun isLoggedIn(): Boolean {
        return prefs.getBoolean(IS_LOGIN, false)
    }

    fun updateData(image: String?) {
        //  editor.putString(KEY_IMAGE, image);
        editor!!.apply()
    }

    companion object {
        const val PREFS_NAME = "BigChicken"
        const val IS_LOGIN = "isLogin"
        const val KEY_NAME = "user_fullname"
        const val KEY_ID = "user_id"
        const val KEY_IDENTITY = "user_identity"
    }

    // Constructor
    init {

        prefs = _context.getSharedPreferences(PREFS_NAME, PRIVATE_MODE)
        editor = prefs.edit()
    }
}