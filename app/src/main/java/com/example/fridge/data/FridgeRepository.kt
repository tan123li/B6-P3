package com.example.fridge.data

import com.example.fridge.data.db.AppDatabase
import com.example.fridge.data.model.Ingredient
import com.example.fridge.data.model.Recipe
import kotlinx.coroutines.flow.Flow

/**
 * 数据仓库：UI 层只跟它打交道，不直接碰 DAO。
 */
class FridgeRepository(private val db: AppDatabase) {

    private val ingredientDao = db.ingredientDao()
    private val recipeDao = db.recipeDao()

    fun observeIngredients(): Flow<List<Ingredient>> = ingredientDao.observeAll()

    fun observeRecipes(): Flow<List<Recipe>> = recipeDao.observeAll()

    suspend fun getIngredients(): List<Ingredient> = ingredientDao.getAll()

    suspend fun getIngredient(id: Long): Ingredient? = ingredientDao.getById(id)

    suspend fun getRecipe(id: Long): Recipe? = recipeDao.getById(id)

    suspend fun saveIngredient(ingredient: Ingredient): Long = ingredientDao.upsert(ingredient)

    suspend fun deleteIngredient(id: Long) = ingredientDao.deleteById(id)

    /** 首次启动（菜谱表为空）时写入预置菜谱 */
    suspend fun seedIfEmpty() {
        if (recipeDao.count() == 0) {
            recipeDao.insertAll(SeedData.recipes)
        }
    }
}
