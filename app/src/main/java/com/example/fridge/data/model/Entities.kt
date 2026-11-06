package com.example.fridge.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

/**
 * 食材库存。
 * 到期日用 epochDay（Long）存储，Room 里比较和排序都方便，
 * 需要展示时再转回 LocalDate。
 */
@Entity(tableName = "ingredients")
data class Ingredient(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val category: String,
    val quantity: Double,
    val unit: String,
    val expiryEpochDay: Long,
    val createdAt: Long = System.currentTimeMillis()
) {
    val expiryDate: LocalDate
        get() = LocalDate.ofEpochDay(expiryEpochDay)
}

/**
 * 菜谱。
 * requiredIngredients 用顿号分隔存成一个字符串，课程项目够用，
 * 省去了再做一张关联表的复杂度。
 */
@Entity(tableName = "recipes")
data class Recipe(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val desc: String,
    val steps: String,
    val requiredIngredients: String,
    val cookMinutes: Int
) {
    fun ingredientList(): List<String> =
        requiredIngredients.split("、").map { it.trim() }.filter { it.isNotEmpty() }
}
