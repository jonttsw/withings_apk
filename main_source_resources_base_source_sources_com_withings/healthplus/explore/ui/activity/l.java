package com.withings.healthplus.explore.ui.activity;

import android.os.Build;
import android.os.Bundle;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.io.Serializable;
import k1.o1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ExploreTabActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.explore.ui.activity.ExploreTabActivity$onCreate$1$1$1", f = "ExploreTabActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40324a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<androidx.navigation.d> f40325b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ExploreTabActivity exploreTabActivity, o1<androidx.navigation.d> o1Var, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f40324a = exploreTabActivity;
        this.f40325b = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l(this.f40324a, this.f40325b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Bundle c11;
        Serializable serializable;
        androidx.navigation.t d11;
        String v11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        o1<androidx.navigation.d> o1Var = this.f40325b;
        androidx.navigation.d value = o1Var.getValue();
        ExploreTabActivity exploreTabActivity = this.f40324a;
        if (value == null || (d11 = value.d()) == null || (v11 = d11.v()) == null || !dp0.j.r(v11, "workout", false)) {
            androidx.navigation.d value2 = o1Var.getValue();
            TaskType taskType = null;
            if (value2 != null && (c11 = value2.c()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = c11.getSerializable(NavigationArguments.TASK_TYPE, TaskType.class);
                } else {
                    Serializable serializable2 = c11.getSerializable(NavigationArguments.TASK_TYPE);
                    if (serializable2 instanceof TaskType) {
                        taskType = serializable2;
                    }
                    serializable = (TaskType) taskType;
                }
                taskType = (TaskType) serializable;
            }
            if (taskType != TaskType.f35301g) {
                ExploreTabActivity.E3(exploreTabActivity).m0(false);
                return nm0.y.f85009a;
            }
        }
        ExploreTabActivity.E3(exploreTabActivity).m0(true);
        return nm0.y.f85009a;
    }
}
