package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "program", "Landroidx/lifecycle/LiveData;", "", "invoke", "(Ljava/util/List;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel$remainingProgramsItems$1 extends w implements l<List<ProgramDomain.LegacyDomain>, LiveData<List<Object>>> {
    final /* synthetic */ BrowseProgramViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BrowseProgramActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "", "", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$remainingProgramsItems$1$1", f = "BrowseProgramActivity.kt", l = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW, 195}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$remainingProgramsItems$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<h0<List<? extends Object>>, qm0.d<? super y>, Object> {
        final /* synthetic */ List<ProgramDomain.LegacyDomain> $program;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BrowseProgramViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BrowseProgramViewModel browseProgramViewModel, List<ProgramDomain.LegacyDomain> list, qm0.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = browseProgramViewModel;
            this.$program = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$program, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(h0<List<Object>> h0Var, qm0.d<? super y> dVar) {
            return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            BrowseProgramViewModel browseProgramViewModel;
            List filterHyResultProgram;
            List filterOnGoingEnrolledPrograms;
            Context context;
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
                browseProgramViewModel = (BrowseProgramViewModel) this.L$1;
                h0Var = (h0) this.L$0;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (h0) this.L$0;
                browseProgramViewModel = this.this$0;
                filterHyResultProgram = browseProgramViewModel.filterHyResultProgram(this.$program);
                this.L$0 = h0Var;
                this.L$1 = browseProgramViewModel;
                this.label = 1;
                obj = browseProgramViewModel.filterOnGoingLeaderBoardProgram(filterHyResultProgram, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            filterOnGoingEnrolledPrograms = browseProgramViewModel.filterOnGoingEnrolledPrograms((List) obj);
            ArrayList S0 = x.S0(filterOnGoingEnrolledPrograms);
            if (!S0.isEmpty()) {
                context = this.this$0.context;
                String string = context.getString(C1987R.string._PROGRAM_WELCOME_MESSAGE_);
                u.i(string, "getString(...)");
                S0.add(0, new WellnessProgramSection(false, string));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (h0Var.emit(S0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ Object invoke(h0<List<? extends Object>> h0Var, qm0.d<? super y> dVar) {
            return invoke2((h0<List<Object>>) h0Var, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramViewModel$remainingProgramsItems$1(BrowseProgramViewModel browseProgramViewModel) {
        super(1);
        this.this$0 = browseProgramViewModel;
    }

    @Override // ym0.l
    public final LiveData<List<Object>> invoke(List<ProgramDomain.LegacyDomain> program) {
        u.j(program, "program");
        return h.a(Dispatchers.getIO(), new AnonymousClass1(this.this$0, program, null), 2);
    }
}
