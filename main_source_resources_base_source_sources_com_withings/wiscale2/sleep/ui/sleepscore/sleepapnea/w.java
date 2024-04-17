package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SleepDisorderDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderDetailsFragment$initLearnMoreSection$2", f = "SleepDisorderDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGUSERID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61472a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f61473b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f61473b = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w(this.f61473b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LearnMoreEntryTranslations> sleepApnea;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61472a;
        s sVar = this.f61473b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Context requireContext = sVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(requireContext);
            this.f61472a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (sleepApnea = learnMoreCategories.getSleepApnea()) != null) {
            sVar.G1().f99643a.setArticles(sleepApnea);
        }
        return nm0.y.f85009a;
    }
}
