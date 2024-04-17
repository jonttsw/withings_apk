package com.withings.cycletracking.ui.viewmodel;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$symptoms$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.i implements ym0.r<fr.a, List<? extends wm.d>, List<? extends wm.i>, qm0.d<? super en.n>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ fr.a f35940a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f35941b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f35942c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f35943d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, qm0.d<? super s> dVar) {
        super(4, dVar);
        this.f35943d = context;
    }

    @Override // ym0.r
    public final Object invoke(fr.a aVar, List<? extends wm.d> list, List<? extends wm.i> list2, qm0.d<? super en.n> dVar) {
        s sVar = new s(this.f35943d, dVar);
        sVar.f35940a = aVar;
        sVar.f35941b = list;
        sVar.f35942c = list2;
        return sVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int size;
        boolean z5;
        int i11;
        List b10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        fr.a aVar = this.f35940a;
        List list = this.f35941b;
        List list2 = this.f35942c;
        if (aVar != null) {
            size = 3;
        } else {
            size = list.size();
        }
        boolean z11 = false;
        if (aVar != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        Context context = this.f35943d;
        kotlin.jvm.internal.u.j(context, "context");
        if (z5) {
            i11 = C1987R.plurals.cycleTracking_mostFrequentLogs_description_factors;
        } else {
            i11 = C1987R.plurals.cycleTracking_mostFrequentLogs_description;
        }
        String quantityString = context.getResources().getQuantityString(i11, size, Integer.valueOf(size));
        kotlin.jvm.internal.u.i(quantityString, "getQuantityString(...)");
        if (aVar != null && mo.a.g(aVar.f())) {
            b10 = com.withings.cycletracking.ui.model.a.c(context, list2);
        } else {
            if (aVar != null) {
                z11 = true;
            }
            b10 = com.withings.cycletracking.ui.model.a.b(context, list, z11);
        }
        en.n nVar = new en.n(b10, quantityString);
        if (!(!nVar.b().isEmpty()) || !(!list.isEmpty())) {
            return null;
        }
        return nVar;
    }
}
