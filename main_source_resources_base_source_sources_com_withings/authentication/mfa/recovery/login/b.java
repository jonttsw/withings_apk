package com.withings.authentication.mfa.recovery.login;

import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
/* compiled from: LoginRecoveryCodeViewModel.kt */
/* loaded from: classes3.dex */
public final class b implements LoginRecoveryCodeViewModel.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f31820a;

    public b(int i11) {
        this.f31820a = i11;
    }

    public final int a() {
        return this.f31820a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f31820a == ((b) obj).f31820a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31820a);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.e.c(new StringBuilder("TooManyRequests(timeToWaitSeconds="), this.f31820a, ")");
    }
}
