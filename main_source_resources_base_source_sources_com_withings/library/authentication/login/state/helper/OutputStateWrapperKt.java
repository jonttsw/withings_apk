package com.withings.library.authentication.login.state.helper;

import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OutputStateWrapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000¨\u0006\u0007"}, d2 = {"toNeedAccountCreationOutputState", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "isAccountContextUpdate", "", "toNeedMailResultOutputState", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OutputStateWrapperKt {
    public static final NeedAccountCreation.OutputState toNeedAccountCreationOutputState(AuthenticationState authenticationState, boolean z5) {
        u.j(authenticationState, "<this>");
        if (authenticationState instanceof LoggedIn) {
            return new NeedAccountCreation.OutputState.SuccessLoggedIn((LoggedIn) authenticationState, z5);
        }
        if (authenticationState instanceof NeedPhoneNumber2FACreation) {
            return new NeedAccountCreation.OutputState.SuccessNeedPhoneNumber2FACreation((NeedPhoneNumber2FACreation) authenticationState, z5);
        }
        if (authenticationState instanceof NeedCode2FA) {
            return new NeedAccountCreation.OutputState.SuccessNeed2FACode((NeedCode2FA) authenticationState, z5);
        }
        throw new IllegalStateException();
    }

    public static final NeedMailResult.OutputState toNeedMailResultOutputState(AuthenticationState authenticationState) {
        u.j(authenticationState, "<this>");
        if (authenticationState instanceof LoggedIn) {
            return new NeedMailResult.OutputState.SuccessLoggedIn((LoggedIn) authenticationState);
        }
        if (authenticationState instanceof NeedPhoneNumber2FACreation) {
            return new NeedMailResult.OutputState.SuccessNeedPhoneNumber2FACreation((NeedPhoneNumber2FACreation) authenticationState);
        }
        if (authenticationState instanceof NeedCode2FA) {
            return new NeedMailResult.OutputState.SuccessNeedCode2FA((NeedCode2FA) authenticationState);
        }
        if (authenticationState instanceof NeedMailResult) {
            return new NeedMailResult.OutputState.GenericError((NeedMailResult) authenticationState);
        }
        throw new IllegalStateException();
    }
}
