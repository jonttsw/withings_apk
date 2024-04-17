package com.withings.overview.ui;

import androidx.activity.result.ActivityResult;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.weight.list.WeightListActivity;
import kotlin.jvm.internal.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WithingsActivity f43354b;

    public /* synthetic */ b(WithingsActivity withingsActivity, int i11) {
        this.f43353a = i11;
        this.f43354b = withingsActivity;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f43353a;
        WithingsActivity withingsActivity = this.f43354b;
        switch (i11) {
            case 0:
                StartTrackingActivity this$0 = (StartTrackingActivity) withingsActivity;
                ActivityResult activityResult = (ActivityResult) obj;
                int i12 = StartTrackingActivity.f43343h;
                u.j(this$0, "this$0");
                this$0.finish();
                return;
            default:
                WeightListActivity this$02 = (WeightListActivity) withingsActivity;
                int i13 = WeightListActivity.f62901n;
                u.j(this$02, "this$0");
                this$02.setResult(((ActivityResult) obj).b());
                return;
        }
    }
}
