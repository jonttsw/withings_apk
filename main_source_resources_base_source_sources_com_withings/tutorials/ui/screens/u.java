package com.withings.tutorials.ui.screens;

import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: SegmentalBodyCompositionTutorialViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel$saveBodyModelSelection$1", f = "SegmentalBodyCompositionTutorialViewModel.kt", l = {39, 40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46302a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionTutorialViewModel f46303b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User.BodyModel f46304c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel, User.BodyModel bodyModel, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f46303b = segmentalBodyCompositionTutorialViewModel;
        this.f46304c = bodyModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new u(this.f46303b, this.f46304c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((u) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        q70.j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46302a;
        SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel = this.f46303b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
            withContext = obj;
        } else {
            nm0.l.b(obj);
            this.f46302a = 1;
            segmentalBodyCompositionTutorialViewModel.getClass();
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new t(segmentalBodyCompositionTutorialViewModel, null), this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        User user = (User) withContext;
        jVar = segmentalBodyCompositionTutorialViewModel.f44779b;
        kotlin.jvm.internal.u.j(user, "<this>");
        User.BodyModel bodyModel = this.f46304c;
        kotlin.jvm.internal.u.j(bodyModel, "bodyModel");
        User copy$default = User.copy$default(user, 0L, null, null, null, null, null, false, null, null, User.GenderPreferences.copy$default(user.getGenderPreferences(), null, bodyModel, null, null, 13, null), null, 1535, null);
        this.f46302a = 2;
        if (jVar.c(copy$default, "view_segmental_body_composition_tutorial", this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
