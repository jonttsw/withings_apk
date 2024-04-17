package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: NeedPhoneNumberSensitiveActionStateWithRepo.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedPhoneNumberSensitiveActionStateWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;)Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "", "phoneNumber", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumberSensitiveActionStateWithRepo implements NeedPhoneNumberSensitiveActionState, a {
    private final NeedPhoneNumberSensitiveActionState delegate;
    private final g mutableSensitiveActionService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;

    public NeedPhoneNumberSensitiveActionStateWithRepo(NeedPhoneNumberSensitiveActionState delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateWithRepo$special$$inlined$inject$default$3(this, null, null));
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

    private final NeedPhoneNumberSensitiveActionState withRepo(NeedPhoneNumberSensitiveActionState needPhoneNumberSensitiveActionState) {
        return getNeedPhoneNumberSensitiveActionStateFactory().buildWithRepo(needPhoneNumberSensitiveActionState);
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r6, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateWithRepo.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }

    private final NeedCode2FASensitiveAction withRepo(NeedCode2FASensitiveAction needCode2FASensitiveAction) {
        return getNeedCode2FASensitiveActionFactory().buildWithRepo(needCode2FASensitiveAction);
    }
}
