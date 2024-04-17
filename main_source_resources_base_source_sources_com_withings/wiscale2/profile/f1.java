package com.withings.wiscale2.profile;

import androidx.lifecycle.LiveData;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ProfileViewModel.kt */
/* loaded from: classes5.dex */
public final class f1 extends LiveData<List<? extends d1>> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f59324a;

    /* renamed from: b  reason: collision with root package name */
    private final User f59325b;

    /* renamed from: c  reason: collision with root package name */
    private final TargetRepository f59326c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkoutCategoryManager f59327d;

    /* renamed from: e  reason: collision with root package name */
    private final ym0.l<qm0.d<? super Boolean>, Object> f59328e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Integer> f59329f;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(CoroutineScope coroutineScope, User mainUser, TargetRepository targetRepository, WorkoutCategoryManager workoutCategoryManager, ym0.l<? super qm0.d<? super Boolean>, ? extends Object> lVar) {
        kotlin.jvm.internal.u.j(mainUser, "mainUser");
        kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
        this.f59324a = coroutineScope;
        this.f59325b = mainUser;
        this.f59326c = targetRepository;
        this.f59327d = workoutCategoryManager;
        this.f59328e = lVar;
        this.f59329f = kotlin.collections.x.W(36, 1, 37);
    }

    public final WorkoutCategoryManager A() {
        return this.f59327d;
    }

    public final ym0.l<qm0.d<? super Boolean>, Object> B() {
        return this.f59328e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        BuildersKt__Builders_commonKt.launch$default(this.f59324a, Dispatchers.getIO(), null, new e1(this, null), 2, null);
    }

    public final User x() {
        return this.f59325b;
    }

    public final TargetRepository y() {
        return this.f59326c;
    }
}
