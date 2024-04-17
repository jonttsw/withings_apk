package com.withings.wiscale2.profile;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.TargetLiveData$load$1", f = "ProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGEMAIL, ConstantsWs.WS_STATUS_WRONGSECRET}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59317a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f59318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.TargetLiveData$load$1$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends Target>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f59319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f59320b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        /* renamed from: com.withings.wiscale2.profile.e1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0766a extends kotlin.jvm.internal.w implements ym0.l<Target, Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0766a f59321a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final Integer invoke(Target target) {
                Target target2 = target;
                kotlin.jvm.internal.u.j(target2, "target");
                return Integer.valueOf(target2.getMeasureType());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f59320b = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f59320b, dVar);
            aVar.f59319a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends Target> list, qm0.d<? super nm0.y> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            WorkoutCategory workoutCategory;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) this.f59319a) {
                Target target = (Target) obj2;
                int measureType = target.getMeasureType();
                if (measureType != 18 && measureType != 37 && measureType != 208 && measureType != 143 && measureType != 144 && target.getType() != 5) {
                    arrayList.add(obj2);
                }
            }
            f1 f1Var = this.f59320b;
            list = f1Var.f59329f;
            List<Target> v11 = ah.l.v(arrayList, list, C0766a.f59321a);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(v11, 10));
            for (Target target2 : v11) {
                if (target2.getType() == 4) {
                    workoutCategory = f1Var.A().getWorkoutCategory(target2.getMeasureType());
                } else {
                    workoutCategory = null;
                }
                arrayList2.add(new d1(target2, workoutCategory));
            }
            f1Var.postValue(arrayList2);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, qm0.d<? super e1> dVar) {
        super(2, dVar);
        this.f59318b = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e1(this.f59318b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59317a;
        f1 f1Var = this.f59318b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            ym0.l<qm0.d<? super Boolean>, Object> B = f1Var.B();
            this.f59317a = 1;
            obj = B.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return nm0.y.f85009a;
        }
        Flow<List<Target>> allActivatedTargetsForUserFlow = f1Var.y().getAllActivatedTargetsForUserFlow(f1Var.x().q());
        a aVar = new a(f1Var, null);
        this.f59317a = 2;
        if (FlowKt.collectLatest(allActivatedTargetsForUserFlow, aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
