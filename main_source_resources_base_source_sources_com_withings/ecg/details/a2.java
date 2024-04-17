package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementFixer;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class a2 extends androidx.lifecycle.j0<HeartSignalMeasurement> {

    /* renamed from: a  reason: collision with root package name */
    private LiveData<HeartSignalMeasurement> f38092a;

    /* renamed from: b  reason: collision with root package name */
    private final HeartSignalMeasurementFixer f38093b;

    /* renamed from: c  reason: collision with root package name */
    private final w1 f38094c;

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<HeartSignalMeasurement>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<HeartSignalMeasurement> invoke(HeartSignalMeasurement heartSignalMeasurement) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new z1(heartSignalMeasurement, a2.this, null), 2);
        }
    }

    public a2(LiveData heartSignalLiveData, sq.f fVar) {
        kotlin.jvm.internal.u.j(heartSignalLiveData, "heartSignalLiveData");
        this.f38092a = heartSignalLiveData;
        this.f38093b = fVar;
        w1 w1Var = new w1(this, 0);
        this.f38094c = w1Var;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(heartSignalLiveData, new y1(this));
        this.f38092a = c11;
        addSource(c11, w1Var);
    }

    public final void v(LiveData<HeartSignalMeasurement> heartSignalLiveData) {
        kotlin.jvm.internal.u.j(heartSignalLiveData, "heartSignalLiveData");
        removeSource(this.f38092a);
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(heartSignalLiveData, new a());
        this.f38092a = c11;
        addSource(c11, this.f38094c);
    }
}
