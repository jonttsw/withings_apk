package com.withings.library.authentication.login.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: NeedAccountCreation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "prefLang", "", "subscribed", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "createAccount", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedAccountCreation extends AuthenticationState {

    /* compiled from: NeedAccountCreation.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "", "()V", "EmailAlreadyLinked", "ExpiredTokenError", "GenericError", "NetworkError", "SuccessLoggedIn", "SuccessNeed2FACode", "SuccessNeedPhoneNumber2FACreation", "WithingsError", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$EmailAlreadyLinked;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$ExpiredTokenError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class OutputState {

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$EmailAlreadyLinked;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class EmailAlreadyLinked extends OutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailAlreadyLinked(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$ExpiredTokenError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "getLoggedOut", "()Lcom/withings/library/authentication/login/state/LoggedOut;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ExpiredTokenError extends OutputState {
            private final LoggedOut loggedOut;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpiredTokenError(LoggedOut loggedOut) {
                super(null);
                u.j(loggedOut, "loggedOut");
                this.loggedOut = loggedOut;
            }

            public final LoggedOut getLoggedOut() {
                return this.loggedOut;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends OutputState {
            private final NeedAccountCreation needCode2FA;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(NeedAccountCreation needCode2FA) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedAccountCreation getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends OutputState {
            private final NeedAccountCreation needCode2FA;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(NeedAccountCreation needCode2FA) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedAccountCreation getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "contextUpdated", "", "(Lcom/withings/library/authentication/login/state/LoggedIn;Z)V", "getContextUpdated", "()Z", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessLoggedIn extends OutputState {
            private final boolean contextUpdated;
            private final LoggedIn loggedIn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessLoggedIn(LoggedIn loggedIn, boolean z5) {
                super(null);
                u.j(loggedIn, "loggedIn");
                this.loggedIn = loggedIn;
                this.contextUpdated = z5;
            }

            public final boolean getContextUpdated() {
                return this.contextUpdated;
            }

            public final LoggedIn getLoggedIn() {
                return this.loggedIn;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessNeed2FACode;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "contextUpdated", "", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;Z)V", "getContextUpdated", "()Z", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeed2FACode extends OutputState {
            private final boolean contextUpdated;
            private final NeedCode2FA needCode2FA;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeed2FACode(NeedCode2FA needCode2FA, boolean z5) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.contextUpdated = z5;
            }

            public final boolean getContextUpdated() {
                return this.contextUpdated;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "contextUpdated", "", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;Z)V", "getContextUpdated", "()Z", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber2FACreation extends OutputState {
            private final boolean contextUpdated;
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeedPhoneNumber2FACreation(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, boolean z5) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
                this.contextUpdated = z5;
            }

            public final boolean getContextUpdated() {
                return this.contextUpdated;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }
        }

        /* compiled from: NeedAccountCreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;I)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends OutputState {
            private final NeedAccountCreation needCode2FA;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(NeedAccountCreation needCode2FA, int i11) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
                this.statusCode = i11;
            }

            public final NeedAccountCreation getNeedCode2FA() {
                return this.needCode2FA;
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

    Object createAccount(String str, boolean z5, d<? super OutputState> dVar);
}
