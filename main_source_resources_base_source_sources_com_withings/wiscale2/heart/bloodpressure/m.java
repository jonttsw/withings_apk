package com.withings.wiscale2.heart.bloodpressure;

import android.widget.LinearLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import tb0.x1;
/* compiled from: BloodPressureHistoryFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureHistoryFragment$loadAndShowData$1", f = "BloodPressureHistoryFragment.kt", l = {ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57435a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f57436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BloodPressureHistoryFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureHistoryFragment$loadAndShowData$1$measureList$1", f = "BloodPressureHistoryFragment.kt", l = {ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends MeasuresGroup>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f57438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57438b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57438b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends MeasuresGroup>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57437a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f57437a = 1;
                obj = k.y1(this.f57438b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f57436b = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f57436b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x1 C1;
        x1 C12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57435a;
        k kVar = this.f57436b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(kVar, null);
            this.f57435a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            k.A1(kVar, list);
            C12 = kVar.C1();
            LinearLayout scrollContent = C12.f99624o;
            kotlin.jvm.internal.u.i(scrollContent, "scrollContent");
            k.w1(kVar, scrollContent);
        } else {
            k.z1(kVar);
            C1 = kVar.C1();
            LinearLayout bpNoDataContainer = C1.f99614e;
            kotlin.jvm.internal.u.i(bpNoDataContainer, "bpNoDataContainer");
            k.w1(kVar, bpNoDataContainer);
        }
        return nm0.y.f85009a;
    }
}
