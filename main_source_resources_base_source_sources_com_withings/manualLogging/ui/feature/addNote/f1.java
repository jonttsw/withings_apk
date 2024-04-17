package com.withings.manualLogging.ui.feature.addNote;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$deactivatePatientSession$1", f = "AddNotesViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41455a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f41456b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, qm0.d<? super f1> dVar) {
        super(2, dVar);
        this.f41456b = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f1(this.f41456b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41455a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            bVar = this.f41456b.f41490k;
            this.f41455a = 1;
            if (bVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
