package com.withings.wiscale2.device.common.screen.ui;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53312a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(sc0.b bVar, ym0.l lVar) {
        super(3);
        this.f53312a = lVar;
        this.f53313b = bVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(cVar, "$this$null");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            wp.d.a(new f1(this.f53313b, this.f53312a), aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
