package com.withings.wiscale2.device.common.screen.ui;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53343a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53344b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(sc0.b bVar, ym0.l lVar) {
        super(3);
        this.f53343a = lVar;
        this.f53344b = bVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(a0Var, "$this$null");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            wp.d.b(0, 0, aVar2, new h0(this.f53344b, this.f53343a));
        }
        return nm0.y.f85009a;
    }
}
