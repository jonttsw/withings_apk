package com.withings.cycletracking.ui.viewmodel;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import en.c;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$analysis$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements ym0.q<fr.a, List<? extends wm.b>, qm0.d<? super en.c>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ fr.a f35903a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f35904b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleTrackingViewModel f35905c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f35906d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, CycleTrackingViewModel cycleTrackingViewModel, qm0.d dVar) {
        super(3, dVar);
        this.f35905c = cycleTrackingViewModel;
        this.f35906d = context;
    }

    @Override // ym0.q
    public final Object invoke(fr.a aVar, List<? extends wm.b> list, qm0.d<? super en.c> dVar) {
        CycleTrackingViewModel cycleTrackingViewModel = this.f35905c;
        k kVar = new k(this.f35906d, cycleTrackingViewModel, dVar);
        kVar.f35903a = aVar;
        kVar.f35904b = list;
        return kVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        df.d dVar;
        jm.a aVar;
        jm.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        fr.a aVar3 = this.f35903a;
        List list = this.f35904b;
        if (aVar3 != null) {
            return c.a.f65732a;
        }
        CycleTrackingViewModel cycleTrackingViewModel = this.f35905c;
        dVar = cycleTrackingViewModel.f35794e;
        dVar.getClass();
        wm.a b10 = df.d.b(list);
        if (b10 != null) {
            aVar = cycleTrackingViewModel.f35793d;
            l70.u g11 = aVar.g(ConstantsWs.MEASURE_TYPE_MENSTRUATION_DURATION);
            aVar2 = cycleTrackingViewModel.f35793d;
            return en.d.b(b10, g11, aVar2.g(ConstantsWs.MEASURE_TYPE_CYCLE_DURATION), this.f35906d);
        }
        return null;
    }
}
