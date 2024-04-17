package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f46143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Double f46144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s60.a f46145c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46146d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f46147e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46148f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46149g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(String str, Double d11, s60.a aVar, ym0.a<nm0.y> aVar2, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4) {
        super(4);
        this.f46143a = str;
        this.f46144b = d11;
        this.f46145c = aVar;
        this.f46146d = aVar2;
        this.f46147e = lVar;
        this.f46148f = aVar3;
        this.f46149g = aVar4;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959883939);
        ym0.l<String, nm0.y> lVar = this.f46147e;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new t(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        int i11 = s60.a.f96637d;
        ym0.a<nm0.y> aVar3 = this.f46146d;
        q0.g(this.f46143a, this.f46144b, this.f46145c, aVar3, (ym0.a) t11, this.f46148f, this.f46149g, aVar2, 0);
        return nm0.y.f85009a;
    }
}
