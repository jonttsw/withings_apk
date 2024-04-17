package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class w extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46170a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f46171b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ym0.a aVar, ym0.a aVar2, ym0.l lVar) {
        super(4);
        this.f46170a = aVar;
        this.f46171b = lVar;
        this.f46172c = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959884290);
        ym0.l<String, nm0.y> lVar = this.f46171b;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new v(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        q0.d(this.f46170a, (ym0.a) t11, this.f46172c, aVar2, 0);
        return nm0.y.f85009a;
    }
}
