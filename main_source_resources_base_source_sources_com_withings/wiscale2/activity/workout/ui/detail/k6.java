package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.vo2max.b;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class k6 extends kotlin.jvm.internal.w implements ym0.l<MeasuresGroup, x5> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Track f49379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f49380b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49381c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(Track track, boolean z5, Context context) {
        super(1);
        this.f49379a = track;
        this.f49380b = z5;
        this.f49381c = context;
    }

    @Override // ym0.l
    public final x5 invoke(MeasuresGroup measuresGroup) {
        Double d11;
        Measure measureForType;
        MeasuresGroup measuresGroup2 = measuresGroup;
        if (measuresGroup2 != null && (measureForType = measuresGroup2.getMeasureForType(123)) != null) {
            d11 = Double.valueOf(measureForType.f95794y);
        } else {
            d11 = null;
        }
        Track track = this.f49379a;
        if (track == null || !this.f49380b) {
            return null;
        }
        if (d11 != null && d11.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return new p1(b.a.a(track, this.f49381c));
    }
}
