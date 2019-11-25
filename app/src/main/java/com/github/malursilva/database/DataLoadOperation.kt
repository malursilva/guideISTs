package com.github.malursilva.database

import android.content.res.Resources
import com.github.malursilva.R
import com.github.malursilva.model.Disease
import io.realm.Realm

class DataLoadOperation {
    private val system = Resources.getSystem()
//    private val realm: Realm = Realm.getDefaultInstance()

    fun init() {
//        val listDisease = createDiseases()
//        listDisease.forEach {
//            realm.apply {
//                beginTransaction()
//                copyToRealmOrUpdate(DiseaseDBModel(it.id, it))
//                commitTransaction()
//            }
//        }
    }

    fun createDiseases(): List<Disease> {
        val listDisease = ArrayList<Disease>()

        val waysOfContraction = ArrayList<String>().apply {
            add(system.getString(R.string.wayOfContraction_1_disease_1))
            add(system.getString(R.string.wayOfContraction_2_disease_1))
            add(system.getString(R.string.wayOfContraction_3_disease_1))
            add(system.getString(R.string.wayOfContraction_4_disease_1))
            add(system.getString(R.string.wayOfContraction_5_disease_1))
            add(system.getString(R.string.wayOfContraction_6_disease_1))
            add(system.getString(R.string.wayOfContraction_7_disease_1))
        }
        val nonWaysOfContraction = ArrayList<String>().apply {
            add(system.getString(R.string.nonWayOfContraction_1_disease_1))
            add(system.getString(R.string.nonWayOfContraction_2_disease_1))
            add(system.getString(R.string.nonWayOfContraction_3_disease_1))
            add(system.getString(R.string.nonWayOfContraction_4_disease_1))
            add(system.getString(R.string.nonWayOfContraction_5_disease_1))
            add(system.getString(R.string.nonWayOfContraction_6_disease_1))
            add(system.getString(R.string.nonWayOfContraction_7_disease_1))
            add(system.getString(R.string.nonWayOfContraction_8_disease_1))
            add(system.getString(R.string.nonWayOfContraction_9_disease_1))
            add(system.getString(R.string.nonWayOfContraction_10_disease_1))
            add(system.getString(R.string.nonWayOfContraction_11_disease_1))
            add(system.getString(R.string.nonWayOfContraction_12_disease_1))
            add(system.getString(R.string.nonWayOfContraction_13_disease_1))
        }

        listDisease.apply {
            add(
                Disease(
                    1,
                    system.getString(R.string.name_disease_1),
                    system.getString(R.string.summary_disease_1),
                    waysOfContraction,
                    nonWaysOfContraction,
                    system.getString(R.string.symptoms_disease_1),
                    system.getString(R.string.reference_disease_1)
                )
            )
            add(
                Disease(
                    2,
                    system.getString(R.string.name_disease_2),
                    system.getString(R.string.summary_disease_2),
                    null,
                    null,
                    system.getString(R.string.symptoms_disease_2),
                    null
                )
            )
        }

        return listDisease
    }
}