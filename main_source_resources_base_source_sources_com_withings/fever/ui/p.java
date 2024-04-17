package com.withings.fever.ui;

import com.withings.common.compose.component.n1;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bs.a f39398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bs.a aVar) {
        super(2);
        this.f39398a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            bs.a aVar3 = this.f39398a;
            String b10 = aVar3.b();
            if (b10 != null) {
                n1.d(b10, s2.b.a(aVar3.a().d(), aVar2), null, aVar2, 0, 4);
            }
        }
        return nm0.y.f85009a;
    }
}
