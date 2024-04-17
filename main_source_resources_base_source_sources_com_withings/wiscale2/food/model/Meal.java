package com.withings.wiscale2.food.model;

import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
/* compiled from: Meal.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b8\b\u0017\u0018\u0000 i2\u00020\u0001:\u0001iB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010g\u001a\u0004\u0018\u00010\u001dJ\r\u0010h\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001e\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001e\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001e\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR \u0010C\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\"\u0010F\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\"\u0010I\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\u001e\u0010L\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR\u001e\u0010O\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000eR\"\u0010R\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010\u000eR\u001e\u0010U\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR\u001e\u0010X\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\"\u0010[\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\\\u0010\f\"\u0004\b]\u0010\u000eR\u001e\u0010^\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00104\"\u0004\b`\u00106R\"\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010\u000eR\"\u0010d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000e¨\u0006j"}, d2 = {"Lcom/withings/wiscale2/food/model/Meal;", "", "()V", "brand", "", "getBrand", "()I", "setBrand", "(I)V", "calcium", "", "getCalcium", "()Ljava/lang/Float;", "setCalcium", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "calorieGoal", "getCalorieGoal", "setCalorieGoal", "calories", "getCalories", "setCalories", "carbs", "getCarbs", "setCarbs", "cholesterol", "getCholesterol", "setCholesterol", "createdDate", "Lorg/joda/time/DateTime;", "getCreatedDate", "()Lorg/joda/time/DateTime;", "setCreatedDate", "(Lorg/joda/time/DateTime;)V", FoodDayFragment.ARG_DAY, "", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "enrich", "getEnrich", "setEnrich", "fat", "getFat", "setFat", "fiber", "getFiber", "setFiber", "id", "", "getId", "()J", "setId", "(J)V", "iron", "getIron", "setIron", "mealNameId", "getMealNameId", "setMealNameId", "mealNameRank", "getMealNameRank", "setMealNameRank", "measureCount", "getMeasureCount", "setMeasureCount", "modifiedDate", "getModifiedDate", "setModifiedDate", "monounsaturatedFat", "getMonounsaturatedFat", "setMonounsaturatedFat", "polyunsaturedFat", "getPolyunsaturedFat", "setPolyunsaturedFat", "potassium", "getPotassium", "setPotassium", "protein", "getProtein", "setProtein", "saturatedFat", "getSaturatedFat", "setSaturatedFat", "sodium", "getSodium", "setSodium", "sugars", "getSugars", "setSugars", "transFat", "getTransFat", "setTransFat", NavigationArguments.USER_ID, "getUserId", "setUserId", "vitaminA", "getVitaminA", "setVitaminA", "vitaminC", "getVitaminC", "setVitaminC", "getDate", "getTotalGramsEaten", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class Meal {
    private static final int NOON = 12;
    private int brand;
    private Float calcium;
    @SerializedName("goal_calories")
    private int calorieGoal;
    private Float calories;
    private Float carbs;
    private Float cholesterol;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private DateTime createdDate;
    @SerializedName("date")
    private String day;
    private int enrich;
    private Float fat;
    private Float fiber;

    /* renamed from: id  reason: collision with root package name */
    private long f56116id;
    private Float iron;
    @SerializedName("mealnameid")
    private int mealNameId;
    @SerializedName("mealnamerank")
    private int mealNameRank;
    @SerializedName("nbmeas")
    private int measureCount;
    @SerializedName("modified")
    private DateTime modifiedDate;
    @SerializedName("monounsaturated_fat")
    private Float monounsaturatedFat;
    @SerializedName("polyunsaturated_fat")
    private Float polyunsaturedFat;
    private Float potassium;
    private Float protein;
    @SerializedName("saturated_fat")
    private Float saturatedFat;
    private Float sodium;
    private Float sugars;
    @SerializedName("trans_fat")
    private Float transFat;
    @SerializedName("userid")
    private long userId;
    @SerializedName("vitamin_a")
    private Float vitaminA;
    @SerializedName("vitamin_c")
    private Float vitaminC;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String DAY_FORMAT = "yyyy-MM-dd";

    /* compiled from: Meal.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/food/model/Meal$Companion;", "", "()V", "DAY_FORMAT", "", "getDAY_FORMAT", "()Ljava/lang/String;", "NOON", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final String getDAY_FORMAT() {
            return Meal.DAY_FORMAT;
        }

        private Companion() {
        }
    }

    public final int getBrand() {
        return this.brand;
    }

    public final Float getCalcium() {
        return this.calcium;
    }

    public final int getCalorieGoal() {
        return this.calorieGoal;
    }

    public final Float getCalories() {
        return this.calories;
    }

    public final Float getCarbs() {
        return this.carbs;
    }

    public final Float getCholesterol() {
        return this.cholesterol;
    }

    public final DateTime getCreatedDate() {
        return this.createdDate;
    }

    public final DateTime getDate() {
        String str = this.day;
        if (str != null) {
            return DateTimeFormat.forPattern(DAY_FORMAT).parseDateTime(str).withHourOfDay(12);
        }
        return null;
    }

    public final String getDay() {
        return this.day;
    }

    public final int getEnrich() {
        return this.enrich;
    }

    public final Float getFat() {
        return this.fat;
    }

    public final Float getFiber() {
        return this.fiber;
    }

    public final long getId() {
        return this.f56116id;
    }

    public final Float getIron() {
        return this.iron;
    }

    public final int getMealNameId() {
        return this.mealNameId;
    }

    public final int getMealNameRank() {
        return this.mealNameRank;
    }

    public final int getMeasureCount() {
        return this.measureCount;
    }

    public final DateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public final Float getMonounsaturatedFat() {
        return this.monounsaturatedFat;
    }

    public final Float getPolyunsaturedFat() {
        return this.polyunsaturedFat;
    }

    public final Float getPotassium() {
        return this.potassium;
    }

    public final Float getProtein() {
        return this.protein;
    }

    public final Float getSaturatedFat() {
        return this.saturatedFat;
    }

    public final Float getSodium() {
        return this.sodium;
    }

    public final Float getSugars() {
        return this.sugars;
    }

    public final Float getTotalGramsEaten() {
        return MealsUtils.Companion.addFloat(this.protein, this.carbs, this.fat);
    }

    public final Float getTransFat() {
        return this.transFat;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Float getVitaminA() {
        return this.vitaminA;
    }

    public final Float getVitaminC() {
        return this.vitaminC;
    }

    public final void setBrand(int i11) {
        this.brand = i11;
    }

    public final void setCalcium(Float f11) {
        this.calcium = f11;
    }

    public final void setCalorieGoal(int i11) {
        this.calorieGoal = i11;
    }

    public final void setCalories(Float f11) {
        this.calories = f11;
    }

    public final void setCarbs(Float f11) {
        this.carbs = f11;
    }

    public final void setCholesterol(Float f11) {
        this.cholesterol = f11;
    }

    public final void setCreatedDate(DateTime dateTime) {
        this.createdDate = dateTime;
    }

    public final void setDay(String str) {
        this.day = str;
    }

    public final void setEnrich(int i11) {
        this.enrich = i11;
    }

    public final void setFat(Float f11) {
        this.fat = f11;
    }

    public final void setFiber(Float f11) {
        this.fiber = f11;
    }

    public final void setId(long j5) {
        this.f56116id = j5;
    }

    public final void setIron(Float f11) {
        this.iron = f11;
    }

    public final void setMealNameId(int i11) {
        this.mealNameId = i11;
    }

    public final void setMealNameRank(int i11) {
        this.mealNameRank = i11;
    }

    public final void setMeasureCount(int i11) {
        this.measureCount = i11;
    }

    public final void setModifiedDate(DateTime dateTime) {
        this.modifiedDate = dateTime;
    }

    public final void setMonounsaturatedFat(Float f11) {
        this.monounsaturatedFat = f11;
    }

    public final void setPolyunsaturedFat(Float f11) {
        this.polyunsaturedFat = f11;
    }

    public final void setPotassium(Float f11) {
        this.potassium = f11;
    }

    public final void setProtein(Float f11) {
        this.protein = f11;
    }

    public final void setSaturatedFat(Float f11) {
        this.saturatedFat = f11;
    }

    public final void setSodium(Float f11) {
        this.sodium = f11;
    }

    public final void setSugars(Float f11) {
        this.sugars = f11;
    }

    public final void setTransFat(Float f11) {
        this.transFat = f11;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setVitaminA(Float f11) {
        this.vitaminA = f11;
    }

    public final void setVitaminC(Float f11) {
        this.vitaminC = f11;
    }
}
