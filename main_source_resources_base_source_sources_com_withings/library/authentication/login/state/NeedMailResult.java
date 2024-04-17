package com.withings.library.authentication.login.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: NeedMailResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "getShortCode", "()Ljava/lang/String;", "shortCode", "OutputState", "ResendMailOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedMailResult extends AuthenticationState {

    /* compiled from: NeedMailResult.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "", "()V", "GenericError", "NetworkError", "ShortCodeExpired", "SuccessLoggedIn", "SuccessNeedAccountCreation", "SuccessNeedCode2FA", "SuccessNeedPhoneNumber2FACreation", "TooManyRequest", "WithingsError", "WrongInput", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$ShortCodeExpired;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedAccountCreation;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$WrongInput;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class OutputState {

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends OutputState {
            private final NeedMailResult needMailResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(NeedMailResult needMailResult) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends OutputState {
            private final NeedMailResult needMailResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(NeedMailResult needMailResult) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$ShortCodeExpired;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShortCodeExpired extends OutputState {
            private final NeedMailResult needMailResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShortCodeExpired(NeedMailResult needMailResult) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessLoggedIn;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "loggedIn", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "getLoggedIn", "()Lcom/withings/library/authentication/login/state/LoggedIn;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedAccountCreation;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "getNeedAccountCreation", "()Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedCode2FA extends OutputState {
            private final NeedCode2FA needCode2FA;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessNeedCode2FA(NeedCode2FA needCode2FA) {
                super(null);
                u.j(needCode2FA, "needCode2FA");
                this.needCode2FA = needCode2FA;
            }

            public final NeedCode2FA getNeedCode2FA() {
                return this.needCode2FA;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$SuccessNeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/NeedMailResult;J)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest extends OutputState {
            private final NeedMailResult needMailResult;
            private final long nextAuthorizedRequestTimestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TooManyRequest(NeedMailResult needMailResult, long j5) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedMailResult;I)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends OutputState {
            private final NeedMailResult needMailResult;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(NeedMailResult needMailResult, int i11) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
                this.statusCode = i11;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState$WrongInput;", "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WrongInput extends OutputState {
            private final NeedMailResult needMailResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrongInput(NeedMailResult needMailResult) {
                super(null);
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        public /* synthetic */ OutputState(m mVar) {
            this();
        }

        private OutputState() {
        }
    }

    /* compiled from: NeedMailResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "", "GenericError", "NetworkError", "SuccessResendMail", "TooManyRequestException", "WithingsError", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$SuccessResendMail;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$TooManyRequestException;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ResendMailOutputState {

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError implements ResendMailOutputState {
            private final NeedMailResult needMailResult;

            public GenericError(NeedMailResult needMailResult) {
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements ResendMailOutputState {
            private final NeedMailResult needMailResult;

            public NetworkError(NeedMailResult needMailResult) {
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$SuccessResendMail;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessResendMail implements ResendMailOutputState {
            private final NeedMailResult needMailResult;

            public SuccessResendMail(NeedMailResult needMailResult) {
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$TooManyRequestException;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/NeedMailResult;J)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequestException implements ResendMailOutputState {
            private final NeedMailResult needMailResult;
            private final long nextAuthorizedRequestTimestamp;

            public TooManyRequestException(NeedMailResult needMailResult, long j5) {
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: NeedMailResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedMailResult;I)V", "getNeedMailResult", "()Lcom/withings/library/authentication/login/state/NeedMailResult;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements ResendMailOutputState {
            private final NeedMailResult needMailResult;
            private final int statusCode;

            public WithingsError(NeedMailResult needMailResult, int i11) {
                u.j(needMailResult, "needMailResult");
                this.needMailResult = needMailResult;
                this.statusCode = i11;
            }

            public final NeedMailResult getNeedMailResult() {
                return this.needMailResult;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }
        }
    }

    String getShortCode();

    Object injectCode(String str, d<? super OutputState> dVar);

    Object injectJWTToken(String str, d<? super OutputState> dVar);

    Object resendMail(d<? super ResendMailOutputState> dVar);
}
