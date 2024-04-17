package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: NeedAccountCreationMulti.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedAccountCreationMulti;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lpq0/a;", "", "prefLang", "", "subscribed", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "createAccount", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "needAccountCreation", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever$delegate", "Lnm0/g;", "getMultiSessionRetriever", "()Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "<init>", "(Lcom/withings/library/authentication/login/state/NeedAccountCreation;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedAccountCreationMulti implements NeedAccountCreation, a {
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g multiSessionRetriever$delegate;
    private final NeedAccountCreation needAccountCreation;
    private final g networkExceptionChecker$delegate;

    public NeedAccountCreationMulti(NeedAccountCreation needAccountCreation) {
        u.j(needAccountCreation, "needAccountCreation");
        this.needAccountCreation = needAccountCreation;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.multiSessionRetriever$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationMulti$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationMulti$special$$inlined$inject$default$2(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedAccountCreationMulti");
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationMulti$special$$inlined$inject$default$3(this, null, null));
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final MultiSessionRetriever getMultiSessionRetriever() {
        return (MultiSessionRetriever) this.multiSessionRetriever$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(7:22|23|24|(3:26|(1:28)|14)|15|16|17))(1:29))(2:61|(1:63)(1:64))|30|(1:32)(2:33|(1:35)(2:36|(2:38|39)(2:40|(1:42)(2:43|(2:45|46)(2:47|(2:49|(1:51)(4:52|24|(0)|15))(2:53|(2:57|58)(1:59)))))))|16|17))|73|6|7|(0)(0)|30|(0)(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
        if (r10.getNetworkExceptionChecker().isNetworkException(r9) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
        r10.getLog().a("Network error during multi session retrieve process");
        r9 = new com.withings.library.authentication.login.state.NeedAccountCreation.OutputState.NetworkError(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
        r10.getLog().b("Exception during multi session retrieve process", r9);
        r9 = new com.withings.library.authentication.login.state.NeedAccountCreation.OutputState.GenericError(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
        r10.getLog().b("Exception during multi session retrieve process", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return new com.withings.library.authentication.login.state.NeedAccountCreation.OutputState.WithingsError(r10, r9.getStatus());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[Catch: Exception -> 0x0038, WrongStatusException -> 0x003b, TryCatch #2 {WrongStatusException -> 0x003b, Exception -> 0x0038, blocks: (B:14:0x0033, B:57:0x010b, B:58:0x010d, B:23:0x004e, B:52:0x00ee, B:54:0x00f4, B:48:0x00cf), top: B:73:0x0023 }] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // com.withings.library.authentication.login.state.NeedAccountCreation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createAccount(java.lang.String r9, boolean r10, qm0.d<? super com.withings.library.authentication.login.state.NeedAccountCreation.OutputState> r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedAccountCreationMulti.createAccount(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }
}
