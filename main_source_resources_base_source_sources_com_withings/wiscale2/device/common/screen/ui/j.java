package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53354b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<nm0.j<sc0.b, List<b.a>>> f53355c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ScreenSelectionActivity screenSelectionActivity, sc0.b bVar, k1.r0<nm0.j<sc0.b, List<b.a>>> r0Var) {
        super(0);
        this.f53353a = screenSelectionActivity;
        this.f53354b = bVar;
        this.f53355c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ScreenSelectionActivity.D3(this.f53353a).X0(this.f53354b);
        this.f53355c.setValue(null);
        return nm0.y.f85009a;
    }
}
