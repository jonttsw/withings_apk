package com.withings.library.authentication.api.account;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: AccountContextBuilder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006!"}, d2 = {"Lcom/withings/library/authentication/api/account/SharedUnitBuilder;", "", "distance", "", "height", "temperature", "weight", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDistance", "()Ljava/lang/Integer;", "setDistance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHeight", "setHeight", "getTemperature", "setTemperature", "getWeight", "setWeight", "build", "Lcom/withings/library/authentication/api/account/SharedUnit;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/library/authentication/api/account/SharedUnitBuilder;", "equals", "", "other", "hashCode", "toString", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SharedUnitBuilder {
    private Integer distance;
    private Integer height;
    private Integer temperature;
    private Integer weight;

    public SharedUnitBuilder() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SharedUnitBuilder copy$default(SharedUnitBuilder sharedUnitBuilder, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = sharedUnitBuilder.distance;
        }
        if ((i11 & 2) != 0) {
            num2 = sharedUnitBuilder.height;
        }
        if ((i11 & 4) != 0) {
            num3 = sharedUnitBuilder.temperature;
        }
        if ((i11 & 8) != 0) {
            num4 = sharedUnitBuilder.weight;
        }
        return sharedUnitBuilder.copy(num, num2, num3, num4);
    }

    public final SharedUnit build() {
        return new SharedUnit(this.distance, this.height, this.temperature, this.weight);
    }

    public final Integer component1() {
        return this.distance;
    }

    public final Integer component2() {
        return this.height;
    }

    public final Integer component3() {
        return this.temperature;
    }

    public final Integer component4() {
        return this.weight;
    }

    public final SharedUnitBuilder copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new SharedUnitBuilder(num, num2, num3, num4);
    }

    public final SharedUnitBuilder distance(int i11) {
        this.distance = Integer.valueOf(i11);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedUnitBuilder)) {
            return false;
        }
        SharedUnitBuilder sharedUnitBuilder = (SharedUnitBuilder) obj;
        if (u.e(this.distance, sharedUnitBuilder.distance) && u.e(this.height, sharedUnitBuilder.height) && u.e(this.temperature, sharedUnitBuilder.temperature) && u.e(this.weight, sharedUnitBuilder.weight)) {
            return true;
        }
        return false;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getTemperature() {
        return this.temperature;
    }

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.distance;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.height;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num3 = this.temperature;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num4 = this.weight;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i14 + i11;
    }

    public final SharedUnitBuilder height(int i11) {
        this.height = Integer.valueOf(i11);
        return this;
    }

    public final void setDistance(Integer num) {
        this.distance = num;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setTemperature(Integer num) {
        this.temperature = num;
    }

    public final void setWeight(Integer num) {
        this.weight = num;
    }

    public final SharedUnitBuilder temperature(int i11) {
        this.temperature = Integer.valueOf(i11);
        return this;
    }

    public String toString() {
        Integer num = this.distance;
        Integer num2 = this.height;
        Integer num3 = this.temperature;
        Integer num4 = this.weight;
        return "SharedUnitBuilder(distance=" + num + ", height=" + num2 + ", temperature=" + num3 + ", weight=" + num4 + ")";
    }

    public final SharedUnitBuilder weight(int i11) {
        this.weight = Integer.valueOf(i11);
        return this;
    }

    public SharedUnitBuilder(Integer num, Integer num2, Integer num3, Integer num4) {
        this.distance = num;
        this.height = num2;
        this.temperature = num3;
        this.weight = num4;
    }

    public /* synthetic */ SharedUnitBuilder(Integer num, Integer num2, Integer num3, Integer num4, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
    }
}
