package com.withings.library.authentication.attachment.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: AttachmentBirthdayVerification.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "", "birthday", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "injectBirthday", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AttachmentBirthdayVerification extends AttachmentState {

    /* compiled from: AttachmentBirthdayVerification.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "ErrorContactCustomerService", "GenericError", "NetworkError", "SuccessAttached", "WithingsError", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$ErrorContactCustomerService;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$SuccessAttached;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OutputState {

        /* compiled from: AttachmentBirthdayVerification.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$ErrorContactCustomerService;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;", "(Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ErrorContactCustomerService implements OutputState {
            private final AttachmentContactCustomerService attachmentState;

            public ErrorContactCustomerService(AttachmentContactCustomerService attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState
            public AttachmentContactCustomerService getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentBirthdayVerification.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$GenericError;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements OutputState {
            private final AttachmentBirthdayVerification attachmentState;

            public GenericError(AttachmentBirthdayVerification attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState
            public AttachmentBirthdayVerification getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentBirthdayVerification.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$NetworkError;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements OutputState {
            private final AttachmentBirthdayVerification attachmentState;

            public NetworkError(AttachmentBirthdayVerification attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState
            public AttachmentBirthdayVerification getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentBirthdayVerification.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$SuccessAttached;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessAttached implements OutputState {
            private final AttachmentFinished attachmentState;

            public SuccessAttached(AttachmentFinished attachmentState) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState
            public AttachmentFinished getAttachmentState() {
                return this.attachmentState;
            }
        }

        /* compiled from: AttachmentBirthdayVerification.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState$WithingsError;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "attachmentState", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;I)V", "getAttachmentState", "()Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements OutputState {
            private final AttachmentBirthdayVerification attachmentState;
            private final int statusCode;

            public WithingsError(AttachmentBirthdayVerification attachmentState, int i11) {
                u.j(attachmentState, "attachmentState");
                this.attachmentState = attachmentState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState
            public AttachmentBirthdayVerification getAttachmentState() {
                return this.attachmentState;
            }
        }

        AttachmentState getAttachmentState();
    }

    Object injectBirthday(String str, d<? super OutputState> dVar);
}
