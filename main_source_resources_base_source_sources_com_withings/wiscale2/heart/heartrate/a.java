package com.withings.wiscale2.heart.heartrate;

import android.app.Application;
import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
public final class a extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final HRZonesAggregate f57534a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f57535b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.f f57536c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.f f57537d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0 f57538e;

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.AwakeAverageViewModel$headerLiveData$1", f = "HeartRateAwakeAverageActivity.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.heart.heartrate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0747a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<nm0.o<? extends String, ? extends String, ? extends String>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57539a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f57540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ jm.a f57541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f57542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f57543e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0747a(jm.a aVar, a aVar2, String str, qm0.d<? super C0747a> dVar) {
            super(2, dVar);
            this.f57541c = aVar;
            this.f57542d = aVar2;
            this.f57543e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            C0747a c0747a = new C0747a(this.f57541c, this.f57542d, this.f57543e, dVar);
            c0747a.f57540b = obj;
            return c0747a;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<nm0.o<? extends String, ? extends String, ? extends String>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((C0747a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57539a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                a aVar = this.f57542d;
                String f11 = this.f57541c.f(aVar.f57534a.b(), 28);
                String string = aVar.g0().getString(C1987R.string.heartRate_detail_avgHR_subtitle, this.f57543e, f11);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                nm0.o oVar = new nm0.o(aVar.g0().getString(C1987R.string.heartRate_detail_avgHR_title), f11, string);
                this.f57539a = 1;
                if (((androidx.lifecycle.h0) this.f57540b).emit(oVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.AwakeAverageViewModel$hrRangeLiveData$1", f = "HeartRateAwakeAverageActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<String>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57544a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f57545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ jm.a f57546c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f57547d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(jm.a aVar, a aVar2, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f57546c = aVar;
            this.f57547d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f57546c, this.f57547d, dVar);
            bVar.f57545b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<String> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57544a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                a aVar = this.f57547d;
                String format = String.format("%s - %s %s", Arrays.copyOf(new Object[]{new Integer(aVar.f57534a.f()), new Integer(aVar.f57534a.e()), this.f57546c.a(aVar.f57534a.f(), 28)}, 3));
                this.f57544a = 1;
                if (((androidx.lifecycle.h0) this.f57545b).emit(format, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application, jm.a measureFormatter, HRZonesAggregate hrZonesAggregate, String str) {
        super(application);
        kotlin.jvm.internal.u.j(measureFormatter, "measureFormatter");
        kotlin.jvm.internal.u.j(hrZonesAggregate, "hrZonesAggregate");
        this.f57534a = hrZonesAggregate;
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        this.f57535b = applicationContext;
        this.f57536c = androidx.lifecycle.h.a(null, new C0747a(measureFormatter, this, str, null), 3);
        this.f57537d = androidx.lifecycle.h.a(null, new b(measureFormatter, this, null), 3);
        this.f57538e = xw.d.a(kotlin.collections.x.W(new l1(HrZone.f57524a, hrZonesAggregate.h(), hrZonesAggregate.h() / hrZonesAggregate.i()), new l1(HrZone.f57525b, hrZonesAggregate.c(), hrZonesAggregate.c() / hrZonesAggregate.i()), new l1(HrZone.f57526c, hrZonesAggregate.g(), hrZonesAggregate.g() / hrZonesAggregate.i()), new l1(HrZone.f57527d, hrZonesAggregate.d(), hrZonesAggregate.d() / hrZonesAggregate.i())));
    }

    public final Context g0() {
        return this.f57535b;
    }

    public final androidx.lifecycle.f i0() {
        return this.f57536c;
    }

    public final androidx.lifecycle.f j0() {
        return this.f57537d;
    }

    public final androidx.lifecycle.k0 k0() {
        return this.f57538e;
    }
}
