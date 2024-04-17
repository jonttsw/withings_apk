package com.withings.common.compose.component;

import androidx.compose.ui.layout.g1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
final class z1 extends kotlin.jvm.internal.w implements ym0.l<g1.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<androidx.compose.ui.layout.g1> f34981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.layout.p1 f34982b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ArrayList arrayList, androidx.compose.ui.layout.p1 p1Var) {
        super(1);
        this.f34981a = arrayList;
        this.f34982b = p1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(g1.a aVar) {
        g1.a layout = aVar;
        kotlin.jvm.internal.u.j(layout, "$this$layout");
        int i11 = 0;
        for (androidx.compose.ui.layout.g1 g1Var : this.f34981a) {
            g1.a.g(layout, g1Var, 0, i11);
            i11 += g1Var.l0() + ((int) this.f34982b.b1(v1.d()));
        }
        return nm0.y.f85009a;
    }
}
