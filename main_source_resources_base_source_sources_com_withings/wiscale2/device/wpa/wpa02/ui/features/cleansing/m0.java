package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import com.withings.common.compose.component.z4;
import k1.r0;
/* compiled from: Wpa02CleansingModeActivity.kt */
/* loaded from: classes5.dex */
final class m0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z4 f55304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeActivity f55305b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f55306c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f55307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(z4 z4Var, Wpa02CleansingModeActivity wpa02CleansingModeActivity, r8.n nVar, r0<Boolean> r0Var) {
        super(2);
        this.f55304a = z4Var;
        this.f55305b = wpa02CleansingModeActivity;
        this.f55306c = nVar;
        this.f55307d = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55305b;
            r8.n nVar = this.f55306c;
            k1.y.f("error", new g0(wpa02CleansingModeActivity, nVar, this.f55304a, null), aVar2);
            k1.y.f("openPermissions", new h0(wpa02CleansingModeActivity, null), aVar2);
            wk.m0.a(null, null, this.f55304a, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -347481700, new l0(wpa02CleansingModeActivity, nVar, this.f55307d)), aVar2, 0, 805306368, 524283);
        }
        return nm0.y.f85009a;
    }
}
