package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
import v9.e;
/* compiled from: NeedCode2FAMulti.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedCode2FAMulti;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lpq0/a;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "toOutputState", "(Lcom/withings/library/authentication/login/state/AuthenticationState;Lqm0/d;)Ljava/lang/Object;", "", "confirmationCode", "", "rememberDevice", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "recoveryCode", "injectRecoveryCode", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "changePhoneNumber", "needCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "", "Lcom/withings/library/authentication/login/Session;", "validSessions", "Ljava/util/List;", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever$delegate", "Lnm0/g;", "getMultiSessionRetriever", "()Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "<init>", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;Ljava/util/List;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedCode2FAMulti implements NeedCode2FA, a {
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g multiSessionRetriever$delegate;
    private final NeedCode2FA needCode2FA;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final List<com.withings.library.authentication.login.Session> validSessions;

    public NeedCode2FAMulti(NeedCode2FA needCode2FA, List<com.withings.library.authentication.login.Session> validSessions) {
        u.j(needCode2FA, "needCode2FA");
        u.j(validSessions, "validSessions");
        this.needCode2FA = needCode2FA;
        this.validSessions = validSessions;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.multiSessionRetriever$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAMulti$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAMulti$special$$inlined$inject$default$2(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedCode2FAMultiAccount");
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAMulti$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAMulti$special$$inlined$inject$default$4(this, null, null));
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

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object toOutputState(AuthenticationState authenticationState, d<? super NeedCode2FA.CodeOutputState> dVar) {
        if (authenticationState instanceof NeedCode2FA) {
            return new NeedCode2FA.CodeOutputState.SuccessNeedCode2FA((NeedCode2FA) authenticationState);
        }
        if (authenticationState instanceof NeedPhoneNumber2FACreation) {
            return new NeedCode2FA.CodeOutputState.SuccessNeedPhoneNumber2FA((NeedPhoneNumber2FACreation) authenticationState);
        }
        if (authenticationState instanceof LoggedIn) {
            return new NeedCode2FA.CodeOutputState.SuccessLoggedIn((LoggedIn) authenticationState);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object changePhoneNumber(qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.ChangePhoneOutputState> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$changePhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$changePhoneNumber$1 r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$changePhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$changePhoneNumber$1 r0 = new com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$changePhoneNumber$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAMulti) r0
            nm0.l.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            nm0.l.b(r5)
            com.withings.library.authentication.login.state.NeedCode2FA r5 = r4.needCode2FA
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.changePhoneNumber(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState r5 = (com.withings.library.authentication.login.state.NeedCode2FA.ChangePhoneOutputState) r5
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.ChangePhoneOutputState.ErrorNot2FACreationProcess
            if (r1 == 0) goto L50
            com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState$ErrorNot2FACreationProcess r5 = new com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState$ErrorNot2FACreationProcess
            r5.<init>(r0)
            goto L6a
        L50:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.ChangePhoneOutputState.Success
            if (r1 == 0) goto L6b
            com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState$Success r1 = new com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState$Success
            com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory r2 = r0.getNeedPhoneNumber2FACreationFactory()
            com.withings.library.authentication.login.state.NeedCode2FA$ChangePhoneOutputState$Success r5 = (com.withings.library.authentication.login.state.NeedCode2FA.ChangePhoneOutputState.Success) r5
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r5 = r5.getNeedPhoneNumber2FACreation()
            java.util.List<com.withings.library.authentication.login.Session> r0 = r0.validSessions
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r5 = r2.buildNeedPhoneNumber2FACreationMulti(r5, r0)
            r1.<init>(r5)
            r5 = r1
        L6a:
            return r5
        L6b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAMulti.changePhoneNumber(qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    public String getPhoneNumber() {
        return this.needCode2FA.getPhoneNumber();
    }

    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    public com.withings.library.authentication.login.Session getSession() {
        return this.needCode2FA.getSession();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(4:13|14|15|17)(2:19|20))(7:21|22|23|24|(1:26)|15|17))(8:27|28|29|(3:31|(1:33)|23)|24|(0)|15|17))(1:34))(2:68|(1:70)(1:71))|35|(2:37|38)(2:39|(2:41|42)(2:43|(2:45|46)(4:47|(1:49)(2:52|(2:56|(8:58|(1:60)|29|(0)|24|(0)|15|17)(2:61|(1:63)(2:64|65)))(1:66))|50|51)))))|80|6|7|(0)(0)|35|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
        if (r9.getNetworkExceptionChecker().isNetworkException(r10) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
        r9.getLog().a("Network error during multi session retrieve process");
        r10 = new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.NetworkError(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
        r9.getLog().b("Exception during multi session retrieve process", r10);
        r10 = new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.GenericError(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012a, code lost:
        r9.getLog().b("Exception during multi session retrieve process", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        return new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.WithingsError(r9, r10.getStatus());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: Exception -> 0x0037, WrongStatusException -> 0x003a, TryCatch #2 {WrongStatusException -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:67:0x0100, B:24:0x0049, B:63:0x00f3, B:64:0x00f5, B:27:0x0052, B:58:0x00d8, B:60:0x00de, B:55:0x00b5), top: B:80:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r9, boolean r10, qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState> r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAMulti.injectCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(4:13|14|15|17)(2:19|20))(7:21|22|23|24|(1:26)|15|17))(8:27|28|29|(3:31|(1:33)|23)|24|(0)|15|17))(1:34))(2:68|(1:70)(1:71))|35|(2:37|38)(2:39|(2:41|42)(2:43|(2:45|46)(4:47|(1:49)(2:52|(1:54)(2:55|(2:59|(8:61|(1:63)|29|(0)|24|(0)|15|17)(2:64|65))(1:66)))|50|51)))))|80|6|7|(0)(0)|35|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011b, code lost:
        if (r9.getNetworkExceptionChecker().isNetworkException(r10) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011d, code lost:
        r9.getLog().a("Network error during multi session retrieve process");
        r10 = new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.NetworkError(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:
        r9.getLog().b("Exception during multi session retrieve process", r10);
        r10 = new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.GenericError(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
        r9.getLog().b("Exception during multi session retrieve process", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014b, code lost:
        return new com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState.WithingsError(r9, r10.getStatus());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[Catch: Exception -> 0x0037, WrongStatusException -> 0x003a, TryCatch #2 {WrongStatusException -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:70:0x0110, B:24:0x0049, B:66:0x0103, B:67:0x0105, B:27:0x0052, B:61:0x00e8, B:63:0x00ee, B:58:0x00c5), top: B:80:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectRecoveryCode(java.lang.String r9, boolean r10, qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState> r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAMulti.injectRecoveryCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSMS(qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$resendSMS$1
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$resendSMS$1 r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$resendSMS$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$resendSMS$1 r0 = new com.withings.library.authentication.login.state.impl.NeedCode2FAMulti$resendSMS$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAMulti) r0
            nm0.l.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            nm0.l.b(r5)
            com.withings.library.authentication.login.state.NeedCode2FA r5 = r4.needCode2FA
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.resendSMS(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState r5 = (com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState) r5
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.TooManyRequest
            if (r1 == 0) goto L56
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$TooManyRequest r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$TooManyRequest
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$TooManyRequest r5 = (com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.TooManyRequest) r5
            long r2 = r5.getNextAuthorizedRequestTimestamp()
            r1.<init>(r0, r2)
            goto L83
        L56:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.GenericError
            if (r1 == 0) goto L60
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$GenericError r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$GenericError
            r1.<init>(r0)
            goto L83
        L60:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.NetworkError
            if (r1 == 0) goto L6a
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$NetworkError r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$NetworkError
            r1.<init>(r0)
            goto L83
        L6a:
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.WithingsError
            if (r1 == 0) goto L7a
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$WithingsError r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$WithingsError
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$WithingsError r5 = (com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.WithingsError) r5
            int r5 = r5.getStatusCode()
            r1.<init>(r0, r5)
            goto L83
        L7a:
            boolean r5 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState.SuccessNeedCode2FA
            if (r5 == 0) goto L84
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$SuccessNeedCode2FA r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$SuccessNeedCode2FA
            r1.<init>(r0)
        L83:
            return r1
        L84:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAMulti.resendSMS(qm0.d):java.lang.Object");
    }
}
