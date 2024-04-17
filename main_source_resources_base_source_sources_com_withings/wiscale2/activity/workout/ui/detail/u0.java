package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.k1;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class u0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49662a;

    public u0(ListGpsPointActivity listGpsPointActivity) {
        this.f49662a = listGpsPointActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        return new ListGpsPointActivity.a(ListGpsPointActivity.B3(this.f49662a), new FilterGpsLocationWithPause());
    }
}
