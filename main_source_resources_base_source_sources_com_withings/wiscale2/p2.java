package com.withings.wiscale2;

import java.io.File;
/* compiled from: ShareWithMyDoctor.kt */
/* loaded from: classes4.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f58822a;

    /* renamed from: b  reason: collision with root package name */
    private final File f58823b;

    public p2(String bodyMessage, File file) {
        kotlin.jvm.internal.u.j(bodyMessage, "bodyMessage");
        kotlin.jvm.internal.u.j(file, "file");
        this.f58822a = bodyMessage;
        this.f58823b = file;
    }

    public final String a() {
        return this.f58822a;
    }

    public final File b() {
        return this.f58823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (kotlin.jvm.internal.u.e(this.f58822a, p2Var.f58822a) && kotlin.jvm.internal.u.e(this.f58823b, p2Var.f58823b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f58823b.hashCode() + (this.f58822a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareContent(bodyMessage=" + this.f58822a + ", file=" + this.f58823b + ")";
    }
}
