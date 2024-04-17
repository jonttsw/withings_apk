package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.setup2fa.MutableSetup2FAService;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.Registered2FASetup;
import com.withings.library.authentication.setup2fa.state.Unregistered2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: Registered2FASetupWithRepo.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/Registered2FASetupWithRepo;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;)Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "remove2FA", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "getRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "generateRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "changePhoneNumber", "registered2FASetup", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService$delegate", "Lnm0/g;", "getMutableSetup2FAService", "()Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService", "Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory$delegate", "getRegistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory$delegate", "getUnregistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory$delegate", "getNeedPhoneNumber2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory", "", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "<init>", "(Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Registered2FASetupWithRepo implements Registered2FASetup, a {
    private final g mutableSetup2FAService$delegate;
    private final g needPhoneNumber2FASetupFactory$delegate;
    private final Registered2FASetup registered2FASetup;
    private final g registered2FASetupFactory$delegate;
    private final g unregistered2FASetupFactory$delegate;

    public Registered2FASetupWithRepo(Registered2FASetup registered2FASetup) {
        u.j(registered2FASetup, "registered2FASetup");
        this.registered2FASetup = registered2FASetup;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSetup2FAService$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.registered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.unregistered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumber2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupWithRepo$special$$inlined$inject$default$4(this, null, null));
    }

    private final MutableSetup2FAService getMutableSetup2FAService() {
        return (MutableSetup2FAService) this.mutableSetup2FAService$delegate.getValue();
    }

    private final NeedPhoneNumber2FASetupFactory getNeedPhoneNumber2FASetupFactory() {
        return (NeedPhoneNumber2FASetupFactory) this.needPhoneNumber2FASetupFactory$delegate.getValue();
    }

    private final Registered2FASetupFactory getRegistered2FASetupFactory() {
        return (Registered2FASetupFactory) this.registered2FASetupFactory$delegate.getValue();
    }

    private final Unregistered2FASetupFactory getUnregistered2FASetupFactory() {
        return (Unregistered2FASetupFactory) this.unregistered2FASetupFactory$delegate.getValue();
    }

    private final Registered2FASetup withRepo(Registered2FASetup registered2FASetup) {
        return getRegistered2FASetupFactory().buildWithRepo(registered2FASetup);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object changePhoneNumber(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.ChangePhoneOutputState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo$changePhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo$changePhoneNumber$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo$changePhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo$changePhoneNumber$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo$changePhoneNumber$1
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
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo r2 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo) r2
            nm0.l.b(r6)
            goto L4b
        L3a:
            nm0.l.b(r6)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup r6 = r5.registered2FASetup
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.changePhoneNumber(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$ChangePhoneOutputState r6 = (com.withings.library.authentication.setup2fa.state.Registered2FASetup.ChangePhoneOutputState) r6
            boolean r4 = r6 instanceof com.withings.library.authentication.setup2fa.state.Registered2FASetup.ChangePhoneOutputState.Success
            if (r4 == 0) goto L73
            com.withings.library.authentication.setup2fa.MutableSetup2FAService r4 = r2.getMutableSetup2FAService()
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$ChangePhoneOutputState$Success r6 = (com.withings.library.authentication.setup2fa.state.Registered2FASetup.ChangePhoneOutputState.Success) r6
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
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$ChangePhoneOutputState$Success r0 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$ChangePhoneOutputState$Success
            r0.<init>(r6)
            return r0
        L73:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo.changePhoneNumber(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object generateRecoveryCode(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState> r7) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo.generateRecoveryCode(qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    public String getPhoneNumber() {
        return this.registered2FASetup.getPhoneNumber();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getRecoveryCode(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState> r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo.getRecoveryCode(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove2FA(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState> r7) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo.remove2FA(qm0.d):java.lang.Object");
    }

    private final Unregistered2FASetup withRepo(Unregistered2FASetup unregistered2FASetup) {
        return getUnregistered2FASetupFactory().buildWithRepo(unregistered2FASetup);
    }

    private final NeedPhoneNumber2FASetup withRepo(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
        return getNeedPhoneNumber2FASetupFactory().buildWithRepo(needPhoneNumber2FASetup);
    }
}
