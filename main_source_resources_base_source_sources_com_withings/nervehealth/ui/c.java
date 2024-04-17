package com.withings.nervehealth.ui;

import androidx.activity.result.ActivityResult;
import com.withings.nutrisync.ui.VitaminCDatavizActivity;
import com.withings.weight.presentation.ui.WeightActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f42490a;

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        switch (this.f42490a) {
            case 0:
                fn0.k<Object>[] kVarArr = NerveHealthActivity.f42355u;
                return;
            case 1:
                int i11 = VitaminCDatavizActivity.f43204j;
                return;
            default:
                int i12 = WeightActivity.f47146n;
                activityResult.getClass();
                return;
        }
    }
}
