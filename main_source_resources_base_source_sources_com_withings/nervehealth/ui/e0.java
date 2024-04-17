package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42503a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f42504b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, c5 c5Var, int i11) {
        super(2);
        this.f42503a = nerveHealthMeasureListActivity;
        this.f42504b = c5Var;
        this.f42505c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42505c | 1);
        NerveHealthMeasureListActivity.z3(this.f42503a, this.f42504b, aVar, g11);
        return nm0.y.f85009a;
    }
}
