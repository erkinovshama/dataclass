package com.itacademy.data_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.itacademy.data_class.models.MedicalCard


class MainActivity2 : AppCompatActivity() {

    lateinit var textViewId: TextView
    lateinit var textViewFullName: TextView
    lateinit var textViewBirthDate: TextView
    lateinit var textViewGender: TextView
    lateinit var textViewBloodGroup: TextView
    lateinit var textViewAddress: TextView
    lateinit var btnBack: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textViewId = findViewById(R.id.textViewId)
        textViewFullName = findViewById(R.id.textViewFullName)
        textViewBirthDate = findViewById(R.id.textViewbirthDate)
        textViewGender = findViewById(R.id.textViewGender)
        textViewBloodGroup = findViewById(R.id.textViewBloodGroup)
        textViewAddress = findViewById(R.id.textViewAddress)
        btnBack = findViewById(R.id.btnBack)

        var blank = intent.getSerializableExtra("BLANK") as MedicalCard
        textViewId.text = blank.id.toString()
        textViewFullName.text = blank.fullName.toString()
        textViewBirthDate.text = blank.birthDate.toString()
        textViewGender.text = blank.gender.toString()
        textViewBloodGroup.text = blank.bloodGroup.toString()
        textViewAddress.text = blank.address.toString()

        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}