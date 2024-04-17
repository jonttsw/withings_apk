package com.withings.nutrisync.ui;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f43285a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity f43286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r8.n nVar, VitaminCDatavizActivity vitaminCDatavizActivity) {
        super(2);
        this.f43285a = nVar;
        this.f43286b = vitaminCDatavizActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n nVar = this.f43285a;
            u uVar = new u(nVar, this.f43286b);
            androidx.navigation.compose.s.b(nVar, "Dataviz", null, null, null, l.f43274a, m.f43275a, n.f43276a, o.f43277a, uVar, aVar2, 115015736, 28);
        }
        return nm0.y.f85009a;
    }
}
