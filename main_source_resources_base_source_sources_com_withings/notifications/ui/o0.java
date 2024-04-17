package com.withings.notifications.ui;

import k1.o1;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.l<d2.u0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Float> f42983a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o1<Float> o1Var) {
        super(1);
        this.f42983a = o1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(d2.u0 u0Var) {
        d2.u0 graphicsLayer = u0Var;
        kotlin.jvm.internal.u.j(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.r(this.f42983a.getValue().floatValue());
        return nm0.y.f85009a;
    }
}
