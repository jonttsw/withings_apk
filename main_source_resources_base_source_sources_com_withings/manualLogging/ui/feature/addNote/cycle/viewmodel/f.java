package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import android.content.Context;
import com.withings.cycletracking.core.model.CycleEntry;
import com.withings.manualLogging.ui.feature.addNote.cycle.h;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: ManualLogEntryViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.ManualLogEntryViewModel$chipAndEmptyEntries$1", f = "ManualLogEntryViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f extends i implements p<j<? extends List<? extends wm.c>, ? extends List<? extends CycleEntry>>, qm0.d<? super j<? extends List<? extends wm.c>, ? extends List<? extends CycleEntry>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f41374a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f41375b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f41376a;

        public a(Context context) {
            this.f41376a = context;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int d11 = h.d(((wm.c) t11).a());
            Context context = this.f41376a;
            return pm0.a.b(context.getString(d11), context.getString(h.d(((wm.c) t12).a())));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f41377a;

        public b(Context context) {
            this.f41377a = context;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int d11 = h.d((CycleEntry) t11);
            Context context = this.f41377a;
            return pm0.a.b(context.getString(d11), context.getString(h.d((CycleEntry) t12)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f41375b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        f fVar = new f(this.f41375b, dVar);
        fVar.f41374a = obj;
        return fVar;
    }

    @Override // ym0.p
    public final Object invoke(j<? extends List<? extends wm.c>, ? extends List<? extends CycleEntry>> jVar, qm0.d<? super j<? extends List<? extends wm.c>, ? extends List<? extends CycleEntry>>> dVar) {
        return ((f) create(jVar, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        j jVar = (j) this.f41374a;
        Context context = this.f41375b;
        return new j(x.D0((List) jVar.a(), new a(context)), x.D0((List) jVar.b(), new b(context)));
    }
}
