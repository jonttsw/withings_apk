package com.withings.wiscale2.heart.afib;

import com.withings.library.measure.Measure;
import java.util.List;
/* compiled from: AFibDetailActivity.kt */
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<Measure> f57217a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57218b;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(List<? extends Measure> list, int i11) {
        this.f57217a = list;
        this.f57218b = i11;
    }

    public final int a() {
        return this.f57218b;
    }

    public final List<Measure> b() {
        return this.f57217a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.u.e(this.f57217a, n0Var.f57217a) && this.f57218b == n0Var.f57218b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57218b) + (this.f57217a.hashCode() * 31);
    }

    public final String toString() {
        return "DataList(list=" + this.f57217a + ", currentItemIndex=" + this.f57218b + ")";
    }
}
