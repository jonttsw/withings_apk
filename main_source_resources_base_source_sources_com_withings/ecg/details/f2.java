package com.withings.ecg.details;

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
/* compiled from: EcgOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgOptionSheetFragment$initArticlesAdapter$1", f = "EcgOptionSheetFragment.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38195a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38196b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c2 f38197c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f38198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c2 f38199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<LearnMoreEntryTranslations> list, c2 c2Var) {
            super(2);
            this.f38198a = list;
            this.f38199b = c2Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1568755478, new e2(this.f38198a, this.f38199b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(c2 c2Var, qm0.d<? super f2> dVar) {
        super(2, dVar);
        this.f38197c = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f2 f2Var = new f2(this.f38197c, dVar);
        f2Var.f38196b = obj;
        return f2Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        nm0.y yVar;
        List<LearnMoreEntryTranslations> ecg;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38195a;
        c2 c2Var = this.f38197c;
        if (i11 != 0) {
            if (i11 == 1) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f38196b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Context requireContext = c2Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(requireContext);
            this.f38196b = (CoroutineScope) this.f38196b;
            this.f38195a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (ecg = learnMoreCategories.getEcg()) != null) {
            ComposeView v12 = c2.v1(c2Var);
            kotlin.jvm.internal.u.i(v12, "access$getEcgArticles(...)");
            v12.setVisibility(0);
            c2.v1(c2Var).setContent(new s1.a(true, 943875440, new a(ecg, c2Var)));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            View x12 = c2.x1(c2Var);
            kotlin.jvm.internal.u.i(x12, "access$getEcgArticlesSectionDivider(...)");
            x12.setVisibility(8);
            SectionView w12 = c2.w1(c2Var);
            kotlin.jvm.internal.u.i(w12, "access$getEcgArticlesSection(...)");
            w12.setVisibility(8);
        }
        return nm0.y.f85009a;
    }
}
