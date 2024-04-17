package com.withings.wiscale2.device.common.screen.ui;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53438a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53439b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sc0.b bVar, ym0.l lVar) {
        super(3);
        this.f53438a = lVar;
        this.f53439b = bVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(a0Var, "$this$null");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            wp.d.e(0, 0, aVar2, new t(this.f53439b, this.f53438a));
        }
        return nm0.y.f85009a;
    }
}
