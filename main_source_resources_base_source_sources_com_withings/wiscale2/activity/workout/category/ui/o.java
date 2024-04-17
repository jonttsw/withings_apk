package com.withings.wiscale2.activity.workout.category.ui;

import android.content.Context;
import com.withings.common.compose.component.n1;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
/* loaded from: classes4.dex */
public final class o {

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkoutCategory f48708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WorkoutCategory workoutCategory) {
            super(3);
            this.f48708a = workoutCategory;
        }

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            a0 $receiver = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j($receiver, "$this$$receiver");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String glyphName = this.f48708a.getGlyphName();
                u.i(glyphName, "getGlyphName(...)");
                n1.k(glyphName, null, 0.0f, 0L, 0L, aVar2, 0, 30);
            }
            return y.f85009a;
        }
    }

    public static final wk.k<WorkoutCategory> a(List<? extends WorkoutCategory> list, Context context, Integer num) {
        u.j(context, "context");
        List<? extends WorkoutCategory> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (WorkoutCategory workoutCategory : list2) {
            String name = workoutCategory.getName(context);
            u.g(name);
            arrayList.add(new wk.j(name, workoutCategory, new s1.a(true, 1857892400, new a(workoutCategory))));
        }
        return new wk.k<>(num, arrayList);
    }
}
