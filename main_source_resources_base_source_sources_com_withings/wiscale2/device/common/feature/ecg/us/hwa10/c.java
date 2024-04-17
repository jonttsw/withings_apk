package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import hc0.q;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.a<hc0.o> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51804a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(0);
        this.f51804a = hwa10EcgActivationActivity;
    }

    @Override // ym0.a
    public final hc0.o invoke() {
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51804a;
        q qVar = hwa10EcgActivationActivity.f51787i;
        if (qVar != null) {
            return qVar.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity));
        }
        u.s("ecgUsStateSelectionViewModelFactory");
        throw null;
    }
}
