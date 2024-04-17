package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import hx.k;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: AddSexualActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/AddSexualActivityViewModel;", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/CycleSymptomsViewModel;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddSexualActivityViewModel extends CycleSymptomsViewModel {

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41297e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41298f;

    /* renamed from: g  reason: collision with root package name */
    private final StateFlow<List<fx.f>> f41299g;

    /* compiled from: AddSexualActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$intercourseSymptoms$1", f = "AddSexualActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends fx.f>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f41300a;

        a() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$a, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new i(2, dVar);
            iVar.f41300a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends fx.f>> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.f41300a) {
                if (u.e(((fx.f) obj2).l(), "15")) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: AddSexualActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$libidoSymptoms$1", f = "AddSexualActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends fx.f>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f41301a;

        b() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new i(2, dVar);
            iVar.f41301a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends fx.f>> dVar) {
            return ((b) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.f41301a) {
                if (u.e(((fx.f) obj2).l(), "9")) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: AddSexualActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$protectionSymptoms$1", f = "AddSexualActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends i implements p<List<? extends fx.f>, qm0.d<? super List<? extends fx.f>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f41302a;

        c() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSexualActivityViewModel$c] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new i(2, dVar);
            iVar.f41302a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.f> list, qm0.d<? super List<? extends fx.f>> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.f41302a) {
                if (u.e(((fx.f) obj2).l(), "18")) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public AddSexualActivityViewModel(u0 savedStateHandle, k kVar) {
        super(savedStateHandle, kVar);
        u.j(savedStateHandle, "savedStateHandle");
        Flow flowOn = FlowKt.flowOn(FlowKt.mapLatest(i0(), new i(2, null)), Dispatchers.getIO());
        i0 i0Var = i0.f76187a;
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f41297e = FlowKt.stateIn(flowOn, a11, companion.getEagerly(), i0Var);
        this.f41298f = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(i0(), new i(2, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
        this.f41299g = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(i0(), new i(2, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
    }

    public final StateFlow<List<fx.f>> k0() {
        return this.f41298f;
    }

    public final StateFlow<List<fx.f>> m0() {
        return this.f41297e;
    }

    public final StateFlow<List<fx.f>> p0() {
        return this.f41299g;
    }
}
