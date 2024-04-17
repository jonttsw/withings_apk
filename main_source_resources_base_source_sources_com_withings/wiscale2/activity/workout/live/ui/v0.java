package com.withings.wiscale2.activity.workout.live.ui;

import androidx.lifecycle.LiveData;
import com.withings.liveworkout.model.LiveWorkout;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<LiveWorkout>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var) {
        super(1);
        this.f48942a = z0Var;
    }

    @Override // ym0.l
    public final LiveData<LiveWorkout> invoke(Boolean bool) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new u0(bool, this.f48942a, null), 2);
    }
}
