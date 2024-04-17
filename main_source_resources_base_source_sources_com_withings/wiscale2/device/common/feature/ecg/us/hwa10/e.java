package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import ic0.p;
import ic0.q;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51806a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(0);
        this.f51806a = hwa10EcgActivationActivity;
    }

    @Override // ym0.a
    public final p invoke() {
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51806a;
        q qVar = hwa10EcgActivationActivity.f51789k;
        if (qVar != null) {
            return qVar.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.B3(hwa10EcgActivationActivity));
        }
        u.s("hwa10EcgEuAcceptationTermsViewModelFactory");
        throw null;
    }
}
