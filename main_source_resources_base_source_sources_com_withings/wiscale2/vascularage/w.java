package com.withings.wiscale2.vascularage;

import com.withings.wiscale2.vascularage.r0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final List<r0.a> f62491a;

    /* renamed from: b  reason: collision with root package name */
    private final z70.c f62492b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.j<b90.a, b90.a> f62493c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f62494d;

    /* renamed from: e  reason: collision with root package name */
    private final LocalDate f62495e;

    public w(ArrayList arrayList, z70.c cVar, nm0.j vascularAgeGraph, Integer num, LocalDate userAge) {
        kotlin.jvm.internal.u.j(vascularAgeGraph, "vascularAgeGraph");
        kotlin.jvm.internal.u.j(userAge, "userAge");
        this.f62491a = arrayList;
        this.f62492b = cVar;
        this.f62493c = vascularAgeGraph;
        this.f62494d = num;
        this.f62495e = userAge;
    }

    public final Integer a() {
        return this.f62494d;
    }

    public final List<r0.a> b() {
        return this.f62491a;
    }

    public final LocalDate c() {
        return this.f62495e;
    }

    public final nm0.j<b90.a, b90.a> d() {
        return this.f62493c;
    }

    public final z70.c e() {
        return this.f62492b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (kotlin.jvm.internal.u.e(this.f62491a, wVar.f62491a) && kotlin.jvm.internal.u.e(this.f62492b, wVar.f62492b) && kotlin.jvm.internal.u.e(this.f62493c, wVar.f62493c) && kotlin.jvm.internal.u.e(this.f62494d, wVar.f62494d) && kotlin.jvm.internal.u.e(this.f62495e, wVar.f62495e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f62491a.hashCode() * 31;
        int i11 = 0;
        z70.c cVar = this.f62492b;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int hashCode3 = (this.f62493c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        Integer num = this.f62494d;
        if (num != null) {
            i11 = num.hashCode();
        }
        return this.f62495e.hashCode() + ((hashCode3 + i11) * 31);
    }

    public final String toString() {
        return "VascularAgeData(datum=" + this.f62491a + ", vascularAgeRange=" + this.f62492b + ", vascularAgeGraph=" + this.f62493c + ", averageVascularAgeDisplayed=" + this.f62494d + ", userAge=" + this.f62495e + ")";
    }
}
