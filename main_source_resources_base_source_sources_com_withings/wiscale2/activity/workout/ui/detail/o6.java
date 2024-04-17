package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class o6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<MeasuresGroup> f49513a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f49514b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ iy.e f49515c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f49516d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(androidx.lifecycle.j0 j0Var, Context context, iy.e eVar, User user) {
        super(1);
        this.f49513a = j0Var;
        this.f49514b = context;
        this.f49515c = eVar;
        this.f49516d = user;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(Boolean bool) {
        if (bool.booleanValue()) {
            return androidx.lifecycle.e1.c(this.f49513a, new n6(this.f49514b, this.f49515c, this.f49516d));
        }
        return xw.d.a(null);
    }
}
