package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddMedicinesScreen.kt */
/* loaded from: classes4.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.c, nm0.y> f41635a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f41636b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(k1.r0 r0Var, ym0.l lVar) {
        super(1);
        this.f41635a = lVar;
        this.f41636b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        if (!dp0.j.D(it)) {
            this.f41635a.invoke(new fx.c(it, 0L, null, 6));
            this.f41636b.setValue("");
        }
        return nm0.y.f85009a;
    }
}
