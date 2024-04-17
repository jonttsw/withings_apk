package com.withings.account.domain;

import androidx.activity.b;
import com.withings.library.authentication.login.state.AuthenticationState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AuthenticationStateException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/account/domain/AuthenticationStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AuthenticationStateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationStateException(AuthenticationState authenticationState, Class<? extends AuthenticationState> cls) {
        super(b.b("Current state is ", authenticationState.getClass().getSimpleName(), " instead of ", cls.getSimpleName()));
        u.j(authenticationState, "authenticationState");
    }
}
