package com.withings.wiscale2.heart.heartrate;

import android.widget.TextView;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class j extends kotlin.jvm.internal.w implements ym0.l<nm0.o<? extends String, ? extends String, ? extends String>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity f57673a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        super(1);
        this.f57673a = heartRateAwakeAverageActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.o<? extends String, ? extends String, ? extends String> oVar) {
        fm.b bVar;
        nm0.o<? extends String, ? extends String, ? extends String> oVar2 = oVar;
        String c11 = oVar2.c();
        HeartRateAwakeAverageActivity heartRateAwakeAverageActivity = this.f57673a;
        heartRateAwakeAverageActivity.B3(oVar2.a(), oVar2.b());
        bVar = heartRateAwakeAverageActivity.f57489f;
        if (bVar != null) {
            ((TextView) bVar.f67703f).setText(c11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }
}
