package com.withings.nervehealth.ui.guidedscan;

import com.withings.nervehealth.ui.guidedscan.c;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: NerveHealthGuidedScanActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanActivity$bindViewModel$1", f = "NerveHealthGuidedScanActivity.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42608a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanActivity f42609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NerveHealthGuidedScanActivity f42610a;

        a(NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity) {
            this.f42610a = nerveHealthGuidedScanActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            if (kotlin.jvm.internal.u.e((c) obj, c.a.f42596a)) {
                this.f42610a.finish();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f42609b = nerveHealthGuidedScanActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f42609b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42608a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity = this.f42609b;
            SharedFlow<c> K0 = NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity).K0();
            a aVar = new a(nerveHealthGuidedScanActivity);
            this.f42608a = 1;
            if (K0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
