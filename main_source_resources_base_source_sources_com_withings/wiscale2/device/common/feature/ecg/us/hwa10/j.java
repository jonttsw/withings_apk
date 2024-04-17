package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51811a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(0);
        this.f51811a = hwa10EcgActivationActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f51811a.finish();
        return y.f85009a;
    }
}
