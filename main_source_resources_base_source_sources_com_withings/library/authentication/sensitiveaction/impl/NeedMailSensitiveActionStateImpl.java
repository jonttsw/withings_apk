package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState;
import com.withings.library.authentication.utils.locale.LocaleProvider;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: NeedMailSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b+\u0010,J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedMailSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Lpq0/a;", "", "email", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState$MailOutputState;", "injectMail", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lym0/a;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory$delegate", "getNeedMailSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "needMailResultSensitiveActionStateFactory$delegate", "getNeedMailResultSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "needMailResultSensitiveActionStateFactory", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider$delegate", "getLocaleProvider", "()Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailSensitiveActionStateImpl implements NeedMailSensitiveActionState, a {
    private final g accountApi$delegate;
    private final g localeProvider$delegate;
    private final g log$delegate;
    private final g needMailResultSensitiveActionStateFactory$delegate;
    private final g needMailSensitiveActionStateFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final ym0.a<Server> server;

    /* JADX WARN: Multi-variable type inference failed */
    public NeedMailSensitiveActionStateImpl(ym0.a<? extends Server> server) {
        u.j(server, "server");
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedMailSensitiveActionStateImpl$special$$inlined$inject$default$1(this, null, null));
        this.needMailSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailSensitiveActionStateImpl$special$$inlined$inject$default$2(this, null, null));
        this.needMailResultSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailSensitiveActionStateImpl$special$$inlined$inject$default$3(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedMailSensitiveActionStateImpl$special$$inlined$inject$default$4(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedMailSensitiveActionState");
        this.localeProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailSensitiveActionStateImpl$special$$inlined$inject$default$5(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final LocaleProvider getLocaleProvider() {
        return (LocaleProvider) this.localeProvider$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NeedMailResultSensitiveActionStateFactory getNeedMailResultSensitiveActionStateFactory() {
        return (NeedMailResultSensitiveActionStateFactory) this.needMailResultSensitiveActionStateFactory$delegate.getValue();
    }

    private final NeedMailSensitiveActionStateFactory getNeedMailSensitiveActionStateFactory() {
        return (NeedMailSensitiveActionStateFactory) this.needMailSensitiveActionStateFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[RETURN] */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectMail(java.lang.String r10, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState.MailOutputState> r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailSensitiveActionStateImpl.injectMail(java.lang.String, qm0.d):java.lang.Object");
    }
}
