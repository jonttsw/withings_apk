package com.withings.wiscale2.device.common.feature.ecg;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class ba implements androidx.lifecycle.l0<h5> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<h5> f51223a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51224b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(androidx.lifecycle.j0 j0Var, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        this.f51223a = j0Var;
        this.f51224b = wBS08EcgActivationActivity;
    }

    @Override // androidx.lifecycle.l0
    public final void onChanged(h5 h5Var) {
        WBS08EcgActivationViewModel R3;
        h5 value = h5Var;
        kotlin.jvm.internal.u.j(value, "value");
        this.f51223a.removeObserver(this);
        R3 = this.f51224b.R3();
        R3.getClass();
        if (value.a()) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(R3), Dispatchers.getIO(), null, new ob(R3, null), 2, null);
        } else {
            WBS08EcgActivationViewModel.q1(R3, C1987R.string.wbs08Rx_ecgErrorFeatureTags_title, C1987R.string.wbs08Rx_ecgErrorFeatureTags_paragraph, 4);
        }
    }
}
