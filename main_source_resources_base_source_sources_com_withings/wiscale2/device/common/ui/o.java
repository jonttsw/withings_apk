package com.withings.wiscale2.device.common.ui;

import android.content.Context;
/* compiled from: BaseDeviceInfoFragment.kt */
/* loaded from: classes5.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f54033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar) {
        super(2);
        this.f54033a = hVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            h hVar = this.f54033a;
            nn.j.a(hVar.F1(), new n(hVar, (Context) aVar2.D(androidx.compose.ui.platform.u0.d())), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
