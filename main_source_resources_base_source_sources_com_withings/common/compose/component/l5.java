package com.withings.common.compose.component;
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class l5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f34047a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34048b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34049c;

    public l5(String firstname, String lastname, String str) {
        kotlin.jvm.internal.u.j(firstname, "firstname");
        kotlin.jvm.internal.u.j(lastname, "lastname");
        this.f34047a = firstname;
        this.f34048b = lastname;
        this.f34049c = str;
    }

    public final String a() {
        return this.f34047a;
    }

    public final String b() {
        return this.f34048b;
    }

    public final String c() {
        return this.f34049c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        if (kotlin.jvm.internal.u.e(this.f34047a, l5Var.f34047a) && kotlin.jvm.internal.u.e(this.f34048b, l5Var.f34048b) && kotlin.jvm.internal.u.e(this.f34049c, l5Var.f34049c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c11 = defpackage.d.c(this.f34048b, this.f34047a.hashCode() * 31, 31);
        String str = this.f34049c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c11 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAvatar(firstname=");
        sb2.append(this.f34047a);
        sb2.append(", lastname=");
        sb2.append(this.f34048b);
        sb2.append(", url=");
        return androidx.camera.core.y1.e(sb2, this.f34049c, ")");
    }
}
