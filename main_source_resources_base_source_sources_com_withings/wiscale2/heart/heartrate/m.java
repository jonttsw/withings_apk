package com.withings.wiscale2.heart.heartrate;

import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity f57695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        super(1);
        this.f57695a = heartRateAwakeAverageActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        HeartRateAwakeAverageActivity heartRateAwakeAverageActivity = this.f57695a;
        String string = heartRateAwakeAverageActivity.getString(C1987R.string._HELP_CENTER_);
        String string2 = heartRateAwakeAverageActivity.getString(C1987R.string.dailyHrDetail_learnMoreUrl);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        heartRateAwakeAverageActivity.startActivity(HMWebActivity.a.a(aVar, heartRateAwakeAverageActivity, "url", string, string2, 16));
        return nm0.y.f85009a;
    }
}
