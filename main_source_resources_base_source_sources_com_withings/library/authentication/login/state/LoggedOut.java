package com.withings.library.authentication.login.state;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.withings.library.authentication.login.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: LoggedOut.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0016\u0017J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "email", "password", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loginWithPassword", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "hashedPassword", "loginWithHashedPassword", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", CommonConstant.KEY_ID_TOKEN, "clientId", "loginWithExternalProviderAndIdToken", "(Lcom/withings/library/authentication/login/ProviderType;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "providerCode", "loginWithExternalProviderAndProviderCode", "loginWithMail", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "requestNewPassword", "NewPasswordOutputState", "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface LoggedOut extends AuthenticationState {

    /* compiled from: LoggedOut.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "", "()V", "GenericError", "NetworkError", "SuccessLoggedOut", "WithingsError", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$SuccessLoggedOut;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class NewPasswordOutputState {

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends NewPasswordOutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends NewPasswordOutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$SuccessLoggedOut;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedOut extends NewPasswordOutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessLoggedOut(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/LoggedOut;I)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends NewPasswordOutputState {
            private final LoggedOut loggedOut;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(LoggedOut loggedOut, int i11) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
                this.statusCode = i11;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        public /* synthetic */ NewPasswordOutputState(m mVar) {
            this();
        }

        private NewPasswordOutputState() {
        }
    }

    /* compiled from: LoggedOut.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "", "()V", "AuthenticationFailed", "GenericError", "NetworkError", "SuccessLoggedIn", "SuccessNeed2FACode", "SuccessNeedAccountCreation", "SuccessNeedMailResult", "SuccessNeedPhoneNumber2FACreation", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedAccountCreation;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class OutputState {

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AuthenticationFailed extends OutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationFailed(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends OutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends OutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedIn extends OutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessLoggedIn(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeed2FACode extends OutputState {
            private final NeedCode2FA needCode2FA;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeed2FACode(NeedCode2FA needCode2FA) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedAccountCreation;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "needAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "getNeedAccountCreation", "()Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedAccountCreation extends OutputState {
            private final NeedAccountCreation needAccountCreation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeedAccountCreation(NeedAccountCreation needAccountCreation) {
                super(null);
                u.j(needAccountCreation, "needAccountCreation");
                this.needAccountCreation = needAccountCreation;
            }

            public final NeedAccountCreation getNeedAccountCreation() {
                return this.needAccountCreation;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedMailResult;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedMailResult extends OutputState {
            private final NeedMailResult needMailResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeedMailResult(NeedMailResult needMailResult) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber2FACreation extends OutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeedPhoneNumber2FACreation(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/LoggedOut;J)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest extends OutputState {
            private final LoggedOut loggedOut;
            private final long nextAuthorizedRequestTimestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TooManyRequest(LoggedOut loggedOut, long j5) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: LoggedOut.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedOut$OutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/LoggedOut;I)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends OutputState {
            private final LoggedOut loggedOut;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(LoggedOut loggedOut, int i11) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
                this.statusCode = i11;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        public /* synthetic */ OutputState(m mVar) {
            this();
        }

        private OutputState() {
        }
    }

    Object loginWithExternalProviderAndIdToken(ProviderType providerType, String str, String str2, d<? super OutputState> dVar);

    Object loginWithExternalProviderAndProviderCode(ProviderType providerType, String str, String str2, d<? super OutputState> dVar);

    Object loginWithHashedPassword(String str, String str2, d<? super OutputState> dVar);

    Object loginWithMail(String str, d<? super OutputState> dVar);

    Object loginWithPassword(String str, String str2, d<? super OutputState> dVar);

    Object requestNewPassword(String str, d<? super NewPasswordOutputState> dVar);
}
