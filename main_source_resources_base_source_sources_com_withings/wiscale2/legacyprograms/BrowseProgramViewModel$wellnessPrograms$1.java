package com.withings.wiscale2.legacyprograms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ProgramDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "invoke", "(Ljava/lang/Boolean;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel$wellnessPrograms$1 extends w implements l<Boolean, LiveData<List<ProgramDomain.LegacyDomain>>> {
    final /* synthetic */ BrowseProgramViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BrowseProgramActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$wellnessPrograms$1$1", f = "BrowseProgramActivity.kt", l = {ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$wellnessPrograms$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<h0<List<? extends ProgramDomain.LegacyDomain>>, qm0.d<? super y>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BrowseProgramViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BrowseProgramViewModel browseProgramViewModel, qm0.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = browseProgramViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(h0<List<ProgramDomain.LegacyDomain>> h0Var, qm0.d<? super y> dVar) {
            return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            x30.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (h0) this.L$0;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (h0) this.L$0;
                cVar = this.this$0.getAllProgramsByUserUseCase;
                x30.b a11 = cVar.a(this.this$0.getUser().q());
                this.L$0 = h0Var;
                this.label = 1;
                obj = FlowKt.first(a11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof ProgramDomain.LegacyDomain) {
                    arrayList.add(obj2);
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (h0Var.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ Object invoke(h0<List<? extends ProgramDomain.LegacyDomain>> h0Var, qm0.d<? super y> dVar) {
            return invoke2((h0<List<ProgramDomain.LegacyDomain>>) h0Var, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramViewModel$wellnessPrograms$1(BrowseProgramViewModel browseProgramViewModel) {
        super(1);
        this.this$0 = browseProgramViewModel;
    }

    @Override // ym0.l
    public final LiveData<List<ProgramDomain.LegacyDomain>> invoke(Boolean bool) {
        return h.a(Dispatchers.getIO(), new AnonymousClass1(this.this$0, null), 2);
    }
}
