package com.withings.library.authentication.login.state.helper;

import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: OutputStateUnwrapper.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u000b¨\u0006\f"}, d2 = {"unwrap", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OutputStateUnwrapperKt {
    public static final AuthenticationState unwrap(NeedCode2FA.CodeOutputState codeOutputState) {
        u.j(codeOutputState, "<this>");
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.WrongCode) {
            return ((NeedCode2FA.CodeOutputState.WrongCode) codeOutputState).getNeedCode2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.GenericError) {
            return ((NeedCode2FA.CodeOutputState.GenericError) codeOutputState).getNeedCode2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.WithingsError) {
            return ((NeedCode2FA.CodeOutputState.WithingsError) codeOutputState).getNeedCode2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.NetworkError) {
            return ((NeedCode2FA.CodeOutputState.NetworkError) codeOutputState).getNeedCode2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.SuccessLoggedIn) {
            return ((NeedCode2FA.CodeOutputState.SuccessLoggedIn) codeOutputState).getLoggedIn();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.SuccessNeedCode2FA) {
            return ((NeedCode2FA.CodeOutputState.SuccessNeedCode2FA) codeOutputState).getNeedCode2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.SuccessNeedPhoneNumber2FA) {
            return ((NeedCode2FA.CodeOutputState.SuccessNeedPhoneNumber2FA) codeOutputState).getNeedPhoneNumber2FA();
        }
        if (codeOutputState instanceof NeedCode2FA.CodeOutputState.TooManyRequest) {
            return ((NeedCode2FA.CodeOutputState.TooManyRequest) codeOutputState).getNeedCode2FA();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedCode2FA.SMSOutputState sMSOutputState) {
        u.j(sMSOutputState, "<this>");
        if (sMSOutputState instanceof NeedCode2FA.SMSOutputState.SuccessNeedCode2FA) {
            return ((NeedCode2FA.SMSOutputState.SuccessNeedCode2FA) sMSOutputState).getNeedCode2FA();
        }
        if (sMSOutputState instanceof NeedCode2FA.SMSOutputState.TooManyRequest) {
            return ((NeedCode2FA.SMSOutputState.TooManyRequest) sMSOutputState).getNeedCode2FA();
        }
        if (sMSOutputState instanceof NeedCode2FA.SMSOutputState.GenericError) {
            return ((NeedCode2FA.SMSOutputState.GenericError) sMSOutputState).getNeedCode2FA();
        }
        if (sMSOutputState instanceof NeedCode2FA.SMSOutputState.NetworkError) {
            return ((NeedCode2FA.SMSOutputState.NetworkError) sMSOutputState).getNeedCode2FA();
        }
        if (sMSOutputState instanceof NeedCode2FA.SMSOutputState.WithingsError) {
            return ((NeedCode2FA.SMSOutputState.WithingsError) sMSOutputState).getNeedCode2FA();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedCode2FA.ChangePhoneOutputState changePhoneOutputState) {
        u.j(changePhoneOutputState, "<this>");
        if (changePhoneOutputState instanceof NeedCode2FA.ChangePhoneOutputState.ErrorNot2FACreationProcess) {
            return ((NeedCode2FA.ChangePhoneOutputState.ErrorNot2FACreationProcess) changePhoneOutputState).getNeedCode2FA();
        }
        if (changePhoneOutputState instanceof NeedCode2FA.ChangePhoneOutputState.Success) {
            return ((NeedCode2FA.ChangePhoneOutputState.Success) changePhoneOutputState).getNeedPhoneNumber2FACreation();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedMailResult.OutputState outputState) {
        u.j(outputState, "<this>");
        if (outputState instanceof NeedMailResult.OutputState.SuccessNeedPhoneNumber2FACreation) {
            return ((NeedMailResult.OutputState.SuccessNeedPhoneNumber2FACreation) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof NeedMailResult.OutputState.SuccessLoggedIn) {
            return ((NeedMailResult.OutputState.SuccessLoggedIn) outputState).getLoggedIn();
        }
        if (outputState instanceof NeedMailResult.OutputState.SuccessNeedCode2FA) {
            return ((NeedMailResult.OutputState.SuccessNeedCode2FA) outputState).getNeedCode2FA();
        }
        if (outputState instanceof NeedMailResult.OutputState.GenericError) {
            return ((NeedMailResult.OutputState.GenericError) outputState).getNeedMailResult();
        }
        if (outputState instanceof NeedMailResult.OutputState.NetworkError) {
            return ((NeedMailResult.OutputState.NetworkError) outputState).getNeedMailResult();
        }
        if (outputState instanceof NeedMailResult.OutputState.WithingsError) {
            return ((NeedMailResult.OutputState.WithingsError) outputState).getNeedMailResult();
        }
        if (outputState instanceof NeedMailResult.OutputState.WrongInput) {
            return ((NeedMailResult.OutputState.WrongInput) outputState).getNeedMailResult();
        }
        if (outputState instanceof NeedMailResult.OutputState.ShortCodeExpired) {
            return ((NeedMailResult.OutputState.ShortCodeExpired) outputState).getNeedMailResult();
        }
        if (outputState instanceof NeedMailResult.OutputState.SuccessNeedAccountCreation) {
            return ((NeedMailResult.OutputState.SuccessNeedAccountCreation) outputState).getNeedAccountCreation();
        }
        if (outputState instanceof NeedMailResult.OutputState.TooManyRequest) {
            return ((NeedMailResult.OutputState.TooManyRequest) outputState).getNeedMailResult();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedMailResult.ResendMailOutputState resendMailOutputState) {
        u.j(resendMailOutputState, "<this>");
        if (resendMailOutputState instanceof NeedMailResult.ResendMailOutputState.SuccessResendMail) {
            return ((NeedMailResult.ResendMailOutputState.SuccessResendMail) resendMailOutputState).getNeedMailResult();
        }
        if (resendMailOutputState instanceof NeedMailResult.ResendMailOutputState.GenericError) {
            return ((NeedMailResult.ResendMailOutputState.GenericError) resendMailOutputState).getNeedMailResult();
        }
        if (resendMailOutputState instanceof NeedMailResult.ResendMailOutputState.NetworkError) {
            return ((NeedMailResult.ResendMailOutputState.NetworkError) resendMailOutputState).getNeedMailResult();
        }
        if (resendMailOutputState instanceof NeedMailResult.ResendMailOutputState.TooManyRequestException) {
            return ((NeedMailResult.ResendMailOutputState.TooManyRequestException) resendMailOutputState).getNeedMailResult();
        }
        if (resendMailOutputState instanceof NeedMailResult.ResendMailOutputState.WithingsError) {
            return ((NeedMailResult.ResendMailOutputState.WithingsError) resendMailOutputState).getNeedMailResult();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedPhoneNumber2FACreation.OutputState outputState) {
        u.j(outputState, "<this>");
        if (outputState instanceof NeedPhoneNumber2FACreation.OutputState.SuccessNeedCode2FA) {
            return ((NeedPhoneNumber2FACreation.OutputState.SuccessNeedCode2FA) outputState).getNeedCode2FA();
        }
        if (outputState instanceof NeedPhoneNumber2FACreation.OutputState.GenericError) {
            return ((NeedPhoneNumber2FACreation.OutputState.GenericError) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof NeedPhoneNumber2FACreation.OutputState.NetworkError) {
            return ((NeedPhoneNumber2FACreation.OutputState.NetworkError) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof NeedPhoneNumber2FACreation.OutputState.WithingsError) {
            return ((NeedPhoneNumber2FACreation.OutputState.WithingsError) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof NeedPhoneNumber2FACreation.OutputState.TooManyRequest) {
            return ((NeedPhoneNumber2FACreation.OutputState.TooManyRequest) outputState).getNeedPhoneNumber2FACreation();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(LoggedIn.LogoutOutputState logoutOutputState) {
        u.j(logoutOutputState, "<this>");
        if (logoutOutputState instanceof LoggedIn.LogoutOutputState.SuccessLoggedOut) {
            return ((LoggedIn.LogoutOutputState.SuccessLoggedOut) logoutOutputState).getLoggedOut();
        }
        if (logoutOutputState instanceof LoggedIn.LogoutOutputState.GenericError) {
            return ((LoggedIn.LogoutOutputState.GenericError) logoutOutputState).getLoggedOut();
        }
        if (logoutOutputState instanceof LoggedIn.LogoutOutputState.NetworkError) {
            return ((LoggedIn.LogoutOutputState.NetworkError) logoutOutputState).getLoggedOut();
        }
        if (logoutOutputState instanceof LoggedIn.LogoutOutputState.WithingsError) {
            return ((LoggedIn.LogoutOutputState.WithingsError) logoutOutputState).getLoggedOut();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(LoggedIn.RenewOutputState renewOutputState) {
        u.j(renewOutputState, "<this>");
        if (renewOutputState instanceof LoggedIn.RenewOutputState.AuthenticationFailed) {
            return ((LoggedIn.RenewOutputState.AuthenticationFailed) renewOutputState).getLoggedOut();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.GenericError) {
            return ((LoggedIn.RenewOutputState.GenericError) renewOutputState).getLoggedIn();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.NetworkError) {
            return ((LoggedIn.RenewOutputState.NetworkError) renewOutputState).getLoggedIn();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.SuccessLoggedIn) {
            return ((LoggedIn.RenewOutputState.SuccessLoggedIn) renewOutputState).getLoggedIn();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.SuccessNeed2FACode) {
            return ((LoggedIn.RenewOutputState.SuccessNeed2FACode) renewOutputState).getNeedCode2FA();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.SuccessNeedPhoneNumber2FACreation) {
            return ((LoggedIn.RenewOutputState.SuccessNeedPhoneNumber2FACreation) renewOutputState).getNeedPhoneNumber2FACreation();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.WithingsError) {
            return ((LoggedIn.RenewOutputState.WithingsError) renewOutputState).getLoggedIn();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.TooManyRequest) {
            return ((LoggedIn.RenewOutputState.TooManyRequest) renewOutputState).getLoggedIn();
        }
        if (renewOutputState instanceof LoggedIn.RenewOutputState.TokenExpired) {
            return ((LoggedIn.RenewOutputState.TokenExpired) renewOutputState).getLoggedOut();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(LoggedOut.OutputState outputState) {
        u.j(outputState, "<this>");
        if (outputState instanceof LoggedOut.OutputState.SuccessNeedMailResult) {
            return ((LoggedOut.OutputState.SuccessNeedMailResult) outputState).getNeedMailResult();
        }
        if (outputState instanceof LoggedOut.OutputState.SuccessNeedPhoneNumber2FACreation) {
            return ((LoggedOut.OutputState.SuccessNeedPhoneNumber2FACreation) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof LoggedOut.OutputState.SuccessLoggedIn) {
            return ((LoggedOut.OutputState.SuccessLoggedIn) outputState).getLoggedIn();
        }
        if (outputState instanceof LoggedOut.OutputState.SuccessNeed2FACode) {
            return ((LoggedOut.OutputState.SuccessNeed2FACode) outputState).getNeedCode2FA();
        }
        if (outputState instanceof LoggedOut.OutputState.GenericError) {
            return ((LoggedOut.OutputState.GenericError) outputState).getLoggedOut();
        }
        if (outputState instanceof LoggedOut.OutputState.NetworkError) {
            return ((LoggedOut.OutputState.NetworkError) outputState).getLoggedOut();
        }
        if (outputState instanceof LoggedOut.OutputState.WithingsError) {
            return ((LoggedOut.OutputState.WithingsError) outputState).getLoggedOut();
        }
        if (outputState instanceof LoggedOut.OutputState.AuthenticationFailed) {
            return ((LoggedOut.OutputState.AuthenticationFailed) outputState).getLoggedOut();
        }
        if (outputState instanceof LoggedOut.OutputState.SuccessNeedAccountCreation) {
            return ((LoggedOut.OutputState.SuccessNeedAccountCreation) outputState).getNeedAccountCreation();
        }
        if (outputState instanceof LoggedOut.OutputState.TooManyRequest) {
            return ((LoggedOut.OutputState.TooManyRequest) outputState).getLoggedOut();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AuthenticationState unwrap(NeedAccountCreation.OutputState outputState) {
        u.j(outputState, "<this>");
        if (outputState instanceof NeedAccountCreation.OutputState.EmailAlreadyLinked) {
            return ((NeedAccountCreation.OutputState.EmailAlreadyLinked) outputState).getLoggedOut();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.ExpiredTokenError) {
            return ((NeedAccountCreation.OutputState.ExpiredTokenError) outputState).getLoggedOut();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.GenericError) {
            return ((NeedAccountCreation.OutputState.GenericError) outputState).getNeedCode2FA();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.NetworkError) {
            return ((NeedAccountCreation.OutputState.NetworkError) outputState).getNeedCode2FA();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.SuccessLoggedIn) {
            return ((NeedAccountCreation.OutputState.SuccessLoggedIn) outputState).getLoggedIn();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.SuccessNeed2FACode) {
            return ((NeedAccountCreation.OutputState.SuccessNeed2FACode) outputState).getNeedCode2FA();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.SuccessNeedPhoneNumber2FACreation) {
            return ((NeedAccountCreation.OutputState.SuccessNeedPhoneNumber2FACreation) outputState).getNeedPhoneNumber2FACreation();
        }
        if (outputState instanceof NeedAccountCreation.OutputState.WithingsError) {
            return ((NeedAccountCreation.OutputState.WithingsError) outputState).getNeedCode2FA();
        }
        throw new NoWhenBranchMatchedException();
    }
}
