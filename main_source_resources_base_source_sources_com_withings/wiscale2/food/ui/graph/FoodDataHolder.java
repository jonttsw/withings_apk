package com.withings.wiscale2.food.ui.graph;

import bn.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import rs.e;
/* compiled from: FoodWeekGraphFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0005\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "", "", "Lrs/e;", "component1", "()Ljava/util/List;", "mainDatumList", "copy", "(Ljava/util/List;)Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMainDatumList", "setMainDatumList", "(Ljava/util/List;)V", "<init>", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodDataHolder {
    public static final int $stable = 8;
    private List<? extends e> mainDatumList;

    public FoodDataHolder(List<? extends e> mainDatumList) {
        u.j(mainDatumList, "mainDatumList");
        this.mainDatumList = mainDatumList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FoodDataHolder copy$default(FoodDataHolder foodDataHolder, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = foodDataHolder.mainDatumList;
        }
        return foodDataHolder.copy(list);
    }

    public final List<e> component1() {
        return this.mainDatumList;
    }

    public final FoodDataHolder copy(List<? extends e> mainDatumList) {
        u.j(mainDatumList, "mainDatumList");
        return new FoodDataHolder(mainDatumList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FoodDataHolder) && u.e(this.mainDatumList, ((FoodDataHolder) obj).mainDatumList)) {
            return true;
        }
        return false;
    }

    public final List<e> getMainDatumList() {
        return this.mainDatumList;
    }

    public int hashCode() {
        return this.mainDatumList.hashCode();
    }

    public final void setMainDatumList(List<? extends e> list) {
        u.j(list, "<set-?>");
        this.mainDatumList = list;
    }

    public String toString() {
        return d.b("FoodDataHolder(mainDatumList=", this.mainDatumList, ")");
    }
}
