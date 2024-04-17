package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.setup2fa.MutableSetup2FAService;
import com.withings.library.authentication.setup2fa.state.NeedCode2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: NeedPhoneNumber2FASetupWithRepo.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/NeedPhoneNumber2FASetupWithRepo;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "withRepo", "(Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;)Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "", "phoneNumber", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "needPhoneNumber2FASetup", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService$delegate", "Lnm0/g;", "getMutableSetup2FAService", "()Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "mutableSetup2FAService", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "needCode2FASetupFactory$delegate", "getNeedCode2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "needCode2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory$delegate", "getNeedPhoneNumber2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory", "<init>", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FASetupWithRepo implements NeedPhoneNumber2FASetup, a {
    private final g mutableSetup2FAService$delegate;
    private final g needCode2FASetupFactory$delegate;
    private final NeedPhoneNumber2FASetup needPhoneNumber2FASetup;
    private final g needPhoneNumber2FASetupFactory$delegate;

    public NeedPhoneNumber2FASetupWithRepo(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
        u.j(needPhoneNumber2FASetup, "needPhoneNumber2FASetup");
        this.needPhoneNumber2FASetup = needPhoneNumber2FASetup;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSetup2FAService$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.needPhoneNumber2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupWithRepo$special$$inlined$inject$default$3(this, null, null));
    }

    private final MutableSetup2FAService getMutableSetup2FAService() {
        return (MutableSetup2FAService) this.mutableSetup2FAService$delegate.getValue();
    }

    private final NeedCode2FASetupFactory getNeedCode2FASetupFactory() {
        return (NeedCode2FASetupFactory) this.needCode2FASetupFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FASetupFactory getNeedPhoneNumber2FASetupFactory() {
        return (NeedPhoneNumber2FASetupFactory) this.needPhoneNumber2FASetupFactory$delegate.getValue();
    }

    private final NeedCode2FASetup withRepo(NeedCode2FASetup needCode2FASetup) {
        return getNeedCode2FASetupFactory().buildWithRepo(needCode2FASetup);
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r6, qm0.d<? super com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupWithRepo.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }

    private final NeedPhoneNumber2FASetup withRepo(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
        return getNeedPhoneNumber2FASetupFactory().buildWithRepo(needPhoneNumber2FASetup);
    }
}
