package com.example.motiontoast

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.example.motiontoast.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var typeFace: Typeface? = ResourcesCompat.getFont(this.applicationContext,R.font.helvetica_regular)

        binding.btnSucess.setOnClickListener {
            MotionToast.Companion.createToast(this@MainActivity,"Urray Sucess !", "Upload Completed"
                ,MotionToast.Companion.TOAST_SUCCESS,MotionToast.Companion.GRAVITY_BOTTOM
                ,MotionToast.Companion.LONG_DURATION,typeFace
            )
        }

        binding.btnError.setOnClickListener {
            MotionToast.Companion.createToast(this@MainActivity,"Failed", "Profile updated Failed"
                ,MotionToast.Companion.TOAST_ERROR,MotionToast.Companion.GRAVITY_BOTTOM
                ,MotionToast.Companion.LONG_DURATION,typeFace
            )
        }

        binding.btnWarning.setOnClickListener {
            MotionToast.Companion.createToast(this@MainActivity,"Please fill all the details!", "Uncompleted"
                ,MotionToast.Companion.TOAST_WARNING,MotionToast.Companion.GRAVITY_BOTTOM
                ,MotionToast.Companion.LONG_DURATION,typeFace
            )
        }

        binding.btnInfo.setOnClickListener {
            MotionToast.Companion.createToast(this@MainActivity,"Information", "This is information Toast"
                ,MotionToast.Companion.TOAST_INFO,MotionToast.Companion.GRAVITY_BOTTOM
                ,MotionToast.Companion.LONG_DURATION,typeFace
            )
        }

        binding.btnDelete.setOnClickListener {
            MotionToast.Companion.createToast(this@MainActivity,"Deleting", "Profile Deleted"
                ,MotionToast.Companion.TOAST_DELETE,MotionToast.Companion.GRAVITY_BOTTOM
                ,MotionToast.Companion.LONG_DURATION,typeFace
            )
        }


    }
}