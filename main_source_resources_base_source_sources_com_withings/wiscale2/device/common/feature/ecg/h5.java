package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.user.User;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f51396a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51397b;

    /* renamed from: c  reason: collision with root package name */
    private final User f51398c;

    public h5(User user, boolean z5, boolean z11) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f51396a = z5;
        this.f51397b = z11;
        this.f51398c = user;
    }

    public final boolean a() {
        return this.f51397b;
    }

    public final User b() {
        return this.f51398c;
    }

    public final boolean c() {
        return this.f51396a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        if (this.f51396a == h5Var.f51396a && this.f51397b == h5Var.f51397b && kotlin.jvm.internal.u.e(this.f51398c, h5Var.f51398c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51398c.hashCode() + androidx.camera.core.y1.a(this.f51397b, Boolean.hashCode(this.f51396a) * 31, 31);
    }

    public final String toString() {
        return "EcgFeatureInfo(isEcgActivated=" + this.f51396a + ", needEcgReview=" + this.f51397b + ", user=" + this.f51398c + ")";
    }
}
