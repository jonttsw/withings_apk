package com.withings.nervehealth.ui.guidedscan;

import androidx.camera.core.y1;
/* compiled from: boundaries.kt */
/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f42650a;

    /* renamed from: b  reason: collision with root package name */
    private final String f42651b;

    /* renamed from: c  reason: collision with root package name */
    private final String f42652c;

    public p0(d page, String str, String str2) {
        kotlin.jvm.internal.u.j(page, "page");
        this.f42650a = page;
        this.f42651b = str;
        this.f42652c = str2;
    }

    public static p0 a(p0 p0Var, String str) {
        d page = p0Var.f42650a;
        String userFirstname = p0Var.f42651b;
        p0Var.getClass();
        kotlin.jvm.internal.u.j(page, "page");
        kotlin.jvm.internal.u.j(userFirstname, "userFirstname");
        return new p0(page, userFirstname, str);
    }

    public final d b() {
        return this.f42650a;
    }

    public final String c() {
        return this.f42652c;
    }

    public final String d() {
        return this.f42651b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (kotlin.jvm.internal.u.e(this.f42650a, p0Var.f42650a) && kotlin.jvm.internal.u.e(this.f42651b, p0Var.f42651b) && kotlin.jvm.internal.u.e(this.f42652c, p0Var.f42652c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f42651b, this.f42650a.hashCode() * 31, 31);
        String str = this.f42652c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c11 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiState(page=");
        sb2.append(this.f42650a);
        sb2.append(", userFirstname=");
        sb2.append(this.f42651b);
        sb2.append(", timer=");
        return y1.e(sb2, this.f42652c, ")");
    }
}
