package com.withings.sharing.datasharing.sendinvitation;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectDataViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$setBiomarkers$1", f = "SelectDataViewModel.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44157a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectDataViewModel f44158b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<y40.a> f44159c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectDataViewModel selectDataViewModel, List<y40.a> list, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f44158b = selectDataViewModel;
        this.f44159c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f44158b, this.f44159c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44157a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            mutableSharedFlow = this.f44158b.f44091a;
            this.f44157a = 1;
            if (mutableSharedFlow.emit(this.f44159c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
