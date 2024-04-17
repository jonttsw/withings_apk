package com.withings.wiscale2.vascularage;

import android.content.Context;
import androidx.compose.material.h6;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.Status;
import com.withings.common.compose.component.m4;
import com.withings.common.compose.component.n4;
import com.withings.common.compose.component.p4;
import com.withings.common.compose.component.y3;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreScreensKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.pwv.core.PwvCategory;
import com.withings.user.core.models.User;
import com.withings.weight.presentation.ui.model.SecondaryGraphUnit;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.vascularage.a;
import com.withings.wiscale2.vascularage.i;
import com.withings.wiscale2.vascularage.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m0.p1;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import z70.a;
/* compiled from: VascularAgeScreen.kt */
/* loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62336a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(3);
            this.f62336a = i11;
        }

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            p4 listOf = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(listOf, "$this$listOf");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._TREND_, aVar2);
                int i11 = this.f62336a;
                n4.c(u11, null, androidx.collection.c.r(C1987R.plurals.results_measurements_toGo_plural, i11, new Object[]{Integer.valueOf(i11)}, aVar2, 512), false, null, aVar2, 0, 26);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<Context, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62337a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(Context context) {
            Context context2 = context;
            kotlin.jvm.internal.u.j(context2, "context");
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            String string = context2.getString(C1987R.string.va_info_url);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            context2.startActivity(aVar.c(context2, null, string));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12) {
            super(2);
            this.f62338a = i11;
            this.f62339b = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62339b | 1);
            k0.a(this.f62338a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z70.c f62340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f62341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f62342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f62343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, z70.c cVar, Integer num, boolean z5) {
            super(2);
            this.f62340a = cVar;
            this.f62341b = z5;
            this.f62342c = num;
            this.f62343d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62343d | 1);
            boolean z5 = this.f62341b;
            Integer num2 = this.f62342c;
            k0.b(this.f62340a, z5, num2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f62344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m4 f62345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Integer num, m4 m4Var) {
            super(3);
            this.f62344a = num;
            this.f62345b = m4Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            String str;
            p4 add = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(add, "$this$add");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._AVERAGE_, aVar2);
                aVar2.s(71003143);
                Integer num2 = this.f62344a;
                if (num2 == null) {
                    str = null;
                } else {
                    str = num2 + " " + ay.b.u(C1987R.string._YEARS_OLD_, aVar2);
                }
                aVar2.J();
                if (str == null) {
                    str = "--";
                }
                n4.b(null, u11, null, str, this.f62345b.d(), false, aVar2, 0, 37);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<Context, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f62346a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(Context context) {
            Context context2 = context;
            kotlin.jvm.internal.u.j(context2, "context");
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            String string = context2.getString(C1987R.string.va_info_url);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            context2.startActivity(aVar.c(context2, null, string));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m4 f62347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m4 f62348b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f62349c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f62350d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f62351e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m4 m4Var, m4 m4Var2, boolean z5, Integer num, int i11) {
            super(2);
            this.f62347a = m4Var;
            this.f62348b = m4Var2;
            this.f62349c = z5;
            this.f62350d = num;
            this.f62351e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62351e | 1);
            boolean z5 = this.f62349c;
            Integer num2 = this.f62350d;
            k0.c(this.f62347a, this.f62348b, z5, num2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m4 f62352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m4 m4Var) {
            super(3);
            this.f62352a = m4Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            p4 arrayListOf = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(arrayListOf, "$this$arrayListOf");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.last_result_va, aVar2);
                m4 m4Var = this.f62352a;
                n4.b(null, u11, null, m4Var.f(), m4Var.d(), false, aVar2, 0, 37);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f62353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62354b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a aVar, boolean z5) {
            super(2);
            this.f62353a = z5;
            this.f62354b = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                String u11 = ay.b.u(C1987R.string.detailView_options_showRecommendedZones, aVar2);
                aVar2.s(1995074487);
                ym0.a<nm0.y> aVar3 = this.f62354b;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new m0(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.o.l(h11, this.f62353a, (ym0.l) t11, null, u11, null, false, false, false, null, aVar2, 0, 1000);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f62355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User.Names f62356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, User.Names names) {
            super(2);
            this.f62355a = context;
            this.f62356b = names;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.shareHealthReport_sectionShareComplete, aVar2), null, false, false, true, null, null, new n0(this.f62355a, this.f62356b), aVar2, 12582912, 0, 886);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f62357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User.Names f62359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f62360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z5, ym0.a<nm0.y> aVar, User.Names names, int i11) {
            super(2);
            this.f62357a = z5;
            this.f62358b = aVar;
            this.f62359c = names;
            this.f62360d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62360d | 1);
            ym0.a<nm0.y> aVar2 = this.f62358b;
            User.Names names = this.f62359c;
            k0.d(this.f62357a, aVar2, names, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeScreenKt$VascularAgeScreen$1", f = "VascularAgeScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f62361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r0 r0Var, qm0.d<? super l> dVar) {
            super(2, dVar);
            this.f62361a = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new l(this.f62361a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f62361a.W0(a.C0789a.f62239a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.l<ws.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f62362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(r0 r0Var) {
            super(1);
            this.f62362a = r0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(ws.f fVar) {
            ws.f timeGraphViewPort = fVar;
            kotlin.jvm.internal.u.j(timeGraphViewPort, "timeGraphViewPort");
            this.f62362a.W0(new a.c(timeGraphViewPort));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f62363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(r0 r0Var) {
            super(0);
            this.f62363a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f62363a.W0(a.b.f62240a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f62364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62365b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(r0 r0Var, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f62364a = r0Var;
            this.f62365b = aVar;
            this.f62366c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62366c | 1);
            k0.e(this.f62364a, this.f62365b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeScreenKt$VascularAgeScreenReady$1$1", f = "VascularAgeScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Object f62367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f62368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n0.z0 f62369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.o0 f62370d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VascularAgeScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeScreenKt$VascularAgeScreenReady$1$1$1", f = "VascularAgeScreen.kt", l = {ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62371a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f62372b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n0.z0 f62373c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ k1.o0 f62374d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z5, n0.z0 z0Var, k1.o0 o0Var, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f62372b = z5;
                this.f62373c = z0Var;
                this.f62374d = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f62372b, this.f62373c, this.f62374d, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62371a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    if (this.f62372b) {
                        p1 d11 = m0.k.d(150, 0, m0.c0.b(), 2);
                        this.f62371a = 1;
                        if (this.f62373c.j((int) this.f62374d.a(), d11, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(boolean z5, n0.z0 z0Var, k1.o0 o0Var, qm0.d<? super p> dVar) {
            super(2, dVar);
            this.f62368b = z5;
            this.f62369c = z0Var;
            this.f62370d = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            p pVar = new p(this.f62368b, this.f62369c, this.f62370d, dVar);
            pVar.f62367a = obj;
            return pVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((p) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f62367a, null, null, new a(this.f62368b, this.f62369c, this.f62370d, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.l<rs.e, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<GraphPeriod> f62375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ at.a f62376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(List<? extends GraphPeriod> list, at.a aVar) {
            super(1);
            this.f62375a = list;
            this.f62376b = aVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(rs.e eVar) {
            rs.e eVar2 = eVar;
            if (eVar2 != null && eVar2.g()) {
                at.a aVar = this.f62376b;
                GraphPeriod d11 = aVar.d();
                List<GraphPeriod> list = this.f62375a;
                DateTime e11 = bt.a.e(eVar2.f95616a);
                kotlin.jvm.internal.u.i(e11, "getDayFromUnitAbs(...)");
                aVar.i(list.get(list.indexOf(d11)), e11);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z70.c f62378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f62379c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f62380d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i11, z70.c cVar, Integer num, boolean z5) {
            super(2);
            this.f62377a = i11;
            this.f62378b = cVar;
            this.f62379c = z5;
            this.f62380d = num;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                k0.j(this.f62377a, this.f62378b, this.f62379c, this.f62380d, aVar2, 64);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z70.c f62381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<ts.d> f62383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e40.d f62384d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Double f62385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Interval f62386f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ at.a f62387g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f62388h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f62389i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62390j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ User.Names f62391k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ k1.o0 f62392l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(z70.c cVar, int i11, List<? extends ts.d> list, e40.d dVar, Double d11, Interval interval, at.a aVar, List<LearnMoreEntryTranslations> list2, boolean z5, ym0.a<nm0.y> aVar2, User.Names names, k1.o0 o0Var) {
            super(3);
            this.f62381a = cVar;
            this.f62382b = i11;
            this.f62383c = list;
            this.f62384d = dVar;
            this.f62385e = d11;
            this.f62386f = interval;
            this.f62387g = aVar;
            this.f62388h = list2;
            this.f62389i = z5;
            this.f62390j = aVar2;
            this.f62391k = names;
            this.f62392l = o0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            int i12;
            List<ts.d> list;
            androidx.compose.runtime.a aVar2;
            nm0.j jVar;
            m4 m4Var;
            m4 m4Var2;
            m4 m4Var3;
            String a11;
            r0.h DataVizScreen = hVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(DataVizScreen, "$this$DataVizScreen");
            if ((intValue & 81) == 16 && aVar3.h()) {
                aVar3.C();
            } else {
                aVar3.s(-483455358);
                e.a aVar4 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.layout.l0 a12 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar3, -1323940314);
                int G = aVar3.G();
                k1.v0 l5 = aVar3.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a13 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(aVar4);
                if (aVar3.i() instanceof k1.d) {
                    aVar3.A();
                    if (aVar3.e()) {
                        aVar3.F(a13);
                    } else {
                        aVar3.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar3, a12, aVar3, l5);
                    if (aVar3.e() || !kotlin.jvm.internal.u.e(aVar3.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar3, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar3), aVar3, 2058660585);
                    aVar3.s(-968557517);
                    z70.c cVar = this.f62381a;
                    int i13 = this.f62382b;
                    if (cVar != null) {
                        if (i13 > 0) {
                            a11 = bn.d.a(aVar3, -968557380, C1987R.string.vascular_age_standby_description, aVar3);
                        } else {
                            aVar3.s(-968557230);
                            z70.a b10 = cVar.b();
                            kotlin.jvm.internal.u.j(b10, "<this>");
                            aVar3.s(-1938497562);
                            if (kotlin.jvm.internal.u.e(b10, a.b.f110146a)) {
                                a11 = bn.d.a(aVar3, 1610618520, C1987R.string.vascular_age_detail_normal_description, aVar3);
                            } else if (kotlin.jvm.internal.u.e(b10, a.C1954a.f110145a)) {
                                a11 = bn.d.a(aVar3, 1610618628, C1987R.string.vascular_age_detail_high_bad_description, aVar3);
                            } else if (kotlin.jvm.internal.u.e(b10, a.c.f110147a)) {
                                a11 = bn.d.a(aVar3, 1610618736, C1987R.string.vascular_age_detail_low_optimal_description, aVar3);
                            } else if (kotlin.jvm.internal.u.e(b10, a.d.b.f110149a)) {
                                a11 = bn.d.a(aVar3, 1610618856, C1987R.string.vascular_age_detail_normal_supernova, aVar3);
                            } else if (kotlin.jvm.internal.u.e(b10, a.d.C1955a.f110148a)) {
                                a11 = bn.d.a(aVar3, 1610618972, C1987R.string.vascular_age_detail_high_bad_supernova, aVar3);
                            } else {
                                throw a0.a.c(aVar3, 1610617164);
                            }
                            aVar3.J();
                            aVar3.J();
                        }
                        androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(aVar4, yk.h.o(), yk.h.B());
                        aVar3.s(-968556979);
                        Object t11 = aVar3.t();
                        if (t11 == a.C0060a.a()) {
                            t11 = new o0(this.f62392l);
                            aVar3.n(t11);
                        }
                        aVar3.J();
                        androidx.compose.material3.d1.a(androidx.compose.ui.layout.u0.a(g11, (ym0.l) t11), null, null, null, null, s1.b.b(aVar3, -312066131, new p0(a11)), aVar3, 196608, 30);
                    }
                    aVar3.J();
                    aVar3.s(-968556480);
                    List<ts.d> list2 = this.f62383c;
                    if (!list2.isEmpty()) {
                        i11 = 2;
                        i12 = 1;
                        list = list2;
                        nk.a0.f(0, 0, 28, 0L, aVar3, androidx.compose.foundation.layout.x0.h(aVar4, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.vascularAge_breakdown_title, aVar3));
                    } else {
                        i11 = 2;
                        i12 = 1;
                        list = list2;
                    }
                    aVar3.J();
                    aVar3.s(-968556187);
                    e40.d dVar = this.f62384d;
                    if (dVar != null) {
                        if (i13 > 0) {
                            aVar3.s(-968556062);
                            jVar = new nm0.j(new m4(ay.b.u(C1987R.string.status_standBy, aVar3), Status.Icon.f33334h, ay.b.u(C1987R.string._AVERAGE_, aVar3), null, 8), new m4(androidx.collection.c.r(C1987R.plurals.results_measurements_toGo_plural, i13, new Object[]{Integer.valueOf(i13)}, aVar3, 512), null, ay.b.u(C1987R.string._TREND_, aVar3), null, 10));
                            aVar3.J();
                        } else {
                            aVar3.s(-968555217);
                            aVar3.s(-1555019114);
                            Double d11 = this.f62385e;
                            if (d11 == null || kotlin.jvm.internal.u.b(d11)) {
                                m4Var = m4.f34072e;
                                m4Var2 = m4.f34072e;
                                jVar = new nm0.j(m4Var, m4Var2);
                            } else {
                                PwvCategory a14 = dVar.a();
                                kotlin.jvm.internal.u.j(a14, "<this>");
                                aVar3.s(-518721102);
                                int ordinal = a14.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != i12) {
                                        if (ordinal == i11) {
                                            aVar3.s(-292196202);
                                            m4Var3 = new m4(f40.a.f(a14, aVar3), f40.a.b(a14), ay.b.u(C1987R.string.last_result_va, aVar3), null, 8);
                                            aVar3.J();
                                        } else {
                                            throw a0.a.c(aVar3, -292197796);
                                        }
                                    } else {
                                        aVar3.s(-292196453);
                                        m4Var3 = new m4(f40.a.f(a14, aVar3), f40.a.b(a14), ay.b.u(C1987R.string.last_result_va, aVar3), null, 8);
                                        aVar3.J();
                                    }
                                } else {
                                    aVar3.s(-292196703);
                                    m4Var3 = new m4(f40.a.f(a14, aVar3), f40.a.b(a14), ay.b.u(C1987R.string.last_result_va, aVar3), null, 8);
                                    aVar3.J();
                                }
                                aVar3.J();
                                double doubleValue = d11.doubleValue();
                                aVar3.s(-1666703125);
                                m4 m4Var4 = new m4(jm.a.c((jm.a) aVar3.D(com.withings.core.ui.b.b()), 91, doubleValue, 0, 0, 60).toString(), null, null, null, 14);
                                aVar3.J();
                                jVar = new nm0.j(m4Var3, m4Var4);
                            }
                            aVar3.J();
                            aVar3.J();
                        }
                        nm0.j jVar2 = jVar;
                        aVar3.s(-968555099);
                        Object t12 = aVar3.t();
                        if (t12 == a.C0060a.a()) {
                            t12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                            aVar3.n(t12);
                        }
                        k1.r0 r0Var = (k1.r0) t12;
                        aVar3.J();
                        androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(aVar4, yk.h.o());
                        aVar3.s(-968554889);
                        Interval interval = this.f62386f;
                        boolean K = aVar3.K(interval);
                        Object t13 = aVar3.t();
                        if (K || t13 == a.C0060a.a()) {
                            t13 = new ij0.e(interval);
                            aVar3.n(t13);
                        }
                        aVar3.J();
                        String u11 = ay.b.u(C1987R.string._PWV_, aVar3);
                        m4 m4Var5 = (m4) jVar2.c();
                        m4 m4Var6 = (m4) jVar2.d();
                        k90.c cVar2 = new k90.c(r0Var, (Context) aVar3.D(androidx.compose.ui.platform.u0.d()), SecondaryGraphUnit.f47270i, false);
                        q0 q0Var = new q0(dVar);
                        int i14 = at.a.f19549d;
                        aVar2 = aVar3;
                        ns.j.a(u11, cVar2, f11, false, null, q0Var, m4Var5, m4Var6, this.f62387g, list, null, null, (ij0.e) t13, false, null, null, aVar2, 1073741888, 512, 60440);
                    } else {
                        aVar2 = aVar3;
                    }
                    aVar2.J();
                    LearnMoreScreensKt.SectionLearnMore(ay.b.u(C1987R.string.weight_about_title, aVar2), this.f62388h, aVar2, 64);
                    k0.d(this.f62389i, this.f62390j, this.f62391k, aVar2, 512);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z70.c f62394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e40.d f62395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Interval f62396d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ at.a f62397e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<GraphPeriod> f62398f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<ws.f, nm0.y> f62399g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f62400h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62401i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List<ts.d> f62402j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ List<ts.d> f62403k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ List<LearnMoreEntryTranslations> f62404l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ User.Names f62405m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ LocalDate f62406n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f62407o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f62408p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f62409q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Integer f62410r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Double f62411s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f62412t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f62413u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(int i11, z70.c cVar, e40.d dVar, Interval interval, at.a aVar, List<? extends GraphPeriod> list, ym0.l<? super ws.f, nm0.y> lVar, boolean z5, ym0.a<nm0.y> aVar2, List<? extends ts.d> list2, List<? extends ts.d> list3, List<LearnMoreEntryTranslations> list4, User.Names names, LocalDate localDate, ym0.a<nm0.y> aVar3, boolean z11, boolean z12, Integer num, Double d11, int i12, int i13) {
            super(2);
            this.f62393a = i11;
            this.f62394b = cVar;
            this.f62395c = dVar;
            this.f62396d = interval;
            this.f62397e = aVar;
            this.f62398f = list;
            this.f62399g = lVar;
            this.f62400h = z5;
            this.f62401i = aVar2;
            this.f62402j = list2;
            this.f62403k = list3;
            this.f62404l = list4;
            this.f62405m = names;
            this.f62406n = localDate;
            this.f62407o = aVar3;
            this.f62408p = z11;
            this.f62409q = z12;
            this.f62410r = num;
            this.f62411s = d11;
            this.f62412t = i12;
            this.f62413u = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f62412t | 1);
            int g12 = ah.o.g(this.f62413u);
            Integer num2 = this.f62410r;
            Double d11 = this.f62411s;
            k0.f(this.f62393a, this.f62394b, this.f62395c, this.f62396d, this.f62397e, this.f62398f, this.f62399g, this.f62400h, this.f62401i, this.f62402j, this.f62403k, this.f62404l, this.f62405m, this.f62406n, this.f62407o, this.f62408p, this.f62409q, num2, d11, aVar, g11, g12);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i11, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(1114593263);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            n4.a(null, 0.0f, 0.0f, kotlin.collections.x.W(com.withings.wiscale2.vascularage.b.f62247a, s1.b.b(g11, 2136366768, new a(i11))), false, b.f62337a, g11, 224256, 7);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(z70.c cVar, boolean z5, Integer num, androidx.compose.runtime.a aVar, int i11) {
        m4 m4Var;
        m4 m4Var2;
        String c11;
        m4 m4Var3;
        androidx.compose.runtime.b g11 = aVar.g(1324174629);
        if (cVar != null && ((num == null || num.intValue() != 0) && num != null)) {
            g11.s(-1037202337);
            z70.a b10 = cVar.b();
            kotlin.jvm.internal.u.j(b10, "<this>");
            g11.s(1528421702);
            g11.s(-219795036);
            a.b bVar = a.b.f110146a;
            if (kotlin.jvm.internal.u.e(b10, bVar) || kotlin.jvm.internal.u.e(b10, a.d.b.f110149a)) {
                c11 = androidx.datastore.preferences.protobuf.e.c(g11, -1849255030, C1987R.string.vascular_age_result_normal, g11);
            } else if (kotlin.jvm.internal.u.e(b10, a.c.f110147a)) {
                c11 = androidx.datastore.preferences.protobuf.e.c(g11, -1849254936, C1987R.string.vascular_age_result_low_good, g11);
            } else if (kotlin.jvm.internal.u.e(b10, a.C1954a.f110145a) || kotlin.jvm.internal.u.e(b10, a.d.C1955a.f110148a)) {
                c11 = androidx.datastore.preferences.protobuf.e.c(g11, -1849254785, C1987R.string.vascular_age_result_high, g11);
            } else {
                g11.s(-1849255955);
                g11.J();
                throw new NoWhenBranchMatchedException();
            }
            String str = c11;
            g11.J();
            m4 m4Var4 = new m4(str, b80.a.c(b10), null, null, 12);
            g11.J();
            g11.s(322149566);
            z70.a b11 = cVar.b();
            if (kotlin.jvm.internal.u.e(b11, a.C1954a.f110145a)) {
                g11.s(-258514037);
                Integer d11 = cVar.d();
                String u11 = ay.b.u(C1987R.string._YEARS_, g11);
                m4Var3 = new m4("> " + d11 + "  " + u11, null, null, null, 14);
                g11.J();
            } else if (kotlin.jvm.internal.u.e(b11, bVar)) {
                g11.s(-258513918);
                Integer d12 = cVar.d();
                Integer c12 = cVar.c();
                String u12 = ay.b.u(C1987R.string._YEARS_, g11);
                m4Var3 = new m4(d12 + "-" + c12 + " " + u12, null, null, null, 14);
                g11.J();
            } else if (kotlin.jvm.internal.u.e(b11, a.c.f110147a)) {
                g11.s(-258513786);
                Integer c13 = cVar.c();
                String u13 = ay.b.u(C1987R.string._YEARS_, g11);
                m4Var3 = new m4("< " + c13 + " " + u13, null, null, null, 14);
                g11.J();
            } else if (kotlin.jvm.internal.u.e(b11, a.d.C1955a.f110148a)) {
                g11.s(-258513652);
                Integer d13 = cVar.d();
                String u14 = ay.b.u(C1987R.string._YEARS_, g11);
                m4Var3 = new m4("> " + d13 + "  " + u14, null, null, null, 14);
                g11.J();
            } else if (!kotlin.jvm.internal.u.e(b11, a.d.b.f110149a)) {
                g11.s(-258515224);
                g11.J();
                throw new NoWhenBranchMatchedException();
            } else {
                g11.s(-258513523);
                Integer c14 = cVar.c();
                String u15 = ay.b.u(C1987R.string._YEARS_, g11);
                m4Var3 = new m4("< " + c14 + "  " + u15, null, null, null, 14);
                g11.J();
            }
            m4 m4Var5 = m4Var3;
            g11.J();
            int i12 = i11 << 3;
            c(m4Var4, m4Var5, z5, num, g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 7168));
            g11.J();
        } else {
            g11.s(-1037202643);
            m4Var = m4.f34072e;
            m4Var2 = m4.f34072e;
            c(m4Var, m4Var2, z5, null, g11, 3072 | ((i11 << 3) & ConstantsWs.HWFAILURE_ZERO));
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(i11, cVar, num, z5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(m4 m4Var, m4 m4Var2, boolean z5, Integer num, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.b g11 = aVar.g(-1969331951);
        if ((i11 & 14) == 0) {
            if (g11.K(m4Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(m4Var2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z5)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(num)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            ArrayList q11 = kotlin.collections.x.q(s1.b.b(g11, 648235284, new h(m4Var)));
            if (z5) {
                q11.add(s1.b.b(g11, -1615897369, new e(num, m4Var2)));
            }
            n4.a(null, 0.0f, 0.0f, q11, false, f.f62346a, g11, 200704, 23);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(m4Var, m4Var2, z5, num, i11));
        }
    }

    public static final void d(boolean z5, ym0.a<nm0.y> switchNormalityZones, User.Names userNames, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(switchNormalityZones, "switchNormalityZones");
        kotlin.jvm.internal.u.j(userNames, "userNames");
        androidx.compose.runtime.b g11 = aVar.g(-351501976);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(aVar2, 0.0f, yk.h.y(), 1);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(h11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            nk.a0.f(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.x0.h(aVar2, og.y.a(0, c11, k1.j1.a(g11), g11, 2058660585), 0.0f, 2), 0.0f, 0.0f, 0.0f, yk.h.h(), 7), null, ay.b.u(C1987R.string.options, g11));
            y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, 921524866, new i(switchNormalityZones, z5)), g11, 1572864, 63);
            y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, -1961464327, new j(context, userNames)), g11, 1572864, 63);
            androidx.compose.runtime.v b12 = h6.b(g11);
            if (b12 != null) {
                b12.G(new k(z5, switchNormalityZones, userNames, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void e(r0 viewModel, ym0.a<nm0.y> onBackPressed, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        List<ts.d> k11;
        e40.d dVar;
        boolean z5;
        Double d11;
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBackPressed, "onBackPressed");
        androidx.compose.runtime.b g11 = aVar.g(1570274590);
        k1.r0 b10 = androidx.compose.runtime.l0.b(viewModel.V0(), g11);
        k1.y.f(Boolean.TRUE, new l(viewModel, null), g11);
        if (((com.withings.wiscale2.vascularage.i) b10.getValue()) instanceof i.b) {
            g11.s(-137761621);
            com.withings.wiscale2.vascularage.i iVar = (com.withings.wiscale2.vascularage.i) b10.getValue();
            kotlin.jvm.internal.u.h(iVar, "null cannot be cast to non-null type com.withings.wiscale2.vascularage.State.Ready");
            i.b bVar2 = (i.b) iVar;
            List<ts.d> l5 = l(bVar2.e().b(), bVar2.b().b(), bVar2.e().d(), g11, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            if (bVar2.d() == null) {
                k11 = null;
            } else {
                k11 = k(bVar2.d().b(), bVar2.b().b(), bVar2.d().d(), g11, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            }
            if (k11 == null) {
                k11 = kotlin.collections.i0.f76187a;
            }
            List<ts.d> list = k11;
            Interval e11 = bVar2.b().e();
            List<GraphPeriod> a11 = bVar2.b().a();
            z70.c e12 = bVar2.e().e();
            com.withings.wiscale2.vascularage.h d12 = bVar2.d();
            if (d12 != null) {
                dVar = d12.c();
            } else {
                dVar = null;
            }
            boolean b11 = bVar2.b().b();
            int c11 = bVar2.c();
            List<LearnMoreEntryTranslations> a12 = bVar2.a();
            at.a d13 = bVar2.b().d();
            User.Names c12 = bVar2.b().c();
            com.withings.wiscale2.vascularage.h d14 = bVar2.d();
            if (d14 != null && d14.e()) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f11 = bVar2.b().f();
            Integer a13 = bVar2.e().a();
            LocalDate c13 = bVar2.e().c();
            com.withings.wiscale2.vascularage.h d15 = bVar2.d();
            if (d15 != null) {
                d11 = d15.a();
            } else {
                d11 = null;
            }
            m mVar = new m(viewModel);
            n nVar = new n(viewModel);
            int i13 = at.a.f19549d;
            i12 = i11;
            f(c11, e12, dVar, e11, d13, a11, mVar, b11, nVar, list, l5, a12, c12, c13, onBackPressed, z5, f11, a13, d11, g11, 1074008640, ((i11 << 9) & 57344) | 4680);
            g11.J();
            bVar = g11;
        } else {
            i12 = i11;
            bVar = g11;
            bVar.s(-137759491);
            ks.g.a(null, ay.b.u(C1987R.string.vascular_age_title, bVar), 0, false, onBackPressed, null, null, bVar, ((i12 << 9) & 57344) | 3072, 101);
            bVar.J();
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new o(viewModel, onBackPressed, i12));
        }
    }

    public static final void f(int i11, z70.c cVar, e40.d dVar, Interval bounds, at.a viewPort, List<? extends GraphPeriod> graphPeriod, ym0.l<? super ws.f, nm0.y> onViewPortChange, boolean z5, ym0.a<nm0.y> onSwitchNormalityZones, List<? extends ts.d> pwvGraphList, List<? extends ts.d> vascularAgeGraphList, List<LearnMoreEntryTranslations> article, User.Names userNames, LocalDate userAge, ym0.a<nm0.y> onBackPressed, boolean z11, boolean z12, Integer num, Double d11, androidx.compose.runtime.a aVar, int i12, int i13) {
        kotlin.jvm.internal.u.j(bounds, "bounds");
        kotlin.jvm.internal.u.j(viewPort, "viewPort");
        kotlin.jvm.internal.u.j(graphPeriod, "graphPeriod");
        kotlin.jvm.internal.u.j(onViewPortChange, "onViewPortChange");
        kotlin.jvm.internal.u.j(onSwitchNormalityZones, "onSwitchNormalityZones");
        kotlin.jvm.internal.u.j(pwvGraphList, "pwvGraphList");
        kotlin.jvm.internal.u.j(vascularAgeGraphList, "vascularAgeGraphList");
        kotlin.jvm.internal.u.j(article, "article");
        kotlin.jvm.internal.u.j(userNames, "userNames");
        kotlin.jvm.internal.u.j(userAge, "userAge");
        kotlin.jvm.internal.u.j(onBackPressed, "onBackPressed");
        androidx.compose.runtime.b g11 = aVar.g(491856998);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        g11.s(-1050761985);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, -1050761892);
        if (a11 == a.C0060a.a()) {
            a11 = new ys.d(new ij0.j(r0Var, context, userAge), true);
            g11.n(a11);
        }
        ys.d dVar2 = (ys.d) a11;
        g11.J();
        n0.z0 b10 = n0.y0.b(g11);
        g11.s(-1050761653);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = ah.l.t(0.0f);
            g11.n(t12);
        }
        k1.o0 o0Var = (k1.o0) t12;
        g11.J();
        g11.s(-1050761581);
        boolean K = g11.K(b10) | ((((i13 & 458752) ^ 196608) > 131072 && g11.a(z11)) || (i13 & 196608) == 131072);
        Object t13 = g11.t();
        if (K || t13 == a.C0060a.a()) {
            t13 = new p(z11, b10, o0Var, null);
            g11.n(t13);
        }
        g11.J();
        k1.y.f("scrollToPWV", (ym0.p) t13, g11);
        String u11 = ay.b.u(C1987R.string.vascular_age_title, g11);
        g11.s(-1050760947);
        boolean K2 = g11.K(bounds);
        Object t14 = g11.t();
        if (K2 || t14 == a.C0060a.a()) {
            t14 = new ij0.i(bounds);
            g11.n(t14);
        }
        g11.J();
        androidx.compose.ui.e p11 = ah.k.p(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a));
        q qVar = new q(graphPeriod, viewPort);
        s1.a b11 = s1.b.b(g11, 1682781382, new r(i11, cVar, num, z12));
        s1.a b12 = s1.b.b(g11, 147960912, new s(cVar, i11, pwvGraphList, dVar, d11, bounds, viewPort, article, z5, onSwitchNormalityZones, userNames, o0Var));
        int i14 = at.a.f19549d;
        ks.g.b(u11, p11, viewPort, graphPeriod, bounds, vascularAgeGraphList, null, (ij0.i) t14, dVar2, null, null, qVar, onBackPressed, null, false, onViewPortChange, null, b11, null, null, null, b10, b12, g11, ((i12 >> 6) & ConstantsWs.HWFAILURE_ZERO) | 151293952, ((i13 >> 6) & ConstantsWs.HWFAILURE_ZERO) | 12582912 | ((i12 >> 3) & 458752), ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1926720);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(i11, cVar, dVar, bounds, viewPort, graphPeriod, onViewPortChange, z5, onSwitchNormalityZones, pwvGraphList, vascularAgeGraphList, article, userNames, userAge, onBackPressed, z11, z12, num, d11, i12, i13));
        }
    }

    public static final void j(int i11, z70.c cVar, boolean z5, Integer num, androidx.compose.runtime.a aVar, int i12) {
        androidx.compose.runtime.b g11 = aVar.g(-260663626);
        if (i11 > 0) {
            g11.s(-1268829269);
            a(i11, g11, i12 & 14);
            g11.J();
        } else {
            g11.s(-1268829207);
            int i13 = i12 >> 3;
            b(cVar, z5, num, g11, (i13 & ConstantsWs.HWFAILURE_ZERO) | (i13 & 112) | 8);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l0(i11, cVar, z5, num, i12));
        }
    }

    public static final List<ts.d> k(List<r0.a> circleDatum, boolean z5, nm0.j<b90.a, b90.a> pwvRange, androidx.compose.runtime.a aVar, int i11) {
        boolean z11;
        kotlin.jvm.internal.u.j(circleDatum, "circleDatum");
        kotlin.jvm.internal.u.j(pwvRange, "pwvRange");
        aVar.s(-1447790062);
        Context context = (Context) aVar.D(androidx.compose.ui.platform.u0.d());
        aVar.s(1803273587);
        boolean K = aVar.K(circleDatum);
        if ((((i11 & 112) ^ 48) > 32 && aVar.a(z5)) || (i11 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean K2 = z11 | K | aVar.K(pwvRange);
        Object t11 = aVar.t();
        if (K2 || t11 == a.C0060a.a()) {
            t11 = new ij0.b(context).a(circleDatum, z5, pwvRange);
            aVar.n(t11);
        }
        List<ts.d> list = (List) t11;
        aVar.J();
        aVar.J();
        return list;
    }

    public static final List<ts.d> l(List<r0.a> circleDatum, boolean z5, nm0.j<b90.a, b90.a> jVar, androidx.compose.runtime.a aVar, int i11) {
        boolean z11;
        kotlin.jvm.internal.u.j(circleDatum, "circleDatum");
        aVar.s(-223074561);
        Context context = (Context) aVar.D(androidx.compose.ui.platform.u0.d());
        aVar.s(2111641088);
        boolean K = aVar.K(circleDatum);
        if ((((i11 & 112) ^ 48) > 32 && aVar.a(z5)) || (i11 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean K2 = z11 | K | aVar.K(jVar);
        Object t11 = aVar.t();
        if (K2 || t11 == a.C0060a.a()) {
            t11 = new ij0.c(context).a(circleDatum, z5, jVar);
            aVar.n(t11);
        }
        List<ts.d> list = (List) t11;
        aVar.J();
        aVar.J();
        return list;
    }
}
