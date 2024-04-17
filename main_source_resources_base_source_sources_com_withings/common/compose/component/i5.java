package com.withings.common.compose.component;

import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.l2;
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
final class i5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a3 f33863a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(a3 a3Var) {
        super(2);
        this.f33863a = a3Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a3.a aVar3 = (a3.a) this.f33863a;
            l2 b10 = aVar3.b();
            if (b10 instanceof l2.a) {
                aVar2.s(1196508891);
                androidx.compose.material3.a5.b(((l2.a) aVar3.b()).a(), "Menu icon", null, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), aVar2, 48, 4);
                aVar2.J();
            } else if (b10 instanceof l2.b) {
                aVar2.s(1196509185);
                androidx.compose.material3.a5.a(((l2.b) aVar3.b()).a(), "Menu icon", null, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), aVar2, 56, 4);
                aVar2.J();
            } else if (b10 instanceof l2.c) {
                aVar2.s(1196509470);
                androidx.compose.material3.a5.a(s2.d.a(com.withings.wiscale2.device.hwa08.postinstall.b0.G(((l2.c) aVar3.b()).a()), aVar2), "Menu icon", null, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), aVar2, 56, 4);
                aVar2.J();
            } else {
                aVar2.s(1196509716);
                aVar2.J();
            }
        }
        return nm0.y.f85009a;
    }
}
