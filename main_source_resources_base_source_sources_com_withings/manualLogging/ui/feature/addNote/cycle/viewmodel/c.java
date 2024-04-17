package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import java.util.Comparator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: CycleSymptomsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleSymptomsViewModel$allMoodAndFeelingsSymptoms$1", f = "CycleSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends fx.f>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f41371a;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(Long.valueOf(((fx.f) t11).getId()), Long.valueOf(((fx.f) t12).getId()));
        }
    }

    c() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.c, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new i(2, dVar);
        iVar.f41371a = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends fx.f>> dVar) {
        return ((c) create(list, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        return x.D0((List) this.f41371a, new Object());
    }
}
