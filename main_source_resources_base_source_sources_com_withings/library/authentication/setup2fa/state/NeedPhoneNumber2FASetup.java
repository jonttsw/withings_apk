package com.withings.library.authentication.setup2fa.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedPhoneNumber2FASetup.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "", "phoneNumber", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedPhoneNumber2FASetup extends Setup2FAState {

    /* compiled from: NeedPhoneNumber2FASetup.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SensitiveActionNeeded", "SuccessNeedCode2FA", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OutputState {

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements OutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;

            public GenericError(NeedPhoneNumber2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements OutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;

            public NetworkError(NeedPhoneNumber2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$SensitiveActionNeeded;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SensitiveActionNeeded implements OutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;

            public SensitiveActionNeeded(NeedPhoneNumber2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements OutputState {
            private final NeedCode2FASetup setup2FAState;

            public SuccessNeedCode2FA(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements OutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedPhoneNumber2FASetup setup2FAState;

            public TooManyRequest(NeedPhoneNumber2FASetup setup2FAState, long j5) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedPhoneNumber2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements OutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(NeedPhoneNumber2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    Object registerPhoneNumber(String str, d<? super OutputState> dVar);
}
