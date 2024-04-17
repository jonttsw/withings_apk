package com.withings.wiscale2.profile;

import androidx.camera.core.y1;
/* compiled from: AllTimeStats.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f59283a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59284b;

    /* renamed from: c  reason: collision with root package name */
    private final String f59285c;

    public b() {
        this((String) null, 0, 7);
    }

    public final String a() {
        return this.f59284b;
    }

    public final String b() {
        return this.f59285c;
    }

    public final int c() {
        return this.f59283a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f59283a == ((b) obj).f59283a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f59283a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AllTimeStat(title=");
        sb2.append(this.f59283a);
        sb2.append(", primaryValue=");
        sb2.append(this.f59284b);
        sb2.append(", secondaryValue=");
        return y1.e(sb2, this.f59285c, ")");
    }

    public b(int i11, String primaryValue, String str) {
        kotlin.jvm.internal.u.j(primaryValue, "primaryValue");
        this.f59283a = i11;
        this.f59284b = primaryValue;
        this.f59285c = str;
    }

    public /* synthetic */ b(String str, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? "" : str, (String) null);
    }
}
