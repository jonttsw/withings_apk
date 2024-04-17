package com.withings.library.authentication.setup2fa.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedCode2FASetup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState;", "changePhoneNumber", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "ChangePhoneOutputState", "CodeOutputState", "SMSOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedCode2FASetup extends Setup2FAState {

    /* compiled from: NeedCode2FASetup.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState;", "", "Success", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState$Success;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ChangePhoneOutputState {

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState$Success;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState;", "needPhoneNumber2FASetup", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getNeedPhoneNumber2FASetup", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success implements ChangePhoneOutputState {
            private final NeedPhoneNumber2FASetup needPhoneNumber2FASetup;

            public Success(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
                u.j(needPhoneNumber2FASetup, "needPhoneNumber2FASetup");
                this.needPhoneNumber2FASetup = needPhoneNumber2FASetup;
            }

            public final NeedPhoneNumber2FASetup getNeedPhoneNumber2FASetup() {
                return this.needPhoneNumber2FASetup;
            }
        }
    }

    /* compiled from: NeedCode2FASetup.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SuccessSetup", "TooManyRequest", "WithingsError", "WrongCode", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$SuccessSetup;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$WrongCode;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface CodeOutputState {

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements CodeOutputState {
            private final NeedCode2FASetup setup2FAState;

            public GenericError(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements CodeOutputState {
            private final NeedCode2FASetup setup2FAState;

            public NetworkError(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$SuccessSetup;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessSetup implements CodeOutputState {
            private final Registered2FASetup setup2FAState;

            public SuccessSetup(Registered2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public Registered2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;J)V", "getNextAuthorizedRequestTimestamp", "()J", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements CodeOutputState {
            private final long nextAuthorizedRequestTimestamp;
            private final NeedCode2FASetup setup2FAState;

            public TooManyRequest(NeedCode2FASetup setup2FAState, long j5) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements CodeOutputState {
            private final NeedCode2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(NeedCode2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState$WrongCode;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WrongCode implements CodeOutputState {
            private final NeedCode2FASetup setup2FAState;

            public WrongCode(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    /* compiled from: NeedCode2FASetup.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "GenericError", "NetworkError", "SuccessNeedCode2FA", "WithingsError", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SMSOutputState {

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements SMSOutputState {
            private final NeedCode2FASetup setup2FAState;

            public GenericError(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.SMSOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements SMSOutputState {
            private final NeedCode2FASetup setup2FAState;

            public NetworkError(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.SMSOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements SMSOutputState {
            private final NeedCode2FASetup setup2FAState;

            public SuccessNeedCode2FA(NeedCode2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.SMSOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        /* compiled from: NeedCode2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState$WithingsError;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;I)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements SMSOutputState {
            private final NeedCode2FASetup setup2FAState;
            private final int statusCode;

            public WithingsError(NeedCode2FASetup setup2FAState, int i11) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
                this.statusCode = i11;
            }

            @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.SMSOutputState
            public NeedCode2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    Object changePhoneNumber(d<? super ChangePhoneOutputState> dVar);

    String getPhoneNumber();

    Object injectCode(String str, boolean z5, d<? super CodeOutputState> dVar);

    Object resendSMS(d<? super SMSOutputState> dVar);
}
