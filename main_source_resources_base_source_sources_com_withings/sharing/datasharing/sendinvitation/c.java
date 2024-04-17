package com.withings.sharing.datasharing.sendinvitation;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectDataViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$selectAll$1", f = "SelectDataViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44140a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectDataViewModel f44141b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f44142c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SelectDataViewModel selectDataViewModel, boolean z5, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f44141b = selectDataViewModel;
        this.f44142c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f44141b, this.f44142c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44140a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SelectDataViewModel selectDataViewModel = this.f44141b;
            mutableSharedFlow = selectDataViewModel.f44091a;
            List<y40.a> a11 = selectDataViewModel.g0().getValue().a();
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
            for (y40.a aVar : a11) {
                arrayList.add(y40.a.a(aVar, this.f44142c));
            }
            this.f44140a = 1;
            if (mutableSharedFlow.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
