package com.withings.wiscale2.device.wpm.ui;

import androidx.activity.result.ActivityResult;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f55736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WithingsActivity f55737b;

    public /* synthetic */ f(WithingsActivity withingsActivity, int i11) {
        this.f55736a = i11;
        this.f55737b = withingsActivity;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f55736a;
        WithingsActivity withingsActivity = this.f55737b;
        switch (i11) {
            case 0:
                Wpm0203Activity.z3((Wpm0203Activity) withingsActivity, (ActivityResult) obj);
                return;
            default:
                ActivityResult activityResult = (ActivityResult) obj;
                SleepActivity.z3((SleepActivity) withingsActivity);
                return;
        }
    }
}
