package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import gc0.n0;
import gc0.p0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.l<i6.a, n0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51803a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(1);
        this.f51803a = hwa10EcgActivationActivity;
    }

    @Override // ym0.l
    public final n0 invoke(i6.a aVar) {
        i6.a viewModel = aVar;
        u.j(viewModel, "$this$viewModel");
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51803a;
        p0 p0Var = hwa10EcgActivationActivity.f51786h;
        if (p0Var != null) {
            return p0Var.a(Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.B3(hwa10EcgActivationActivity));
        }
        u.s("hwa10EcgActivationViewModelFactory");
        throw null;
    }
}
