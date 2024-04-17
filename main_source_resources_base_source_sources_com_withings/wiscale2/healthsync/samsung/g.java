package com.withings.wiscale2.healthsync.samsung;

import com.samsung.android.sdk.healthdata.HealthDataResolver;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportMeasureToSamsung.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker$update$2", f = "ExportMeasureToSamsung.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, ConstantsWs.MEASURE_TYPE_VASCULAR_AGE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class g extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    HealthDataResolver f56987a;

    /* renamed from: b  reason: collision with root package name */
    y10.a f56988b;

    /* renamed from: c  reason: collision with root package name */
    InsertMeasureToSamsungWorker f56989c;

    /* renamed from: d  reason: collision with root package name */
    Iterator f56990d;

    /* renamed from: e  reason: collision with root package name */
    int f56991e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ InsertMeasureToSamsungWorker f56992f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ y10.a f56993g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Partner f56994h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ List<jg0.a> f56995i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InsertMeasureToSamsungWorker insertMeasureToSamsungWorker, y10.a aVar, Partner partner, List<jg0.a> list, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f56992f = insertMeasureToSamsungWorker;
        this.f56993g = aVar;
        this.f56994h = partner;
        this.f56995i = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f56992f, this.f56993g, this.f56994h, this.f56995i, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d6 -> B:22:0x0060). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r11.f56991e
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r2 = r11.f56992f
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            java.util.Iterator r1 = r11.f56990d
            com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker r2 = r11.f56989c
            y10.a r4 = r11.f56988b
            com.samsung.android.sdk.healthdata.HealthDataResolver r5 = r11.f56987a
            nm0.l.b(r12)     // Catch: java.lang.Exception -> L1a
            goto L60
        L1a:
            r12 = move-exception
            goto Ld6
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            nm0.l.b(r12)
            goto L39
        L29:
            nm0.l.b(r12)
            android.content.Context r12 = r2.getContext()
            r11.f56991e = r4
            java.lang.Object r12 = y10.d.e(r12, r11)
            if (r12 != r0) goto L39
            return r0
        L39:
            com.samsung.android.sdk.healthdata.HealthDataStore r12 = (com.samsung.android.sdk.healthdata.HealthDataStore) r12
            y10.a r1 = r11.f56993g
            java.util.List r4 = r1.q()
            boolean r4 = y10.d.d(r12, r4)
            if (r4 == 0) goto Lda
            com.withings.partner.model.Partner r4 = r11.f56994h
            boolean r4 = r1.i(r4)
            if (r4 == 0) goto Lda
            com.samsung.android.sdk.healthdata.HealthDataResolver r4 = new com.samsung.android.sdk.healthdata.HealthDataResolver
            r5 = 0
            r4.<init>(r12, r5)
            java.util.List<jg0.a> r12 = r11.f56995i
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r5 = r4
            r4 = r1
            r1 = r12
        L60:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto Lda
            java.lang.Object r12 = r1.next()
            jg0.a r12 = (jg0.a) r12
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder r6 = new com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder
            r6.<init>()
            java.lang.String r7 = r4.a()
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder r6 = r6.setDataType(r7)
            java.lang.String r7 = "-Withings-"
            java.util.List r7 = kotlin.collections.x.V(r7)
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder r6 = r6.setSourceDevices(r7)
            long r7 = r12.b()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.String r7 = "start_time"
            com.samsung.android.sdk.healthdata.HealthDataResolver$Filter r7 = com.samsung.android.sdk.healthdata.HealthDataResolver.Filter.eq(r7, r9)
            long r8 = r12.b()
            java.util.TimeZone r10 = java.util.TimeZone.getDefault()
            int r8 = r10.getOffset(r8)
            long r8 = (long) r8
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            java.lang.String r8 = "time_offset"
            com.samsung.android.sdk.healthdata.HealthDataResolver$Filter r8 = com.samsung.android.sdk.healthdata.HealthDataResolver.Filter.eq(r8, r10)
            com.samsung.android.sdk.healthdata.HealthDataResolver$Filter[] r8 = new com.samsung.android.sdk.healthdata.HealthDataResolver.Filter[]{r8}
            com.samsung.android.sdk.healthdata.HealthDataResolver$Filter r7 = com.samsung.android.sdk.healthdata.HealthDataResolver.Filter.and(r7, r8)
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder r6 = r6.setFilter(r7)
            com.samsung.android.sdk.healthdata.HealthData r12 = com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker.D(r2, r12, r4)
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest$Builder r12 = r6.setHealthData(r12)
            com.samsung.android.sdk.healthdata.HealthDataResolver$UpdateRequest r12 = r12.build()
            kotlin.jvm.internal.u.g(r12)     // Catch: java.lang.Exception -> L1a
            r11.f56987a = r5     // Catch: java.lang.Exception -> L1a
            r11.f56988b = r4     // Catch: java.lang.Exception -> L1a
            r11.f56989c = r2     // Catch: java.lang.Exception -> L1a
            r11.f56990d = r1     // Catch: java.lang.Exception -> L1a
            r11.f56991e = r3     // Catch: java.lang.Exception -> L1a
            java.lang.Object r12 = y10.d.c(r5, r12, r11)     // Catch: java.lang.Exception -> L1a
            if (r12 != r0) goto L60
            return r0
        Ld6:
            r12.printStackTrace()
            goto L60
        Lda:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
