package com.withings.wiscale2.heart.bloodpressure;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.user.User;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import org.joda.time.DateTime;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class b0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity f57351a;

    public b0(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        this.f57351a = bloodPressureMeasureListActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        BloodPressureMeasureListActivity bloodPressureMeasureListActivity = this.f57351a;
        User H3 = BloodPressureMeasureListActivity.H3(bloodPressureMeasureListActivity);
        DateTime D3 = BloodPressureMeasureListActivity.D3(bloodPressureMeasureListActivity);
        fy.l lVar = bloodPressureMeasureListActivity.f57310k;
        if (lVar != null) {
            fy.n nVar = bloodPressureMeasureListActivity.f57311l;
            if (nVar != null) {
                return new BloodPressureMeasureListActivity.a(H3, D3, bloodPressureMeasureListActivity, lVar, nVar, BloodPressureMeasureListActivity.F3(bloodPressureMeasureListActivity));
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypes");
            throw null;
        }
        kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesBetween");
        throw null;
    }
}
