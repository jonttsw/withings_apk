package com.withings.survey.ui;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.l1 f44363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f44364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.ui.platform.l1 l1Var, k1.r0<String> r0Var) {
        super(2);
        this.f44363a = l1Var;
        this.f44364b = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, "Paste", null, false, null, null, false, new j(this.f44363a, this.f44364b), aVar2, 48, 125);
        }
        return nm0.y.f85009a;
    }
}
