package com.withings.wiscale2.settings;

import com.withings.user.User;
import java.util.List;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
public final class e0 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f59973b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends User> f59974c;

    public e0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i11) {
        super("withings-bd2://dashboard");
        kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
        this.f59973b = "withings-bd2://dashboard";
        this.f59974c = i0Var;
    }

    @Override // com.withings.wiscale2.settings.b0
    public final String a() {
        return this.f59973b;
    }

    public final List<User> b() {
        return this.f59974c;
    }

    public final void c(List<? extends User> list) {
        this.f59974c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (kotlin.jvm.internal.u.e(this.f59973b, e0Var.f59973b) && kotlin.jvm.internal.u.e(this.f59974c, e0Var.f59974c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f59974c.hashCode() + (this.f59973b.hashCode() * 31);
    }

    public final String toString() {
        List<? extends User> list = this.f59974c;
        return "DeeplinkWithUser(deeplink=" + this.f59973b + ", users=" + list + ")";
    }
}
