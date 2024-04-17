package com.withings.cycletracking.ui;

import androidx.activity.result.ActivityResult;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35519a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WithingsActivity f35520b;

    public /* synthetic */ d(WithingsActivity withingsActivity, int i11) {
        this.f35519a = i11;
        this.f35520b = withingsActivity;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f35519a;
        WithingsActivity withingsActivity = this.f35520b;
        switch (i11) {
            case 0:
                CycleTrackingActivity this$0 = (CycleTrackingActivity) withingsActivity;
                fn0.k<Object>[] kVarArr = CycleTrackingActivity.f35469l;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (((ActivityResult) obj).b() == -1) {
                    this$0.finish();
                    return;
                }
                return;
            default:
                Wpa02CleansingModeActivity.z3((Wpa02CleansingModeActivity) withingsActivity, (ActivityResult) obj);
                return;
        }
    }
}
