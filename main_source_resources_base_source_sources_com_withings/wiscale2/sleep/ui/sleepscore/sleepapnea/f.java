package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Application;
import android.content.Context;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDisorderGraphFragment.kt */
/* loaded from: classes5.dex */
public final class f extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.f f61298a;

    /* compiled from: SleepDisorderGraphFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepApneaGraphViewModel$articlesLiveData$1", f = "SleepDisorderGraphFragment.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY, ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61299a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f61300b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Application f61301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Application application, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61301c = application;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f61301c, dVar);
            aVar.f61300b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends LearnMoreEntryTranslations>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            List<LearnMoreEntryTranslations> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61299a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f61300b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f61300b;
                Context applicationContext = this.f61301c.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                LearnMoreManager learnMoreManager = new LearnMoreManager(applicationContext);
                this.f61300b = h0Var;
                this.f61299a = 1;
                obj = learnMoreManager.getLearnMoreCategories(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
            if (learnMoreCategories != null) {
                list = learnMoreCategories.getSleepApnea();
            } else {
                list = null;
            }
            this.f61300b = null;
            this.f61299a = 2;
            if (h0Var.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Application application) {
        super(application);
        kotlin.jvm.internal.u.j(application, "application");
        this.f61298a = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(application, null), 2);
    }

    public final androidx.lifecycle.f f0() {
        return this.f61298a;
    }
}
