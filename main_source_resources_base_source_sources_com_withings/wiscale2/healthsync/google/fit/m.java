package com.withings.wiscale2.healthsync.google.fit;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureImportWorker.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker", f = "MeasureImportWorker.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD}, m = "saveGoogleFitData-gIAlu-s")
/* loaded from: classes5.dex */
public final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f56476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasureImportWorker f56477b;

    /* renamed from: c  reason: collision with root package name */
    int f56478c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MeasureImportWorker measureImportWorker, qm0.d<? super m> dVar) {
        super(dVar);
        this.f56477b = measureImportWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56476a = obj;
        this.f56478c |= Integer.MIN_VALUE;
        Object D = MeasureImportWorker.D(this.f56477b, null, this);
        if (D == CoroutineSingletons.f76214a) {
            return D;
        }
        return nm0.k.a(D);
    }
}
