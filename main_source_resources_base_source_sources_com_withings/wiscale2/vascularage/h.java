package com.withings.wiscale2.vascularage;

import androidx.camera.core.y1;
import com.withings.wiscale2.vascularage.r0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<r0.a> f62308a;

    /* renamed from: b  reason: collision with root package name */
    private final e40.d f62309b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.j<b90.a, b90.a> f62310c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62311d;

    /* renamed from: e  reason: collision with root package name */
    private final Double f62312e;

    public h(ArrayList arrayList, e40.d dVar, nm0.j pwvRangeDataGraph, boolean z5, Double d11) {
        kotlin.jvm.internal.u.j(pwvRangeDataGraph, "pwvRangeDataGraph");
        this.f62308a = arrayList;
        this.f62309b = dVar;
        this.f62310c = pwvRangeDataGraph;
        this.f62311d = z5;
        this.f62312e = d11;
    }

    public final Double a() {
        return this.f62312e;
    }

    public final List<r0.a> b() {
        return this.f62308a;
    }

    public final e40.d c() {
        return this.f62309b;
    }

    public final nm0.j<b90.a, b90.a> d() {
        return this.f62310c;
    }

    public final boolean e() {
        return this.f62311d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.u.e(this.f62308a, hVar.f62308a) && kotlin.jvm.internal.u.e(this.f62309b, hVar.f62309b) && kotlin.jvm.internal.u.e(this.f62310c, hVar.f62310c) && this.f62311d == hVar.f62311d && kotlin.jvm.internal.u.e(this.f62312e, hVar.f62312e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f62308a.hashCode() * 31;
        int i11 = 0;
        e40.d dVar = this.f62309b;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        int a11 = y1.a(this.f62311d, (this.f62310c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31, 31);
        Double d11 = this.f62312e;
        if (d11 != null) {
            i11 = d11.hashCode();
        }
        return a11 + i11;
    }

    public final String toString() {
        return "PwvData(datum=" + this.f62308a + ", pwvRange=" + this.f62309b + ", pwvRangeDataGraph=" + this.f62310c + ", shouldScrollPWV=" + this.f62311d + ", averagePwvDisplayed=" + this.f62312e + ")";
    }
}
