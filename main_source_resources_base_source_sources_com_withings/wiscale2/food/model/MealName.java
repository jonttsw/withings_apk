package com.withings.wiscale2.food.model;

import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: MealName.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014¨\u0006)"}, d2 = {"Lcom/withings/wiscale2/food/model/MealName;", "", "()V", "brand", "", "getBrand", "()I", "setBrand", "(I)V", "createdDate", "Lorg/joda/time/DateTime;", "getCreatedDate", "()Lorg/joda/time/DateTime;", "setCreatedDate", "(Lorg/joda/time/DateTime;)V", "id", "", "getId", "()J", "setId", "(J)V", "modifiedDate", "getModifiedDate", "setModifiedDate", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "rank", "getRank", "setRank", NavigationArguments.USER_ID, "getUserId", "setUserId", "equals", "", "other", "hashCode", "MealNameComparator", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MealName {
    public static final int $stable = 8;
    private int brand;
    private DateTime createdDate;
    @SerializedName("mealnameid")

    /* renamed from: id  reason: collision with root package name */
    private long f56117id;
    private DateTime modifiedDate;
    private String name;
    private int rank;
    @SerializedName("userid")
    private long userId;

    /* compiled from: MealName.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/food/model/MealName$MealNameComparator;", "Ljava/util/Comparator;", "Lcom/withings/wiscale2/food/model/MealName;", "()V", "compare", "", "mealName1", "mealName2", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MealNameComparator implements Comparator<MealName> {
        public static final int $stable = 0;

        @Override // java.util.Comparator
        public int compare(MealName mealName1, MealName mealName2) {
            u.j(mealName1, "mealName1");
            u.j(mealName2, "mealName2");
            return Double.compare(mealName1.getRank(), mealName2.getRank());
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof MealName) && ((MealName) obj).f56117id == this.f56117id) {
            return true;
        }
        return false;
    }

    public final int getBrand() {
        return this.brand;
    }

    public final DateTime getCreatedDate() {
        return this.createdDate;
    }

    public final long getId() {
        return this.f56117id;
    }

    public final DateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (int) this.f56117id;
    }

    public final void setBrand(int i11) {
        this.brand = i11;
    }

    public final void setCreatedDate(DateTime dateTime) {
        this.createdDate = dateTime;
    }

    public final void setId(long j5) {
        this.f56117id = j5;
    }

    public final void setModifiedDate(DateTime dateTime) {
        this.modifiedDate = dateTime;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRank(int i11) {
        this.rank = i11;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }
}
