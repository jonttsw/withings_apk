package com.withings.library.authentication.setup2fa.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: Registered2FASetup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004J\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "remove2FA", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "getRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "generateRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "changePhoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "ChangePhoneOutputState", "GenerateRecoveryCodeOutputState", "GetRecoveryCodeOutputState", "Remove2FAOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface Registered2FASetup extends Setup2FAState {

    /* compiled from: Registered2FASetup.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "Success", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState$Success;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ChangePhoneOutputState {

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState$Success;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success implements ChangePhoneOutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;

            public Success(NeedPhoneNumber2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.ChangePhoneOutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    /* compiled from: Registered2FASetup.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SensitiveActionNeeded", "Success", "WithingsError", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$Success;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface GenerateRecoveryCodeOutputState {

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements GenerateRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public GenericError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements GenerateRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public NetworkError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SensitiveActionNeeded implements GenerateRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public SensitiveActionNeeded(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$Success;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "recoveryCode", "", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;Ljava/lang/String;)V", "getRecoveryCode", "()Ljava/lang/String;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success implements GenerateRecoveryCodeOutputState {
            private final String recoveryCode;
            private final Registered2FASetup setup2FAState;

            public Success(Registered2FASetup setup2FAState, String recoveryCode) {
                u.j(setup2FAState, "setup2FAState");
                u.j(recoveryCode, "recoveryCode");
                this.setup2FAState = setup2FAState;
                this.recoveryCode = recoveryCode;
            }

            public final String getRecoveryCode() {
                return this.recoveryCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements GenerateRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(Registered2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    /* compiled from: Registered2FASetup.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SensitiveActionNeeded", "SuccessCodeFound", "SuccessNoCodeFound", "WithingsError", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SuccessCodeFound;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SuccessNoCodeFound;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface GetRecoveryCodeOutputState {

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements GetRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public GenericError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements GetRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public NetworkError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SensitiveActionNeeded implements GetRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public SensitiveActionNeeded(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SuccessCodeFound;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "recoveryCode", "", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;Ljava/lang/String;)V", "getRecoveryCode", "()Ljava/lang/String;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessCodeFound implements GetRecoveryCodeOutputState {
            private final String recoveryCode;
            private final Registered2FASetup setup2FAState;

            public SuccessCodeFound(Registered2FASetup setup2FAState, String recoveryCode) {
                u.j(setup2FAState, "setup2FAState");
                u.j(recoveryCode, "recoveryCode");
                this.setup2FAState = setup2FAState;
                this.recoveryCode = recoveryCode;
            }

            public final String getRecoveryCode() {
                return this.recoveryCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$SuccessNoCodeFound;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNoCodeFound implements GetRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;

            public SuccessNoCodeFound(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements GetRecoveryCodeOutputState {
            private final Registered2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(Registered2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    /* compiled from: Registered2FASetup.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SensitiveActionNeeded", "SuccessUnregister2FA", "WithingsError", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$SuccessUnregister2FA;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Remove2FAOutputState {

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements Remove2FAOutputState {
            private final Registered2FASetup setup2FAState;

            public GenericError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements Remove2FAOutputState {
            private final Registered2FASetup setup2FAState;

            public NetworkError(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SensitiveActionNeeded implements Remove2FAOutputState {
            private final Registered2FASetup setup2FAState;

            public SensitiveActionNeeded(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$SuccessUnregister2FA;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessUnregister2FA implements Remove2FAOutputState {
            private final Unregistered2FASetup setup2FAState;

            public SuccessUnregister2FA(Unregistered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState
            public Unregistered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: Registered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements Remove2FAOutputState {
            private final Registered2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(Registered2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    Object changePhoneNumber(d<? super ChangePhoneOutputState> dVar);

    Object generateRecoveryCode(d<? super GenerateRecoveryCodeOutputState> dVar);

    String getPhoneNumber();

    Object getRecoveryCode(d<? super GetRecoveryCodeOutputState> dVar);

    Object remove2FA(d<? super Remove2FAOutputState> dVar);
}
