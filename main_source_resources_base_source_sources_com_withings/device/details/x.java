package com.withings.device.details;

import androidx.camera.camera2.internal.q2;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f37358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h hVar) {
        super(2);
        this.f37358a = hVar;
    }

    public static final void a(r0 r0Var, boolean z5) {
        r0Var.setValue(Boolean.valueOf(z5));
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, aVar2, 14);
            Object a11 = q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            aVar2.s(-1837808547);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = l0.f(Boolean.FALSE, v0.f8878a);
                aVar2.n(t11);
            }
            r0 r0Var = (r0) t11;
            aVar2.J();
            h hVar = this.f37358a;
            il.a aVar3 = hVar.f36828n;
            if (aVar3 != null) {
                wk.h.a(null, f11, s1.b.b(aVar2, 1748614311, new l(hVar)), s1.b.b(aVar2, -457028056, new s(f11, r0Var, hVar, a12)), s1.b.b(aVar2, 1632296873, new w(this.f37358a, l0.a(aVar3.a(hVar.A1().getId()), Boolean.FALSE, null, aVar2, 2), r0Var, a12, f11)), aVar2, 28096, 1);
            } else {
                kotlin.jvm.internal.u.s("isB2BDeviceUseCase");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
