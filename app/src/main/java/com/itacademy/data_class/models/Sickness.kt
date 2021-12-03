package com.itacademy.data_class.models

import java.util.*

data class Sickness(
    var name: String,
    var date: Date,
    var status: String,
    var endDate: Date?
)
