package com.rawin.kotlinpytorch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            KotlinPytorchTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }package:com.rawin.kotlinpytorch
        val intent = Intent(this, ImageClassificationActivity::class.java)
        intent.putExtra(
            ImageClassificationActivity.INTENT_MODULE_ASSET_NAME,
            "mobilenet_v2.pt"
        )
        intent.putExtra(
            ImageClassificationActivity.INTENT_INFO_VIEW_TYPE,
            InfoViewFactory.INFO_VIEW_TYPE_IMAGE_CLASSIFICATION_QMOBILENET
        )
        startActivity(intent)
        Log.v("verbose","hELLO")
    }
}
