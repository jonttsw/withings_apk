package com.withings.authentication;

import androidx.activity.result.ActivityResult;
import com.withings.android.activity.WithingsActivity;
import com.withings.details.height.HeightActivity;
import com.withings.wiscale2.vascularage.VascularAgeActivityV1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WithingsActivity f31446b;

    public /* synthetic */ b(WithingsActivity withingsActivity, int i11) {
        this.f31445a = i11;
        this.f31446b = withingsActivity;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f31445a;
        WithingsActivity withingsActivity = this.f31446b;
        switch (i11) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                AuthenticationActivity.A3((AuthenticationActivity) withingsActivity);
                return;
            case 1:
                HeightActivity.z3((HeightActivity) withingsActivity, (ActivityResult) obj);
                return;
            default:
                VascularAgeActivityV1 this$0 = (VascularAgeActivityV1) withingsActivity;
                int i12 = VascularAgeActivityV1.f62203q;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (((ActivityResult) obj).b() != -1) {
                    this$0.finish();
                    return;
                }
                return;
        }
    }
}
