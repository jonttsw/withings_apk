package com.withings.authentication.mfa.recovery.login;

import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
/* compiled from: LoginRecoveryCodeViewModel.kt */
/* loaded from: classes3.dex */
public final class c implements LoginRecoveryCodeViewModel.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f31821a = new c();

    private c() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return true;
    }

    public final int hashCode() {
        return 1437015012;
    }

    public final String toString() {
        return "WrongCode";
    }
}
