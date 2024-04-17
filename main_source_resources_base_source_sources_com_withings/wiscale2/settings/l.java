package com.withings.wiscale2.settings;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.settings.DatabaseInfoActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Zip.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$1$invokeSuspend$$inlined$combine$1$3", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGACCOUNTID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super DatabaseInfoActivity.a>, Integer[], qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60112a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FlowCollector f60113b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object[] f60114c;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.settings.l] */
    @Override // ym0.q
    public final Object invoke(FlowCollector<? super DatabaseInfoActivity.a> flowCollector, Integer[] numArr, qm0.d<? super nm0.y> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f60113b = flowCollector;
        iVar.f60114c = numArr;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60112a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = this.f60113b;
            Integer[] numArr = (Integer[]) this.f60114c;
            DatabaseInfoActivity.a aVar = new DatabaseInfoActivity.a(numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue(), numArr[4].intValue(), numArr[5].intValue(), numArr[6].intValue(), numArr[7].intValue(), numArr[8].intValue(), numArr[9].intValue(), numArr[10].intValue(), numArr[11].intValue(), numArr[12].intValue(), numArr[13].intValue(), numArr[14].intValue(), numArr[15].intValue());
            this.f60112a = 1;
            if (flowCollector.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
