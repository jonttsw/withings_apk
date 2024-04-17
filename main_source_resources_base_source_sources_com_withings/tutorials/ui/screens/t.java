package com.withings.tutorials.ui.screens;

import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalBodyCompositionTutorialViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel$getUser$2", f = "SegmentalBodyCompositionTutorialViewModel.kt", l = {49, 50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class t extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super User>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionTutorialViewModel f46213b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel, qm0.d<? super t> dVar) {
        super(2, dVar);
        this.f46213b = segmentalBodyCompositionTutorialViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new t(this.f46213b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
        r70.c cVar;
        r70.c cVar2;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46212a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    user = (User) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                user = (User) obj;
            }
        } else {
            nm0.l.b(obj);
            SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel = this.f46213b;
            l5 = segmentalBodyCompositionTutorialViewModel.f44780c;
            if (l5 == null) {
                cVar2 = segmentalBodyCompositionTutorialViewModel.f44778a;
                this.f46212a = 1;
                obj = r70.d.e(cVar2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                user = (User) obj;
            } else {
                cVar = segmentalBodyCompositionTutorialViewModel.f44778a;
                long longValue = l5.longValue();
                this.f46212a = 2;
                obj = r70.d.b(cVar, longValue, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                user = (User) obj;
            }
        }
        kotlin.jvm.internal.u.g(user);
        return user;
    }
}
