package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import com.withings.wiscale2.device.common.feature.ecg.t5;
import ic0.b0;
import ic0.c0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.l<t5, b0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51805a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(1);
        this.f51805a = hwa10EcgActivationActivity;
    }

    @Override // ym0.l
    public final b0 invoke(t5 t5Var) {
        t5 t5Var2 = t5Var;
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51805a;
        c0 c0Var = hwa10EcgActivationActivity.f51788j;
        if (c0Var != null) {
            return c0Var.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity), t5Var2);
        }
        u.s("hwa10EcgUsAcceptationTermsViewModelFactory");
        throw null;
    }
}
