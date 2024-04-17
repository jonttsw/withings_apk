package com.withings.wiscale2.activity.workout.ui.map;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.workout.category.model.WorkoutCategory;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class j extends w implements ym0.a<WorkoutCategory> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutMapActivity.j f49882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WorkoutMapActivity.j jVar) {
        super(0);
        this.f49882a = jVar;
    }

    @Override // ym0.a
    public final WorkoutCategory invoke() {
        WorkoutMapActivity.j jVar = this.f49882a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(WorkoutCategory.class);
        Activity activity = jVar.f49870b;
        if (isAssignableFrom) {
            return (WorkoutCategory) b0.F(activity, "extra_category");
        }
        if (Serializable.class.isAssignableFrom(WorkoutCategory.class)) {
            return (WorkoutCategory) b0.H(activity, "extra_category");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_category of class ", q0.b(WorkoutCategory.class), " is not supported"));
    }
}
