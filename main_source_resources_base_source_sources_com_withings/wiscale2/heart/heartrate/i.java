package com.withings.wiscale2.heart.heartrate;

import com.withings.views.widget.LineCellView;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity f57661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        super(1);
        this.f57661a = heartRateAwakeAverageActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        fm.b bVar;
        String str2 = str;
        bVar = this.f57661a.f57489f;
        if (bVar != null) {
            ((LineCellView) bVar.f67702e).setValue(str2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }
}
