package com.withings.tutorials.ui.screens.tab;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: TutorialType.kt */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final int f46297a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46298b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46299c;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.p<androidx.compose.runtime.a, Integer, y> f46300d;

    /* renamed from: e  reason: collision with root package name */
    private final String f46301e;

    public p(int i11, int i12, String str, s1.a aVar, String str2) {
        this.f46297a = i11;
        this.f46298b = i12;
        this.f46299c = str;
        this.f46300d = aVar;
        this.f46301e = str2;
    }

    public final int a() {
        return this.f46297a;
    }

    public final int b() {
        return this.f46298b;
    }

    public final String c() {
        return this.f46301e;
    }

    public final String d() {
        return this.f46299c;
    }

    public final ym0.p<androidx.compose.runtime.a, Integer, y> e() {
        return this.f46300d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f46297a == pVar.f46297a && this.f46298b == pVar.f46298b && u.e(this.f46299c, pVar.f46299c) && u.e(this.f46300d, pVar.f46300d) && u.e(this.f46301e, pVar.f46301e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f46300d.hashCode() + defpackage.d.c(this.f46299c, androidx.appcompat.app.h.a(this.f46298b, Integer.hashCode(this.f46297a) * 31, 31), 31)) * 31;
        String str = this.f46301e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TutorialContentScreen(asset=");
        sb2.append(this.f46297a);
        sb2.append(", body=");
        sb2.append(this.f46298b);
        sb2.append(", route=");
        sb2.append(this.f46299c);
        sb2.append(", title=");
        sb2.append(this.f46300d);
        sb2.append(", nextRoute=");
        return y1.e(sb2, this.f46301e, ")");
    }
}
