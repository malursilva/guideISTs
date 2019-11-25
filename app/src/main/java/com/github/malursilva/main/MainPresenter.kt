package com.github.malursilva.main

import android.app.Activity
import com.github.malursilva.R
import com.github.malursilva.database.DatabaseManager
import com.github.malursilva.model.Disease

class MainPresenter (
    private val activity: Activity,
    private val databaseManager: DatabaseManager = DatabaseManager()
){

    fun getDataList(): List<Disease> {
        return databaseManager.getDataList()
    }

    fun createData(): ArrayList<Disease> {
        val listDisease = ArrayList<Disease>()

        val waysOfContraction = ArrayList<String>().apply {
            add(activity.getString(R.string.wayOfContraction_1_disease_1))
            add(activity.getString(R.string.wayOfContraction_2_disease_1))
            add(activity.getString(R.string.wayOfContraction_3_disease_1))
            add(activity.getString(R.string.wayOfContraction_4_disease_1))
            add(activity.getString(R.string.wayOfContraction_5_disease_1))
            add(activity.getString(R.string.wayOfContraction_6_disease_1))
            add(activity.getString(R.string.wayOfContraction_7_disease_1))
        }
        val nonWaysOfContraction = ArrayList<String>().apply {
            add(activity.getString(R.string.nonWayOfContraction_1_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_2_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_3_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_4_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_5_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_6_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_7_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_8_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_9_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_10_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_11_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_12_disease_1))
            add(activity.getString(R.string.nonWayOfContraction_13_disease_1))
        }

        listDisease.apply {
            add(
                Disease(
                    1,
                    activity.getString(R.string.name_disease_1),
                    activity.getString(R.string.summary_disease_1),
                    waysOfContraction,
                    nonWaysOfContraction,
                    activity.getString(R.string.symptoms_disease_1),
                    activity.getString(R.string.reference_disease_1)
                )
            )
            add(
                Disease(
                    2,
                    activity.getString(R.string.name_disease_2),
                    activity.getString(R.string.summary_disease_2),
                    null,
                    null,
                    activity.getString(R.string.symptoms_disease_2),
                    null
                )
            )
        }

        return listDisease
    }
}