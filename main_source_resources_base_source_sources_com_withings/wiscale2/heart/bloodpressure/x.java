package com.withings.wiscale2.heart.bloodpressure;

import android.content.Intent;
import hj0.a;
import java.util.List;
/* compiled from: BloodPressureMeasureListActivity.kt */
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<List<? extends a.C1035a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity f57459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        super(1);
        this.f57459a = bloodPressureMeasureListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends a.C1035a> list) {
        int i11;
        Intent intent;
        List<? extends a.C1035a> list2 = list;
        if (list2 != null) {
            boolean isEmpty = list2.isEmpty();
            BloodPressureMeasureListActivity bloodPressureMeasureListActivity = this.f57459a;
            if (isEmpty) {
                i11 = bloodPressureMeasureListActivity.f57308i;
                intent = bloodPressureMeasureListActivity.f57309j;
                bloodPressureMeasureListActivity.setResult(i11, intent);
                bloodPressureMeasureListActivity.finish();
            } else {
                BloodPressureMeasureListActivity.I3(bloodPressureMeasureListActivity, list2);
            }
        }
        return nm0.y.f85009a;
    }
}
