package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.setup2fa.MutableSetup2FAService;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.Unregistered2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: Unregistered2FASetupWithRepo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/Unregistered2FASetupWithRepo;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "withRepo", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "startSetupSequence", "(Lqm0/d;)Ljava/lang/Object;", "unregistered2FASetup", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService$delegate", "Lnm0/g;", "getMutableSetup2FAService", "()Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory$delegate", "getNeedPhoneNumber2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory", "<init>", "(Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Unregistered2FASetupWithRepo implements Unregistered2FASetup, a {
    private final g mutableSetup2FAService$delegate;
    private final g needPhoneNumber2FASetupFactory$delegate;
    private final Unregistered2FASetup unregistered2FASetup;

    public Unregistered2FASetupWithRepo(Unregistered2FASetup unregistered2FASetup) {
        u.j(unregistered2FASetup, "unregistered2FASetup");
        this.unregistered2FASetup = unregistered2FASetup;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSetup2FAService$delegate = h.a(lazyThreadSafetyMode, new Unregistered2FASetupWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needPhoneNumber2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Unregistered2FASetupWithRepo$special$$inlined$inject$default$2(this, null, null));
    }

    private final MutableSetup2FAService getMutableSetup2FAService() {
        return (MutableSetup2FAService) this.mutableSetup2FAService$delegate.getValue();
    }

    private final NeedPhoneNumber2FASetupFactory getNeedPhoneNumber2FASetupFactory() {
        return (NeedPhoneNumber2FASetupFactory) this.needPhoneNumber2FASetupFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FASetup withRepo(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
        return getNeedPhoneNumber2FASetupFactory().buildWithRepo(needPhoneNumber2FASetup);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // com.withings.library.authentication.setup2fa.state.Unregistered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startSetupSequence(qm0.d<? super com.withings.library.authentication.setup2fa.state.Unregistered2FASetup.StartSetup2FAOutputState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo$startSetupSequence$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo$startSetupSequence$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo$startSetupSequence$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo$startSetupSequence$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo$startSetupSequence$1
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
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo r2 = (com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo) r2
            nm0.l.b(r6)
            goto L4b
        L3a:
            nm0.l.b(r6)
            com.withings.library.authentication.setup2fa.state.Unregistered2FASetup r6 = r5.unregistered2FASetup
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.startSetupSequence(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.withings.library.authentication.setup2fa.state.Unregistered2FASetup$StartSetup2FAOutputState r6 = (com.withings.library.authentication.setup2fa.state.Unregistered2FASetup.StartSetup2FAOutputState) r6
            boolean r4 = r6 instanceof com.withings.library.authentication.setup2fa.state.Unregistered2FASetup.StartSetup2FAOutputState.SuccessNeedPhoneNumber2FA
            if (r4 == 0) goto L73
            com.withings.library.authentication.setup2fa.MutableSetup2FAService r4 = r2.getMutableSetup2FAService()
            com.withings.library.authentication.setup2fa.state.Unregistered2FASetup$StartSetup2FAOutputState$SuccessNeedPhoneNumber2FA r6 = (com.withings.library.authentication.setup2fa.state.Unregistered2FASetup.StartSetup2FAOutputState.SuccessNeedPhoneNumber2FA) r6
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup r6 = r6.getSetup2FAState()
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup r6 = r2.withRepo(r6)
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r4.pushNewState(r6, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup r6 = (com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup) r6
            com.withings.library.authentication.setup2fa.state.Unregistered2FASetup$StartSetup2FAOutputState$SuccessNeedPhoneNumber2FA r0 = new com.withings.library.authentication.setup2fa.state.Unregistered2FASetup$StartSetup2FAOutputState$SuccessNeedPhoneNumber2FA
            r0.<init>(r6)
            return r0
        L73:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo.startSetupSequence(qm0.d):java.lang.Object");
    }
}
