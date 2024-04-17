package com.withings.ecg.heartsound;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.views.view.SectionView;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeartSoundOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundOptionSheetFragment$initArticlesAdapter$1", f = "HeartSoundOptionSheetFragment.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38527a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38528b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p0 f38529c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeartSoundOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f38530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f38531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<LearnMoreEntryTranslations> list, p0 p0Var) {
            super(2);
            this.f38530a = list;
            this.f38531b = p0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1254789283, new r0(this.f38530a, this.f38531b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 p0Var, qm0.d<? super s0> dVar) {
        super(2, dVar);
        this.f38529c = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        s0 s0Var = new s0(this.f38529c, dVar);
        s0Var.f38528b = obj;
        return s0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        nm0.y yVar;
        List<LearnMoreEntryTranslations> heartSound;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38527a;
        p0 p0Var = this.f38529c;
        if (i11 != 0) {
            if (i11 == 1) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f38528b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Context requireContext = p0Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(requireContext);
            this.f38528b = (CoroutineScope) this.f38528b;
            this.f38527a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (heartSound = learnMoreCategories.getHeartSound()) != null) {
            ComposeView u12 = p0.u1(p0Var);
            kotlin.jvm.internal.u.i(u12, "access$getHeartSoundArticles(...)");
            u12.setVisibility(0);
            p0.u1(p0Var).setContent(new s1.a(true, 961321027, new a(heartSound, p0Var)));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            View w12 = p0.w1(p0Var);
            kotlin.jvm.internal.u.i(w12, "access$getHeartSoundArticlesSectionDivider(...)");
            w12.setVisibility(8);
            SectionView v12 = p0.v1(p0Var);
            kotlin.jvm.internal.u.i(v12, "access$getHeartSoundArticlesSection(...)");
            v12.setVisibility(8);
        }
        return nm0.y.f85009a;
    }
}
