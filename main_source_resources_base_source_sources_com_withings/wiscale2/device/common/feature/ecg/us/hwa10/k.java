package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.withings.wiscale2.C1987R;
import gc0.n0;
import i6.a;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: Hwa10EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity f51812a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        super(2);
        this.f51812a = hwa10EcgActivationActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            Hwa10EcgActivationActivity hwa10EcgActivationActivity = this.f51812a;
            b bVar = new b(hwa10EcgActivationActivity);
            aVar3.s(419377738);
            n1 a11 = j6.a.a(aVar3);
            if (a11 != null) {
                i6.c cVar = new i6.c();
                cVar.a(q0.b(n0.class), bVar);
                i6.b b10 = cVar.b();
                if (a11 instanceof u) {
                    aVar2 = ((u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a12 = j6.b.a(n0.class, a11, null, b10, aVar2, aVar3);
                aVar3.J();
                n0 n0Var = (n0) a12;
                ch.l lVar = hwa10EcgActivationActivity.f51793o;
                if (lVar != null) {
                    ch.d dVar = hwa10EcgActivationActivity.f51794p;
                    if (dVar != null) {
                        gc0.a.a(n0Var, lVar, dVar, new c(hwa10EcgActivationActivity), new d(hwa10EcgActivationActivity), new e(hwa10EcgActivationActivity), new f(hwa10EcgActivationActivity), new g(hwa10EcgActivationActivity), new h(hwa10EcgActivationActivity), ay.b.u(C1987R.string.hwa10_usOnboarding_support_link, aVar3), new i(hwa10EcgActivationActivity), new j(hwa10EcgActivationActivity), aVar3, 584, 0);
                    } else {
                        kotlin.jvm.internal.u.s("intentBuilder");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("webIntentBuilder");
                    throw null;
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        return y.f85009a;
    }
}
