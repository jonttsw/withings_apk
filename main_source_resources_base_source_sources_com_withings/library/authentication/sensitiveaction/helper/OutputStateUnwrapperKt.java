package com.withings.library.authentication.sensitiveaction.helper;

import com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.SensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OutputStateUnwrapper.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\n¨\u0006\u000b"}, d2 = {"unwrap", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OutputStateUnwrapperKt {
    public static final SensitiveActionState unwrap(InitializationErrorSensitiveActionState.RetryOutputState retryOutputState) {
        u.j(retryOutputState, "<this>");
        return retryOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedCode2FASensitiveAction.CodeOutputState codeOutputState) {
        u.j(codeOutputState, "<this>");
        return codeOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedCode2FASensitiveAction.SMSOutputState sMSOutputState) {
        u.j(sMSOutputState, "<this>");
        return sMSOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedCode2FASensitiveAction.ChangePhoneOutputState changePhoneOutputState) {
        u.j(changePhoneOutputState, "<this>");
        return changePhoneOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState injectInfoOutputState) {
        u.j(injectInfoOutputState, "<this>");
        return injectInfoOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedMailResultSensitiveActionState.OutputState outputState) {
        u.j(outputState, "<this>");
        return outputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedMailResultSensitiveActionState.ResendMailOutputState resendMailOutputState) {
        u.j(resendMailOutputState, "<this>");
        return resendMailOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedMailSensitiveActionState.MailOutputState mailOutputState) {
        u.j(mailOutputState, "<this>");
        return mailOutputState.getSensitiveActionState();
    }

    public static final SensitiveActionState unwrap(NeedPhoneNumberSensitiveActionState.OutputState outputState) {
        u.j(outputState, "<this>");
        return outputState.getSensitiveActionState();
    }
}
