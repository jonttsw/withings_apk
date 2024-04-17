package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: NeedCode2FASensitiveActionWithRepo.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b1\u00102J\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedCode2FASensitiveActionWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "changePhoneNumber", "recoveryCode", "injectRecoveryCode", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionWithRepo implements NeedCode2FASensitiveAction, a {
    private final NeedCode2FASensitiveAction delegate;
    private final g mutableSensitiveActionService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    public NeedCode2FASensitiveActionWithRepo(NeedCode2FASensitiveAction delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionWithRepo$special$$inlined$inject$default$4(this, null, null));
    }

    private final MutableSensitiveActionService getMutableSensitiveActionService() {
        return (MutableSensitiveActionService) this.mutableSensitiveActionService$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NeedPhoneNumberSensitiveActionStateFactory getNeedPhoneNumberSensitiveActionStateFactory() {
        return (NeedPhoneNumberSensitiveActionStateFactory) this.needPhoneNumberSensitiveActionStateFactory$delegate.getValue();
    }

    private final VerifiedSensitiveActionStateFactory getVerifiedSensitiveActionStateFactory() {
        return (VerifiedSensitiveActionStateFactory) this.verifiedSensitiveActionStateFactory$delegate.getValue();
    }

    private final NeedCode2FASensitiveAction withRepo(NeedCode2FASensitiveAction needCode2FASensitiveAction) {
        return getNeedCode2FASensitiveActionFactory().buildWithRepo(needCode2FASensitiveAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object changePhoneNumber(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo$changePhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo$changePhoneNumber$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo$changePhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo$changePhoneNumber$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo$changePhoneNumber$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nm0.l.b(r8)
            goto L97
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            nm0.l.b(r8)
            goto L72
        L39:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo r2 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo) r2
            nm0.l.b(r8)
            goto L52
        L41:
            nm0.l.b(r8)
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r8 = r7.delegate
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.changePhoneNumber(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r2 = r7
        L52:
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState r8 = (com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState) r8
            boolean r5 = r8 instanceof com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState.ErrorNot2FACreationProcess
            r6 = 0
            if (r5 == 0) goto L7a
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r3 = r2.getMutableSensitiveActionService()
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$ErrorNot2FACreationProcess r8 = (com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState.ErrorNot2FACreationProcess) r8
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r8 = r8.getSensitiveActionState()
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r8 = r2.withRepo(r8)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r3.pushNewState(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r8 = (com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction) r8
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$ErrorNot2FACreationProcess r0 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$ErrorNot2FACreationProcess
            r0.<init>(r8)
            goto L9e
        L7a:
            boolean r4 = r8 instanceof com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState.Success
            if (r4 == 0) goto L9f
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r4 = r2.getMutableSensitiveActionService()
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$Success r8 = (com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.ChangePhoneOutputState.Success) r8
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState r8 = r8.getSensitiveActionState()
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState r8 = r2.withRepo(r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r4.pushNewState(r8, r0)
            if (r8 != r1) goto L97
            return r1
        L97:
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState r8 = (com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState) r8
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$Success r0 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$ChangePhoneOutputState$Success
            r0.<init>(r8)
        L9e:
            return r0
        L9f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo.changePhoneNumber(qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    public String getPhoneNumber() {
        return this.delegate.getPhoneNumber();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r5, boolean r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState> r7) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo.injectCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectRecoveryCode(java.lang.String r5, boolean r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState> r7) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo.injectRecoveryCode(java.lang.String, boolean, qm0.d):java.lang.Object");
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
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSMS(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState> r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionWithRepo.resendSMS(qm0.d):java.lang.Object");
    }

    private final VerifiedSensitiveActionState withRepo(VerifiedSensitiveActionState verifiedSensitiveActionState) {
        return getVerifiedSensitiveActionStateFactory().buildWithRepo(verifiedSensitiveActionState);
    }

    private final NeedPhoneNumberSensitiveActionState withRepo(NeedPhoneNumberSensitiveActionState needPhoneNumberSensitiveActionState) {
        return getNeedPhoneNumberSensitiveActionStateFactory().buildWithRepo(needPhoneNumberSensitiveActionState);
    }
}
