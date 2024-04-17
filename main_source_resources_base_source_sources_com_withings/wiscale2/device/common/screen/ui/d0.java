package com.withings.wiscale2.device.common.screen.ui;

import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53280a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ sc0.b f53281b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(sc0.b bVar, ym0.l lVar) {
        super(0);
        this.f53280a = lVar;
        this.f53281b = bVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ym0.l<Integer, nm0.y> lVar = this.f53280a;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(((b.InterfaceC1611b.C1612b) this.f53281b.d()).a()));
        }
        return nm0.y.f85009a;
    }
}
