package com.withings.wiscale2.healthsync.model.measuresgroup;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeMeasureGroupsRequest.kt */
@e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker", f = "ExchangeMeasureGroupsRequest.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT}, m = "getSerializedMeasuresGroupToExport$suspendImpl")
/* loaded from: classes5.dex */
public final class b<PartnerType, ParentPartnerType> extends c {

    /* renamed from: a  reason: collision with root package name */
    ExchangeMeasuresGroupWorker f56870a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f56871b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56872c;

    /* renamed from: d  reason: collision with root package name */
    int f56873d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker, d<? super b> dVar) {
        super(dVar);
        this.f56872c = exchangeMeasuresGroupWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56871b = obj;
        this.f56873d |= Integer.MIN_VALUE;
        return ExchangeMeasuresGroupWorker.P(this.f56872c, null, false, this);
    }
}
