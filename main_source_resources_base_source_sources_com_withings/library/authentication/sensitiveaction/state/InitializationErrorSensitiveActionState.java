package com.withings.library.authentication.sensitiveaction.state;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: InitializationErrorSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "retryInitialization", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "getErrorType", "()Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "errorType", "ErrorType", "RetryOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface InitializationErrorSensitiveActionState extends SensitiveActionState {

    /* compiled from: InitializationErrorSensitiveActionState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "", "Generic", "NetworkError", "NotLoggedIn", "OutdatedSession", DeviceInfo.STR_TYPE_UNKNOWN, "WithingsError", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$Generic;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$NotLoggedIn;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$OutdatedSession;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$Unknown;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ErrorType {

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$Generic;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Generic implements ErrorType {
            private final Exception exception;

            public Generic(Exception exception) {
                u.j(exception, "exception");
                this.exception = exception;
            }

            public final Exception getException() {
                return this.exception;
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$NetworkError;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError implements ErrorType {
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$NotLoggedIn;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NotLoggedIn implements ErrorType {
            public static final NotLoggedIn INSTANCE = new NotLoggedIn();

            private NotLoggedIn() {
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$OutdatedSession;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "(Lcom/withings/library/authentication/login/Session;)V", "getSession", "()Lcom/withings/library/authentication/login/Session;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class OutdatedSession implements ErrorType {
            private final com.withings.library.authentication.login.Session session;

            public OutdatedSession(com.withings.library.authentication.login.Session session) {
                u.j(session, "session");
                this.session = session;
            }

            public final com.withings.library.authentication.login.Session getSession() {
                return this.session;
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$Unknown;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Unknown implements ErrorType {
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType$WithingsError;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "errorCode", "", "(I)V", "getErrorCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError implements ErrorType {
            private final int errorCode;

            public WithingsError(int i11) {
                this.errorCode = i11;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }
        }
    }

    /* compiled from: InitializationErrorSensitiveActionState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "Error", "SuccessNeedGoogleSignIn", "SuccessNeedMail", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$Error;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface RetryOutputState {

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$Error;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Error implements RetryOutputState {
            private final InitializationErrorSensitiveActionState sensitiveActionState;

            public Error(InitializationErrorSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState
            public InitializationErrorSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedGoogleSignIn implements RetryOutputState {
            private final NeedGoogleSignInInfoSensitiveActionState sensitiveActionState;

            public SuccessNeedGoogleSignIn(NeedGoogleSignInInfoSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState
            public NeedGoogleSignInInfoSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        /* compiled from: InitializationErrorSensitiveActionState.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "sensitiveActionState", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;)V", "getSensitiveActionState", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedMail implements RetryOutputState {
            private final NeedMailSensitiveActionState sensitiveActionState;

            public SuccessNeedMail(NeedMailSensitiveActionState sensitiveActionState) {
                u.j(sensitiveActionState, "sensitiveActionState");
                this.sensitiveActionState = sensitiveActionState;
            }

            @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState
            public NeedMailSensitiveActionState getSensitiveActionState() {
                return this.sensitiveActionState;
            }
        }

        SensitiveActionState getSensitiveActionState();
    }

    ErrorType getErrorType();

    Object retryInitialization(d<? super RetryOutputState> dVar);
}
