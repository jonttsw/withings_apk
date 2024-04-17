package com.withings.wiscale2.vo2max.view;

import androidx.compose.material.t3;
/* compiled from: Vo2MaxTextSelector.kt */
/* loaded from: classes5.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2.d f62885a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f62886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h2.d dVar, String str) {
        super(2);
        this.f62885a = dVar;
        this.f62886b = str;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            long B = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).B();
            t3.b(this.f62885a, this.f62886b, androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, yk.h.s()), B, aVar2, 0, 0);
        }
        return nm0.y.f85009a;
    }
}
