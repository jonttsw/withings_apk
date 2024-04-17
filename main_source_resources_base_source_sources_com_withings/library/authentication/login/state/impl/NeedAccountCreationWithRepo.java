package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: NeedAccountCreationWithRepo.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b5\u00106J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0004\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0004\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedAccountCreationWithRepo;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lpq0/a;", "Lcom/withings/library/authentication/login/state/LoggedIn;", "withRepo", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedOut;)Lcom/withings/library/authentication/login/state/LoggedOut;", "", "prefLang", "", "subscribed", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "createAccount", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "needAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService$delegate", "Lnm0/g;", "getMutableAuthenticationService", "()Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory$delegate", "getNeedAccountCreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "<init>", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedAccountCreationWithRepo implements NeedAccountCreation, a {
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g mutableAuthenticationService$delegate;
    private final NeedAccountCreation needAccountCreation;
    private final g needAccountCreationFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;

    public NeedAccountCreationWithRepo(NeedAccountCreation needAccountCreation) {
        u.j(needAccountCreation, "needAccountCreation");
        this.needAccountCreation = needAccountCreation;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableAuthenticationService$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needAccountCreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$5(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationWithRepo$special$$inlined$inject$default$6(this, null, null));
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

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final LoggedIn withRepo(LoggedIn loggedIn) {
        return getLoggedInFactory().buildLoggedInWithRepo(loggedIn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    @Override // com.withings.library.authentication.login.state.NeedAccountCreation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createAccount(java.lang.String r5, boolean r6, qm0.d<? super com.withings.library.authentication.login.state.NeedAccountCreation.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedAccountCreationWithRepo.createAccount(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
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

    private final LoggedOut withRepo(LoggedOut loggedOut) {
        return getLoggedOutFactory().buildLoggedOutWithRepo(loggedOut);
    }
}
