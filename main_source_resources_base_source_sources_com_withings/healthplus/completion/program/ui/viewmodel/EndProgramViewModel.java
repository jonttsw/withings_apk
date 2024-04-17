package com.withings.healthplus.completion.program.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import b40.b;
import b40.c;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.endprogram.EndProgramStatsDomain;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
import ym0.q;
import zt.a;
/* compiled from: EndProgramViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/completion/program/ui/viewmodel/EndProgramViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EndProgramViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f40050a;

    /* renamed from: b  reason: collision with root package name */
    private final c f40051b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40052c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<zt.a> f40053d;

    /* compiled from: EndProgramViewModel.kt */
    @e(c = "com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel$1", f = "EndProgramViewModel.kt", l = {54, 58}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f40054a;

        /* renamed from: b  reason: collision with root package name */
        int f40055b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EndProgramViewModel.kt */
        @e(c = "com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel$1$1$1", f = "EndProgramViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0521a extends i implements q<EndProgramStatsDomain, String, d<? super a.b>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ EndProgramStatsDomain f40057a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ String f40058b;

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.healthplus.completion.program.ui.viewmodel.EndProgramViewModel$a$a] */
            @Override // ym0.q
            public final Object invoke(EndProgramStatsDomain endProgramStatsDomain, String str, d<? super a.b> dVar) {
                ?? iVar = new i(3, dVar);
                iVar.f40057a = endProgramStatsDomain;
                iVar.f40058b = str;
                return iVar.invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                EndProgramStatsDomain endProgramStatsDomain = this.f40057a;
                String str = this.f40058b;
                return new a.b(new zt.b(endProgramStatsDomain.getTotalTaskCompleted() / endProgramStatsDomain.getTotalTask(), (int) ((endProgramStatsDomain.getTotalTaskCompleted() / endProgramStatsDomain.getTotalTask()) * 100), String.valueOf(endProgramStatsDomain.getTotalTaskCompleted()), str));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EndProgramViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class b<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EndProgramViewModel f40059a;

            b(EndProgramViewModel endProgramViewModel) {
                this.f40059a = endProgramViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, d dVar) {
                Object emit = this.f40059a.f40053d.emit((a.b) obj, dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return y.f85009a;
                }
                return emit;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40055b;
            EndProgramViewModel endProgramViewModel = EndProgramViewModel.this;
            try {
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                Flow combine = FlowKt.combine(endProgramViewModel.f40050a.a(endProgramViewModel.f40052c), endProgramViewModel.f40051b.a(endProgramViewModel.f40052c), new i(3, null));
                b bVar = new b(endProgramViewModel);
                this.f40055b = 1;
                if (combine.collect(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = y.f85009a;
            if (k.b(a11) != null) {
                MutableStateFlow mutableStateFlow = endProgramViewModel.f40053d;
                a.C1977a c1977a = a.C1977a.f111033a;
                this.f40054a = a11;
                this.f40055b = 2;
                if (mutableStateFlow.emit(c1977a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public EndProgramViewModel(u0 savedStateHandle, b bVar, c cVar, xw.b dispatcher) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        this.f40050a = bVar;
        this.f40051b = cVar;
        String str = (String) savedStateHandle.c(NavigationArguments.PROGRAM_ID);
        if (str != null) {
            this.f40052c = Integer.parseInt(str);
            this.f40053d = StateFlowKt.MutableStateFlow(a.c.f111035a);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatcher.a(), null, new a(null), 2, null);
            return;
        }
        throw new Exception("programId shouldn't be null");
    }

    public final MutableStateFlow<zt.a> k0() {
        return this.f40053d;
    }
}
