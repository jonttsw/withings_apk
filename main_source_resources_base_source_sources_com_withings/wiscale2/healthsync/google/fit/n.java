package com.withings.wiscale2.healthsync.google.fit;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureImportWorker.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$saveGoogleFitData$2", f = "MeasureImportWorker.kt", l = {ConstantsWs.MEASURE_TYPE_NEPHRO, ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super nm0.k<? extends y>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MeasureImportWorker f56479a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f56480b;

    /* renamed from: c  reason: collision with root package name */
    List f56481c;

    /* renamed from: d  reason: collision with root package name */
    int f56482d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f56483e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ MeasureImportWorker f56484f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MeasureImportWorker measureImportWorker, List list, qm0.d dVar) {
        super(2, dVar);
        this.f56483e = list;
        this.f56484f = measureImportWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f56484f, this.f56483e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.k<? extends y>> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0016, B:29:0x00be, B:19:0x004c, B:21:0x0052, B:25:0x0075, B:30:0x00c4, B:14:0x002f, B:17:0x003c), top: B:38:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0016, B:29:0x00be, B:19:0x004c, B:21:0x0052, B:25:0x0075, B:30:0x00c4, B:14:0x002f, B:17:0x003c), top: B:38:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bc -> B:29:0x00be). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
