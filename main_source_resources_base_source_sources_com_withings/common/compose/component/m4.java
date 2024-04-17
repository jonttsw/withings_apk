package com.withings.common.compose.component;

import com.withings.common.compose.component.Status;
/* compiled from: StatusHeader.kt */
/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: e  reason: collision with root package name */
    private static final m4 f34072e = new m4("--", null, null, null, 12);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f34073f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f34074a;

    /* renamed from: b  reason: collision with root package name */
    private final Status.Icon f34075b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34076c;

    /* renamed from: d  reason: collision with root package name */
    private final String f34077d;

    public m4(String value, Status.Icon icon, String str, String str2) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f34074a = value;
        this.f34075b = icon;
        this.f34076c = str;
        this.f34077d = str2;
    }

    public static m4 b(m4 m4Var, String str) {
        String value = m4Var.f34074a;
        kotlin.jvm.internal.u.j(value, "value");
        return new m4(value, m4Var.f34075b, str, m4Var.f34077d);
    }

    public final String c() {
        return this.f34077d;
    }

    public final Status.Icon d() {
        return this.f34075b;
    }

    public final String e() {
        return this.f34076c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        if (kotlin.jvm.internal.u.e(this.f34074a, m4Var.f34074a) && this.f34075b == m4Var.f34075b && kotlin.jvm.internal.u.e(this.f34076c, m4Var.f34076c) && kotlin.jvm.internal.u.e(this.f34077d, m4Var.f34077d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34074a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f34074a.hashCode() * 31;
        int i11 = 0;
        Status.Icon icon = this.f34075b;
        if (icon == null) {
            hashCode = 0;
        } else {
            hashCode = icon.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        String str = this.f34076c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.f34077d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatusHeaderData(value=");
        sb2.append(this.f34074a);
        sb2.append(", icon=");
        sb2.append(this.f34075b);
        sb2.append(", label=");
        sb2.append(this.f34076c);
        sb2.append(", description=");
        return androidx.camera.core.y1.e(sb2, this.f34077d, ")");
    }

    public /* synthetic */ m4(String str, Status.Icon icon, String str2, String str3, int i11) {
        this(str, (i11 & 2) != 0 ? null : icon, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
