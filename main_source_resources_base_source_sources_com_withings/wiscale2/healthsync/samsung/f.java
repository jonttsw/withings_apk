package com.withings.wiscale2.healthsync.samsung;

import com.withings.wiscale2.spo2.n;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportMeasureToSamsung.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$loadMeasureToExport$2", f = "ExportMeasureToSamsung.kt", l = {256}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f extends i implements p<CoroutineScope, qm0.d<? super List<? extends jg0.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Iterator f56978a;

    /* renamed from: b  reason: collision with root package name */
    n f56979b;

    /* renamed from: c  reason: collision with root package name */
    n f56980c;

    /* renamed from: d  reason: collision with root package name */
    int f56981d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f56982e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long[] f56983f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToSamsungWorker f56984g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExportMeasureToSamsung.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$loadMeasureToExport$2$1$1", f = "ExportMeasureToSamsung.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends i implements p<CoroutineScope, qm0.d<? super ky.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InsertMeasureToSamsungWorker f56985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f56986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, long j5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f56985a = insertMeasureToSamsungWorker;
            this.f56986b = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f56985a, this.f56986b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super ky.d> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            iy.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            cVar = this.f56985a.f56898f;
            return cVar.d(this.f56986b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long[] jArr, InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f56983f = jArr;
        this.f56984g = insertMeasureToSamsungWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        f fVar = new f(this.f56983f, this.f56984g, dVar);
        fVar.f56982e = obj;
        return fVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends jg0.a>> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0087 -> B:17:0x008a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
