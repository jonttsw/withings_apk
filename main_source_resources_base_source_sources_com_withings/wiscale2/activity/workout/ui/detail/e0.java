package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49167a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GpsLocation f49168b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f49169c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ListGpsPointActivity listGpsPointActivity, GpsLocation gpsLocation, int i11) {
        super(2);
        this.f49167a = listGpsPointActivity;
        this.f49168b = gpsLocation;
        this.f49169c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f49169c | 1);
        ListGpsPointActivity.z3(this.f49167a, this.f49168b, aVar, g11);
        return nm0.y.f85009a;
    }
}
