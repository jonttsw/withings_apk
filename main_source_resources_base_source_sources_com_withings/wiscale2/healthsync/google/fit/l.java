package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataType;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureImportWorker.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$importMeasures$2", f = "MeasureImportWorker.kt", l = {108, 121, 121, 123, ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f56464a;

    /* renamed from: b  reason: collision with root package name */
    int f56465b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f56466c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MeasureImportWorker f56467d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f56468e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DataType f56469f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ GoogleSignInAccount f56470g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasureImportWorker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker$importMeasures$2$localMeasures$1", f = "MeasureImportWorker.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super List<? extends ky.d>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasureImportWorker f56472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DateTime f56474d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DateTime f56475e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MeasureImportWorker measureImportWorker, int i11, DateTime dateTime, DateTime dateTime2, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f56472b = measureImportWorker;
            this.f56473c = i11;
            this.f56474d = dateTime;
            this.f56475e = dateTime2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f56472b, this.f56473c, this.f56474d, this.f56475e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends ky.d>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            iy.e eVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56471a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
            MeasureImportWorker measureImportWorker = this.f56472b;
            eVar = measureImportWorker.f56362f;
            long q11 = MeasureImportWorker.B(measureImportWorker).q();
            Long l5 = new Long(this.f56474d.getMillis());
            Long l6 = new Long(this.f56475e.getMillis());
            this.f56471a = 1;
            Object b10 = iy.e.b(eVar, q11, this.f56473c, l5, l6, null, false, false, false, this, ConstantsWs.BLINDCODE_WIFI_HW_HS);
            if (b10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, GoogleSignInAccount googleSignInAccount, DataType dataType, MeasureImportWorker measureImportWorker, qm0.d dVar) {
        super(2, dVar);
        this.f56467d = measureImportWorker;
        this.f56468e = i11;
        this.f56469f = dataType;
        this.f56470g = googleSignInAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        DataType dataType = this.f56469f;
        l lVar = new l(this.f56468e, this.f56470g, dataType, this.f56467d, dVar);
        lVar.f56466c = obj;
        return lVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0031, B:43:0x0130, B:45:0x0134, B:47:0x0146, B:49:0x0155, B:51:0x015b, B:54:0x016e, B:55:0x017d, B:56:0x0182, B:57:0x0183, B:58:0x0186, B:18:0x0048, B:38:0x0116, B:40:0x0123, B:21:0x0058, B:35:0x0102, B:31:0x00c4), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0031, B:43:0x0130, B:45:0x0134, B:47:0x0146, B:49:0x0155, B:51:0x015b, B:54:0x016e, B:55:0x017d, B:56:0x0182, B:57:0x0183, B:58:0x0186, B:18:0x0048, B:38:0x0116, B:40:0x0123, B:21:0x0058, B:35:0x0102, B:31:0x00c4), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:13:0x0031, B:43:0x0130, B:45:0x0134, B:47:0x0146, B:49:0x0155, B:51:0x015b, B:54:0x016e, B:55:0x017d, B:56:0x0182, B:57:0x0183, B:58:0x0186, B:18:0x0048, B:38:0x0116, B:40:0x0123, B:21:0x0058, B:35:0x0102, B:31:0x00c4), top: B:67:0x0010 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
