package com.withings.library.authentication.attachment.state.helper;

import com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification;
import com.withings.library.authentication.attachment.state.AttachmentNeedMailResult;
import com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult;
import com.withings.library.authentication.attachment.state.AttachmentState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: OutputStateUnwrapper.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b¨\u0006\t"}, d2 = {"unwrap", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OutputStateUnwrapperKt {
    public static final AttachmentState unwrap(AttachmentNeedMailResult.CodeOutputState codeOutputState) {
        u.j(codeOutputState, "<this>");
        return codeOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentNeedMailResult.MailOutputState mailOutputState) {
        u.j(mailOutputState, "<this>");
        return mailOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentNeedMailResult.SwitchMethodOutputState switchMethodOutputState) {
        u.j(switchMethodOutputState, "<this>");
        return switchMethodOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentNeedSmsResult.CodeOutputState codeOutputState) {
        u.j(codeOutputState, "<this>");
        return codeOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentNeedSmsResult.SmsOutputState smsOutputState) {
        u.j(smsOutputState, "<this>");
        return smsOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentNeedSmsResult.SwitchMethodOutputState switchMethodOutputState) {
        u.j(switchMethodOutputState, "<this>");
        return switchMethodOutputState.getAttachmentState();
    }

    public static final AttachmentState unwrap(AttachmentBirthdayVerification.OutputState outputState) {
        u.j(outputState, "<this>");
        return outputState.getAttachmentState();
    }
}
