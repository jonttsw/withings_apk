package com.withings.wiscale2.healthsync.google.fit;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncMeasureWithFit.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$loadMeasureToExport$2", f = "SyncMeasureWithFit.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<? extends tf0.b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Collection f56451a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f56452b;

    /* renamed from: c  reason: collision with root package name */
    com.withings.wiscale2.spo2.n f56453c;

    /* renamed from: d  reason: collision with root package name */
    com.withings.wiscale2.spo2.n f56454d;

    /* renamed from: e  reason: collision with root package name */
    int f56455e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f56456f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long[] f56457g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToFitWorker f56458h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncMeasureWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertMeasureToFitWorker$loadMeasureToExport$2$1$1", f = "SyncMeasureWithFit.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super ky.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsertMeasureToFitWorker f56460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f56461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InsertMeasureToFitWorker insertMeasureToFitWorker, long j5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f56460b = insertMeasureToFitWorker;
            this.f56461c = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f56460b, this.f56461c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super ky.d> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56459a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                fy.j c11 = this.f56460b.f56305f.c();
                this.f56459a = 1;
                obj = c11.b(this.f56461c, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long[] jArr, InsertMeasureToFitWorker insertMeasureToFitWorker, qm0.d<? super i> dVar) {
        super(2, dVar);
        this.f56457g = jArr;
        this.f56458h = insertMeasureToFitWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        i iVar = new i(this.f56457g, this.f56458h, dVar);
        iVar.f56456f = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends tf0.b>> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f7 -> B:24:0x00fa). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
