package com.withings.wiscale2.activity.workout.category.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class n extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseWorkoutCategoryActivity.d f48707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ChooseWorkoutCategoryActivity.d dVar) {
        super(0);
        this.f48707a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        ChooseWorkoutCategoryActivity.d dVar = this.f48707a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = dVar.f48666b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "show_type_workout_launch");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "show_type_workout_launch");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra show_type_workout_launch of class ", q0.b(Boolean.class), " is not supported"));
    }
}
