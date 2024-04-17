package com.withings.measurements.ui;

import com.withings.user.core.models.User;
/* compiled from: MeasurementsViewModel.kt */
/* loaded from: classes4.dex */
public final class n2 {

    /* renamed from: a  reason: collision with root package name */
    private final User f42082a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f42083b;

    public n2(User user, boolean z5) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f42082a = user;
        this.f42083b = z5;
    }

    public final User a() {
        return this.f42082a;
    }

    public final boolean b() {
        return this.f42083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        if (kotlin.jvm.internal.u.e(this.f42082a, n2Var.f42082a) && this.f42083b == n2Var.f42083b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42083b) + (this.f42082a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedUserUi(user=" + this.f42082a + ", isMainUser=" + this.f42083b + ")";
    }
}
