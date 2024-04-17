package com.withings.wiscale2.food.model;

import bn.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: FoodResponses.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/wiscale2/food/model/MealNameResponse;", "", "data", "", "Lcom/withings/wiscale2/food/model/MealName;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MealNameResponse {
    public static final int $stable = 8;
    private final List<MealName> data;

    public MealNameResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MealNameResponse copy$default(MealNameResponse mealNameResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mealNameResponse.data;
        }
        return mealNameResponse.copy(list);
    }

    public final List<MealName> component1() {
        return this.data;
    }

    public final MealNameResponse copy(List<MealName> data) {
        u.j(data, "data");
        return new MealNameResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MealNameResponse) && u.e(this.data, ((MealNameResponse) obj).data)) {
            return true;
        }
        return false;
    }

    public final List<MealName> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return d.b("MealNameResponse(data=", this.data, ")");
    }

    public MealNameResponse(List<MealName> data) {
        u.j(data, "data");
        this.data = data;
    }

    public /* synthetic */ MealNameResponse(List list, int i11, m mVar) {
        this((i11 & 1) != 0 ? i0.f76187a : list);
    }
}
