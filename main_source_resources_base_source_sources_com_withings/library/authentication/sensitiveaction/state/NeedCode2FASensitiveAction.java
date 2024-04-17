package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedCode2FASensitiveAction.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "changePhoneNumber", "recoveryCode", "injectRecoveryCode", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "ChangePhoneOutputState", "CodeOutputState", "SMSOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedCode2FASensitiveAction extends SensitiveActionState {

    /* compiled from: NeedCode2FASensitiveAction.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "ErrorNot2FACreationProcess", "Success", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState$ErrorNot2FACreationProcess;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState$Success;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ChangePhoneOutputState {

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState$ErrorNot2FACreationProcess;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ErrorNot2FACreationProcess implements ChangePhoneOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public ErrorNot2FACreationProcess(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState$Success;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success implements ChangePhoneOutputState {
            private final NeedPhoneNumberSensitiveActionState sensitiveActionState;

            public Success(NeedPhoneNumberSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState
            public NeedPhoneNumberSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    /* compiled from: NeedCode2FASensitiveAction.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "SuccessVerified", "TooManyRequest", "WithingsError", "WrongCode", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$WrongCode;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface CodeOutputState {

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements CodeOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public GenericError(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements CodeOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public NetworkError(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$SuccessVerified;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessVerified implements CodeOutputState {
            private final VerifiedSensitiveActionState sensitiveActionState;

            public SuccessVerified(VerifiedSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public VerifiedSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements CodeOutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public TooManyRequest(NeedCode2FASensitiveAction sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements CodeOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedCode2FASensitiveAction sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$WrongCode;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WrongCode implements CodeOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public WrongCode(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    /* compiled from: NeedCode2FASensitiveAction.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "GenericError", "NetworkError", "SuccessNeedCode2FA", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SMSOutputState {

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements SMSOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public GenericError(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements SMSOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public NetworkError(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements SMSOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public SuccessNeedCode2FA(NeedCode2FASensitiveAction sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$TooManyRequest;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements SMSOutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedCode2FASensitiveAction sensitiveActionState;

            public TooManyRequest(NeedCode2FASensitiveAction sensitiveActionState, long j5) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: NeedCode2FASensitiveAction.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;I)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements SMSOutputState {
            private final NeedCode2FASensitiveAction sensitiveActionState;
            private final int statusCode;

            public WithingsError(NeedCode2FASensitiveAction sensitiveActionState, int i11) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState
            public NeedCode2FASensitiveAction getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    Object changePhoneNumber(d<? super ChangePhoneOutputState> dVar);

    String getPhoneNumber();

    Object injectCode(String str, boolean z5, d<? super CodeOutputState> dVar);

    Object injectRecoveryCode(String str, boolean z5, d<? super CodeOutputState> dVar);

    Object resendSMS(d<? super SMSOutputState> dVar);
}
