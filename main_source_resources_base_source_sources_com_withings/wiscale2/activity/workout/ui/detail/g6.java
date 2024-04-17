package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class g6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<Boolean> f49203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f49204b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context, LiveData liveData) {
        super(1);
        this.f49203a = liveData;
        this.f49204b = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            return androidx.lifecycle.e1.b(this.f49203a, new f6(this.f49204b));
        }
        return xw.d.a(null);
    }
}
