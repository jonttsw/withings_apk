package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$workoutToDisplayFlow$1", f = "WorkoutPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class u7 extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends Track>, qm0.d<? super List<? extends l7>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f49708a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutManager f49709b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o7 f49710c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(WorkoutManager workoutManager, o7 o7Var, qm0.d<? super u7> dVar) {
        super(2, dVar);
        this.f49709b = workoutManager;
        this.f49710c = o7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u7 u7Var = new u7(this.f49709b, this.f49710c, dVar);
        u7Var.f49708a = obj;
        return u7Var;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends Track> list, qm0.d<? super List<? extends l7>> dVar) {
        return ((u7) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n7 n7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ArrayList<Track> arrayList = new ArrayList();
        for (Object obj2 : (List) this.f49708a) {
            if (this.f49709b.shouldBeDisplayed((Track) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Track track : arrayList) {
            n7Var = this.f49710c.f49518b;
            l7 a11 = n7Var.a(track);
            if (a11 != null) {
                arrayList2.add(a11);
            }
        }
        return arrayList2;
    }
}
