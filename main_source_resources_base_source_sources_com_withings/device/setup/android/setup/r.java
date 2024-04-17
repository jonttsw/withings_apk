package com.withings.device.setup.android.setup;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WppConversationKtx.kt */
/* loaded from: classes3.dex */
final class r extends w implements ym0.l<nm0.j<? extends HandsCalibrationConversation.Action, ? extends Object>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WppDeviceConversation f37469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(WppDeviceConversation wppDeviceConversation) {
        super(1);
        this.f37469a = wppDeviceConversation;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends HandsCalibrationConversation.Action, ? extends Object> jVar) {
        nm0.j<? extends HandsCalibrationConversation.Action, ? extends Object> it = jVar;
        u.j(it, "it");
        this.f37469a.G(it);
        return y.f85009a;
    }
}
