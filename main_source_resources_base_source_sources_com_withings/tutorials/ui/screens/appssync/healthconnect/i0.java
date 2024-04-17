package com.withings.tutorials.ui.screens.appssync.healthconnect;

import androidx.compose.material3.j5;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f44972a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44973b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44974c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f44975d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44976e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r8.n nVar, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, boolean z5) {
        super(4);
        this.f44972a = z5;
        this.f44973b = aVar;
        this.f44974c = aVar2;
        this.f44975d = nVar;
        this.f44976e = aVar3;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        boolean z5 = this.f44972a;
        ym0.a<nm0.y> aVar3 = this.f44976e;
        r8.n nVar = this.f44975d;
        ym0.a<nm0.y> aVar4 = this.f44974c;
        ym0.a<nm0.y> aVar5 = this.f44973b;
        if (z5) {
            aVar2.s(-640109431);
            d0.k(48, 0, aVar2, aVar5, s1.b.b(aVar2, -1036887851, new f0(nVar, aVar4, aVar3)));
            aVar2.J();
        } else {
            aVar2.s(-640109041);
            d0.i(48, 0, aVar2, aVar5, s1.b.b(aVar2, -985050046, new h0(nVar, aVar4, aVar3)));
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
