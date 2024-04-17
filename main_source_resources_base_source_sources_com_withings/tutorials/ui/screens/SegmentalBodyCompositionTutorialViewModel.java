package com.withings.tutorials.ui.screens;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.user.core.models.User;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: SegmentalBodyCompositionTutorialViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/SegmentalBodyCompositionTutorialViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionTutorialViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f44778a;

    /* renamed from: b  reason: collision with root package name */
    private final q70.j f44779b;

    /* renamed from: c  reason: collision with root package name */
    private Long f44780c;

    /* renamed from: d  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f44781d;

    /* compiled from: SegmentalBodyCompositionTutorialViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SegmentalBodyCompositionTutorialViewModel$setUser$1", f = "SegmentalBodyCompositionTutorialViewModel.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ParcelableSnapshotMutableState f44782a;

        /* renamed from: b  reason: collision with root package name */
        int f44783b;

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
            ParcelableSnapshotMutableState parcelableSnapshotMutableState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44783b;
            if (i11 != 0) {
                if (i11 == 1) {
                    parcelableSnapshotMutableState = this.f44782a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel = SegmentalBodyCompositionTutorialViewModel.this;
                ParcelableSnapshotMutableState j02 = segmentalBodyCompositionTutorialViewModel.j0();
                this.f44782a = j02;
                this.f44783b = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new t(segmentalBodyCompositionTutorialViewModel, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                parcelableSnapshotMutableState = j02;
            }
            User.BodyModel bodyModel = ((User) obj).getGenderPreferences().getBodyModel();
            if (bodyModel == null) {
                bodyModel = User.BodyModel.NEUTRAL;
            }
            parcelableSnapshotMutableState.setValue(bodyModel);
            return y.f85009a;
        }
    }

    @Inject
    public SegmentalBodyCompositionTutorialViewModel(r70.c userRepository, q70.j jVar) {
        ParcelableSnapshotMutableState f11;
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f44778a = userRepository;
        this.f44779b = jVar;
        f11 = l0.f(null, v0.f8878a);
        this.f44781d = f11;
    }

    public final ParcelableSnapshotMutableState j0() {
        return this.f44781d;
    }

    public final void k0(Long l5) {
        this.f44780c = l5;
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
    }
}
