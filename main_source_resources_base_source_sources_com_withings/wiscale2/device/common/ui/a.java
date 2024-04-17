package com.withings.wiscale2.device.common.ui;

import com.withings.features.platform.model.DeviceOwner;
/* compiled from: PlatformFeatureAggregator.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f53757a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53758b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53759c;

    /* renamed from: d  reason: collision with root package name */
    private final DeviceOwner f53760d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f53761e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f53762f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f53763g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f53764h;

    /* renamed from: i  reason: collision with root package name */
    private final long f53765i;

    /* renamed from: j  reason: collision with root package name */
    private final Long f53766j;

    /* renamed from: k  reason: collision with root package name */
    private final Long f53767k;

    /* renamed from: l  reason: collision with root package name */
    private final Integer f53768l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f53769m;

    public a(long j5, int i11, String str, DeviceOwner deviceOwner, boolean z5, boolean z11, boolean z12, boolean z13, long j11, Long l5, Long l6, Integer num, boolean z14) {
        this.f53757a = j5;
        this.f53758b = i11;
        this.f53759c = str;
        this.f53760d = deviceOwner;
        this.f53761e = z5;
        this.f53762f = z11;
        this.f53763g = z12;
        this.f53764h = z13;
        this.f53765i = j11;
        this.f53766j = l5;
        this.f53767k = l6;
        this.f53768l = num;
        this.f53769m = z14;
    }

    public final boolean a() {
        return this.f53762f;
    }

    public final Long b() {
        return this.f53767k;
    }

    public final int c() {
        return this.f53758b;
    }

    public final Integer d() {
        return this.f53768l;
    }

    public final long e() {
        return this.f53765i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f53757a == aVar.f53757a && this.f53758b == aVar.f53758b && kotlin.jvm.internal.u.e(this.f53759c, aVar.f53759c) && kotlin.jvm.internal.u.e(this.f53760d, aVar.f53760d) && this.f53761e == aVar.f53761e && this.f53762f == aVar.f53762f && this.f53763g == aVar.f53763g && this.f53764h == aVar.f53764h && this.f53765i == aVar.f53765i && kotlin.jvm.internal.u.e(this.f53766j, aVar.f53766j) && kotlin.jvm.internal.u.e(this.f53767k, aVar.f53767k) && kotlin.jvm.internal.u.e(this.f53768l, aVar.f53768l) && this.f53769m == aVar.f53769m) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f53759c;
    }

    public final Long g() {
        return this.f53766j;
    }

    public final boolean h() {
        return this.f53764h;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int a11 = androidx.appcompat.app.h.a(this.f53758b, Long.hashCode(this.f53757a) * 31, 31);
        int i11 = 0;
        String str = this.f53759c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a12 = androidx.activity.result.c.a(this.f53765i, androidx.camera.core.y1.a(this.f53764h, androidx.camera.core.y1.a(this.f53763g, androidx.camera.core.y1.a(this.f53762f, androidx.camera.core.y1.a(this.f53761e, (this.f53760d.hashCode() + ((a11 + hashCode) * 31)) * 31, 31), 31), 31), 31), 31);
        Long l5 = this.f53766j;
        if (l5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l5.hashCode();
        }
        int i12 = (a12 + hashCode2) * 31;
        Long l6 = this.f53767k;
        if (l6 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l6.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num = this.f53768l;
        if (num != null) {
            i11 = num.hashCode();
        }
        return Boolean.hashCode(this.f53769m) + ((i13 + i11) * 31);
    }

    public final boolean i() {
        return this.f53769m;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AggregatedPlatformFeature(deviceId=");
        sb2.append(this.f53757a);
        sb2.append(", featureId=");
        sb2.append(this.f53758b);
        sb2.append(", name=");
        sb2.append(this.f53759c);
        sb2.append(", deviceOwner=");
        sb2.append(this.f53760d);
        sb2.append(", synced=");
        sb2.append(this.f53761e);
        sb2.append(", active=");
        sb2.append(this.f53762f);
        sb2.append(", activable=");
        sb2.append(this.f53763g);
        sb2.append(", write=");
        sb2.append(this.f53764h);
        sb2.append(", modified=");
        sb2.append(this.f53765i);
        sb2.append(", startDate=");
        sb2.append(this.f53766j);
        sb2.append(", endDate=");
        sb2.append(this.f53767k);
        sb2.append(", frequency=");
        sb2.append(this.f53768l);
        sb2.append(", isTutorialSeen=");
        return androidx.appcompat.app.h.d(sb2, this.f53769m, ")");
    }
}
