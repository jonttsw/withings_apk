package com.withings.device.details;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f36785a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f36786b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, h hVar) {
        super(3);
        this.f36785a = str;
        this.f36786b = hVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            h hVar = this.f36786b;
            Object obj = this.f36785a;
            if (obj == null) {
                obj = Integer.valueOf(hVar.B1().M(hVar.A1().getColor()));
            }
            n0.z.a(x9.n.a(obj, aVar2, 8), hVar.A1().getName(), x0.f(androidx.compose.foundation.c.b(w0.a(e1.f(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), yk.h.u()), 1.0f), ((i1) aVar2.D(j1.e())).O(), ((f8) aVar2.D(g8.a())).d()), yk.h.a()), null, null, 0.0f, null, aVar2, 0, 120);
        }
        return nm0.y.f85009a;
    }
}
