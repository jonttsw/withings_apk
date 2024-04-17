package com.withings.comm.wpp;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: LoggedMessage.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f33216a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33217b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33218c;

    /* renamed from: d  reason: collision with root package name */
    private final String f33219d;

    public a(long j5, long j11, boolean z5, String bytes) {
        u.j(bytes, "bytes");
        this.f33216a = j5;
        this.f33217b = j11;
        this.f33218c = z5;
        this.f33219d = bytes;
    }

    public final String a() {
        return this.f33219d;
    }

    public final long b() {
        return this.f33217b;
    }

    public final long c() {
        return this.f33216a;
    }

    public final boolean d() {
        return this.f33218c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f33216a == aVar.f33216a && this.f33217b == aVar.f33217b && this.f33218c == aVar.f33218c && u.e(this.f33219d, aVar.f33219d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33219d.hashCode() + y1.a(this.f33218c, androidx.activity.result.c.a(this.f33217b, Long.hashCode(this.f33216a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoggedMessage(timestamp=");
        sb2.append(this.f33216a);
        sb2.append(", millisSinceStart=");
        sb2.append(this.f33217b);
        sb2.append(", isSent=");
        sb2.append(this.f33218c);
        sb2.append(", bytes=");
        return y1.e(sb2, this.f33219d, ")");
    }
}
