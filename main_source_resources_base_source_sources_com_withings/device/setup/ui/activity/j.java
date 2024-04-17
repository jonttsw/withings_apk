package com.withings.device.setup.ui.activity;

import androidx.compose.runtime.l0;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.withings.device.setup.ui.activity.l;
import i6.a;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import nm0.y;
import np.p0;
import ym0.p;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37525a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f37526b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SetupActivity setupActivity, int i11) {
        super(2);
        this.f37525a = setupActivity;
        this.f37526b = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        i6.a aVar3;
        androidx.compose.runtime.a aVar4 = aVar;
        if ((num.intValue() & 11) == 2 && aVar4.h()) {
            aVar4.C();
        } else {
            SetupActivity setupActivity = this.f37525a;
            l lVar = (l) l0.b(setupActivity.z3().f0(), aVar4).getValue();
            boolean z5 = lVar instanceof l.a;
            int i11 = this.f37526b;
            if (z5) {
                aVar4.s(461903821);
                e eVar = new e(setupActivity, lVar, i11);
                aVar4.s(419377738);
                n1 a11 = j6.a.a(aVar4);
                if (a11 != null) {
                    i6.c cVar = new i6.c();
                    cVar.a(q0.b(p0.class), eVar);
                    i6.b b10 = cVar.b();
                    if (a11 instanceof u) {
                        aVar3 = ((u) a11).getDefaultViewModelCreationExtras();
                    } else {
                        aVar3 = a.C1058a.f71431b;
                    }
                    g1 a12 = j6.b.a(p0.class, a11, null, b10, aVar3, aVar4);
                    aVar4.J();
                    np.c.a((p0) a12, new f(setupActivity), aVar4, 8);
                    aVar4.J();
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            } else if (kotlin.jvm.internal.u.e(lVar, l.b.f37528a)) {
                aVar4.s(461904211);
                d.a(i11, new g(setupActivity), aVar4, 0);
                aVar4.J();
            } else if (lVar instanceof l.c) {
                aVar4.s(461904424);
                h hVar = new h(setupActivity, lVar);
                aVar4.s(419377738);
                n1 a13 = j6.a.a(aVar4);
                if (a13 != null) {
                    i6.c cVar2 = new i6.c();
                    cVar2.a(q0.b(op.d.class), hVar);
                    i6.b b11 = cVar2.b();
                    if (a13 instanceof u) {
                        aVar2 = ((u) a13).getDefaultViewModelCreationExtras();
                    } else {
                        aVar2 = a.C1058a.f71431b;
                    }
                    g1 a14 = j6.b.a(op.d.class, a13, null, b11, aVar2, aVar4);
                    aVar4.J();
                    op.b.b((op.d) a14, new i(setupActivity), aVar4, 8);
                    aVar4.J();
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            } else {
                aVar4.s(461904672);
                aVar4.J();
            }
        }
        return y.f85009a;
    }
}
