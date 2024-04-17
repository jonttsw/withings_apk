package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddMedicinesScreen.kt */
/* loaded from: classes4.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f41632a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k1.r0<String> r0Var) {
        super(1);
        this.f41632a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String newText = str;
        kotlin.jvm.internal.u.j(newText, "newText");
        this.f41632a.setValue(androidx.compose.ui.text.z.b(newText, new z2.d(kotlin.collections.l.a0(new z2.c[0]))));
        return nm0.y.f85009a;
    }
}
