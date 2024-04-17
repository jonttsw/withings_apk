package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.wiscale2.C1987R;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f61217a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0 f61218b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, k0 k0Var) {
        super(2);
        this.f61217a = context;
        this.f61218b = k0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Context context = this.f61217a;
            String string = context.getString(C1987R.string.manualLogging_detailsViewLogSection_title);
            String string2 = context.getString(C1987R.string.manualLogging_detailsViewLogSection_btn);
            kotlin.jvm.internal.u.g(string2);
            k0 k0Var = this.f61218b;
            com.withings.common.compose.component.y3.e(string2, new o0(k0Var), string, s1.b.b(aVar2, -1024686211, new q0(k0Var)), aVar2, 3072, 0);
        }
        return nm0.y.f85009a;
    }
}
