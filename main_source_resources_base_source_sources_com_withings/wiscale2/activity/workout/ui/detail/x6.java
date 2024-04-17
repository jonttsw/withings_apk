package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WorkoutOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutOptionSheetFragment$setupHelps$1", f = "WorkoutOptionSheetFragment.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class x6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49817a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tb0.h1 f49818b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u6 f49819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutOptionSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f49820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u6 f49821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ tb0.h1 f49822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<LearnMoreEntryTranslations> list, u6 u6Var, tb0.h1 h1Var) {
            super(2);
            this.f49820a = list;
            this.f49821b = u6Var;
            this.f49822c = h1Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -479800013, new w6(this.f49820a, this.f49821b, this.f49822c)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(tb0.h1 h1Var, u6 u6Var, qm0.d<? super x6> dVar) {
        super(2, dVar);
        this.f49818b = h1Var;
        this.f49819c = u6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x6(this.f49818b, this.f49819c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x6) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LearnMoreEntryTranslations> workout;
        tb0.h1 h1Var;
        tb0.h1 h1Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49817a;
        tb0.h1 h1Var3 = this.f49818b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Context context = h1Var3.a().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(context);
            this.f49817a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (workout = learnMoreCategories.getWorkout()) != null) {
            u6 u6Var = this.f49819c;
            h1Var = u6Var.f49700c;
            if (h1Var != null) {
                ComposeView dialogWorkoutHelpsContainer = h1Var.f99131c;
                kotlin.jvm.internal.u.i(dialogWorkoutHelpsContainer, "dialogWorkoutHelpsContainer");
                dialogWorkoutHelpsContainer.setVisibility(0);
                h1Var2 = u6Var.f49700c;
                if (h1Var2 != null) {
                    h1Var2.f99131c.setContent(new s1.a(true, 1196537881, new a(workout, u6Var, h1Var3)));
                } else {
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
