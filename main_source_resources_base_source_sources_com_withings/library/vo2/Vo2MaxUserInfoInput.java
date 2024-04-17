package com.withings.library.vo2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Vo2MaxUserInfoInput.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000e¨\u0006%"}, d2 = {"Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "", "age", "", "height", "weight", "gender", "Lcom/withings/library/vo2/Gender;", ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX, "", "monthlyLoad", "activityClass", "(IIILcom/withings/library/vo2/Gender;Ljava/lang/Double;Ljava/lang/Integer;I)V", "getActivityClass", "()I", "getAge", "getGender", "()Lcom/withings/library/vo2/Gender;", "getHeight", "latestVo2Max", "getLatestVo2Max", "()Ljava/lang/Double;", "Ljava/lang/Double;", "maxHeartRate", "getMaxHeartRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "maxMet", "getMaxMet", "()D", "minHeartRate", "getMinHeartRate", "getMonthlyLoad", "getVo2max", "getWeight", "toString", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxUserInfoInput {
    private final int activityClass;
    private final int age;
    private final Gender gender;
    private final int height;
    private final Double latestVo2Max;
    private final Integer maxHeartRate;
    private final double maxMet;
    private final Integer minHeartRate;
    private final Integer monthlyLoad;
    private final Double vo2max;
    private final int weight;

    public Vo2MaxUserInfoInput(int i11, int i12, int i13, Gender gender, Double d11, Integer num, int i14) {
        u.j(gender, "gender");
        this.age = i11;
        this.height = i12;
        this.weight = i13;
        this.gender = gender;
        this.vo2max = d11;
        this.monthlyLoad = num;
        this.activityClass = i14;
        this.latestVo2Max = d11;
        this.maxMet = (d11 != null ? d11.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) / 3.5d;
    }

    public final int getActivityClass() {
        return this.activityClass;
    }

    public final int getAge() {
        return this.age;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Double getLatestVo2Max() {
        return this.latestVo2Max;
    }

    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final double getMaxMet() {
        return this.maxMet;
    }

    public final Integer getMinHeartRate() {
        return this.minHeartRate;
    }

    public final Integer getMonthlyLoad() {
        return this.monthlyLoad;
    }

    public final Double getVo2max() {
        return this.vo2max;
    }

    public final int getWeight() {
        return this.weight;
    }

    public String toString() {
        return "{ age: " + this.age + " - height: " + this.height + " - weight: " + this.weight + " - gender: " + this.gender + " - monthlyLoad: " + this.monthlyLoad + " - activityClass: " + this.activityClass + " - minHeartRate: " + this.minHeartRate + " - maxHeartRate: " + this.maxHeartRate + " - latestVo2Max: " + this.latestVo2Max + " - maxMet: " + this.maxMet + '}';
    }

    public /* synthetic */ Vo2MaxUserInfoInput(int i11, int i12, int i13, Gender gender, Double d11, Integer num, int i14, int i15, m mVar) {
        this(i11, i12, i13, gender, d11, num, (i15 & 64) != 0 ? 50 : i14);
    }
}
