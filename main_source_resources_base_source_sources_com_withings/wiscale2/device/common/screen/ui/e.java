package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class e extends kotlin.jvm.internal.w implements ym0.p<sc0.b, List<? extends b.a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<nm0.j<sc0.b, List<b.a>>> f53284a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k1.r0<nm0.j<sc0.b, List<b.a>>> r0Var) {
        super(2);
        this.f53284a = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(sc0.b bVar, List<? extends b.a> list) {
        sc0.b uiScreen = bVar;
        List<? extends b.a> children = list;
        kotlin.jvm.internal.u.j(uiScreen, "uiScreen");
        kotlin.jvm.internal.u.j(children, "children");
        this.f53284a.setValue(new nm0.j<>(uiScreen, children));
        return nm0.y.f85009a;
    }
}
