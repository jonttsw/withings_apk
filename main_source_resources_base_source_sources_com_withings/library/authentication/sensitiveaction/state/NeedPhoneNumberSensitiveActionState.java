package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedPhoneNumberSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "", "phoneNumber", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedPhoneNumberSensitiveActionState extends SensitiveActionState {

    /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "SuccessNeedCode2FA", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OutputState {

        /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements OutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public GenericError(NeedPhoneNumberSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements OutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public NetworkError(NeedPhoneNumberSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements OutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public SuccessNeedCode2FA(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements OutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public TooManyRequest(NeedPhoneNumberSensitiveActionState sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedPhoneNumberSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements OutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedPhoneNumberSensitiveActionState sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    Object registerPhoneNumber(String str, d<? super OutputState> dVar);
}
