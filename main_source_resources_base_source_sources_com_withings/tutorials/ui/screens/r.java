package com.withings.tutorials.ui.screens;

import androidx.lifecycle.h1;
import com.withings.user.core.models.User;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<User.BodyModel, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionTutorialViewModel f46207a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46208b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel, ym0.a<y> aVar) {
        super(1);
        this.f46207a = segmentalBodyCompositionTutorialViewModel;
        this.f46208b = aVar;
    }

    @Override // ym0.l
    public final y invoke(User.BodyModel bodyModel) {
        User.BodyModel selectedBodyShape = bodyModel;
        kotlin.jvm.internal.u.j(selectedBodyShape, "selectedBodyShape");
        SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel = this.f46207a;
        segmentalBodyCompositionTutorialViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(segmentalBodyCompositionTutorialViewModel), Dispatchers.getIO(), null, new u(segmentalBodyCompositionTutorialViewModel, selectedBodyShape, null), 2, null);
        this.f46208b.invoke();
        return y.f85009a;
    }
}
