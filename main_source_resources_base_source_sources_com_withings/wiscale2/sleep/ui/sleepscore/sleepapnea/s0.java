package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.measure.detail.ui.views.ArticlesView;
import java.util.List;
/* compiled from: SleepDisorderGraphFragment.kt */
/* loaded from: classes5.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.l<List<? extends LearnMoreEntryTranslations>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f61466a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o0 o0Var) {
        super(1);
        this.f61466a = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(List<? extends LearnMoreEntryTranslations> list) {
        ArticlesView articlesView;
        List<? extends LearnMoreEntryTranslations> list2 = list;
        if (list2 != null) {
            articlesView = this.f61466a.f61410f;
            if (articlesView != 0) {
                articlesView.setArticles(list2);
            } else {
                kotlin.jvm.internal.u.s("articlesView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
