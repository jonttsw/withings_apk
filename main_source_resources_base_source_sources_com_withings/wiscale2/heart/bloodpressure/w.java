package com.withings.wiscale2.heart.bloodpressure;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import hj0.a;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BloodPressureMeasureListActivity.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<a.C1035a>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.a f57458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(BloodPressureMeasureListActivity.a aVar) {
        super(1);
        this.f57458a = aVar;
    }

    @Override // ym0.l
    public final LiveData<List<a.C1035a>> invoke(Boolean bool) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new v(this.f57458a, null), 2);
    }
}
