package com.withings.wiscale2.accountV2.ui;

import android.app.Application;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qf.b;
import xw.n;
import ym0.l;
import ym0.p;
/* compiled from: LoggedOutActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/accountV2/ui/LoggedOutViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedOutViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Application f48194a;

    /* renamed from: b  reason: collision with root package name */
    private final qf.a f48195b;

    /* renamed from: c  reason: collision with root package name */
    private final k0<Boolean> f48196c = xw.d.b(Boolean.FALSE);

    /* renamed from: d  reason: collision with root package name */
    private final n<y> f48197d = new n<>();

    /* compiled from: LoggedOutActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.accountV2.ui.LoggedOutViewModel$disconnect$1", f = "LoggedOutActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VHD_RESULT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48198a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoggedOutActivity.kt */
        /* renamed from: com.withings.wiscale2.accountV2.ui.LoggedOutViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0663a extends w implements l<qf.b, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LoggedOutViewModel f48200a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0663a(LoggedOutViewModel loggedOutViewModel) {
                super(1);
                this.f48200a = loggedOutViewModel;
            }

            @Override // ym0.l
            public final y invoke(qf.b bVar) {
                qf.b it = bVar;
                u.j(it, "it");
                if (it instanceof b.c) {
                    this.f48200a.j0().postValue(null);
                }
                return y.f85009a;
            }
        }

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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48198a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                LoggedOutViewModel loggedOutViewModel = LoggedOutViewModel.this;
                qf.a aVar = loggedOutViewModel.f48195b;
                Application application = loggedOutViewModel.f48194a;
                C0663a c0663a = new C0663a(loggedOutViewModel);
                this.f48198a = 1;
                if (((com.withings.wiscale2.settings.k0) aVar).a(application, this, c0663a) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public LoggedOutViewModel(Application application, com.withings.wiscale2.settings.k0 k0Var) {
        this.f48194a = application;
        this.f48195b = k0Var;
    }

    public final void i0() {
        this.f48196c.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final n<y> j0() {
        return this.f48197d;
    }

    public final k0<Boolean> k0() {
        return this.f48196c;
    }
}
