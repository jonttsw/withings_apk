package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f61536a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f61537b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, k0 k0Var) {
        super(0);
        this.f61536a = k0Var;
        this.f61537b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        k0 k0Var = this.f61536a;
        String string = k0Var.getString(C1987R.string.sleepScore_learnMoreUrl);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        k0Var.startActivity(aVar.c(this.f61537b, "", string));
        return nm0.y.f85009a;
    }
}
