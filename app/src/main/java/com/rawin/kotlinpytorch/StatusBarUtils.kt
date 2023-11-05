package com.rawin.kotlinpytorch

import android.view.View
import android.view.Window
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


object StatusBarUtils {
    fun setStatusBarOverlay(window: Window, showStatusBarAsOverlay: Boolean) {
        val decorView = window.decorView
        ViewCompat.setOnApplyWindowInsetsListener(
            decorView
        ) { v: View?, insets: WindowInsetsCompat? ->
            val defaultInsets = ViewCompat.onApplyWindowInsets(
                v!!, insets!!
            )
            defaultInsets.replaceSystemWindowInsets(
                defaultInsets.systemWindowInsetLeft,
                if (showStatusBarAsOverlay) 0 else defaultInsets.systemWindowInsetTop,
                defaultInsets.systemWindowInsetRight,
                defaultInsets.systemWindowInsetBottom
            )
        }
        ViewCompat.requestApplyInsets(decorView)
    }
}