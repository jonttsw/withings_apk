package com.withings.library.authentication.setup2fa.state.helper;

import com.withings.library.authentication.setup2fa.state.InitializationError2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedCode2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.Registered2FASetup;
import com.withings.library.authentication.setup2fa.state.Setup2FAState;
import com.withings.library.authentication.setup2fa.state.Unregistered2FASetup;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OutputStateUnwrapper.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\n¨\u0006\u000b"}, d2 = {"unwrap", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$RetryOutputState;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OutputStateUnwrapperKt {
    public static final Setup2FAState unwrap(NeedCode2FASetup.CodeOutputState codeOutputState) {
        u.j(codeOutputState, "<this>");
        return codeOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(NeedCode2FASetup.SMSOutputState sMSOutputState) {
        u.j(sMSOutputState, "<this>");
        return sMSOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(NeedPhoneNumber2FASetup.OutputState outputState) {
        u.j(outputState, "<this>");
        return outputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(InitializationError2FASetup.RetryOutputState retryOutputState) {
        u.j(retryOutputState, "<this>");
        return retryOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(Registered2FASetup.Remove2FAOutputState remove2FAOutputState) {
        u.j(remove2FAOutputState, "<this>");
        return remove2FAOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(Registered2FASetup.GetRecoveryCodeOutputState getRecoveryCodeOutputState) {
        u.j(getRecoveryCodeOutputState, "<this>");
        return getRecoveryCodeOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(Registered2FASetup.GenerateRecoveryCodeOutputState generateRecoveryCodeOutputState) {
        u.j(generateRecoveryCodeOutputState, "<this>");
        return generateRecoveryCodeOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(Registered2FASetup.ChangePhoneOutputState changePhoneOutputState) {
        u.j(changePhoneOutputState, "<this>");
        return changePhoneOutputState.getSetup2FAState();
    }

    public static final Setup2FAState unwrap(Unregistered2FASetup.StartSetup2FAOutputState startSetup2FAOutputState) {
        u.j(startSetup2FAOutputState, "<this>");
        return startSetup2FAOutputState.getSetup2FAState();
    }
}
