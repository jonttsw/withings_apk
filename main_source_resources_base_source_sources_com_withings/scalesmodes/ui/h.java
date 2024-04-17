package com.withings.scalesmodes.ui;

import com.withings.common.compose.component.n1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
import ym0.q;
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
final class h extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f43933a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar) {
        super(3);
        this.f43933a = cVar;
    }

    @Override // ym0.q
    public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        a0 LabelValueCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelValueCell, "$this$LabelValueCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            c cVar = this.f43933a;
            n1.i(ay.b.u(cVar.c(), aVar2), s2.b.a(cVar.b(), aVar2), s2.b.a(cVar.a(), aVar2), null, 0.0f, 0L, null, aVar2, 0, 120);
        }
        return y.f85009a;
    }
}
