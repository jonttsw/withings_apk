package com.withings.wiscale2.heart.heartrate;

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
/* compiled from: HeartRateOptionSheetFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateOptionSheetFragment$setupHelpsView$1", f = "HeartRateOptionSheetFragment.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f57578b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a1 f57579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeartRateOptionSheetFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f57580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1 f57581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f57582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<LearnMoreEntryTranslations> list, a1 a1Var, View view) {
            super(2);
            this.f57580a = list;
            this.f57581b = a1Var;
            this.f57582c = view;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1699848902, new c1(this.f57580a, this.f57581b, this.f57582c)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(View view, a1 a1Var, qm0.d<? super d1> dVar) {
        super(2, dVar);
        this.f57578b = view;
        this.f57579c = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d1(this.f57578b, this.f57579c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LearnMoreEntryTranslations> heartRate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57577a;
        View view = this.f57578b;
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
            this.f57577a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (heartRate = learnMoreCategories.getHeartRate()) != null) {
            View findViewById = view.findViewById(C1987R.id.dialog_hr_helps_section);
            kotlin.jvm.internal.u.g(findViewById);
            findViewById.setVisibility(0);
            ((ComposeView) view.findViewById(C1987R.id.dialog_hr_helps_container)).setContent(new s1.a(true, 1063417004, new a(heartRate, this.f57579c, view)));
        }
        return nm0.y.f85009a;
    }
}
