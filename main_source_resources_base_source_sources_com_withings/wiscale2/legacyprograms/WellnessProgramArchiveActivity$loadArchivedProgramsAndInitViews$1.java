package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramArchiveActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1", f = "WellnessProgramArchiveActivity.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ WellnessProgramArchiveActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WellnessProgramArchiveActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1$1", f = "WellnessProgramArchiveActivity.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, qm0.d<? super List<? extends WellnessProgramArchiveActivity.ProgramWithIteration>>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ WellnessProgramArchiveActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WellnessProgramArchiveActivity wellnessProgramArchiveActivity, qm0.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = wellnessProgramArchiveActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends WellnessProgramArchiveActivity.ProgramWithIteration>> dVar) {
            return invoke2(coroutineScope, (qm0.d<? super List<WellnessProgramArchiveActivity.ProgramWithIteration>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            User user;
            WellnessProgramArchiveActivity wellnessProgramArchiveActivity;
            List archivedEnrolledPrograms;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    wellnessProgramArchiveActivity = (WellnessProgramArchiveActivity) this.L$0;
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                x30.a getAllEnrolledProgramByUserUseCase = this.this$0.getGetAllEnrolledProgramByUserUseCase();
                user = this.this$0.getUser();
                Flow<List<ProgramDomain>> a11 = getAllEnrolledProgramByUserUseCase.a(user.q());
                WellnessProgramArchiveActivity wellnessProgramArchiveActivity2 = this.this$0;
                this.L$0 = wellnessProgramArchiveActivity2;
                this.label = 1;
                obj = FlowKt.first(a11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wellnessProgramArchiveActivity = wellnessProgramArchiveActivity2;
            }
            archivedEnrolledPrograms = wellnessProgramArchiveActivity.getArchivedEnrolledPrograms((List) obj);
            return archivedEnrolledPrograms;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, qm0.d<? super List<WellnessProgramArchiveActivity.ProgramWithIteration>> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1(WellnessProgramArchiveActivity wellnessProgramArchiveActivity, qm0.d<? super WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramArchiveActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WellnessProgramArchiveActivity wellnessProgramArchiveActivity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                wellnessProgramArchiveActivity = (WellnessProgramArchiveActivity) this.L$0;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            WellnessProgramArchiveActivity wellnessProgramArchiveActivity2 = this.this$0;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.L$0 = wellnessProgramArchiveActivity2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(io2, anonymousClass1, this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            wellnessProgramArchiveActivity = wellnessProgramArchiveActivity2;
            obj = withContext;
        }
        wellnessProgramArchiveActivity.archivedPrograms = (List) obj;
        this.this$0.updateViews();
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
