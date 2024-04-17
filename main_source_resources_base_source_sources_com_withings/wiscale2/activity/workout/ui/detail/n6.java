package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class n6 extends kotlin.jvm.internal.w implements ym0.l<MeasuresGroup, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f49490a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ iy.e f49491b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f49492c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(Context context, iy.e eVar, User user) {
        super(1);
        this.f49490a = context;
        this.f49491b = eVar;
        this.f49492c = user;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(MeasuresGroup measuresGroup) {
        MeasuresGroup measuresGroup2 = measuresGroup;
        if (measuresGroup2 != null) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new p6(measuresGroup2, this.f49492c, this.f49491b, this.f49490a, null), 2);
        }
        return xw.d.a(null);
    }
}
