package com.github.malursilva.main

import com.github.malursilva.database.DatabaseManager
import com.github.malursilva.model.Disease

class MainPresenter (
    private val databaseManager: DatabaseManager = DatabaseManager()
){

    fun getDataList(): List<Disease> {
        return databaseManager.getDataList()
    }
}