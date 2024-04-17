package com.withings.wiscale2.device.common.screen.ui;

import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53379b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<nm0.j<sc0.b, b.a>> f53380c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ScreenSelectionActivity screenSelectionActivity, sc0.b bVar, k1.r0<nm0.j<sc0.b, b.a>> r0Var) {
        super(0);
        this.f53378a = screenSelectionActivity;
        this.f53379b = bVar;
        this.f53380c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ScreenSelectionActivity.D3(this.f53378a).X0(this.f53379b);
        this.f53380c.setValue(null);
        return nm0.y.f85009a;
    }
}
