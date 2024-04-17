package com.withings.tutorials.ui.screens;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.goal.core.model.HealthGoal;
import com.withings.user.core.models.User;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
/* compiled from: SetHealthGoalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/SetHealthGoalViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SetHealthGoalViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f44785a;

    /* renamed from: b  reason: collision with root package name */
    private final is.c f44786b;

    /* renamed from: c  reason: collision with root package name */
    private final is.b f44787c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<User> f44788d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Integer> f44789e;

    /* renamed from: f  reason: collision with root package name */
    private final HealthGoal[] f44790f;

    /* compiled from: SetHealthGoalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SetHealthGoalViewModel$1", f = "SetHealthGoalViewModel.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44791a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SetHealthGoalViewModel.kt */
        /* renamed from: com.withings.tutorials.ui.screens.SetHealthGoalViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0618a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SetHealthGoalViewModel f44793a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SetHealthGoalViewModel.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SetHealthGoalViewModel$1$1", f = "SetHealthGoalViewModel.kt", l = {40}, m = "emit")
            /* renamed from: com.withings.tutorials.ui.screens.SetHealthGoalViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0619a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                SetHealthGoalViewModel f44794a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f44795b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0618a<T> f44796c;

                /* renamed from: d  reason: collision with root package name */
                int f44797d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0619a(C0618a<? super T> c0618a, qm0.d<? super C0619a> dVar) {
                    super(dVar);
                    this.f44796c = c0618a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44795b = obj;
                    this.f44797d |= Integer.MIN_VALUE;
                    return this.f44796c.emit(null, this);
                }
            }

            C0618a(SetHealthGoalViewModel setHealthGoalViewModel) {
                this.f44793a = setHealthGoalViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.withings.user.core.models.User r8, qm0.d<? super nm0.y> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withings.tutorials.ui.screens.SetHealthGoalViewModel.a.C0618a.C0619a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withings.tutorials.ui.screens.SetHealthGoalViewModel$a$a$a r0 = (com.withings.tutorials.ui.screens.SetHealthGoalViewModel.a.C0618a.C0619a) r0
                    int r1 = r0.f44797d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f44797d = r1
                    goto L18
                L13:
                    com.withings.tutorials.ui.screens.SetHealthGoalViewModel$a$a$a r0 = new com.withings.tutorials.ui.screens.SetHealthGoalViewModel$a$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f44795b
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f44797d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    com.withings.tutorials.ui.screens.SetHealthGoalViewModel r8 = r0.f44794a
                    nm0.l.b(r9)
                    goto L63
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    nm0.l.b(r9)
                    com.withings.tutorials.ui.screens.SetHealthGoalViewModel r9 = r7.f44793a
                    kotlinx.coroutines.flow.MutableStateFlow r2 = com.withings.tutorials.ui.screens.SetHealthGoalViewModel.j0(r9)
                L3a:
                    java.lang.Object r4 = r2.getValue()
                    r5 = r4
                    com.withings.user.core.models.User r5 = (com.withings.user.core.models.User) r5
                    boolean r4 = r2.compareAndSet(r4, r8)
                    if (r4 == 0) goto L3a
                    if (r8 == 0) goto L70
                    long r4 = r8.getId()
                    is.b r8 = com.withings.tutorials.ui.screens.SetHealthGoalViewModel.f0(r9)
                    kotlinx.coroutines.flow.Flow r8 = r8.a(r4)
                    r0.f44794a = r9
                    r0.f44797d = r3
                    java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r0)
                    if (r8 != r1) goto L60
                    return r1
                L60:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L63:
                    com.withings.goal.core.model.HealthGoal r9 = (com.withings.goal.core.model.HealthGoal) r9
                    com.withings.goal.core.model.HealthGoal[] r0 = r8.k0()
                    int r9 = kotlin.collections.l.I(r0, r9)
                    r8.q0(r9)
                L70:
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.SetHealthGoalViewModel.a.C0618a.emit(com.withings.user.core.models.User, qm0.d):java.lang.Object");
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44791a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SetHealthGoalViewModel setHealthGoalViewModel = SetHealthGoalViewModel.this;
                Flow<User> f11 = setHealthGoalViewModel.f44785a.f();
                C0618a c0618a = new C0618a(setHealthGoalViewModel);
                this.f44791a = 1;
                if (f11.collect(c0618a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SetHealthGoalViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<HealthGoal> f44798a = sm0.b.a(HealthGoal.values());
    }

    /* compiled from: SetHealthGoalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SetHealthGoalViewModel$onSaveAction$2$1", f = "SetHealthGoalViewModel.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HealthGoal f44800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SetHealthGoalViewModel f44801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HealthGoal healthGoal, SetHealthGoalViewModel setHealthGoalViewModel, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f44800b = healthGoal;
            this.f44801c = setHealthGoalViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f44800b, this.f44801c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44799a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                HealthGoal goal = this.f44800b;
                kotlin.jvm.internal.u.j(goal, "goal");
                Map i12 = s0.i(new nm0.j("flow_specificity", goal.a()));
                int i13 = v70.a.f103433b;
                v70.a.d("set_goal", "health_goal", i12, true);
                SetHealthGoalViewModel setHealthGoalViewModel = this.f44801c;
                User user = (User) setHealthGoalViewModel.f44788d.getValue();
                if (user != null) {
                    is.c cVar = setHealthGoalViewModel.f44786b;
                    long id2 = user.getId();
                    this.f44799a = 1;
                    if (cVar.a(id2, goal, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public SetHealthGoalViewModel(r70.c userRepository, is.c cVar, is.b bVar) {
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f44785a = userRepository;
        this.f44786b = cVar;
        this.f44787c = bVar;
        this.f44788d = StateFlowKt.MutableStateFlow(null);
        this.f44789e = StateFlowKt.MutableStateFlow(null);
        kotlin.collections.a aVar = (kotlin.collections.a) b.f44798a;
        aVar.getClass();
        this.f44790f = (HealthGoal[]) kotlin.jvm.internal.l.b(aVar, new HealthGoal[0]);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final HealthGoal[] k0() {
        return this.f44790f;
    }

    public final StateFlow<Integer> m0() {
        return FlowKt.asStateFlow(this.f44789e);
    }

    public final void p0() {
        Integer value = this.f44789e.getValue();
        if (value != null) {
            HealthGoal healthGoal = this.f44790f[value.intValue()];
            if (healthGoal != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(healthGoal, this, null), 2, null);
            }
        }
    }

    public final void q0(int i11) {
        MutableStateFlow<Integer> mutableStateFlow;
        do {
            mutableStateFlow = this.f44789e;
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), Integer.valueOf(i11)));
    }
}
