package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailResultSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
/* compiled from: NeedMailResultSensitiveActionStateWithRepo.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b4\u00105J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedMailResultSensitiveActionStateWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Lpq0/a;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "withRepo", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "needMailResultSensitiveActionStateFactory$delegate", "getNeedMailResultSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailResultSensitiveActionStateFactory;", "needMailResultSensitiveActionStateFactory", "getEmail", "()Ljava/lang/String;", "email", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateWithRepo implements NeedMailResultSensitiveActionState, a {
    private final NeedMailResultSensitiveActionState delegate;
    private final g mutableSensitiveActionService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needMailResultSensitiveActionStateFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    public NeedMailResultSensitiveActionStateWithRepo(NeedMailResultSensitiveActionState delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needMailResultSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateWithRepo$special$$inlined$inject$default$5(this, null, null));
    }

    private final MutableSensitiveActionService getMutableSensitiveActionService() {
        return (MutableSensitiveActionService) this.mutableSensitiveActionService$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NeedMailResultSensitiveActionStateFactory getNeedMailResultSensitiveActionStateFactory() {
        return (NeedMailResultSensitiveActionStateFactory) this.needMailResultSensitiveActionStateFactory$delegate.getValue();
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

    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    public String getEmail() {
        return this.delegate.getEmail();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectJWTToken(java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo.injectJWTToken(java.lang.String, qm0.d):java.lang.Object");
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
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendMail(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState> r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateWithRepo.resendMail(qm0.d):java.lang.Object");
    }

    private final VerifiedSensitiveActionState withRepo(VerifiedSensitiveActionState verifiedSensitiveActionState) {
        return getVerifiedSensitiveActionStateFactory().buildWithRepo(verifiedSensitiveActionState);
    }

    private final NeedPhoneNumberSensitiveActionState withRepo(NeedPhoneNumberSensitiveActionState needPhoneNumberSensitiveActionState) {
        return getNeedPhoneNumberSensitiveActionStateFactory().buildWithRepo(needPhoneNumberSensitiveActionState);
    }

    private final NeedMailResultSensitiveActionState withRepo(NeedMailResultSensitiveActionState needMailResultSensitiveActionState) {
        return getNeedMailResultSensitiveActionStateFactory().buildWithRepo(needMailResultSensitiveActionState);
    }
}
