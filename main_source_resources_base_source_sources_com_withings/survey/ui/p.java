package com.withings.survey.ui;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44408a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ChooseInsightActivity chooseInsightActivity) {
        super(2);
        this.f44408a = chooseInsightActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            androidx.navigation.compose.s.b(c11, "selectionScreen", null, null, null, a.f44294a, b.f44297a, null, null, new o(c11, this.f44408a), aVar2, 1769528, 412);
        }
        return nm0.y.f85009a;
    }
}
