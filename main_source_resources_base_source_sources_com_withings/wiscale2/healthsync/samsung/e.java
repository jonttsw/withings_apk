package com.withings.wiscale2.healthsync.samsung;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportMeasureToSamsung.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker", f = "ExportMeasureToSamsung.kt", l = {119}, m = "insertChunk")
/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    InsertMeasureToSamsungWorker f56974a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f56975b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToSamsungWorker f56976c;

    /* renamed from: d  reason: collision with root package name */
    int f56977d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, qm0.d<? super e> dVar) {
        super(dVar);
        this.f56976c = insertMeasureToSamsungWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56975b = obj;
        this.f56977d |= Integer.MIN_VALUE;
        return InsertMeasureToSamsungWorker.B(this.f56976c, null, null, null, this);
    }
}
