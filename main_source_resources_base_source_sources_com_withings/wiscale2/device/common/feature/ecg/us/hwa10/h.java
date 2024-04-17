package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel;
import jc0.v;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class h extends w implements ym0.a<FirstEcgVideoInstructionViewModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51809a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(0);
        this.f51809a = hwa10EcgActivationActivity;
    }

    @Override // ym0.a
    public final FirstEcgVideoInstructionViewModel invoke() {
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51809a;
        v vVar = hwa10EcgActivationActivity.f51792n;
        if (vVar != null) {
            return vVar.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity));
        }
        u.s("firstEcgVideoInstructionViewModelFactory");
        throw null;
    }
}
