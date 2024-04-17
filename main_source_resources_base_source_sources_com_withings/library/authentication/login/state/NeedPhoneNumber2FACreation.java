package com.withings.library.authentication.login.state;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: NeedPhoneNumber2FACreation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "phoneNumber", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "OutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NeedPhoneNumber2FACreation extends AuthenticationState {

    /* compiled from: NeedPhoneNumber2FACreation.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "", "()V", "GenericError", "NetworkError", "SuccessNeedCode2FA", "TooManyRequest", "WithingsError", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$WithingsError;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class OutputState {

        /* compiled from: NeedPhoneNumber2FACreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$GenericError;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericError extends OutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }
        }

        /* compiled from: NeedPhoneNumber2FACreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$NetworkError;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NetworkError extends OutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }
        }

        /* compiled from: NeedPhoneNumber2FACreation.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)V", "getNeedCode2FA", "()Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: NeedPhoneNumber2FACreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$TooManyRequest;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "nextAuthorizedRequestTimestamp", "", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;J)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TooManyRequest extends OutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;
            private final long nextAuthorizedRequestTimestamp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TooManyRequest(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, long j5) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
                this.nextAuthorizedRequestTimestamp = j5;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
            }

            public final long getNextAuthorizedRequestTimestamp() {
                return this.nextAuthorizedRequestTimestamp;
            }
        }

        /* compiled from: NeedPhoneNumber2FACreation.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState$WithingsError;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;I)V", "getNeedPhoneNumber2FACreation", "()Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "getStatusCode", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithingsError extends OutputState {
            private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithingsError(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, int i11) {
                super(null);
                u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
                this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
                this.statusCode = i11;
            }

            public final NeedPhoneNumber2FACreation getNeedPhoneNumber2FACreation() {
                return this.needPhoneNumber2FACreation;
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

    com.withings.library.authentication.login.Session getSession();

    Object registerPhoneNumber(String str, d<? super OutputState> dVar);
}
