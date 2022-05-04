package io.github.geeksforgeinc.base_android.data.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.geeksforgeinc.base_android.data.persistance.dao.EntityDao
import io.github.geeksforgeinc.base_android.data.persistance.entity.Entity

// TODO Replace Entity::class and add exportSchema flag
@Database(
    entities = [Entity::class],
    version = AppDatabase.DATABASE_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "app_database"
        const val DATABASE_VERSION = 1
    }
    // TODO add entityDao
    abstract fun EntityDao(): EntityDao
}