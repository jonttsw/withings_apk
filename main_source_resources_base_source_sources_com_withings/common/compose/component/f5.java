package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.a3;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
public final class f5 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<a3.b> f33797a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33798b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(List<a3.b> list, ym0.a<nm0.y> aVar) {
        super(3);
        this.f33797a = list;
        this.f33798b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h DropdownMenu = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(DropdownMenu, "$this$DropdownMenu");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            for (a3.b bVar : this.f33797a) {
                s1.a b10 = s1.b.b(aVar2, 71769226, new d5(bVar));
                aVar2.s(1629740373);
                ym0.a<nm0.y> aVar3 = this.f33798b;
                boolean K = aVar2.K(aVar3) | aVar2.K(bVar);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new e5(aVar3, bVar);
                    aVar2.n(t11);
                }
                aVar2.J();
                androidx.compose.material3.a0.b(b10, (ym0.a) t11, null, null, null, false, null, null, null, aVar2, 6, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            }
        }
        return nm0.y.f85009a;
    }
}
