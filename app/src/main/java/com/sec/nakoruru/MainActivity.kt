package com.sec.nakoruru

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import java.io.File

class MainActivity : AppCompatActivity() {

    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                // val intent = result.intent
                // Handle the Intent
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startForResult.launch(Intent())

        val oldName = "hi DHL"
        val newName = "hi dhl"
        val result = oldName.equals(newName, ignoreCase = true)

        val target: String? = ""
        val name = target.orEmpty().ifEmpty { "dhl" }
        val name2 = target?.toIntOrNull() ?: 0
        val number = target?.toDoubleOrNull() ?: 0
        val number2 = target?.toBoolean() ?: 0


        File("dhl.txt").useLines { line ->
            println(line)
        }
    }

}