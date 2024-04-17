package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "", CommonConstant.KEY_ID_TOKEN, "clientId", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "injectIdToken", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "injectProviderCodeWithIdToken", "providerCode", "injectProviderCodeWithProviderCode", "InjectInfoOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedGoogleSignInInfoSensitiveActionState extends SensitiveActionState {

    /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "AuthenticationFailed", "GenericError", "NetworkError", "SuccessNeedCode2FA", "SuccessNeedPhoneNumber", "SuccessVerified", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedPhoneNumber;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface InjectInfoOutputState {

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AuthenticationFailed implements InjectInfoOutputState {
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;

            public AuthenticationFailed(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements InjectInfoOutputState {
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;

            public GenericError(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements InjectInfoOutputState {
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;

            public NetworkError(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements InjectInfoOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public SuccessNeedCode2FA(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedPhoneNumber;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber implements InjectInfoOutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public SuccessNeedPhoneNumber(NeedPhoneNumberSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessVerified implements InjectInfoOutputState {
            private final VerifiedSensitiveActionState sensitiveActionState;

            public SuccessVerified(VerifiedSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public VerifiedSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements InjectInfoOutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;

            public TooManyRequest(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedGoogleSignInInfoSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements InjectInfoOutputState {
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    Object injectIdToken(String str, String str2, d<? super InjectInfoOutputState> dVar);

    Object injectProviderCodeWithIdToken(String str, String str2, d<? super InjectInfoOutputState> dVar);

    Object injectProviderCodeWithProviderCode(String str, String str2, d<? super InjectInfoOutputState> dVar);
}
