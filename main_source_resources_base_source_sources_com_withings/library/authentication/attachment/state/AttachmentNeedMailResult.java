package com.withings.library.authentication.attachment.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: AttachmentNeedMailResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\f\r\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState;", "switchToBirthdayVerification", "CodeOutputState", "MailOutputState", "SwitchMethodOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AttachmentNeedMailResult extends AttachmentState {

    /* compiled from: AttachmentNeedMailResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "GenericError", "NetworkError", "SuccessFinished", "WithingsError", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$SuccessFinished;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface CodeOutputState {

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements CodeOutputState {
            private final AttachmentNeedMailResult attachmentState;

            public GenericError(AttachmentNeedMailResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.CodeOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements CodeOutputState {
            private final AttachmentNeedMailResult attachmentState;

            public NetworkError(AttachmentNeedMailResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.CodeOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$SuccessFinished;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessFinished implements CodeOutputState {
            private final AttachmentFinished attachmentState;

            public SuccessFinished(AttachmentFinished attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.CodeOutputState
            public AttachmentFinished getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;I)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements CodeOutputState {
            private final AttachmentNeedMailResult attachmentState;
            private final int statusCode;

            public WithingsError(AttachmentNeedMailResult attachmentState, int i11) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.CodeOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    /* compiled from: AttachmentNeedMailResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "GenericError", "NetworkError", "SuccessNeedMailResult", "WithingsError", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface MailOutputState {

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements MailOutputState {
            private final AttachmentNeedMailResult attachmentState;

            public GenericError(AttachmentNeedMailResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.MailOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements MailOutputState {
            private final AttachmentNeedMailResult attachmentState;

            public NetworkError(AttachmentNeedMailResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.MailOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedMailResult implements MailOutputState {
            private final AttachmentNeedMailResult attachmentState;

            public SuccessNeedMailResult(AttachmentNeedMailResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.MailOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState$WithingsError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;I)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements MailOutputState {
            private final AttachmentNeedMailResult attachmentState;
            private final int statusCode;

            public WithingsError(AttachmentNeedMailResult attachmentState, int i11) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.MailOutputState
            public AttachmentNeedMailResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    /* compiled from: AttachmentNeedMailResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "SuccessBirthdayVerification", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState$SuccessBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SwitchMethodOutputState {

        /* compiled from: AttachmentNeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState$SuccessBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessBirthdayVerification implements SwitchMethodOutputState {
            private final AttachmentBirthdayVerification attachmentState;

            public SuccessBirthdayVerification(AttachmentBirthdayVerification attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult.SwitchMethodOutputState
            public AttachmentBirthdayVerification getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    Object injectCode(String str, d<? super CodeOutputState> dVar);

    Object resendMail(d<? super MailOutputState> dVar);

    Object switchToBirthdayVerification(d<? super SwitchMethodOutputState> dVar);
}
