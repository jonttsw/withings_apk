package com.withings.wiscale2.healthsync.samsung;

import androidx.work.o;
import com.withings.partner.model.Partner;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.p0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: SHealthWorker.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.SHealthWorker$doWork$2", f = "SHealthWorker.kt", l = {34, 37}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    p0 f56996a;

    /* renamed from: b  reason: collision with root package name */
    SHealthWorker f56997b;

    /* renamed from: c  reason: collision with root package name */
    Partner f56998c;

    /* renamed from: d  reason: collision with root package name */
    p0 f56999d;

    /* renamed from: e  reason: collision with root package name */
    long f57000e;

    /* renamed from: f  reason: collision with root package name */
    int f57001f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SHealthWorker f57002g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SHealthWorker sHealthWorker, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f57002g = sHealthWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f57002g, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.o$a$c, T] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
