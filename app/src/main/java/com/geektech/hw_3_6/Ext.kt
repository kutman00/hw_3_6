package com.geektech.hw_3_6

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun FragmentActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
}

fun Fragment.replaceFragment(fragment: Fragment) {
    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, fragment).addToBackStack("").commit()
}