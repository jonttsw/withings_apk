package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Intent;
import com.google.android.gms.maps.GoogleMap;
import com.huawei.hms.maps.HuaweiMap;
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
final class j7 extends kotlin.jvm.internal.w implements ym0.p<GoogleMap, HuaweiMap, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f49344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutPreview f49345b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Intent f49346c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m7 f49347d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f49348e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(Object obj, WorkoutPreview workoutPreview, Intent intent, m7 m7Var, long j5) {
        super(2);
        this.f49344a = obj;
        this.f49345b = workoutPreview;
        this.f49346c = intent;
        this.f49347d = m7Var;
        this.f49348e = j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.withings.workout.ui.GpsLocationMapView$b] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // ym0.p
    public final nm0.y invoke(GoogleMap googleMap, HuaweiMap huaweiMap) {
        ?? r42;
        Object obj = this.f49344a;
        if (obj != null) {
            r42 = new Object();
        } else {
            r42 = new Object();
        }
        WorkoutPreview workoutPreview = this.f49345b;
        WorkoutPreview.w(workoutPreview, r42, this.f49346c);
        WorkoutPreview.x(workoutPreview, this.f49347d, r42);
        if (obj == null) {
            WorkoutPreview.z(workoutPreview, this.f49348e);
        }
        return nm0.y.f85009a;
    }
}
