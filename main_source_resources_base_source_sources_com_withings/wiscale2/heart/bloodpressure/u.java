package com.withings.wiscale2.heart.bloodpressure;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BloodPressureMeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity$BloodPressureMeasureListViewModel", f = "BloodPressureMeasureListActivity.kt", l = {ConstantsWs.WS_STATUS_SHARINGGETERROR, ConstantsWs.WS_STATUS_WRONGASSOCID, 250}, m = "getMeasuresGroups")
/* loaded from: classes5.dex */
public final class u extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f57452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.a f57453b;

    /* renamed from: c  reason: collision with root package name */
    int f57454c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(BloodPressureMeasureListActivity.a aVar, qm0.d<? super u> dVar) {
        super(dVar);
        this.f57453b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f57452a = obj;
        this.f57454c |= Integer.MIN_VALUE;
        return BloodPressureMeasureListActivity.a.g0(this.f57453b, this);
    }
}
