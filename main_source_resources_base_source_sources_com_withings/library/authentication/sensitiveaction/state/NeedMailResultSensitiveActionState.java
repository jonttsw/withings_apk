package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: NeedMailResultSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "getEmail", "()Ljava/lang/String;", "email", "OutputState", "ResendMailOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedMailResultSensitiveActionState extends SensitiveActionState {

    /* compiled from: NeedMailResultSensitiveActionState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0006\u0007\b\t\n\u000b\f\r\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "ShortCodeExpired", "SuccessNeedCode2FA", "SuccessNeedPhoneNumber", "SuccessVerified", "TooManyRequest", "WithingsError", "WrongInput", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$ShortCodeExpired;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessNeedPhoneNumber;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$WrongInput;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OutputState {

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements OutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public GenericError(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements OutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public NetworkError(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$ShortCodeExpired;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShortCodeExpired implements OutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public ShortCodeExpired(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements OutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public SuccessNeedCode2FA(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessNeedPhoneNumber;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber implements OutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public SuccessNeedPhoneNumber(NeedPhoneNumberSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessVerified implements OutputState {
            private final VerifiedSensitiveActionState sensitiveActionState;

            public SuccessVerified(VerifiedSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public VerifiedSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements OutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public TooManyRequest(NeedMailResultSensitiveActionState sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements OutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedMailResultSensitiveActionState sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState$WrongInput;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WrongInput implements OutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public WrongInput(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    /* compiled from: NeedMailResultSensitiveActionState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "SuccessResendMail", "TooManyRequestException", "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$SuccessResendMail;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$TooManyRequestException;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ResendMailOutputState {

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements ResendMailOutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public GenericError(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements ResendMailOutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public NetworkError(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$SuccessResendMail;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessResendMail implements ResendMailOutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public SuccessResendMail(NeedMailResultSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$TooManyRequestException;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequestException implements ResendMailOutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedMailResultSensitiveActionState sensitiveActionState;

            public TooManyRequestException(NeedMailResultSensitiveActionState sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedMailResultSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements ResendMailOutputState {
            private final NeedMailResultSensitiveActionState sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedMailResultSensitiveActionState sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState
            public NeedMailResultSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    String getEmail();

    Object injectCode(String str, d<? super OutputState> dVar);

    Object injectJWTToken(String str, d<? super OutputState> dVar);

    Object resendMail(d<? super ResendMailOutputState> dVar);
}
