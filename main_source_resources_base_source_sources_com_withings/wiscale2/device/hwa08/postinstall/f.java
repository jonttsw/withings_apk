package com.withings.wiscale2.device.hwa08.postinstall;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class f implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity f54460a;

    public f(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        this.f54460a = hwa08PostInstallActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Hwa08PostInstallActivity hwa08PostInstallActivity = this.f54460a;
        User F3 = Hwa08PostInstallActivity.F3(hwa08PostInstallActivity);
        Device C3 = Hwa08PostInstallActivity.C3(hwa08PostInstallActivity);
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        ej.w w11 = ej.w.w();
        kotlin.jvm.internal.u.i(w11, "get(...)");
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        bx.a aVar = hwa08PostInstallActivity.f54414m;
        if (aVar != null) {
            return new c0(F3, C3, workoutManager, w11, c11, aVar, hwa08PostInstallActivity.getIntent().getBooleanExtra("only_ecg_informations", false), Hwa08PostInstallActivity.B3(hwa08PostInstallActivity));
        }
        kotlin.jvm.internal.u.s("sharedLiveWorkoutInfo");
        throw null;
    }
}
