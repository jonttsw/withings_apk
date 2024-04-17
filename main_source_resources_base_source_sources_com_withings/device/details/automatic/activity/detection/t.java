package com.withings.device.details.automatic.activity.detection;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p<Long, Boolean, nm0.y> f36732a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f36733b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(ym0.p<? super Long, ? super Boolean, nm0.y> pVar, WorkoutCategory workoutCategory) {
        super(1);
        this.f36732a = pVar;
        this.f36733b = workoutCategory;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f36732a.invoke(Long.valueOf(this.f36733b.getId()), bool2);
        return nm0.y.f85009a;
    }
}
