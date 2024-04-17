package com.withings.scalesmodes.ui;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ScalesModeActivity.kt */
/* loaded from: classes4.dex */
final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScalesModeActivity f43931a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ScalesModeActivity scalesModeActivity) {
        super(2);
        this.f43931a = scalesModeActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-1322347680);
            ScalesModeActivity scalesModeActivity = this.f43931a;
            boolean K = aVar2.K(scalesModeActivity);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new d(scalesModeActivity);
                aVar2.n(t11);
            }
            aVar2.J();
            j.c((ym0.a) t11, null, aVar2, 0, 2);
        }
        return y.f85009a;
    }
}
