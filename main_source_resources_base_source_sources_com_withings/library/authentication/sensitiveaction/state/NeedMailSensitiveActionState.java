package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedMailSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "", "email", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "injectMail", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "MailOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedMailSensitiveActionState extends SensitiveActionState {

    /* compiled from: NeedMailSensitiveActionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "SuccessNeedMailResult", "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface MailOutputState {

        /* compiled from: NeedMailSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements MailOutputState {
            private final NeedMailSensitiveActionState sensitiveActionState;

            public GenericError(NeedMailSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState.MailOutputState
            public NeedMailSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements MailOutputState {
            private final NeedMailSensitiveActionState sensitiveActionState;

            public NetworkError(NeedMailSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState.MailOutputState
            public NeedMailSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedMailResult implements MailOutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public SuccessNeedMailResult(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState.MailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements MailOutputState {
            private final NeedMailSensitiveActionState sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedMailSensitiveActionState sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState.MailOutputState
            public NeedMailSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    Object injectMail(String str, d<? super MailOutputState> dVar);
}
