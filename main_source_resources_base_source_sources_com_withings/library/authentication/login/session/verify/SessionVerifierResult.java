package com.withings.library.authentication.login.session.verify;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: SessionVerifier.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", "Need2FACode", "NeedPhoneNumber", "Success", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$Need2FACode;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$NeedPhoneNumber;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$Success;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SessionVerifierResult {

    /* compiled from: SessionVerifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$Need2FACode;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "", "(Lcom/withings/library/authentication/login/Session;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getSession", "()Lcom/withings/library/authentication/login/Session;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Need2FACode implements SessionVerifierResult {
        private final String phoneNumber;
        private final com.withings.library.authentication.login.Session session;

        public Need2FACode(com.withings.library.authentication.login.Session session, String phoneNumber) {
            u.j(session, "session");
            u.j(phoneNumber, "phoneNumber");
            this.session = session;
            this.phoneNumber = phoneNumber;
        }

        public static /* synthetic */ Need2FACode copy$default(Need2FACode need2FACode, com.withings.library.authentication.login.Session session, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                session = need2FACode.session;
            }
            if ((i11 & 2) != 0) {
                str = need2FACode.phoneNumber;
            }
            return need2FACode.copy(session, str);
        }

        public final com.withings.library.authentication.login.Session component1() {
            return this.session;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final Need2FACode copy(com.withings.library.authentication.login.Session session, String phoneNumber) {
            u.j(session, "session");
            u.j(phoneNumber, "phoneNumber");
            return new Need2FACode(session, phoneNumber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Need2FACode)) {
                return false;
            }
            Need2FACode need2FACode = (Need2FACode) obj;
            if (u.e(this.session, need2FACode.session) && u.e(this.phoneNumber, need2FACode.phoneNumber)) {
                return true;
            }
            return false;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Override // com.withings.library.authentication.login.session.verify.SessionVerifierResult
        public com.withings.library.authentication.login.Session getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode() + (this.session.hashCode() * 31);
        }

        public String toString() {
            com.withings.library.authentication.login.Session session = this.session;
            String str = this.phoneNumber;
            return "Need2FACode(session=" + session + ", phoneNumber=" + str + ")";
        }
    }

    /* compiled from: SessionVerifier.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$NeedPhoneNumber;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "(Lcom/withings/library/authentication/login/Session;)V", "getSession", "()Lcom/withings/library/authentication/login/Session;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NeedPhoneNumber implements SessionVerifierResult {
        private final com.withings.library.authentication.login.Session session;

        public NeedPhoneNumber(com.withings.library.authentication.login.Session session) {
            u.j(session, "session");
            this.session = session;
        }

        public static /* synthetic */ NeedPhoneNumber copy$default(NeedPhoneNumber needPhoneNumber, com.withings.library.authentication.login.Session session, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                session = needPhoneNumber.session;
            }
            return needPhoneNumber.copy(session);
        }

        public final com.withings.library.authentication.login.Session component1() {
            return this.session;
        }

        public final NeedPhoneNumber copy(com.withings.library.authentication.login.Session session) {
            u.j(session, "session");
            return new NeedPhoneNumber(session);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof NeedPhoneNumber) && u.e(this.session, ((NeedPhoneNumber) obj).session)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.library.authentication.login.session.verify.SessionVerifierResult
        public com.withings.library.authentication.login.Session getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode();
        }

        public String toString() {
            com.withings.library.authentication.login.Session session = this.session;
            return "NeedPhoneNumber(session=" + session + ")";
        }
    }

    /* compiled from: SessionVerifier.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult$Success;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "(Lcom/withings/library/authentication/login/Session;)V", "getSession", "()Lcom/withings/library/authentication/login/Session;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Success implements SessionVerifierResult {
        private final com.withings.library.authentication.login.Session session;

        public Success(com.withings.library.authentication.login.Session session) {
            u.j(session, "session");
            this.session = session;
        }

        public static /* synthetic */ Success copy$default(Success success, com.withings.library.authentication.login.Session session, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                session = success.session;
            }
            return success.copy(session);
        }

        public final com.withings.library.authentication.login.Session component1() {
            return this.session;
        }

        public final Success copy(com.withings.library.authentication.login.Session session) {
            u.j(session, "session");
            return new Success(session);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && u.e(this.session, ((Success) obj).session)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.library.authentication.login.session.verify.SessionVerifierResult
        public com.withings.library.authentication.login.Session getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode();
        }

        public String toString() {
            com.withings.library.authentication.login.Session session = this.session;
            return "Success(session=" + session + ")";
        }
    }

    com.withings.library.authentication.login.Session getSession();
}
