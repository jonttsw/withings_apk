package com.withings.wiscale2.device.common.tutorial.navigation;

import androidx.appcompat.app.h;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import kotlin.jvm.internal.u;
/* compiled from: NavigationTutorialActivity.kt */
/* loaded from: classes5.dex */
public final class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f53650a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53651b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53652c;

    /* renamed from: d  reason: collision with root package name */
    private final String f53653d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53654e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f53655f;

    public f(int i11, int i12, String str, String str2, Integer num, int i13) {
        str = (i13 & 8) != 0 ? null : str;
        str2 = (i13 & 16) != 0 ? null : str2;
        num = (i13 & 32) != 0 ? null : num;
        this.f53650a = i11;
        this.f53651b = i12;
        this.f53652c = C1987R.string._NEXT_;
        this.f53653d = str;
        this.f53654e = str2;
        this.f53655f = num;
    }

    public final Integer a() {
        return this.f53655f;
    }

    public final String b() {
        return this.f53654e;
    }

    public final String c() {
        return this.f53653d;
    }

    public final int d() {
        return this.f53652c;
    }

    public final int e() {
        return this.f53650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f53650a == fVar.f53650a && this.f53651b == fVar.f53651b && this.f53652c == fVar.f53652c && u.e(this.f53653d, fVar.f53653d) && u.e(this.f53654e, fVar.f53654e) && u.e(this.f53655f, fVar.f53655f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f53651b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a11 = h.a(this.f53652c, h.a(this.f53651b, Integer.hashCode(this.f53650a) * 31, 31), 31);
        int i11 = 0;
        String str = this.f53653d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str2 = this.f53654e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num = this.f53655f;
        if (num != null) {
            i11 = num.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        return "NavigationTutorialScreen(mainTextResId=" + this.f53650a + ", secondaryTextResId=" + this.f53651b + ", mainActionResId=" + this.f53652c + ", lottieImagesPath=" + this.f53653d + ", lottieFilePath=" + this.f53654e + ", imgId=" + this.f53655f + ")";
    }
}
