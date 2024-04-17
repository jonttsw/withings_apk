package com.withings.library.authentication.login.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.withings.library.authentication.api.account.AccountContext;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.updateaccount.AccountContextRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: LoggedIn.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "logout", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "renewSession", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "", "force", "renewSessions", "(ZLqm0/d;)Ljava/lang/Object;", "renewAndRetrieveSessions", "Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "accountContextRequest", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "updateAccountContext", "(Lcom/withings/library/authentication/updateaccount/AccountContextRequest;Lqm0/d;)Ljava/lang/Object;", "", "sessionId", "", "accountId", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountContext", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "", "getSessions", "()Ljava/util/List;", "sessions", "LogoutOutputState", "RenewOutputState", "UpdateContextOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface LoggedIn extends AuthenticationState {

    /* compiled from: LoggedIn.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object renewSessions$default(LoggedIn loggedIn, boolean z5, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z5 = false;
                }
                return loggedIn.renewSessions(z5, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renewSessions");
        }
    }

    /* compiled from: LoggedIn.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "", "()V", "GenericError", "NetworkError", "SuccessLoggedOut", "WithingsError", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$SuccessLoggedOut;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class LogoutOutputState {

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends LogoutOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends LogoutOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$SuccessLoggedOut;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedOut extends LogoutOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/LoggedOut;I)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends LogoutOutputState {
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

        public /* synthetic */ LogoutOutputState(m mVar) {
            this();
        }

        private LogoutOutputState() {
        }
    }

    /* compiled from: LoggedIn.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "", "()V", "AuthenticationFailed", "GenericError", "NetworkError", "SuccessLoggedIn", "SuccessNeed2FACode", "SuccessNeedPhoneNumber2FACreation", "TokenExpired", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$TokenExpired;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class RenewOutputState {

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AuthenticationFailed extends RenewOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends RenewOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends RenewOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedIn extends RenewOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeed2FACode extends RenewOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber2FACreation extends RenewOutputState {
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

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$TokenExpired;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TokenExpired extends RenewOutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenExpired(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/LoggedIn;J)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest extends RenewOutputState {
            private final LoggedIn loggedIn;
            private final long nextAuthorizedRequestTimestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TooManyRequest(LoggedIn loggedIn, long j5) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/LoggedIn;I)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends RenewOutputState {
            private final LoggedIn loggedIn;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(LoggedIn loggedIn, int i11) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
                this.statusCode = i11;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        public /* synthetic */ RenewOutputState(m mVar) {
            this();
        }

        private RenewOutputState() {
        }
    }

    /* compiled from: LoggedIn.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "", "()V", "AuthenticationFailed", "GenericError", "NetworkError", "SuccessUpdate", "WithingsError", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$SuccessUpdate;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class UpdateContextOutputState {

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$AuthenticationFailed;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AuthenticationFailed extends UpdateContextOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthenticationFailed(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends UpdateContextOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends UpdateContextOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$SuccessUpdate;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessUpdate extends UpdateContextOutputState {
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessUpdate(LoggedIn loggedIn) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: LoggedIn.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/LoggedIn;I)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends UpdateContextOutputState {
            private final LoggedIn loggedIn;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(LoggedIn loggedIn, int i11) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
                this.statusCode = i11;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        public /* synthetic */ UpdateContextOutputState(m mVar) {
            this();
        }

        private UpdateContextOutputState() {
        }
    }

    Object getAccountContext(String str, long j5, Server server, d<? super AccountContext> dVar);

    List<com.withings.library.authentication.login.Session> getSessions();

    Object logout(d<? super LogoutOutputState> dVar);

    Object renewAndRetrieveSessions(d<? super RenewOutputState> dVar);

    Object renewSession(com.withings.library.authentication.login.Session session, d<? super RenewOutputState> dVar);

    Object renewSessions(boolean z5, d<? super RenewOutputState> dVar);

    Object updateAccountContext(AccountContextRequest accountContextRequest, d<? super UpdateContextOutputState> dVar);
}
