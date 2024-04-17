package com.withings.wiscale2.healthsync.samsung;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportMeasureToSamsung.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "getLastSyncedData")
/* loaded from: classes5.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    InsertMeasureToSamsungWorker f56961a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f56962b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToSamsungWorker f56963c;

    /* renamed from: d  reason: collision with root package name */
    int f56964d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, qm0.d<? super c> dVar) {
        super(dVar);
        this.f56963c = insertMeasureToSamsungWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56962b = obj;
        this.f56964d |= Integer.MIN_VALUE;
        return InsertMeasureToSamsungWorker.z(this.f56963c, null, null, this);
    }
}
