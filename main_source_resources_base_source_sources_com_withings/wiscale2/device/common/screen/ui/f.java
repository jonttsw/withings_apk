package com.withings.wiscale2.device.common.screen.ui;

import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class f extends kotlin.jvm.internal.w implements ym0.p<sc0.b, b.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<nm0.j<sc0.b, b.a>> f53290a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k1.r0<nm0.j<sc0.b, b.a>> r0Var) {
        super(2);
        this.f53290a = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(sc0.b bVar, b.a aVar) {
        sc0.b uiScreen = bVar;
        b.a parent = aVar;
        kotlin.jvm.internal.u.j(uiScreen, "uiScreen");
        kotlin.jvm.internal.u.j(parent, "parent");
        this.f53290a.setValue(new nm0.j<>(uiScreen, parent));
        return nm0.y.f85009a;
    }
}
