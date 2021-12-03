package com.itacademy.data_class.models

import java.io.Serializable
import kotlin.collections.ArrayList

data class MedicalCard(
    var id: String,
    var fullName: String,
    var birthDate: String,
    var gender: String,
    var bloodGroup: String,
    var address: String?,
    var vacHistory: ArrayList<Vaccine>?,
    var sicknessHistory: ArrayList<Sickness>? = null
) : Serializable
