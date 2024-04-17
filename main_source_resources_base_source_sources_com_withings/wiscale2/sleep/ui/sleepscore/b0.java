package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Bundle;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepActivity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.p<Integer, Bundle, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepActivity f60890a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SleepActivity sleepActivity) {
        super(2);
        this.f60890a = sleepActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, Bundle bundle) {
        num.intValue();
        SleepActivity sleepActivity = this.f60890a;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(sleepActivity), null, null, new a0(sleepActivity, null), 3, null);
        return nm0.y.f85009a;
    }
}
