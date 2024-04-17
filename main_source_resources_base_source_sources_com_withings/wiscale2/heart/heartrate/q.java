package com.withings.wiscale2.heart.heartrate;

import androidx.lifecycle.k1;
import com.withings.core.data.aggregate.ActivityAggregateManager;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class q implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateDayActivity f57717a;

    public q(HeartRateDayActivity heartRateDayActivity) {
        this.f57717a = heartRateDayActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        return new d0(this.f57717a.getUser(), ActivityAggregateManager.Companion.get());
    }
}
