package com.github.malursilva.database

import com.github.malursilva.model.Disease
import io.realm.Realm

class DatabaseManager(
    private val dataLoadOperation: DataLoadOperation = DataLoadOperation()
) {
    private val realm: Realm = Realm.getDefaultInstance()

    fun init() {
        dataLoadOperation.init()
    }

    fun getDataList(): List<Disease> {
//        val dbList = realm.where(DiseaseDBModel::class.java).findAll()
        val diseaseList = dataLoadOperation.createDiseases()

//        dbList.forEach {
//            diseaseList.add(it.disease)
//        }
        return diseaseList
    }

}