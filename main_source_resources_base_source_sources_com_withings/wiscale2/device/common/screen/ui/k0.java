package com.withings.wiscale2.device.common.screen.ui;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ sc0.b f53372a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(sc0.b bVar, ym0.l<? super sc0.b, nm0.y> lVar) {
        super(3);
        this.f53372a = bVar;
        this.f53373b = lVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        ym0.l<sc0.b, nm0.y> lVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(cVar, "$this$null");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            sc0.b bVar = this.f53372a;
            if (bVar.c() != null && (lVar = this.f53373b) != null) {
                wp.d.d(0, 0, aVar2, new j0(bVar, lVar));
            }
        }
        return nm0.y.f85009a;
    }
}
