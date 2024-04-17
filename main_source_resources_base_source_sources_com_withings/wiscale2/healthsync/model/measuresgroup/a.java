package com.withings.wiscale2.healthsync.model.measuresgroup;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeMeasureGroupsRequest.kt */
@e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker", f = "ExchangeMeasureGroupsRequest.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "getMeasuresGroupForDateBounds")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    Object f56865a;

    /* renamed from: b  reason: collision with root package name */
    PartnerCapabilities f56866b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56867c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExchangeMeasuresGroupWorker<Object, Object> f56868d;

    /* renamed from: e  reason: collision with root package name */
    int f56869e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExchangeMeasuresGroupWorker<Object, Object> exchangeMeasuresGroupWorker, d<? super a> dVar) {
        super(dVar);
        this.f56868d = exchangeMeasuresGroupWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable L;
        this.f56867c = obj;
        this.f56869e |= Integer.MIN_VALUE;
        L = this.f56868d.L(0, null, this);
        return L;
    }
}
