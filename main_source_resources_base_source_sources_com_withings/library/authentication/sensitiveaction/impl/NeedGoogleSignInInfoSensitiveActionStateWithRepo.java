package com.withings.library.authentication.sensitiveaction.impl;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateWithRepo.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b0\u00101J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedGoogleSignInInfoSensitiveActionStateWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lpq0/a;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "withRepo", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "", CommonConstant.KEY_ID_TOKEN, "clientId", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "injectIdToken", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "injectProviderCodeWithIdToken", "providerCode", "injectProviderCodeWithProviderCode", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory$delegate", "getNeedGoogleSignInInfoSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateWithRepo implements NeedGoogleSignInInfoSensitiveActionState, a {
    private final NeedGoogleSignInInfoSensitiveActionState delegate;
    private final g mutableSensitiveActionService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needGoogleSignInInfoSensitiveActionStateFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    public NeedGoogleSignInInfoSensitiveActionStateWithRepo(NeedGoogleSignInInfoSensitiveActionState delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needGoogleSignInInfoSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateWithRepo$special$$inlined$inject$default$5(this, null, null));
    }

    private final MutableSensitiveActionService getMutableSensitiveActionService() {
        return (MutableSensitiveActionService) this.mutableSensitiveActionService$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NeedGoogleSignInInfoSensitiveActionStateFactory getNeedGoogleSignInInfoSensitiveActionStateFactory() {
        return (NeedGoogleSignInInfoSensitiveActionStateFactory) this.needGoogleSignInInfoSensitiveActionStateFactory$delegate.getValue();
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

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectIdToken(java.lang.String r5, java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r7) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo.injectIdToken(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectProviderCodeWithIdToken(java.lang.String r5, java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r7) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo.injectProviderCodeWithIdToken(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectProviderCodeWithProviderCode(java.lang.String r5, java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r7) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateWithRepo.injectProviderCodeWithProviderCode(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    private final VerifiedSensitiveActionState withRepo(VerifiedSensitiveActionState verifiedSensitiveActionState) {
        return getVerifiedSensitiveActionStateFactory().buildWithRepo(verifiedSensitiveActionState);
    }

    private final NeedPhoneNumberSensitiveActionState withRepo(NeedPhoneNumberSensitiveActionState needPhoneNumberSensitiveActionState) {
        return getNeedPhoneNumberSensitiveActionStateFactory().buildWithRepo(needPhoneNumberSensitiveActionState);
    }

    private final NeedGoogleSignInInfoSensitiveActionState withRepo(NeedGoogleSignInInfoSensitiveActionState needGoogleSignInInfoSensitiveActionState) {
        return getNeedGoogleSignInInfoSensitiveActionStateFactory().buildWithRepo(needGoogleSignInInfoSensitiveActionState);
    }
}
