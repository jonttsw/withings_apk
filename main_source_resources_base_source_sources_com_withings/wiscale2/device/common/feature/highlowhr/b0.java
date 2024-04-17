package com.withings.wiscale2.device.common.feature.highlowhr;

import android.view.View;
import androidx.lifecycle.h1;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0 f52256b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(HighLowHRSettingsActivity highLowHRSettingsActivity, n0 n0Var) {
        super(1);
        this.f52255a = highLowHRSettingsActivity;
        this.f52256b = n0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        a L3;
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        L3 = this.f52255a.L3();
        int i11 = this.f52256b.f76254a;
        L3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(L3), Dispatchers.getIO(), null, new e(L3, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX, i11, null), 2, null);
        return nm0.y.f85009a;
    }
}
