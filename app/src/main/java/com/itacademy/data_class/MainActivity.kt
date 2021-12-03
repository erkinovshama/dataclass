package com.itacademy.data_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import com.itacademy.data_class.models.MedicalCard
import com.itacademy.data_class.models.Sickness
import com.itacademy.data_class.models.Vaccine


class MainActivity : AppCompatActivity() {

    lateinit var personalID: EditText
    lateinit var fullName: EditText
    lateinit var birthDate: EditText
    lateinit var gender: EditText
    lateinit var bloodGroup: EditText
    lateinit var address: EditText
    lateinit var btnNext: Button

    var blank: MedicalCard? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        personalID = findViewById(R.id.perconalId)
        fullName = findViewById(R.id.fullName)
        birthDate = findViewById(R.id.birthDate)
        gender = findViewById(R.id.gender)
        bloodGroup = findViewById(R.id.bloodGroup)
        address = findViewById(R.id.address)
        btnNext = findViewById(R.id.btnNext)
        val arrayVaccines = arrayListOf<Vaccine>()
        val arraySickness = arrayListOf<Sickness>()


        btnNext.setOnClickListener {
            blank = MedicalCard(
                id = personalID.text.toString(),
                fullName = fullName.text.toString(),
                birthDate = birthDate.text.toString(),
                gender = gender.text.toString(),
                bloodGroup = bloodGroup.text.toString(),
                address = address.text.toString(),
                vacHistory = arrayVaccines,
                sicknessHistory = arraySickness)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("BLANK", blank)
            startActivity(intent)
        }
    }
}