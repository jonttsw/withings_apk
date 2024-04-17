package com.withings.wiscale2.heart.bloodpressure;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BloodPressureOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureOptionSheetFragment$setupHelpsView$1", f = "BloodPressureOptionSheetFragment.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57381a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f57382b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d0 f57383c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BloodPressureOptionSheetFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f57384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0 f57385b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f57386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<LearnMoreEntryTranslations> list, d0 d0Var, View view) {
            super(2);
            this.f57384a = list;
            this.f57385b = d0Var;
            this.f57386c = view;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -87290497, new g0(this.f57384a, this.f57385b, this.f57386c)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(View view, d0 d0Var, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f57382b = view;
        this.f57383c = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f57382b, this.f57383c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LearnMoreEntryTranslations> bloodPressure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57381a;
        View view = this.f57382b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Context context = view.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(context);
            this.f57381a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (bloodPressure = learnMoreCategories.getBloodPressure()) != null) {
            View findViewById = view.findViewById(C1987R.id.dialog_bp_helps_section);
            kotlin.jvm.internal.u.g(findViewById);
            findViewById.setVisibility(0);
            ((ComposeView) view.findViewById(C1987R.id.dialog_bp_helps_container)).setContent(new s1.a(true, 2128819813, new a(bloodPressure, this.f57383c, view)));
        }
        return nm0.y.f85009a;
    }
}
