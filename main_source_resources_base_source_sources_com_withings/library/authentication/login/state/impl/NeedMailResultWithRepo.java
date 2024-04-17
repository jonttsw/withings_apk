package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedMailResultFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
/* compiled from: NeedMailResultWithRepo.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b;\u0010<J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u0013\u0010\u0004\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedMailResultWithRepo;", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lpq0/a;", "Lcom/withings/library/authentication/login/state/LoggedIn;", "withRepo", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)Lcom/withings/library/authentication/login/state/NeedMailResult;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService$delegate", "Lnm0/g;", "getMutableAuthenticationService", "()Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory$delegate", "getNeedAccountCreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "needMailResultFactory$delegate", "getNeedMailResultFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedMailResultFactory;", "needMailResultFactory", "getShortCode", "()Ljava/lang/String;", "shortCode", "<init>", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailResultWithRepo implements NeedMailResult, a {
    private final g loggedInFactory$delegate;
    private final g mutableAuthenticationService$delegate;
    private final g needAccountCreationFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final NeedMailResult needMailResult;
    private final g needMailResultFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;

    public NeedMailResultWithRepo(NeedMailResult needMailResult) {
        u.j(needMailResult, "needMailResult");
        this.needMailResult = needMailResult;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableAuthenticationService$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needAccountCreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$5(this, null, null));
        this.needMailResultFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultWithRepo$special$$inlined$inject$default$6(this, null, null));
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
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

    private final LoggedIn withRepo(LoggedIn loggedIn) {
        return getLoggedInFactory().buildLoggedInWithRepo(loggedIn);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedMailResult
    public String getShortCode() {
        return this.needMailResult.getShortCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r6, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultWithRepo.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectJWTToken(java.lang.String r6, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultWithRepo.injectJWTToken(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendMail(qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState> r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultWithRepo.resendMail(qm0.d):java.lang.Object");
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
