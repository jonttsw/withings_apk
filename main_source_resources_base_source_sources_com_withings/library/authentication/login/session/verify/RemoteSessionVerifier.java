package com.withings.library.authentication.login.session.verify;

import com.withings.library.authentication.api.account.AccountApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: RemoteSessionVerifier.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/withings/library/authentication/login/session/verify/RemoteSessionVerifier;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "sessionVerifierRequest", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "verifySession", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteSessionVerifier implements SessionVerifier, a {
    private final g accountApi$delegate = h.a(LazyThreadSafetyMode.f76136a, new RemoteSessionVerifier$special$$inlined$inject$default$1(this, null, null));

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // com.withings.library.authentication.login.session.verify.SessionVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object verifySession(com.withings.library.authentication.login.session.verify.SessionVerifier.SessionVerifierRequest r9, com.withings.library.authentication.login.Server r10, qm0.d<? super com.withings.library.authentication.login.session.verify.SessionVerifierResult> r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.session.verify.RemoteSessionVerifier.verifySession(com.withings.library.authentication.login.session.verify.SessionVerifier$SessionVerifierRequest, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }
}
