package com.withings.fever.ui;

import androidx.compose.foundation.layout.x0;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bs.a f39380a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bs.a aVar) {
        super(2);
        this.f39380a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.u.d(0, 0, 0, 60, 0L, aVar2, x0.j(androidx.compose.ui.e.f8927a, yk.h.a(), 0.0f, 0.0f, 0.0f, 14), null, this.f39380a.c());
        }
        return nm0.y.f85009a;
    }
}
