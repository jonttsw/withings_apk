package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.wiscale2.activity.workout.model.WorkoutLocationsLiveData;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements androidx.lifecycle.l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38350a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f38351b;

    public /* synthetic */ w1(androidx.lifecycle.j0 j0Var, int i11) {
        this.f38350a = i11;
        this.f38351b = j0Var;
    }

    @Override // androidx.lifecycle.l0
    public final void onChanged(Object obj) {
        int i11 = this.f38350a;
        androidx.lifecycle.j0 j0Var = this.f38351b;
        switch (i11) {
            case 0:
                a2 this$0 = (a2) j0Var;
                HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) obj;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (heartSignalMeasurement != null) {
                    this$0.setValue(heartSignalMeasurement);
                    return;
                }
                return;
            default:
                WorkoutLocationsLiveData.observer$lambda$0((WorkoutLocationsLiveData) j0Var, (nm0.o) obj);
                return;
        }
    }
}
