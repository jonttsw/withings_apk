package com.withings.wiscale2.sleep.ui.sleepscore;
/* compiled from: ScoreWeeklyView.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScoreWeeklyView f61193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f61194b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f61195c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ScoreWeeklyView scoreWeeklyView, int i11, int i12) {
        super(2);
        this.f61193a = scoreWeeklyView;
        this.f61194b = i11;
        this.f61195c = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            long b10 = d2.h0.b(androidx.core.content.a.getColor(this.f61193a.getContext(), this.f61194b));
            int i11 = this.f61195c;
            com.withings.common.compose.component.k3.a(null, b10, i11 / 100.0f, String.valueOf(i11), null, true, false, aVar2, 196608, 81);
        }
        return nm0.y.f85009a;
    }
}
