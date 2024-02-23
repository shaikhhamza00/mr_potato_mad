package com.example.mrpotato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val earCheckBox: CheckBox = findViewById(R.id.earCheckBox)
        val eyesCheckBox: CheckBox = findViewById(R.id.eyesCheckBox)
        val armsCheckBox: CheckBox = findViewById(R.id.armsCheckBox)
        val eyebrowsCheckBox: CheckBox = findViewById(R.id.eyebrowsCheckBox)
        val glassesCheckBox: CheckBox = findViewById(R.id.glassesCheckBox)
        val hatCheckBox: CheckBox = findViewById(R.id.hatCheckBox)
        val mouthCheckBox: CheckBox = findViewById(R.id.mouthCheckBox)
        val mustacheCheckBox: CheckBox = findViewById(R.id.mustacheCheckBox)
        val noseCheckBox: CheckBox = findViewById(R.id.noseCheckBox)
        val shoesCheckBox: CheckBox = findViewById(R.id.shoesCheckBox)


        val earImageView: ImageView = findViewById(R.id.earImageView)
        val eyesImageView: ImageView = findViewById(R.id.eyesImageView)
        val armsImageView: ImageView = findViewById(R.id.armsImageView)
        val eyebrowsImageView: ImageView = findViewById(R.id.eyebrowsImageView)
        val glassesImageView: ImageView = findViewById(R.id.glassesImageView)
        val hatImageView: ImageView = findViewById(R.id.hatImageView)
        val mouthImageView: ImageView = findViewById(R.id.mouthImageView)
        val mustacheImageView: ImageView = findViewById(R.id.mustacheImageView)
        val noseImageView: ImageView = findViewById(R.id.noseImageView)
        val shoesImageView: ImageView = findViewById(R.id.shoesImageView)

        earCheckBox.setOnCheckedChangeListener { _, isChecked ->
            earImageView.visibility = if (isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        eyesCheckBox.setOnCheckedChangeListener { _, isChecked ->
            eyesImageView.visibility = if (isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        armsCheckBox.setOnCheckedChangeListener { _, isChecked ->
            armsImageView.visibility = if (isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        eyebrowsCheckBox.setOnCheckedChangeListener { _, isChecked ->
            eyebrowsImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        glassesCheckBox.setOnCheckedChangeListener { _, isChecked ->
            glassesImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        hatCheckBox.setOnCheckedChangeListener { _, isChecked ->
            hatImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        mouthCheckBox.setOnCheckedChangeListener { _, isChecked ->
            mouthImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        mustacheCheckBox.setOnCheckedChangeListener { _, isChecked ->
            mustacheImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        noseCheckBox.setOnCheckedChangeListener { _, isChecked ->
            noseImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

        shoesCheckBox.setOnCheckedChangeListener { _, isChecked ->
            shoesImageView.visibility = if(isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }

    }
}
