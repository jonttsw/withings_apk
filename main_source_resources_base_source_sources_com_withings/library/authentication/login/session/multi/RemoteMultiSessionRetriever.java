package com.withings.library.authentication.login.session.multi;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.session.verify.SessionVerifierResult;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: RemoteMultiSessionRetriever.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b5\u00106J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/withings/library/authentication/login/session/multi/RemoteMultiSessionRetriever;", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "toAuthenticationState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;)Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "Lcom/withings/library/authentication/login/Session;", "sessions", "retrieve", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteMultiSessionRetriever implements MultiSessionRetriever, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g loggedInFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g sessionVerifier$delegate;

    public RemoteMultiSessionRetriever() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$2(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$3(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$4(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$5(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$6(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$7(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new RemoteMultiSessionRetriever$special$$inlined$inject$default$8(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final ApiConstantProvider getApiConstantProvider() {
        return (ApiConstantProvider) this.apiConstantProvider$delegate.getValue();
    }

    private final ApplicationInformationProvider getApplicationInformationProvider() {
        return (ApplicationInformationProvider) this.applicationInformationProvider$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final SessionVerifier getSessionVerifier() {
        return (SessionVerifier) this.sessionVerifier$delegate.getValue();
    }

    private final AuthenticationState toAuthenticationState(SessionVerifierResult sessionVerifierResult) {
        if (sessionVerifierResult instanceof SessionVerifierResult.Need2FACode) {
            return getNeedCode2FAFactory().buildNeedCode2FA(Sequence.Verification.INSTANCE, sessionVerifierResult.getSession(), ((SessionVerifierResult.Need2FACode) sessionVerifierResult).getPhoneNumber());
        }
        if (sessionVerifierResult instanceof SessionVerifierResult.NeedPhoneNumber) {
            return getNeedPhoneNumber2FACreationFactory().buildNeedPhoneNumber2FACreation(sessionVerifierResult.getSession());
        }
        if (sessionVerifierResult instanceof SessionVerifierResult.Success) {
            return getLoggedInFactory().buildLoggedIn(x.V(sessionVerifierResult.getSession()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143 A[LOOP:2: B:32:0x013d->B:34:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ca  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0281 -> B:63:0x0282). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x02c3 -> B:82:0x02c7). Please submit an issue!!! */
    @Override // com.withings.library.authentication.login.session.multi.MultiSessionRetriever
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieve(java.util.List<com.withings.library.authentication.login.Session> r26, qm0.d<? super com.withings.library.authentication.login.state.AuthenticationState> r27) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.session.multi.RemoteMultiSessionRetriever.retrieve(java.util.List, qm0.d):java.lang.Object");
    }
}
