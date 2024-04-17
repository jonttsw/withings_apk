package com.withings.library.authentication.login.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: NeedCode2FA.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "recoveryCode", "injectRecoveryCode", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "changePhoneNumber", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "ChangePhoneOutputState", "CodeOutputState", "SMSOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedCode2FA extends AuthenticationState {

    /* compiled from: NeedCode2FA.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "", "ErrorNot2FACreationProcess", "Success", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState$ErrorNot2FACreationProcess;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState$Success;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ChangePhoneOutputState {

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState$ErrorNot2FACreationProcess;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ErrorNot2FACreationProcess implements ChangePhoneOutputState {
            private final NeedCode2FA needCode2FA;

            public ErrorNot2FACreationProcess(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState$Success;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success implements ChangePhoneOutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;

            public Success(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }
        }
    }

    /* compiled from: NeedCode2FA.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "", "GenericError", "NetworkError", "SuccessLoggedIn", "SuccessNeedCode2FA", "SuccessNeedPhoneNumber2FA", "TooManyRequest", "WithingsError", "WrongCode", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessNeedPhoneNumber2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$WrongCode;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface CodeOutputState {

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements CodeOutputState {
            private final NeedCode2FA needCode2FA;

            public GenericError(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements CodeOutputState {
            private final NeedCode2FA needCode2FA;

            public NetworkError(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedIn implements CodeOutputState {
            private final LoggedIn loggedIn;

            public SuccessLoggedIn(LoggedIn loggedIn) {
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements CodeOutputState {
            private final NeedCode2FA needCode2FA;

            public SuccessNeedCode2FA(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$SuccessNeedPhoneNumber2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needPhoneNumber2FA", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FA", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber2FA implements CodeOutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FA;

            public SuccessNeedPhoneNumber2FA(NeedPhoneNumber2FACreation needPhoneNumber2FA) {
                u.j(needPhoneNumber2FA, "needPhoneNumber2FA");
                this.needPhoneNumber2FA = needPhoneNumber2FA;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FA() {
                return this.needPhoneNumber2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;J)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements CodeOutputState {
            private final NeedCode2FA needCode2FA;
            private final long nextAuthorizedRequestTimestamp;

            public TooManyRequest(NeedCode2FA needCode2FA, long j5) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;I)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements CodeOutputState {
            private final NeedCode2FA needCode2FA;
            private final int statusCode;

            public WithingsError(NeedCode2FA needCode2FA, int i11) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.statusCode = i11;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState$WrongCode;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WrongCode implements CodeOutputState {
            private final NeedCode2FA needCode2FA;

            public WrongCode(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }
    }

    /* compiled from: NeedCode2FA.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "", "GenericError", "NetworkError", "SuccessNeedCode2FA", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface SMSOutputState {

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements SMSOutputState {
            private final NeedCode2FA needCode2FA;

            public GenericError(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements SMSOutputState {
            private final NeedCode2FA needCode2FA;

            public NetworkError(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA implements SMSOutputState {
            private final NeedCode2FA needCode2FA;

            public SuccessNeedCode2FA(NeedCode2FA needCode2FA) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;J)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest implements SMSOutputState {
            private final NeedCode2FA needCode2FA;
            private final long nextAuthorizedRequestTimestamp;

            public TooManyRequest(NeedCode2FA needCode2FA, long j5) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: NeedCode2FA.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;I)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements SMSOutputState {
            private final NeedCode2FA needCode2FA;
            private final int statusCode;

            public WithingsError(NeedCode2FA needCode2FA, int i11) {
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.statusCode = i11;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }
    }

    Object changePhoneNumber(d<? super ChangePhoneOutputState> dVar);

    String getPhoneNumber();

    com.withings.library.authentication.login.Session getSession();

    Object injectCode(String str, boolean z5, d<? super CodeOutputState> dVar);

    Object injectRecoveryCode(String str, boolean z5, d<? super CodeOutputState> dVar);

    Object resendSMS(d<? super SMSOutputState> dVar);
}
