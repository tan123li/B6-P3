package com.example.fridge.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fridge.data.model.Ingredient
import com.example.fridge.data.model.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface IngredientDao {

    /** 按到期日升序，越快到期的排越前面 */
    @Query("SELECT * FROM ingredients ORDER BY expiryEpochDay ASC")
    fun observeAll(): Flow<List<Ingredient>>

    @Query("SELECT * FROM ingredients ORDER BY expiryEpochDay ASC")
    suspend fun getAll(): List<Ingredient>

    @Query("SELECT * FROM ingredients WHERE id = :id")
    suspend fun getById(id: Long): Ingredient?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(ingredient: Ingredient): Long

    @Delete
    suspend fun delete(ingredient: Ingredient)

    @Query("DELETE FROM ingredients WHERE id = :id")
    suspend fun deleteById(id: Long)
}

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipes ORDER BY name ASC")
    fun observeAll(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipes ORDER BY name ASC")
    suspend fun getAll(): List<Recipe>

    @Query("SELECT * FROM recipes WHERE id = :id")
    suspend fun getById(id: Long): Recipe?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(recipes: List<Recipe>)

    @Query("SELECT COUNT(*) FROM recipes")
    suspend fun count(): Int
}
