package com.withings.survey.ui;

import androidx.compose.runtime.a;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44380a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f44381b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ChooseInsightActivity chooseInsightActivity, k1.r0<String> r0Var) {
        super(2);
        this.f44380a = chooseInsightActivity;
        this.f44381b = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.r0<String> r0Var = this.f44381b;
            if (r0Var.getValue().length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5;
            aVar2.s(-1356854848);
            ChooseInsightActivity chooseInsightActivity = this.f44380a;
            boolean K = aVar2.K(chooseInsightActivity);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new l(chooseInsightActivity, r0Var);
                aVar2.n(t11);
            }
            aVar2.J();
            com.withings.common.compose.component.l.a(null, "Start", null, z11, null, null, false, (ym0.a) t11, aVar2, 48, 117);
        }
        return nm0.y.f85009a;
    }
}
