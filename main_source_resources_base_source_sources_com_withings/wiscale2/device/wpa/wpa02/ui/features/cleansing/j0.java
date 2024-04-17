package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Wpa02CleansingModeActivity.kt */
/* loaded from: classes5.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeActivity f55294a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Wpa02CleansingModeActivity wpa02CleansingModeActivity) {
        super(0);
        this.f55294a = wpa02CleansingModeActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpa02CleansingModeViewModel B3 = Wpa02CleansingModeActivity.B3(this.f55294a);
        BuildersKt__Builders_commonKt.launch$default(h1.a(B3), Dispatchers.getIO(), null, new p0(B3, null), 2, null);
        return nm0.y.f85009a;
    }
}
