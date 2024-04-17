package com.withings.wiscale2.food.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.h0;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;
import pm.b;
import x8.a;
import z8.f;
/* loaded from: classes5.dex */
public final class MealDao_RoomDb_Impl implements MealDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<Meal> __insertionAdapterOfMeal;
    private final h0 __preparedStmtOfDeleteByMealNameId;
    private final h0 __preparedStmtOfDeleteByUserId;

    public MealDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMeal = new k<Meal>(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Meal` (`id`,`userId`,`date`,`brand`,`calorieGoal`,`measureCount`,`mealNameId`,`mealNameRank`,`calories`,`sodium`,`potassium`,`carbs`,`vitaminA`,`vitaminC`,`calcium`,`iron`,`fat`,`saturatedFat`,`polyunsaturedFat`,`monounsaturatedFat`,`transFat`,`cholesterol`,`fiber`,`sugars`,`protein`,`createdDate`,`modifiedDate`,`enrich`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, Meal meal) {
                fVar.v(1, meal.getId());
                fVar.v(2, meal.getUserId());
                if (meal.getDay() == null) {
                    fVar.g2(3);
                } else {
                    fVar.s(3, meal.getDay());
                }
                fVar.v(4, meal.getBrand());
                fVar.v(5, meal.getCalorieGoal());
                fVar.v(6, meal.getMeasureCount());
                fVar.v(7, meal.getMealNameId());
                fVar.v(8, meal.getMealNameRank());
                if (meal.getCalories() == null) {
                    fVar.g2(9);
                } else {
                    fVar.f2(meal.getCalories().floatValue(), 9);
                }
                if (meal.getSodium() == null) {
                    fVar.g2(10);
                } else {
                    fVar.f2(meal.getSodium().floatValue(), 10);
                }
                if (meal.getPotassium() == null) {
                    fVar.g2(11);
                } else {
                    fVar.f2(meal.getPotassium().floatValue(), 11);
                }
                if (meal.getCarbs() == null) {
                    fVar.g2(12);
                } else {
                    fVar.f2(meal.getCarbs().floatValue(), 12);
                }
                if (meal.getVitaminA() == null) {
                    fVar.g2(13);
                } else {
                    fVar.f2(meal.getVitaminA().floatValue(), 13);
                }
                if (meal.getVitaminC() == null) {
                    fVar.g2(14);
                } else {
                    fVar.f2(meal.getVitaminC().floatValue(), 14);
                }
                if (meal.getCalcium() == null) {
                    fVar.g2(15);
                } else {
                    fVar.f2(meal.getCalcium().floatValue(), 15);
                }
                if (meal.getIron() == null) {
                    fVar.g2(16);
                } else {
                    fVar.f2(meal.getIron().floatValue(), 16);
                }
                if (meal.getFat() == null) {
                    fVar.g2(17);
                } else {
                    fVar.f2(meal.getFat().floatValue(), 17);
                }
                if (meal.getSaturatedFat() == null) {
                    fVar.g2(18);
                } else {
                    fVar.f2(meal.getSaturatedFat().floatValue(), 18);
                }
                if (meal.getPolyunsaturedFat() == null) {
                    fVar.g2(19);
                } else {
                    fVar.f2(meal.getPolyunsaturedFat().floatValue(), 19);
                }
                if (meal.getMonounsaturatedFat() == null) {
                    fVar.g2(20);
                } else {
                    fVar.f2(meal.getMonounsaturatedFat().floatValue(), 20);
                }
                if (meal.getTransFat() == null) {
                    fVar.g2(21);
                } else {
                    fVar.f2(meal.getTransFat().floatValue(), 21);
                }
                if (meal.getCholesterol() == null) {
                    fVar.g2(22);
                } else {
                    fVar.f2(meal.getCholesterol().floatValue(), 22);
                }
                if (meal.getFiber() == null) {
                    fVar.g2(23);
                } else {
                    fVar.f2(meal.getFiber().floatValue(), 23);
                }
                if (meal.getSugars() == null) {
                    fVar.g2(24);
                } else {
                    fVar.f2(meal.getSugars().floatValue(), 24);
                }
                if (meal.getProtein() == null) {
                    fVar.g2(25);
                } else {
                    fVar.f2(meal.getProtein().floatValue(), 25);
                }
                b bVar = MealDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime createdDate = meal.getCreatedDate();
                bVar.getClass();
                Long e11 = b.e(createdDate);
                if (e11 == null) {
                    fVar.g2(26);
                } else {
                    fVar.v(26, e11.longValue());
                }
                b bVar2 = MealDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime modifiedDate = meal.getModifiedDate();
                bVar2.getClass();
                Long e12 = b.e(modifiedDate);
                if (e12 == null) {
                    fVar.g2(27);
                } else {
                    fVar.v(27, e12.longValue());
                }
                fVar.v(28, meal.getEnrich());
            }
        };
        this.__preparedStmtOfDeleteByUserId = new h0(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM meal WHERE userId = ?";
            }
        };
        this.__preparedStmtOfDeleteByMealNameId = new h0(roomDatabase) { // from class: com.withings.wiscale2.food.model.MealDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM meal WHERE userId = ? AND mealNameId = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public void createOrUpdate(Meal meal) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfMeal.insert((k<Meal>) meal);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public void deleteByMealNameId(long j5, long j11) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteByMealNameId.acquire();
        acquire.v(1, j5);
        acquire.v(2, j11);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteByMealNameId.release(acquire);
        }
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public void deleteByUserId(long j5) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteByUserId.acquire();
        acquire.v(1, j5);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteByUserId.release(acquire);
        }
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public Meal queryFirstByUserId(long j5) {
        d0 d0Var;
        String string;
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        Float valueOf5;
        Float valueOf6;
        Float valueOf7;
        Float valueOf8;
        Float valueOf9;
        Float valueOf10;
        Float valueOf11;
        Float valueOf12;
        Float valueOf13;
        Float valueOf14;
        Float valueOf15;
        Float valueOf16;
        Float valueOf17;
        Long valueOf18;
        MealDao_RoomDb_Impl mealDao_RoomDb_Impl;
        d0 c11 = d0.c(1, "SELECT * FROM meal WHERE userId = ? ORDER BY date ASC");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, NavigationArguments.USER_ID);
            int b12 = a.b(c12, "date");
            int b13 = a.b(c12, "brand");
            int b14 = a.b(c12, "calorieGoal");
            int b15 = a.b(c12, "measureCount");
            int b16 = a.b(c12, "mealNameId");
            int b17 = a.b(c12, "mealNameRank");
            int b18 = a.b(c12, "calories");
            int b19 = a.b(c12, "sodium");
            int b21 = a.b(c12, "potassium");
            int b22 = a.b(c12, "carbs");
            int b23 = a.b(c12, "vitaminA");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "vitaminC");
                try {
                    int b25 = a.b(c12, "calcium");
                    int b26 = a.b(c12, "iron");
                    int b27 = a.b(c12, "fat");
                    int b28 = a.b(c12, "saturatedFat");
                    int b29 = a.b(c12, "polyunsaturedFat");
                    int b31 = a.b(c12, "monounsaturatedFat");
                    int b32 = a.b(c12, "transFat");
                    int b33 = a.b(c12, "cholesterol");
                    int b34 = a.b(c12, "fiber");
                    int b35 = a.b(c12, "sugars");
                    int b36 = a.b(c12, "protein");
                    int b37 = a.b(c12, "createdDate");
                    int b38 = a.b(c12, "modifiedDate");
                    int b39 = a.b(c12, "enrich");
                    Meal meal = null;
                    Long valueOf19 = null;
                    if (c12.moveToFirst()) {
                        Meal meal2 = new Meal();
                        meal2.setId(c12.getLong(b10));
                        meal2.setUserId(c12.getLong(b11));
                        if (c12.isNull(b12)) {
                            string = null;
                        } else {
                            string = c12.getString(b12);
                        }
                        meal2.setDay(string);
                        meal2.setBrand(c12.getInt(b13));
                        meal2.setCalorieGoal(c12.getInt(b14));
                        meal2.setMeasureCount(c12.getInt(b15));
                        meal2.setMealNameId(c12.getInt(b16));
                        meal2.setMealNameRank(c12.getInt(b17));
                        if (c12.isNull(b18)) {
                            valueOf = null;
                        } else {
                            valueOf = Float.valueOf(c12.getFloat(b18));
                        }
                        meal2.setCalories(valueOf);
                        if (c12.isNull(b19)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Float.valueOf(c12.getFloat(b19));
                        }
                        meal2.setSodium(valueOf2);
                        if (c12.isNull(b21)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Float.valueOf(c12.getFloat(b21));
                        }
                        meal2.setPotassium(valueOf3);
                        if (c12.isNull(b22)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Float.valueOf(c12.getFloat(b22));
                        }
                        meal2.setCarbs(valueOf4);
                        if (c12.isNull(b23)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Float.valueOf(c12.getFloat(b23));
                        }
                        meal2.setVitaminA(valueOf5);
                        if (c12.isNull(b24)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Float.valueOf(c12.getFloat(b24));
                        }
                        meal2.setVitaminC(valueOf6);
                        if (c12.isNull(b25)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Float.valueOf(c12.getFloat(b25));
                        }
                        meal2.setCalcium(valueOf7);
                        if (c12.isNull(b26)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Float.valueOf(c12.getFloat(b26));
                        }
                        meal2.setIron(valueOf8);
                        if (c12.isNull(b27)) {
                            valueOf9 = null;
                        } else {
                            valueOf9 = Float.valueOf(c12.getFloat(b27));
                        }
                        meal2.setFat(valueOf9);
                        if (c12.isNull(b28)) {
                            valueOf10 = null;
                        } else {
                            valueOf10 = Float.valueOf(c12.getFloat(b28));
                        }
                        meal2.setSaturatedFat(valueOf10);
                        if (c12.isNull(b29)) {
                            valueOf11 = null;
                        } else {
                            valueOf11 = Float.valueOf(c12.getFloat(b29));
                        }
                        meal2.setPolyunsaturedFat(valueOf11);
                        if (c12.isNull(b31)) {
                            valueOf12 = null;
                        } else {
                            valueOf12 = Float.valueOf(c12.getFloat(b31));
                        }
                        meal2.setMonounsaturatedFat(valueOf12);
                        if (c12.isNull(b32)) {
                            valueOf13 = null;
                        } else {
                            valueOf13 = Float.valueOf(c12.getFloat(b32));
                        }
                        meal2.setTransFat(valueOf13);
                        if (c12.isNull(b33)) {
                            valueOf14 = null;
                        } else {
                            valueOf14 = Float.valueOf(c12.getFloat(b33));
                        }
                        meal2.setCholesterol(valueOf14);
                        if (c12.isNull(b34)) {
                            valueOf15 = null;
                        } else {
                            valueOf15 = Float.valueOf(c12.getFloat(b34));
                        }
                        meal2.setFiber(valueOf15);
                        if (c12.isNull(b35)) {
                            valueOf16 = null;
                        } else {
                            valueOf16 = Float.valueOf(c12.getFloat(b35));
                        }
                        meal2.setSugars(valueOf16);
                        if (c12.isNull(b36)) {
                            valueOf17 = null;
                        } else {
                            valueOf17 = Float.valueOf(c12.getFloat(b36));
                        }
                        meal2.setProtein(valueOf17);
                        if (c12.isNull(b37)) {
                            mealDao_RoomDb_Impl = this;
                            valueOf18 = null;
                        } else {
                            valueOf18 = Long.valueOf(c12.getLong(b37));
                            mealDao_RoomDb_Impl = this;
                        }
                        try {
                            mealDao_RoomDb_Impl.__commonRoomConverter.getClass();
                            meal2.setCreatedDate(b.a(valueOf18));
                            if (!c12.isNull(b38)) {
                                valueOf19 = Long.valueOf(c12.getLong(b38));
                            }
                            mealDao_RoomDb_Impl.__commonRoomConverter.getClass();
                            meal2.setModifiedDate(b.a(valueOf19));
                            meal2.setEnrich(c12.getInt(b39));
                            meal = meal2;
                        } catch (Throwable th2) {
                            th = th2;
                            c12.close();
                            d0Var.release();
                            throw th;
                        }
                    }
                    c12.close();
                    d0Var.release();
                    return meal;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            d0Var = c11;
        }
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public List<Meal> queryForUserIdAndDay(long j5, String str) {
        d0 d0Var;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        String string;
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        int i11;
        Float valueOf5;
        int i12;
        Float valueOf6;
        Float valueOf7;
        Float valueOf8;
        Float valueOf9;
        int i13;
        Float valueOf10;
        Float valueOf11;
        Float valueOf12;
        Float valueOf13;
        Float valueOf14;
        Float valueOf15;
        Float valueOf16;
        Float valueOf17;
        Long valueOf18;
        int i14;
        int i15;
        Long valueOf19;
        d0 c11 = d0.c(2, "SELECT * FROM meal WHERE userId = ? AND date = ?");
        c11.v(1, j5);
        c11.s(2, str);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            b10 = a.b(c12, "id");
            b11 = a.b(c12, NavigationArguments.USER_ID);
            b12 = a.b(c12, "date");
            b13 = a.b(c12, "brand");
            b14 = a.b(c12, "calorieGoal");
            b15 = a.b(c12, "measureCount");
            b16 = a.b(c12, "mealNameId");
            b17 = a.b(c12, "mealNameRank");
            b18 = a.b(c12, "calories");
            b19 = a.b(c12, "sodium");
            b21 = a.b(c12, "potassium");
            b22 = a.b(c12, "carbs");
            b23 = a.b(c12, "vitaminA");
            d0Var = c11;
        } catch (Throwable th2) {
            th = th2;
            d0Var = c11;
        }
        try {
            int b24 = a.b(c12, "vitaminC");
            int b25 = a.b(c12, "calcium");
            int b26 = a.b(c12, "iron");
            int b27 = a.b(c12, "fat");
            int b28 = a.b(c12, "saturatedFat");
            int b29 = a.b(c12, "polyunsaturedFat");
            int b31 = a.b(c12, "monounsaturatedFat");
            int b32 = a.b(c12, "transFat");
            int b33 = a.b(c12, "cholesterol");
            int b34 = a.b(c12, "fiber");
            int b35 = a.b(c12, "sugars");
            int b36 = a.b(c12, "protein");
            int b37 = a.b(c12, "createdDate");
            int b38 = a.b(c12, "modifiedDate");
            int b39 = a.b(c12, "enrich");
            int i16 = b24;
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                Meal meal = new Meal();
                int i17 = b22;
                int i18 = b23;
                meal.setId(c12.getLong(b10));
                meal.setUserId(c12.getLong(b11));
                if (c12.isNull(b12)) {
                    string = null;
                } else {
                    string = c12.getString(b12);
                }
                meal.setDay(string);
                meal.setBrand(c12.getInt(b13));
                meal.setCalorieGoal(c12.getInt(b14));
                meal.setMeasureCount(c12.getInt(b15));
                meal.setMealNameId(c12.getInt(b16));
                meal.setMealNameRank(c12.getInt(b17));
                if (c12.isNull(b18)) {
                    valueOf = null;
                } else {
                    valueOf = Float.valueOf(c12.getFloat(b18));
                }
                meal.setCalories(valueOf);
                if (c12.isNull(b19)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Float.valueOf(c12.getFloat(b19));
                }
                meal.setSodium(valueOf2);
                if (c12.isNull(b21)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Float.valueOf(c12.getFloat(b21));
                }
                meal.setPotassium(valueOf3);
                b22 = i17;
                if (c12.isNull(b22)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Float.valueOf(c12.getFloat(b22));
                }
                meal.setCarbs(valueOf4);
                b23 = i18;
                if (c12.isNull(b23)) {
                    i11 = b10;
                    valueOf5 = null;
                } else {
                    i11 = b10;
                    valueOf5 = Float.valueOf(c12.getFloat(b23));
                }
                meal.setVitaminA(valueOf5);
                int i19 = i16;
                if (c12.isNull(i19)) {
                    i12 = i19;
                    valueOf6 = null;
                } else {
                    i12 = i19;
                    valueOf6 = Float.valueOf(c12.getFloat(i19));
                }
                meal.setVitaminC(valueOf6);
                int i21 = b25;
                if (c12.isNull(i21)) {
                    b25 = i21;
                    valueOf7 = null;
                } else {
                    b25 = i21;
                    valueOf7 = Float.valueOf(c12.getFloat(i21));
                }
                meal.setCalcium(valueOf7);
                int i22 = b26;
                if (c12.isNull(i22)) {
                    b26 = i22;
                    valueOf8 = null;
                } else {
                    b26 = i22;
                    valueOf8 = Float.valueOf(c12.getFloat(i22));
                }
                meal.setIron(valueOf8);
                int i23 = b27;
                if (c12.isNull(i23)) {
                    b27 = i23;
                    valueOf9 = null;
                } else {
                    b27 = i23;
                    valueOf9 = Float.valueOf(c12.getFloat(i23));
                }
                meal.setFat(valueOf9);
                int i24 = b28;
                if (c12.isNull(i24)) {
                    i13 = i24;
                    valueOf10 = null;
                } else {
                    i13 = i24;
                    valueOf10 = Float.valueOf(c12.getFloat(i24));
                }
                meal.setSaturatedFat(valueOf10);
                int i25 = b29;
                if (c12.isNull(i25)) {
                    b29 = i25;
                    valueOf11 = null;
                } else {
                    b29 = i25;
                    valueOf11 = Float.valueOf(c12.getFloat(i25));
                }
                meal.setPolyunsaturedFat(valueOf11);
                int i26 = b31;
                if (c12.isNull(i26)) {
                    b31 = i26;
                    valueOf12 = null;
                } else {
                    b31 = i26;
                    valueOf12 = Float.valueOf(c12.getFloat(i26));
                }
                meal.setMonounsaturatedFat(valueOf12);
                int i27 = b32;
                if (c12.isNull(i27)) {
                    b32 = i27;
                    valueOf13 = null;
                } else {
                    b32 = i27;
                    valueOf13 = Float.valueOf(c12.getFloat(i27));
                }
                meal.setTransFat(valueOf13);
                int i28 = b33;
                if (c12.isNull(i28)) {
                    b33 = i28;
                    valueOf14 = null;
                } else {
                    b33 = i28;
                    valueOf14 = Float.valueOf(c12.getFloat(i28));
                }
                meal.setCholesterol(valueOf14);
                int i29 = b34;
                if (c12.isNull(i29)) {
                    b34 = i29;
                    valueOf15 = null;
                } else {
                    b34 = i29;
                    valueOf15 = Float.valueOf(c12.getFloat(i29));
                }
                meal.setFiber(valueOf15);
                int i31 = b35;
                if (c12.isNull(i31)) {
                    b35 = i31;
                    valueOf16 = null;
                } else {
                    b35 = i31;
                    valueOf16 = Float.valueOf(c12.getFloat(i31));
                }
                meal.setSugars(valueOf16);
                int i32 = b36;
                if (c12.isNull(i32)) {
                    b36 = i32;
                    valueOf17 = null;
                } else {
                    b36 = i32;
                    valueOf17 = Float.valueOf(c12.getFloat(i32));
                }
                meal.setProtein(valueOf17);
                int i33 = b37;
                if (c12.isNull(i33)) {
                    i14 = i33;
                    i15 = b11;
                    valueOf18 = null;
                } else {
                    valueOf18 = Long.valueOf(c12.getLong(i33));
                    i14 = i33;
                    i15 = b11;
                }
                this.__commonRoomConverter.getClass();
                meal.setCreatedDate(b.a(valueOf18));
                int i34 = b38;
                if (c12.isNull(i34)) {
                    b38 = i34;
                    valueOf19 = null;
                } else {
                    b38 = i34;
                    valueOf19 = Long.valueOf(c12.getLong(i34));
                }
                this.__commonRoomConverter.getClass();
                meal.setModifiedDate(b.a(valueOf19));
                int i35 = b39;
                meal.setEnrich(c12.getInt(i35));
                arrayList.add(meal);
                b39 = i35;
                b11 = i15;
                b28 = i13;
                i16 = i12;
                b10 = i11;
                b37 = i14;
            }
            c12.close();
            d0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c12.close();
            d0Var.release();
            throw th;
        }
    }

    @Override // com.withings.wiscale2.food.model.MealDao
    public Meal queryLastByUserId(long j5) {
        d0 d0Var;
        String string;
        Float valueOf;
        Float valueOf2;
        Float valueOf3;
        Float valueOf4;
        Float valueOf5;
        Float valueOf6;
        Float valueOf7;
        Float valueOf8;
        Float valueOf9;
        Float valueOf10;
        Float valueOf11;
        Float valueOf12;
        Float valueOf13;
        Float valueOf14;
        Float valueOf15;
        Float valueOf16;
        Float valueOf17;
        Long valueOf18;
        MealDao_RoomDb_Impl mealDao_RoomDb_Impl;
        d0 c11 = d0.c(1, "SELECT * FROM meal WHERE userId = ? ORDER BY date DESC");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, NavigationArguments.USER_ID);
            int b12 = a.b(c12, "date");
            int b13 = a.b(c12, "brand");
            int b14 = a.b(c12, "calorieGoal");
            int b15 = a.b(c12, "measureCount");
            int b16 = a.b(c12, "mealNameId");
            int b17 = a.b(c12, "mealNameRank");
            int b18 = a.b(c12, "calories");
            int b19 = a.b(c12, "sodium");
            int b21 = a.b(c12, "potassium");
            int b22 = a.b(c12, "carbs");
            int b23 = a.b(c12, "vitaminA");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "vitaminC");
                try {
                    int b25 = a.b(c12, "calcium");
                    int b26 = a.b(c12, "iron");
                    int b27 = a.b(c12, "fat");
                    int b28 = a.b(c12, "saturatedFat");
                    int b29 = a.b(c12, "polyunsaturedFat");
                    int b31 = a.b(c12, "monounsaturatedFat");
                    int b32 = a.b(c12, "transFat");
                    int b33 = a.b(c12, "cholesterol");
                    int b34 = a.b(c12, "fiber");
                    int b35 = a.b(c12, "sugars");
                    int b36 = a.b(c12, "protein");
                    int b37 = a.b(c12, "createdDate");
                    int b38 = a.b(c12, "modifiedDate");
                    int b39 = a.b(c12, "enrich");
                    Meal meal = null;
                    Long valueOf19 = null;
                    if (c12.moveToFirst()) {
                        Meal meal2 = new Meal();
                        meal2.setId(c12.getLong(b10));
                        meal2.setUserId(c12.getLong(b11));
                        if (c12.isNull(b12)) {
                            string = null;
                        } else {
                            string = c12.getString(b12);
                        }
                        meal2.setDay(string);
                        meal2.setBrand(c12.getInt(b13));
                        meal2.setCalorieGoal(c12.getInt(b14));
                        meal2.setMeasureCount(c12.getInt(b15));
                        meal2.setMealNameId(c12.getInt(b16));
                        meal2.setMealNameRank(c12.getInt(b17));
                        if (c12.isNull(b18)) {
                            valueOf = null;
                        } else {
                            valueOf = Float.valueOf(c12.getFloat(b18));
                        }
                        meal2.setCalories(valueOf);
                        if (c12.isNull(b19)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Float.valueOf(c12.getFloat(b19));
                        }
                        meal2.setSodium(valueOf2);
                        if (c12.isNull(b21)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Float.valueOf(c12.getFloat(b21));
                        }
                        meal2.setPotassium(valueOf3);
                        if (c12.isNull(b22)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Float.valueOf(c12.getFloat(b22));
                        }
                        meal2.setCarbs(valueOf4);
                        if (c12.isNull(b23)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Float.valueOf(c12.getFloat(b23));
                        }
                        meal2.setVitaminA(valueOf5);
                        if (c12.isNull(b24)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Float.valueOf(c12.getFloat(b24));
                        }
                        meal2.setVitaminC(valueOf6);
                        if (c12.isNull(b25)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Float.valueOf(c12.getFloat(b25));
                        }
                        meal2.setCalcium(valueOf7);
                        if (c12.isNull(b26)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Float.valueOf(c12.getFloat(b26));
                        }
                        meal2.setIron(valueOf8);
                        if (c12.isNull(b27)) {
                            valueOf9 = null;
                        } else {
                            valueOf9 = Float.valueOf(c12.getFloat(b27));
                        }
                        meal2.setFat(valueOf9);
                        if (c12.isNull(b28)) {
                            valueOf10 = null;
                        } else {
                            valueOf10 = Float.valueOf(c12.getFloat(b28));
                        }
                        meal2.setSaturatedFat(valueOf10);
                        if (c12.isNull(b29)) {
                            valueOf11 = null;
                        } else {
                            valueOf11 = Float.valueOf(c12.getFloat(b29));
                        }
                        meal2.setPolyunsaturedFat(valueOf11);
                        if (c12.isNull(b31)) {
                            valueOf12 = null;
                        } else {
                            valueOf12 = Float.valueOf(c12.getFloat(b31));
                        }
                        meal2.setMonounsaturatedFat(valueOf12);
                        if (c12.isNull(b32)) {
                            valueOf13 = null;
                        } else {
                            valueOf13 = Float.valueOf(c12.getFloat(b32));
                        }
                        meal2.setTransFat(valueOf13);
                        if (c12.isNull(b33)) {
                            valueOf14 = null;
                        } else {
                            valueOf14 = Float.valueOf(c12.getFloat(b33));
                        }
                        meal2.setCholesterol(valueOf14);
                        if (c12.isNull(b34)) {
                            valueOf15 = null;
                        } else {
                            valueOf15 = Float.valueOf(c12.getFloat(b34));
                        }
                        meal2.setFiber(valueOf15);
                        if (c12.isNull(b35)) {
                            valueOf16 = null;
                        } else {
                            valueOf16 = Float.valueOf(c12.getFloat(b35));
                        }
                        meal2.setSugars(valueOf16);
                        if (c12.isNull(b36)) {
                            valueOf17 = null;
                        } else {
                            valueOf17 = Float.valueOf(c12.getFloat(b36));
                        }
                        meal2.setProtein(valueOf17);
                        if (c12.isNull(b37)) {
                            mealDao_RoomDb_Impl = this;
                            valueOf18 = null;
                        } else {
                            valueOf18 = Long.valueOf(c12.getLong(b37));
                            mealDao_RoomDb_Impl = this;
                        }
                        try {
                            mealDao_RoomDb_Impl.__commonRoomConverter.getClass();
                            meal2.setCreatedDate(b.a(valueOf18));
                            if (!c12.isNull(b38)) {
                                valueOf19 = Long.valueOf(c12.getLong(b38));
                            }
                            mealDao_RoomDb_Impl.__commonRoomConverter.getClass();
                            meal2.setModifiedDate(b.a(valueOf19));
                            meal2.setEnrich(c12.getInt(b39));
                            meal = meal2;
                        } catch (Throwable th2) {
                            th = th2;
                            c12.close();
                            d0Var.release();
                            throw th;
                        }
                    }
                    c12.close();
                    d0Var.release();
                    return meal;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            d0Var = c11;
        }
    }
}
