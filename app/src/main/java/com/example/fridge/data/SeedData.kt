package com.example.fridge.data

import com.example.fridge.data.model.Recipe

/**
 * 预置的家常菜谱种子数据，首次启动时写入 Room。
 * 食材名就是库存里常用的名字，方便推荐算法直接匹配。
 */
object SeedData {

    val recipes = listOf(
        Recipe(
            name = "番茄炒蛋",
            desc = "国民家常菜，酸甜开胃",
            steps = "1. 鸡蛋打散，番茄切块\n2. 热油先把鸡蛋炒至八分熟盛出\n3. 下番茄炒出汁，加半勺糖\n4. 倒回鸡蛋翻炒均匀即可",
            requiredIngredients = "番茄、鸡蛋",
            cookMinutes = 10
        ),
        Recipe(
            name = "青椒土豆丝",
            desc = "脆爽下饭的经典素菜",
            steps = "1. 土豆切细丝泡水去淀粉，青椒切丝\n2. 热油下土豆丝大火快炒\n3. 加青椒丝、盐、少许醋\n4. 翻炒均匀出锅",
            requiredIngredients = "土豆、青椒",
            cookMinutes = 15
        ),
        Recipe(
            name = "可乐鸡翅",
            desc = "甜咸入味，零失败硬菜",
            steps = "1. 鸡翅两面划刀，冷水下锅焯一下\n2. 少油煎至两面金黄\n3. 倒入可乐没过鸡翅，加生抽\n4. 中小火收汁到浓稠即可",
            requiredIngredients = "鸡翅、可乐",
            cookMinutes = 30
        ),
        Recipe(
            name = "麻婆豆腐",
            desc = "麻辣鲜香的川菜代表",
            steps = "1. 豆腐切块焯水备用\n2. 炒香牛肉末和豆瓣酱\n3. 加水烧开下豆腐煮3分钟\n4. 水淀粉勾芡，撒花椒粉出锅",
            requiredIngredients = "豆腐、牛肉末、豆瓣酱",
            cookMinutes = 20
        ),
        Recipe(
            name = "蒜蓉西兰花",
            desc = "清爽快手素菜",
            steps = "1. 西兰花掰小朵焯水1分钟\n2. 热油爆香蒜蓉\n3. 下西兰花大火翻炒\n4. 加盐调味出锅",
            requiredIngredients = "西兰花、大蒜",
            cookMinutes = 10
        ),
        Recipe(
            name = "蛋炒饭",
            desc = "隔夜米饭的最佳归宿",
            steps = "1. 鸡蛋炒熟盛出\n2. 下米饭炒散，加胡萝卜丁\n3. 倒回鸡蛋，加盐和少许生抽\n4. 大火翻炒均匀即可",
            requiredIngredients = "米饭、鸡蛋、胡萝卜",
            cookMinutes = 10
        ),
        Recipe(
            name = "红烧茄子",
            desc = "软糯入味的下饭神器",
            steps = "1. 茄子切滚刀块，盐腌10分钟挤水\n2. 热油煎至表面微黄\n3. 加蒜末、生抽、少许糖和水\n4. 焖3分钟收汁出锅",
            requiredIngredients = "茄子、大蒜、生抽",
            cookMinutes = 20
        ),
        Recipe(
            name = "番茄鸡蛋面",
            desc = "十分钟搞定的暖心汤面",
            steps = "1. 番茄炒出汁加水煮开\n2. 下面条煮3分钟\n3. 淋入蛋液搅成蛋花\n4. 加盐调味即可",
            requiredIngredients = "番茄、鸡蛋、面条",
            cookMinutes = 15
        ),
        Recipe(
            name = "土豆炖牛肉",
            desc = "软烂浓郁的炖菜",
            steps = "1. 牛肉切块焯水\n2. 炒糖色下牛肉翻炒上色\n3. 加水、生抽炖40分钟\n4. 下土豆、胡萝卜、洋葱再炖20分钟",
            requiredIngredients = "牛肉、土豆、胡萝卜、洋葱",
            cookMinutes = 70
        ),
        Recipe(
            name = "黄瓜炒火腿",
            desc = "清爽快手的家常小炒",
            steps = "1. 黄瓜、火腿肠切片\n2. 热油先炒火腿片\n3. 下黄瓜片大火快炒\n4. 加盐调味即可",
            requiredIngredients = "黄瓜、火腿肠",
            cookMinutes = 10
        ),
        Recipe(
            name = "香煎鸡胸肉",
            desc = "低脂高蛋白的健身餐",
            steps = "1. 鸡胸肉用刀背拍松，盐和黑胡椒腌15分钟\n2. 平底锅少油中小火煎\n3. 每面煎4分钟\n4. 静置2分钟切块",
            requiredIngredients = "鸡胸肉、黑胡椒",
            cookMinutes = 20
        ),
        Recipe(
            name = "洋葱炒牛肉",
            desc = "滑嫩下饭的家常炒菜",
            steps = "1. 牛肉逆纹切片，加生抽淀粉抓匀\n2. 热油滑炒牛肉至变色盛出\n3. 下洋葱炒软\n4. 倒回牛肉，加盐翻炒均匀",
            requiredIngredients = "牛肉、洋葱",
            cookMinutes = 15
        )
    )
}
