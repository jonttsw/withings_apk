package com.withings.tutorials.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.device.Device;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.q<o60.d, Device, Long, Intent> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44742a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f44743b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeviceIntroductionActivity deviceIntroductionActivity, Context context) {
        super(3);
        this.f44742a = deviceIntroductionActivity;
        this.f44743b = context;
    }

    @Override // ym0.q
    public final Intent invoke(o60.d dVar, Device device, Long l5) {
        o60.d tutorialData = dVar;
        Device device2 = device;
        long longValue = l5.longValue();
        kotlin.jvm.internal.u.j(tutorialData, "tutorialData");
        kotlin.jvm.internal.u.j(device2, "device");
        h70.b bVar = this.f44742a.f44596h;
        if (bVar != null) {
            return bVar.a(this.f44743b, device2, tutorialData.b(), longValue, tutorialData.d());
        }
        kotlin.jvm.internal.u.s("getFeatureTutorialIntentUseCase");
        throw null;
    }
}
