package com.withings.library.authentication.attachment.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: AttachmentNeedSmsResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\f\r\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "resendSms", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState;", "switchToBirthdayVerification", "CodeOutputState", "SmsOutputState", "SwitchMethodOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AttachmentNeedSmsResult extends AttachmentState {

    /* compiled from: AttachmentNeedSmsResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "GenericError", "NetworkError", "SuccessAttached", "WithingsError", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$SuccessAttached;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface CodeOutputState {

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements CodeOutputState {
            private final AttachmentNeedSmsResult attachmentState;

            public GenericError(AttachmentNeedSmsResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.CodeOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements CodeOutputState {
            private final AttachmentNeedSmsResult attachmentState;

            public NetworkError(AttachmentNeedSmsResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.CodeOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$SuccessAttached;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessAttached implements CodeOutputState {
            private final AttachmentFinished attachmentState;

            public SuccessAttached(AttachmentFinished attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.CodeOutputState
            public AttachmentFinished getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;I)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements CodeOutputState {
            private final AttachmentNeedSmsResult attachmentState;
            private final int statusCode;

            public WithingsError(AttachmentNeedSmsResult attachmentState, int i11) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.CodeOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    /* compiled from: AttachmentNeedSmsResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "GenericError", "NetworkError", "SuccessNeedSmsResult", "WithingsError", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$SuccessNeedSmsResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SmsOutputState {

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements SmsOutputState {
            private final AttachmentNeedSmsResult attachmentState;

            public GenericError(AttachmentNeedSmsResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SmsOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements SmsOutputState {
            private final AttachmentNeedSmsResult attachmentState;

            public NetworkError(AttachmentNeedSmsResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SmsOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$SuccessNeedSmsResult;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedSmsResult implements SmsOutputState {
            private final AttachmentNeedSmsResult attachmentState;

            public SuccessNeedSmsResult(AttachmentNeedSmsResult attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SmsOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState$WithingsError;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;I)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements SmsOutputState {
            private final AttachmentNeedSmsResult attachmentState;
            private final int statusCode;

            public WithingsError(AttachmentNeedSmsResult attachmentState, int i11) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SmsOutputState
            public AttachmentNeedSmsResult getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    /* compiled from: AttachmentNeedSmsResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "SuccessBirthdayVerification", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState$SuccessBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SwitchMethodOutputState {

        /* compiled from: AttachmentNeedSmsResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState$SuccessBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessBirthdayVerification implements SwitchMethodOutputState {
            private final AttachmentBirthdayVerification attachmentState;

            public SuccessBirthdayVerification(AttachmentBirthdayVerification attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SwitchMethodOutputState
            public AttachmentBirthdayVerification getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    Object injectCode(String str, d<? super CodeOutputState> dVar);

    Object resendSms(d<? super SmsOutputState> dVar);

    Object switchToBirthdayVerification(d<? super SwitchMethodOutputState> dVar);
}
