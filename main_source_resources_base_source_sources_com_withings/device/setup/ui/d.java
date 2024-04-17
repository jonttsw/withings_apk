package com.withings.device.setup.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupChooseDeviceActivity.kt */
/* loaded from: classes3.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity f37540a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        super(0);
        this.f37540a = setupChooseDeviceActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f37540a.finish();
        return y.f85009a;
    }
}
