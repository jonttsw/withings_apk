package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Intent;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
/* compiled from: SleepDisorderActivity.kt */
/* loaded from: classes5.dex */
final class j extends kotlin.jvm.internal.w implements ym0.p<Integer, Intent, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity f61348a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SleepDisorderActivity sleepDisorderActivity) {
        super(2);
        this.f61348a = sleepDisorderActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, Intent intent) {
        int intValue = num.intValue();
        Intent intent2 = intent;
        kotlin.jvm.internal.u.j(intent2, "intent");
        SleepDisorderActivity.a aVar = SleepDisorderActivity.f61233p;
        SleepDisorderActivity sleepDisorderActivity = this.f61348a;
        sleepDisorderActivity.setResult(intValue, intent2);
        sleepDisorderActivity.finish();
        return nm0.y.f85009a;
    }
}
