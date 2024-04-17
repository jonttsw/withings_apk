package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import ac0.x;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class f extends w implements ym0.a<VideoCallPhoneNumberViewModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51807a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(0);
        this.f51807a = hwa10EcgActivationActivity;
    }

    @Override // ym0.a
    public final VideoCallPhoneNumberViewModel invoke() {
        Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51807a;
        x xVar = hwa10EcgActivationActivity.f51790l;
        if (xVar != null) {
            return xVar.a(Hwa10EcgActivationActivity.A3(hwa10EcgActivationActivity), Hwa10EcgActivationActivity.z3(hwa10EcgActivationActivity));
        }
        u.s("videoCallPhoneNumberViewModelFactory");
        throw null;
    }
}
