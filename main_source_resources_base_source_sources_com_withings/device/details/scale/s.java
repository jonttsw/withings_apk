package com.withings.device.details.scale;

import com.withings.device.Device;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f37013a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f37014b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Device device, w wVar) {
        super(1);
        this.f37013a = device;
        this.f37014b = wVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        this.f37013a.setSyncDisabled(bool.booleanValue());
        this.f37014b.M0();
        return nm0.y.f85009a;
    }
}
