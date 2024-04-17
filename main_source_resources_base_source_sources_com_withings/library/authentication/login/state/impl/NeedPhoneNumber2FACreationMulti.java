package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
/* compiled from: NeedPhoneNumber2FACreationMulti.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedPhoneNumber2FACreationMulti;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lpq0/a;", "", "phoneNumber", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "needPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "", "Lcom/withings/library/authentication/login/Session;", "validSessions", "Ljava/util/List;", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "<init>", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;Ljava/util/List;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FACreationMulti implements NeedPhoneNumber2FACreation, a {
    private final NeedPhoneNumber2FACreation needPhoneNumber2FACreation;
    private final List<com.withings.library.authentication.login.Session> validSessions;

    public NeedPhoneNumber2FACreationMulti(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, List<com.withings.library.authentication.login.Session> validSessions) {
        u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
        u.j(validSessions, "validSessions");
        this.needPhoneNumber2FACreation = needPhoneNumber2FACreation;
        this.validSessions = validSessions;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
    public com.withings.library.authentication.login.Session getSession() {
        return this.needPhoneNumber2FACreation.getSession();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r5, qm0.d<? super com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1 r0 = (com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1 r0 = new com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti r5 = (com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti) r5
            nm0.l.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            nm0.l.b(r6)
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r6 = r4.needPhoneNumber2FACreation
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.registerPhoneNumber(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState r6 = (com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState) r6
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.GenericError
            if (r0 == 0) goto L50
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$GenericError r6 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$GenericError
            r6.<init>(r5)
            goto L92
        L50:
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.NetworkError
            if (r0 == 0) goto L5a
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$NetworkError r6 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$NetworkError
            r6.<init>(r5)
            goto L92
        L5a:
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.TooManyRequest
            if (r0 == 0) goto L6b
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$TooManyRequest r0 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$TooManyRequest
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$TooManyRequest r6 = (com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.TooManyRequest) r6
            long r1 = r6.getNextAuthorizedRequestTimestamp()
            r0.<init>(r5, r1)
        L69:
            r6 = r0
            goto L92
        L6b:
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.WithingsError
            if (r0 == 0) goto L7b
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$WithingsError r0 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$WithingsError
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$WithingsError r6 = (com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.WithingsError) r6
            int r6 = r6.getStatusCode()
            r0.<init>(r5, r6)
            goto L69
        L7b:
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.SuccessNeedCode2FA
            if (r0 == 0) goto L93
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA r0 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA
            com.withings.library.authentication.login.state.impl.NeedCode2FAMulti r1 = new com.withings.library.authentication.login.state.impl.NeedCode2FAMulti
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA r6 = (com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState.SuccessNeedCode2FA) r6
            com.withings.library.authentication.login.state.NeedCode2FA r6 = r6.getNeedCode2FA()
            java.util.List<com.withings.library.authentication.login.Session> r5 = r5.validSessions
            r1.<init>(r6, r5)
            r0.<init>(r1)
            goto L69
        L92:
            return r6
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }
}
