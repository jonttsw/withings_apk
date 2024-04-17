package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import com.withings.device.Device;
/* compiled from: ToiletNavigation.kt */
/* loaded from: classes5.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f55369a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Device f55370b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55371c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f55372d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r8.n nVar, Device device, k kVar, ym0.a aVar) {
        super(4);
        this.f55369a = kVar;
        this.f55370b = device;
        this.f55371c = aVar;
        this.f55372d = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        long id2 = this.f55370b.getId();
        e0 e0Var = new e0(this.f55372d);
        aVar2.s(-617476758);
        ym0.a<nm0.y> aVar3 = this.f55371c;
        boolean K = aVar2.K(aVar3);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new f0(aVar3);
            aVar2.n(t11);
        }
        aVar2.J();
        s.a(this.f55369a, id2, e0Var, (ym0.a) t11, aVar2, 8);
        return nm0.y.f85009a;
    }
}
