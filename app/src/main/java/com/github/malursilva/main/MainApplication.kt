package com.github.malursilva.main

import android.app.Application
import android.content.Context
import com.github.malursilva.R
import com.github.malursilva.database.DatabaseManager
import io.realm.Realm
import io.realm.RealmConfiguration

class MainApplication : Application() {
    private val databaseManager: DatabaseManager = DatabaseManager()

    companion object {
        var ctx: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
//        ctx = applicationContext
//
//        Realm.init(this)
//        val realmConfig = RealmConfiguration.Builder()
//            .name(getString(R.string.db_filename))
//            .schemaVersion(1)
//            .deleteRealmIfMigrationNeeded()
//            .build()
//        Realm.setDefaultConfiguration(realmConfig)
//        databaseManager.init()
    }
}