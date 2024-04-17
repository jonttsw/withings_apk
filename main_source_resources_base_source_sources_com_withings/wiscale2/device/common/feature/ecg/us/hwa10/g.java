package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements ym0.l<String, VideoCallCodeCheckViewModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51808a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(1);
        this.f51808a = hwa10EcgActivationActivity;
    }

    @Override // ym0.l
    public final VideoCallCodeCheckViewModel invoke(String str) {
        String it = str;
        u.j(it, "it");
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51808a;
        ac0.e eVar = hwa10EcgActivationActivity.f51791m;
        if (eVar != null) {
            return eVar.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity), it);
        }
        u.s("videoCallCodeCheckViewModelFactory");
        throw null;
    }
}
