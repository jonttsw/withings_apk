package com.withings.library.authentication.login.state.impl;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedMailResultFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: LoggedOutWithRepo.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0004\bI\u0010JJ\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u0013\u0010\u0003\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\u0003\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0003\u0010\fJ\u0013\u0010\u0003\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u0003\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014J+\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/LoggedOutWithRepo;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/login/state/LoggedOut;)Lcom/withings/library/authentication/login/state/LoggedOut;", "Lcom/withings/library/authentication/login/state/LoggedIn;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)Lcom/withings/library/authentication/login/state/NeedMailResult;", "", "email", "password", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "loginWithPassword", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "hashedPassword", "loginWithHashedPassword", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", CommonConstant.KEY_ID_TOKEN, "clientId", "loginWithExternalProviderAndIdToken", "(Lcom/withings/library/authentication/login/ProviderType;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "providerCode", "loginWithExternalProviderAndProviderCode", "loginWithMail", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "requestNewPassword", "loggedOut", "Lcom/withings/library/authentication/login/state/LoggedOut;", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService$delegate", "Lnm0/g;", "getMutableAuthenticationService", "()Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory$delegate", "getNeedAccountCreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "needMailResultFactory$delegate", "getNeedMailResultFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "needMailResultFactory", "<init>", "(Lcom/withings/library/authentication/login/state/LoggedOut;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedOutWithRepo implements LoggedOut, a {
    private final g loggedInFactory$delegate;
    private final LoggedOut loggedOut;
    private final g loggedOutFactory$delegate;
    private final g mutableAuthenticationService$delegate;
    private final g needAccountCreationFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needMailResultFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;

    public LoggedOutWithRepo(LoggedOut loggedOut) {
        u.j(loggedOut, "loggedOut");
        this.loggedOut = loggedOut;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableAuthenticationService$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$5(this, null, null));
        this.needAccountCreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$6(this, null, null));
        this.needMailResultFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutWithRepo$special$$inlined$inject$default$7(this, null, null));
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final LoggedOutFactory getLoggedOutFactory() {
        return (LoggedOutFactory) this.loggedOutFactory$delegate.getValue();
    }

    private final MutableAuthenticationService getMutableAuthenticationService() {
        return (MutableAuthenticationService) this.mutableAuthenticationService$delegate.getValue();
    }

    private final NeedAccountCreationFactory getNeedAccountCreationFactory() {
        return (NeedAccountCreationFactory) this.needAccountCreationFactory$delegate.getValue();
    }

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NeedMailResultFactory getNeedMailResultFactory() {
        return (NeedMailResultFactory) this.needMailResultFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final LoggedOut withRepo(LoggedOut loggedOut) {
        return getLoggedOutFactory().buildLoggedOutWithRepo(loggedOut);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType r5, java.lang.String r6, java.lang.String r7, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r8) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType r5, java.lang.String r6, java.lang.String r7, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r8) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithHashedPassword(java.lang.String r5, java.lang.String r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.loginWithHashedPassword(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithMail(java.lang.String r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.loginWithMail(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithPassword(java.lang.String r5, java.lang.String r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.loginWithPassword(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestNewPassword(java.lang.String r10, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.NewPasswordOutputState> r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutWithRepo.requestNewPassword(java.lang.String, qm0.d):java.lang.Object");
    }

    private final LoggedIn withRepo(LoggedIn loggedIn) {
        return getLoggedInFactory().buildLoggedInWithRepo(loggedIn);
    }

    private final NeedCode2FA withRepo(NeedCode2FA needCode2FA) {
        return getNeedCode2FAFactory().buildNeedCode2FAWithRepo(needCode2FA);
    }

    private final NeedPhoneNumber2FACreation withRepo(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
        return getNeedPhoneNumber2FACreationFactory().buildNeedPhoneNumber2FACreationWithRepo(needPhoneNumber2FACreation);
    }

    private final NeedAccountCreation withRepo(NeedAccountCreation needAccountCreation) {
        return getNeedAccountCreationFactory().buildNeedAccountCreationWithRepo(needAccountCreation);
    }

    private final NeedMailResult withRepo(NeedMailResult needMailResult) {
        return getNeedMailResultFactory().buildNeedMailResultFactoryWithRepo(needMailResult);
    }
}
