package com.withings.wiscale2.mydevices;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyDevicesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$reloadData$1", f = "MyDevicesViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_BCGIPG}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class t extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58714a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyDevicesViewModel f58715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MyDevicesViewModel myDevicesViewModel, qm0.d<? super t> dVar) {
        super(2, dVar);
        this.f58715b = myDevicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new t(this.f58715b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58714a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            mutableSharedFlow = this.f58715b.f58599g;
            y yVar = y.f85009a;
            this.f58714a = 1;
            if (mutableSharedFlow.emit(yVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
