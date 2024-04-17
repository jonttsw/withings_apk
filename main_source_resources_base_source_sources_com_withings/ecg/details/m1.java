package com.withings.ecg.details;

import java.util.ArrayList;
import java.util.List;
/* compiled from: EcgListViewModel.kt */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<l1> f38265a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38266b;

    public m1(ArrayList arrayList, int i11) {
        this.f38265a = arrayList;
        this.f38266b = i11;
    }

    public final int a() {
        return this.f38266b;
    }

    public final List<l1> b() {
        return this.f38265a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (kotlin.jvm.internal.u.e(this.f38265a, m1Var.f38265a) && this.f38266b == m1Var.f38266b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38266b) + (this.f38265a.hashCode() * 31);
    }

    public final String toString() {
        return "EcgList(ecgItems=" + this.f38265a + ", currentItemIndex=" + this.f38266b + ")";
    }
}
