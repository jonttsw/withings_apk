package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
/* compiled from: VerifiedSensitiveActionStateWithRepo.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/VerifiedSensitiveActionStateWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lpq0/a;", "Lnm0/y;", "finishSensitiveActionVerification", "(Lqm0/d;)Ljava/lang/Object;", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VerifiedSensitiveActionStateWithRepo implements VerifiedSensitiveActionState, a {
    private final VerifiedSensitiveActionState delegate;
    private final g mutableSensitiveActionService$delegate;

    public VerifiedSensitiveActionStateWithRepo(VerifiedSensitiveActionState delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        this.mutableSensitiveActionService$delegate = h.a(LazyThreadSafetyMode.f76136a, new VerifiedSensitiveActionStateWithRepo$special$$inlined$inject$default$1(this, null, null));
    }

    private final MutableSensitiveActionService getMutableSensitiveActionService() {
        return (MutableSensitiveActionService) this.mutableSensitiveActionService$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    @Override // com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object finishSensitiveActionVerification(qm0.d<? super nm0.y> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo$finishSensitiveActionVerification$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r6)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo r2 = (com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo) r2
            nm0.l.b(r6)
            goto L4b
        L3a:
            nm0.l.b(r6)
            com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState r6 = r5.delegate
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.finishSensitiveActionVerification(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r6 = r2.getMutableSensitiveActionService()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.clearState(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo.finishSensitiveActionVerification(qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState
    public com.withings.library.authentication.login.Session getSession() {
        return this.delegate.getSession();
    }
}
