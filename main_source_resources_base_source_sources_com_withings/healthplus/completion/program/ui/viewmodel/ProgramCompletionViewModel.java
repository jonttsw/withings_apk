package com.withings.healthplus.completion.program.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
import qm0.d;
import v30.c;
import xw.b;
import ym0.l;
import ym0.p;
/* compiled from: ProgramCompletionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/completion/program/ui/viewmodel/ProgramCompletionViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProgramCompletionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final c f40060a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40061b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40062c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<Boolean> f40063d;

    /* compiled from: ProgramCompletionViewModel.kt */
    @e(c = "com.withings.healthplus.completion.program.ui.viewmodel.ProgramCompletionViewModel$finishProgram$2", f = "ProgramCompletionViewModel.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40064a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f40066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f40067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l<Boolean, y> f40068e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<Boolean, y> f40069f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProgramCompletionViewModel.kt */
        /* renamed from: com.withings.healthplus.completion.program.ui.viewmodel.ProgramCompletionViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0522a extends w implements l<Boolean, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProgramCompletionViewModel f40070a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l<Boolean, y> f40071b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l<Boolean, y> f40072c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0522a(ProgramCompletionViewModel programCompletionViewModel, l<? super Boolean, y> lVar, l<? super Boolean, y> lVar2) {
                super(1);
                this.f40070a = programCompletionViewModel;
                this.f40071b = lVar;
                this.f40072c = lVar2;
            }

            @Override // ym0.l
            public final y invoke(Boolean bool) {
                Object value;
                Boolean bool2 = bool;
                bool2.booleanValue();
                MutableStateFlow mutableStateFlow = this.f40070a.f40062c;
                do {
                    value = mutableStateFlow.getValue();
                    ((Boolean) value).getClass();
                } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
                this.f40071b.invoke(bool2);
                l<Boolean, y> lVar = this.f40072c;
                if (lVar != null) {
                    lVar.invoke(bool2);
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j5, long j11, l<? super Boolean, y> lVar, l<? super Boolean, y> lVar2, d<? super a> dVar) {
            super(2, dVar);
            this.f40066c = j5;
            this.f40067d = j11;
            this.f40068e = lVar;
            this.f40069f = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(this.f40066c, this.f40067d, this.f40068e, this.f40069f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40064a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ProgramCompletionViewModel programCompletionViewModel = ProgramCompletionViewModel.this;
                c cVar = programCompletionViewModel.f40060a;
                int i12 = (int) this.f40067d;
                C0522a c0522a = new C0522a(programCompletionViewModel, this.f40068e, this.f40069f);
                this.f40064a = 1;
                if (cVar.a(this.f40066c, i12, c0522a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public ProgramCompletionViewModel(c cVar, b dispatchers) {
        u.j(dispatchers, "dispatchers");
        this.f40060a = cVar;
        this.f40061b = dispatchers;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f40062c = MutableStateFlow;
        this.f40063d = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void i0(long j5, long j11, l<? super Boolean, y> lVar, l<? super Boolean, y> lVar2) {
        MutableStateFlow<Boolean> mutableStateFlow;
        Boolean value;
        do {
            mutableStateFlow = this.f40062c;
            value = mutableStateFlow.getValue();
            value.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f40061b.a(), null, new a(j11, j5, lVar, lVar2, null), 2, null);
    }

    public final StateFlow<Boolean> j0() {
        return this.f40063d;
    }
}
