package com.withings.wiscale2.vascularage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.camera.camera2.internal.v1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import ij0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jj0.a;
import jj0.c;
import jj0.d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import tb0.f3;
/* compiled from: VascularAgeQuarterFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/vascularage/y;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/graph/GraphView$e;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class y extends com.withings.wiscale2.vascularage.g implements CustomNestedScrollView.c, GraphView.e {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public fy.l f62510h;

    /* renamed from: o  reason: collision with root package name */
    private int f62517o;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public fy.p f62519q;

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f62509s = {androidx.camera.core.v.c(y.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(y.class, "startOfQuarter", "getStartOfQuarter()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(y.class, "selectedDate", "getSelectedDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(y.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentVascularAgeQuarterBinding;", 0)};

    /* renamed from: r  reason: collision with root package name */
    public static final a f62508r = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final g f62511i = new g(this);

    /* renamed from: j  reason: collision with root package name */
    private final h f62512j = new h(this);

    /* renamed from: k  reason: collision with root package name */
    private final i f62513k = new i(this);

    /* renamed from: l  reason: collision with root package name */
    private final LifecycleViewBindingProperty f62514l = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f62515m = nm0.h.b(new d());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f62516n = nm0.h.b(new e());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f62518p = nm0.h.b(new k());

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void b(int i11);
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends androidx.lifecycle.b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.f f62520a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.lifecycle.j0 f62521b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.lifecycle.j0 f62522c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.lifecycle.j0 f62523d;

        /* renamed from: e  reason: collision with root package name */
        private final androidx.lifecycle.j0 f62524e;

        /* renamed from: f  reason: collision with root package name */
        private final androidx.lifecycle.j0 f62525f;

        /* compiled from: VascularAgeQuarterFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeQuarterFragment$VascularAgeQuarterViewModel$allVascularAges$1", f = "VascularAgeQuarterFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGMACADDRESS, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<nm0.j<? extends List<? extends ky.d>, ? extends List<? extends ky.d>>>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62526a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f62527b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f62528c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ fy.l f62529d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(User user, fy.l lVar, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f62528c = user;
                this.f62529d = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f62528c, this.f62529d, dVar);
                aVar.f62527b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<nm0.j<? extends List<? extends ky.d>, ? extends List<? extends ky.d>>> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.lifecycle.h0 h0Var;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            nm0.l.b(obj);
                            return nm0.y.f85009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = (androidx.lifecycle.h0) this.f62527b;
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    h0Var = (androidx.lifecycle.h0) this.f62527b;
                    long q11 = this.f62528c.q();
                    int[] iArr = {ConstantsWs.MEASURE_TYPE_VASCULAR_AGE};
                    this.f62527b = h0Var;
                    this.f62526a = 1;
                    obj = fy.l.c(this.f62529d, q11, null, null, true, iArr, this, 20);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((ky.d) obj2).e().b() == 8) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                nm0.j jVar = new nm0.j(arrayList, arrayList2);
                this.f62527b = null;
                this.f62526a = 2;
                if (h0Var.emit(jVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<ky.d>, List<ky.d>>, LiveData<jj0.a>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ fy.p f62530a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f62531b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ DateTime f62532c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(fy.p pVar, User user, DateTime dateTime) {
                super(1);
                this.f62530a = pVar;
                this.f62531b = user;
                this.f62532c = dateTime;
            }

            @Override // ym0.l
            public final LiveData<jj0.a> invoke(nm0.j<List<ky.d>, List<ky.d>> jVar) {
                nm0.j<List<ky.d>, List<ky.d>> vascularAges = jVar;
                kotlin.jvm.internal.u.j(vascularAges, "vascularAges");
                return androidx.lifecycle.h.a(Dispatchers.getIO(), new z(this.f62530a, this.f62531b, this.f62532c, vascularAges, null), 2);
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* renamed from: com.withings.wiscale2.vascularage.y$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0795c extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Boolean, nm0.j<List<ky.d>, List<ky.d>>>, nm0.o<Boolean, List<x>, List<x>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f62533a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0795c(User user) {
                super(1);
                this.f62533a = user;
            }

            @Override // ym0.l
            public final nm0.o<Boolean, List<x>, List<x>> invoke(nm0.j<Boolean, nm0.j<List<ky.d>, List<ky.d>>> jVar) {
                boolean z5;
                nm0.j<Boolean, nm0.j<List<ky.d>, List<ky.d>>> jVar2 = jVar;
                Boolean a11 = jVar2.a();
                a11.getClass();
                nm0.j<List<ky.d>, List<ky.d>> b10 = jVar2.b();
                ArrayList<ky.d> l02 = kotlin.collections.x.l0(b10.d(), b10.c());
                User user = this.f62533a;
                kotlin.jvm.internal.u.j(user, "user");
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(l02, 10));
                for (ky.d dVar : l02) {
                    DateTime c11 = dVar.c();
                    int C = (int) v1.C(user, c11);
                    float f11 = (float) ly.a.f(ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, dVar);
                    jj0.a a12 = jj0.b.a(new a80.b(new a80.c()).a(f11, C));
                    jj0.c a13 = c.a.a(f11, C);
                    if (dVar.e().b() == 8) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(new x(c11, f11, a12, a13, z5));
                }
                return new nm0.o<>(a11, arrayList, g.a.a(user, b10.c()));
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* loaded from: classes5.dex */
        static final class d extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Boolean, jj0.a>, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f62534a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final Boolean invoke(nm0.j<Boolean, jj0.a> jVar) {
                boolean z5;
                nm0.j<Boolean, jj0.a> jVar2 = jVar;
                boolean booleanValue = jVar2.a().booleanValue();
                jj0.a b10 = jVar2.b();
                if (!(b10 instanceof a.b) && !(b10 instanceof a.C1135a) && !booleanValue) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeQuarterFragment$VascularAgeQuarterViewModel$isSuperNovaUser$1", f = "VascularAgeQuarterFragment.kt", l = {250}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62535a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f62536b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f62537c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ DateTime f62538d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(User user, DateTime dateTime, qm0.d<? super e> dVar) {
                super(2, dVar);
                this.f62537c = user;
                this.f62538d = dateTime;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                e eVar = new e(this.f62537c, this.f62538d, dVar);
                eVar.f62536b = obj;
                return eVar;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((e) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z5;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62535a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f62536b;
                    if (v1.C(this.f62537c, this.f62538d) < 25.0d) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z5);
                    this.f62535a = 1;
                    if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeQuarterFragment$VascularAgeQuarterViewModel$learnMoreArticles$1", f = "VascularAgeQuarterFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGSHAREID, ConstantsWs.WS_STATUS_WRONGSHAREID}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62539a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f62540b;

            f(qm0.d<? super f> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                f fVar = new f(dVar);
                fVar.f62540b = obj;
                return fVar;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<List<? extends LearnMoreEntryTranslations>> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((f) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.lifecycle.h0 h0Var;
                List<LearnMoreEntryTranslations> vascularAge;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62539a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            nm0.l.b(obj);
                            return nm0.y.f85009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = (androidx.lifecycle.h0) this.f62540b;
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    h0Var = (androidx.lifecycle.h0) this.f62540b;
                    LearnMoreManager learnMoreManager = new LearnMoreManager(c.this.getApplication());
                    this.f62540b = h0Var;
                    this.f62539a = 1;
                    obj = learnMoreManager.getLearnMoreCategories(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
                if (learnMoreCategories != null && (vascularAge = learnMoreCategories.getVascularAge()) != null) {
                    this.f62540b = null;
                    this.f62539a = 2;
                    if (h0Var.emit(vascularAge, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* loaded from: classes5.dex */
        static final class g extends kotlin.jvm.internal.w implements ym0.l<List<ky.d>, String> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f62542a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DateTime f62543b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f62544c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(User user, DateTime dateTime, c cVar) {
                super(1);
                this.f62542a = user;
                this.f62543b = dateTime;
                this.f62544c = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
            @Override // ym0.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String invoke(java.util.List<ky.d> r13) {
                /*
                    Method dump skipped, instructions count: 451
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vascularage.y.c.g.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* loaded from: classes5.dex */
        static final class h extends kotlin.jvm.internal.w implements ym0.l<List<ky.d>, jj0.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f62545a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(User user) {
                super(1);
                this.f62545a = user;
            }

            @Override // ym0.l
            public final jj0.d invoke(List<ky.d> list) {
                Float f11;
                List<ky.d> vascularAgesInQuarter = list;
                kotlin.jvm.internal.u.j(vascularAgesInQuarter, "vascularAgesInQuarter");
                User user = this.f62545a;
                kotlin.jvm.internal.u.j(user, "user");
                ArrayList a11 = g.a.a(user, vascularAgesInQuarter);
                x xVar = (x) kotlin.collections.x.K(a11);
                Float f12 = null;
                if (xVar != null) {
                    f11 = Float.valueOf(xVar.a());
                } else {
                    f11 = null;
                }
                x xVar2 = (x) kotlin.collections.x.U(a11);
                if (xVar2 != null) {
                    f12 = Float.valueOf(xVar2.a());
                }
                if (f11 != null && f12 != null) {
                    if (f12.floatValue() - f11.floatValue() >= 0.75d) {
                        return d.c.f74550c;
                    }
                    if (f11.floatValue() - f12.floatValue() >= 0.75d) {
                        return d.a.f74548c;
                    }
                    return d.C1137d.f74551c;
                }
                return d.b.f74549c;
            }
        }

        /* compiled from: VascularAgeQuarterFragment.kt */
        /* loaded from: classes5.dex */
        static final class i extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<ky.d>, List<ky.d>>, List<ky.d>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DateTime f62546a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(DateTime dateTime) {
                super(1);
                this.f62546a = dateTime;
            }

            @Override // ym0.l
            public final List<ky.d> invoke(nm0.j<List<ky.d>, List<ky.d>> jVar) {
                nm0.j<List<ky.d>, List<ky.d>> vascularAges = jVar;
                kotlin.jvm.internal.u.j(vascularAges, "vascularAges");
                ArrayList arrayList = new ArrayList();
                for (Object obj : vascularAges.c()) {
                    ky.d dVar = (ky.d) obj;
                    kotlin.jvm.internal.u.j(dVar, "<this>");
                    DateTime startOfQuarter = this.f62546a;
                    kotlin.jvm.internal.u.j(startOfQuarter, "startOfQuarter");
                    if (new Interval(startOfQuarter, a3.g.x(startOfQuarter)).contains(new DateTime(dVar.c()))) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Application application, User user, DateTime startOfQuarter, fy.p pVar, fy.l lVar) {
            super(application);
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(startOfQuarter, "startOfQuarter");
            this.f62520a = androidx.lifecycle.h.a(Dispatchers.getIO(), new f(null), 2);
            androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(user, lVar, null), 2);
            androidx.lifecycle.j0 b10 = androidx.lifecycle.e1.b(a11, new i(startOfQuarter));
            androidx.lifecycle.f a12 = androidx.lifecycle.h.a(null, new e(user, startOfQuarter, null), 3);
            this.f62521b = androidx.lifecycle.e1.b(b10, new h(user));
            this.f62522c = androidx.lifecycle.e1.b(b10, new g(user, startOfQuarter, this));
            androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(a11, new b(pVar, user, startOfQuarter));
            this.f62523d = c11;
            this.f62524e = androidx.lifecycle.e1.b(xw.a.d(new nm0.j(a12, c11)), d.f62534a);
            this.f62525f = androidx.lifecycle.e1.b(xw.a.d(new nm0.j(a12, a11)), new C0795c(user));
        }

        public final androidx.lifecycle.j0 f0() {
            return this.f62523d;
        }

        public final androidx.lifecycle.j0 g0() {
            return this.f62525f;
        }

        public final androidx.lifecycle.f i0() {
            return this.f62520a;
        }

        public final androidx.lifecycle.j0 j0() {
            return this.f62522c;
        }

        public final androidx.lifecycle.j0 k0() {
            return this.f62521b;
        }

        public final androidx.lifecycle.j0 m0() {
            return this.f62524e;
        }
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<b> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            FragmentActivity activity = y.this.getActivity();
            kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.vascularage.VascularAgeQuarterFragment.Delegate");
            return (b) activity;
        }
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<BlockableViewPager.b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final BlockableViewPager.b invoke() {
            FragmentActivity activity = y.this.getActivity();
            kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
            return (BlockableViewPager.b) activity;
        }
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    static final class f implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f62549a;

        f(ym0.l lVar) {
            this.f62549a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f62549a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f62549a;
        }

        public final int hashCode() {
            return this.f62549a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f62549a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62550a = nm0.h.b(new g0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f62551b;

        public g(Fragment fragment) {
            this.f62551b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62550a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62552a = nm0.h.b(new h0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f62553b;

        public h(Fragment fragment) {
            this.f62553b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62552a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class i implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62554a = nm0.h.b(new i0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f62555b;

        public i(Fragment fragment) {
            this.f62555b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62554a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.l<y, f3> {
        @Override // ym0.l
        public final f3 invoke(y yVar) {
            y fragment = yVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return f3.a(fragment.requireView());
        }
    }

    /* compiled from: VascularAgeQuarterFragment.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<c> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final c invoke() {
            y yVar = y.this;
            Application application = yVar.requireActivity().getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            User u12 = y.u1(yVar);
            DateTime t12 = y.t1(yVar);
            fy.p pVar = yVar.f62519q;
            if (pVar != null) {
                fy.l lVar = yVar.f62510h;
                if (lVar != null) {
                    return new c(application, u12, t12, pVar, lVar);
                }
                kotlin.jvm.internal.u.s("getMeasureGroupWithAllTypesBetweenUseCase");
                throw null;
            }
            kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
            throw null;
        }
    }

    private final f3 A1() {
        return (f3) this.f62514l.getValue(this, f62509s[3]);
    }

    private final c B1() {
        return (c) this.f62518p.getValue();
    }

    public static final void s1(y yVar, boolean z5, List list, List list2) {
        Float valueOf;
        float f11;
        ProgressBar graphLoading = yVar.A1().f99088e;
        kotlin.jvm.internal.u.i(graphLoading, "graphLoading");
        graphLoading.setVisibility(8);
        yVar.A1().f99087d.setOnScrubbingListener(yVar);
        fn0.k<Object>[] kVarArr = f62509s;
        fn0.k<Object> kVar = kVarArr[0];
        g gVar = yVar.f62511i;
        User user = (User) gVar.getValue(yVar, kVar);
        kotlin.jvm.internal.u.j(list, "<this>");
        List list3 = list;
        Iterator it = list3.iterator();
        Float f12 = null;
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float a11 = ((x) it.next()).a();
            while (it.hasNext()) {
                a11 = Math.max(a11, ((x) it.next()).a());
            }
            valueOf = Float.valueOf(a11);
        }
        float f13 = 0.0f;
        if (valueOf != null) {
            f11 = valueOf.floatValue();
        } else {
            f11 = 0.0f;
        }
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            float a12 = ((x) it2.next()).a();
            while (it2.hasNext()) {
                a12 = Math.min(a12, ((x) it2.next()).a());
            }
            f12 = Float.valueOf(a12);
        }
        if (f12 != null) {
            f13 = f12.floatValue();
        }
        nm0.j jVar = new nm0.j(Integer.valueOf((int) f13), Integer.valueOf((int) f11));
        fn0.k<Object> kVar2 = kVarArr[1];
        h hVar = yVar.f62512j;
        List b10 = c.a.b(user, jVar, (DateTime) hVar.getValue(yVar, kVar2));
        f80.a aVar = new f80.a(((jj0.c) kotlin.collections.x.I(b10)).e(), ((jj0.c) kotlin.collections.x.T(b10)).b(), 0.0f, false, 92, new int[]{92}, 25628);
        TimeGraphView graph = yVar.A1().f99087d;
        kotlin.jvm.internal.u.i(graph, "graph");
        User user2 = (User) gVar.getValue(yVar, kVarArr[0]);
        GraphPopupView viewPopup = yVar.A1().f99095l;
        kotlin.jvm.internal.u.i(viewPopup, "viewPopup");
        new ij0.g(graph, aVar, user2, viewPopup, z5, (DateTime) hVar.getValue(yVar, kVarArr[1]), list, list2, b10, m0.t.l(yVar), (DateTime) yVar.f62513k.getValue(yVar, kVarArr[2])).k();
    }

    public static final DateTime t1(y yVar) {
        yVar.getClass();
        return (DateTime) yVar.f62512j.getValue(yVar, f62509s[1]);
    }

    public static final User u1(y yVar) {
        yVar.getClass();
        return (User) yVar.f62511i.getValue(yVar, f62509s[0]);
    }

    public static final void v1(y yVar, jj0.a aVar) {
        LineCellView lineCellView = yVar.A1().f99092i;
        lineCellView.x(C1987R.drawable.ic_circle_black_12dp, aVar.a());
        lineCellView.setLabel(com.withings.wiscale2.spo2.m.h(lineCellView, aVar.c()));
        if (aVar instanceof a.b) {
            yVar.A1().f99092i.setSecondaryLabel(yVar.getString(C1987R.string.vascular_age_result_emptyState_description));
        } else if (aVar instanceof a.C1135a) {
            LineCellView lineCellView2 = yVar.A1().f99092i;
            Context requireContext = yVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            lineCellView2.setSecondaryLabel(((a.C1135a) aVar).d(requireContext));
        }
        yVar.A1().f99091h.setMessage(aVar.b());
    }

    public static final void w1(y yVar, List list) {
        yVar.A1().f99084a.setArticles(list);
    }

    public static final void x1(y yVar, String str) {
        yVar.A1().f99093j.setValue(str);
    }

    public static final void y1(y yVar, jj0.d dVar) {
        LineCellView lineCellView = yVar.A1().f99094k;
        String a11 = dVar.a();
        String string = yVar.getString(dVar.b());
        lineCellView.setValue(a11 + string);
    }

    public static final void z1(y yVar, boolean z5) {
        int i11;
        LineCellView vascularAgeRange = yVar.A1().f99093j;
        kotlin.jvm.internal.u.i(vascularAgeRange, "vascularAgeRange");
        int i12 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        vascularAgeRange.setVisibility(i11);
        LineCellView vascularAgeTrend = yVar.A1().f99094k;
        kotlin.jvm.internal.u.i(vascularAgeTrend, "vascularAgeTrend");
        if (z5) {
            i12 = 0;
        }
        vascularAgeTrend.setVisibility(i12);
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView customNestedScrollView, int i11) {
        this.f62517o = i11;
        A1().f99095l.a();
        ((b) this.f62515m.getValue()).b(i11);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingEnded() {
        ((BlockableViewPager.b) this.f62516n.getValue()).Q1(true);
        A1().f99086c.setScrollingEnabled(true);
    }

    @Override // com.withings.graph.GraphView.e
    public final void onScrubbingStarted() {
        ((BlockableViewPager.b) this.f62516n.getValue()).Q1(false);
        A1().f99086c.setScrollingEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        float f11 = i70.b.a(getActivity()).x;
        int i11 = (int) (0.42857143f * f11);
        int i12 = (int) (f11 * 0.75f);
        A1().f99089f.getLayoutParams().height = i12;
        A1().f99089f.requestLayout();
        CustomNestedScrollView customNestedScrollView = A1().f99086c;
        customNestedScrollView.E(A1().f99089f, A1().f99090g, A1().f99085b, i11, i12);
        customNestedScrollView.F(this.f62517o);
        customNestedScrollView.setDelegate(this);
        B1().i0().observe(getViewLifecycleOwner(), new f(new a0(this)));
        B1().k0().observe(getViewLifecycleOwner(), new f(new b0(this)));
        B1().j0().observe(getViewLifecycleOwner(), new f(new c0(this)));
        B1().f0().observe(getViewLifecycleOwner(), new f(new d0(this)));
        B1().m0().observe(getViewLifecycleOwner(), new f(new e0(this)));
        B1().g0().observe(getViewLifecycleOwner(), new f(new f0(this)));
    }
}
