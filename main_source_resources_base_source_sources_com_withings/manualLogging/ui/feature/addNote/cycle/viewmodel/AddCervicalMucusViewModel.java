package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import android.content.Context;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import hx.k;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.l;
import nm0.y;
import pm.n;
import ym0.p;
/* compiled from: AddCervicalMucusViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/AddCervicalMucusViewModel;", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/CycleSymptomsViewModel;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddCervicalMucusViewModel extends CycleSymptomsViewModel {

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<List<sx.b>> f41294e;

    /* compiled from: AddCervicalMucusViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddCervicalMucusViewModel$symptomsOptions$1", f = "AddCervicalMucusViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends sx.b>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f41295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f41296b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f41296b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f41296b, dVar);
            aVar.f41295a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends sx.b>> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            List<fx.f> list = (List) this.f41295a;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (fx.f fVar : list) {
                arrayList.add(new sx.b(fVar.c(), (int) fVar.g(), n.a(this.f41296b, fVar.k(), fVar.j())));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AddCervicalMucusViewModel(Context context, u0 savedStateHandle, k kVar) {
        super(savedStateHandle, kVar);
        u.j(savedStateHandle, "savedStateHandle");
        this.f41294e = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(g0(), new a(context, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.getEagerly(), i0.f76187a);
    }

    public final StateFlow<List<sx.b>> k0() {
        return this.f41294e;
    }
}
