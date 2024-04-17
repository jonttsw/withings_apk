package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
import v9.e;
/* compiled from: NeedMailResultMulti.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedMailResultMulti;", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lpq0/a;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "needMailResult", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever$delegate", "Lnm0/g;", "getMultiSessionRetriever", "()Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "getShortCode", "()Ljava/lang/String;", "shortCode", "<init>", "(Lcom/withings/library/authentication/login/state/NeedMailResult;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailResultMulti implements NeedMailResult, a {
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g multiSessionRetriever$delegate;
    private final NeedMailResult needMailResult;
    private final g networkExceptionChecker$delegate;

    public NeedMailResultMulti(NeedMailResult needMailResult) {
        u.j(needMailResult, "needMailResult");
        this.needMailResult = needMailResult;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.multiSessionRetriever$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultMulti$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultMulti$special$$inlined$inject$default$2(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedMailResultMulti");
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultMulti$special$$inlined$inject$default$3(this, null, null));
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

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedMailResult
    public String getShortCode() {
        return this.needMailResult.getShortCode();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(7:22|23|24|(3:26|(1:28)|14)|15|16|17))(1:29))(2:70|(1:72)(1:73))|30|(2:32|33)(2:34|(2:36|37)(4:38|(1:40)(2:43|(2:45|46)(4:47|(1:49)(2:50|(1:52)(2:53|(1:55)(2:56|(5:58|(1:60)|24|(0)|15)(2:61|(2:63|64)(2:65|(1:67)(2:68|69))))))|16|17))|41|42))))|83|6|7|(0)(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
        if (r8.getNetworkExceptionChecker().isNetworkException(r9) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
        r8.getLog().a("Network error during multi session retrieve process");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
        r8.getLog().b("Exception during multi session retrieve process", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
        r8.getLog().b("Exception during multi session retrieve process", r9);
        r0 = new com.withings.library.authentication.login.state.NeedMailResult.OutputState.WithingsError(r8, r9.getStatus());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
        return new com.withings.library.authentication.login.state.NeedMailResult.OutputState.NetworkError(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return new com.withings.library.authentication.login.state.NeedMailResult.OutputState.GenericError(r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff A[Catch: Exception -> 0x0034, WrongStatusException -> 0x0037, TryCatch #2 {WrongStatusException -> 0x0037, Exception -> 0x0034, blocks: (B:14:0x002f, B:63:0x0114, B:64:0x0116, B:23:0x0046, B:58:0x00f9, B:60:0x00ff, B:55:0x00e0), top: B:80:0x0023 }] */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r8, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r9) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultMulti.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(2:61|(1:63)(1:64))|21|(2:23|24)(2:25|(2:27|28)(4:29|(1:31)(2:34|(2:36|37)(4:38|(1:40)(2:41|(1:43)(2:44|(1:46)(2:47|(3:49|(1:51)|13)(2:52|(2:54|55)(2:56|(1:58)(2:59|60))))))|14|15))|32|33))))|74|6|7|(0)(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r7.getNetworkExceptionChecker().isNetworkException(r8) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r7.getLog().a("Network error during multi session retrieve process");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
        r7.getLog().b("Exception during multi session retrieve process", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
        r7.getLog().b("Exception during multi session retrieve process", r8);
        r0 = new com.withings.library.authentication.login.state.NeedMailResult.OutputState.WithingsError(r7, r8.getStatus());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return new com.withings.library.authentication.login.state.NeedMailResult.OutputState.NetworkError(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return new com.withings.library.authentication.login.state.NeedMailResult.OutputState.GenericError(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectJWTToken(java.lang.String r7, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultMulti.injectJWTToken(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendMail(qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.library.authentication.login.state.impl.NeedMailResultMulti$resendMail$1
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.library.authentication.login.state.impl.NeedMailResultMulti$resendMail$1 r0 = (com.withings.library.authentication.login.state.impl.NeedMailResultMulti$resendMail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedMailResultMulti$resendMail$1 r0 = new com.withings.library.authentication.login.state.impl.NeedMailResultMulti$resendMail$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedMailResultMulti r0 = (com.withings.library.authentication.login.state.impl.NeedMailResultMulti) r0
            nm0.l.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            nm0.l.b(r5)
            com.withings.library.authentication.login.state.NeedMailResult r5 = r4.needMailResult
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.resendMail(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState r5 = (com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState) r5
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.SuccessResendMail
            if (r1 == 0) goto L50
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$SuccessResendMail r5 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$SuccessResendMail
            r5.<init>(r0)
            goto L85
        L50:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.GenericError
            if (r1 == 0) goto L5a
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$GenericError r5 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$GenericError
            r5.<init>(r0)
            goto L85
        L5a:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.NetworkError
            if (r1 == 0) goto L64
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$NetworkError r5 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$NetworkError
            r5.<init>(r0)
            goto L85
        L64:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.TooManyRequestException
            if (r1 == 0) goto L75
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$TooManyRequestException r1 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$TooManyRequestException
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$TooManyRequestException r5 = (com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.TooManyRequestException) r5
            long r2 = r5.getNextAuthorizedRequestTimestamp()
            r1.<init>(r0, r2)
        L73:
            r5 = r1
            goto L85
        L75:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.WithingsError
            if (r1 == 0) goto L86
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$WithingsError r1 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$WithingsError
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$WithingsError r5 = (com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.WithingsError) r5
            int r5 = r5.getStatusCode()
            r1.<init>(r0, r5)
            goto L73
        L85:
            return r5
        L86:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultMulti.resendMail(qm0.d):java.lang.Object");
    }
}
