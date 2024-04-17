package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import dp0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: CycleSymptomsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleSymptomsViewModel$symptomsSexualActivity$1", f = "CycleSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends fx.f>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f41372a;

    d() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.d, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new i(2, dVar);
        iVar.f41372a = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends fx.f>> dVar) {
        return ((d) create(list, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) this.f41372a) {
            String l5 = ((fx.f) obj2).l();
            if (l5 != null && (!j.D(l5))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
