package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.location.model.GpsLocation;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public final class i4 extends kotlin.jvm.internal.w implements ym0.l<List<GpsLocation>, LiveData<String>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j4 f49236a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(j4 j4Var) {
        super(1);
        this.f49236a = j4Var;
    }

    @Override // ym0.l
    public final LiveData<String> invoke(List<GpsLocation> list) {
        List<GpsLocation> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        return androidx.lifecycle.h.a(Dispatchers.getDefault(), new h4(it, this.f49236a, null), 2);
    }
}
