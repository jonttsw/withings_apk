package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddMedicinesScreen.kt */
/* loaded from: classes4.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.c, nm0.y> f40716a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f40717b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1.r0 r0Var, ym0.l lVar) {
        super(0);
        this.f40716a = lVar;
        this.f40717b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k1.r0<String> r0Var = this.f40717b;
        if (!dp0.j.D(r0Var.getValue())) {
            this.f40716a.invoke(new fx.c(r0Var.getValue(), 0L, null, 6));
            r0Var.setValue("");
        }
        return nm0.y.f85009a;
    }
}
