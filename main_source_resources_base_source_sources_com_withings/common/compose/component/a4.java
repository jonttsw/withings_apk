package com.withings.common.compose.component;

import androidx.compose.material3.a9;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SectionCard.kt */
/* loaded from: classes3.dex */
public final class a4 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f33373a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0.o f33374b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33375c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a4(float f11, n0.o oVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
        super(3);
        this.f33373a = f11;
        this.f33374b = oVar;
        this.f33375c = pVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            a9.a(androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), 0.0f, 0.0f, 0.0f, yk.h.f(), 7), this.f33373a, 0.0f, 2), ((f8) aVar2.D(g8.a())).d(), 0L, 0L, 0.0f, 0.0f, this.f33374b, this.f33375c, aVar2, 0, 60);
        }
        return nm0.y.f85009a;
    }
}
