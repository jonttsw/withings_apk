package com.withings.wiscale2.partner.ui;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.DataType;
import com.samsung.android.sdk.healthdata.HealthConnectionErrorResult;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import com.withings.partner.model.Partner;
import com.withings.partner.model.PartnerAssociationStatusLoader;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker;
import com.withings.wiscale2.partner.ui.d2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.k;
import u10.j0;
import v10.c;
import y10.a;
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
public final class f2 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final PartnerActivity f59005a;

    /* renamed from: b  reason: collision with root package name */
    private final User f59006b;

    /* renamed from: c  reason: collision with root package name */
    private final a10.a f59007c;

    /* renamed from: d  reason: collision with root package name */
    private final t10.e f59008d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59009e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f59010f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<Boolean> f59011g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f59012h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<Boolean> f59013i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<Boolean> f59014j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f59015k;

    /* renamed from: l  reason: collision with root package name */
    private final t10.c f59016l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f59017m;

    /* renamed from: n  reason: collision with root package name */
    private final xw.h<nm0.j<Partner, d2>> f59018n;

    /* renamed from: o  reason: collision with root package name */
    private final com.withings.wiscale2.partner.ui.g f59019o;

    /* renamed from: p  reason: collision with root package name */
    private final xw.n<a> f59020p;

    /* renamed from: q  reason: collision with root package name */
    private final xw.n f59021q;

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* compiled from: PartnerActivity.kt */
        /* renamed from: com.withings.wiscale2.partner.ui.f2$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0765a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0765a f59022a = new a(0);
        }

        /* compiled from: PartnerActivity.kt */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f59023a = new a(0);
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59024a;

        static {
            int[] iArr = new int[Partner.values().length];
            try {
                iArr[Partner.f43456n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Partner.f43461s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Partner.f43457o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Partner.f43458p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59024a = iArr;
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f59025a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final c.a invoke() {
            return new c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$discardChanges$1$1", f = "PartnerActivity.kt", l = {389}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59026a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Partner f59028c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f59029d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Partner partner, ym0.a<nm0.y> aVar, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f59028c = partner;
            this.f59029d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f59028c, this.f59029d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            sf0.y e11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59026a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    f2 f2Var = f2.this;
                    List<? extends u10.u> value = f2Var.G0().getValue();
                    Partner partner = this.f59028c;
                    if (value != null) {
                        for (u10.u uVar : value) {
                            Context B0 = f2Var.B0();
                            User user = f2Var.f59006b;
                            kotlin.jvm.internal.u.g(partner);
                            uVar.h(B0, user, partner, false);
                            if (uVar instanceof c.p) {
                                androidx.work.impl.n0.n(f2Var.B0()).i("ImportStepsFromFit");
                            } else if (uVar instanceof a.d) {
                                androidx.work.impl.n0.n(f2Var.B0()).i("ImportStepsFromSHealth");
                            } else if ((uVar instanceof j0.b) && (e11 = a70.a.e(partner)) != null) {
                                e11.d(f2Var.B0());
                            }
                        }
                    }
                    t10.e eVar = f2Var.f59008d;
                    Context B02 = f2Var.B0();
                    long q11 = f2Var.f59006b.q();
                    kotlin.jvm.internal.u.g(partner);
                    this.f59026a = 1;
                    if (eVar.j(q11, B02, partner, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                a11 = nm0.y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (!(a11 instanceof k.a)) {
                nm0.y yVar = (nm0.y) a11;
                this.f59029d.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$onRequestPermissionsResult$1$1", f = "PartnerActivity.kt", l = {430}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59030a;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59030a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                f2 f2Var = f2.this;
                a10.a aVar = f2Var.f59007c;
                long q11 = f2Var.f59006b.q();
                this.f59030a = 1;
                if (aVar.d(q11, "PartnerAssociationError", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<Partner, LiveData<List<d0>>> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<d0>> invoke(Partner partner) {
            Partner partner2 = partner;
            kotlin.jvm.internal.u.j(partner2, "partner");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new g2(partner2, f2.this, null), 2);
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<Partner, LiveData<List<d0>>> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<d0>> invoke(Partner partner) {
            Partner partner2 = partner;
            kotlin.jvm.internal.u.j(partner2, "partner");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new h2(partner2, f2.this, null), 2);
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.q<xw.p<Partner, Boolean, nm0.j<? extends Partner, ? extends d2>>, Partner, Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f59034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f2 f59035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z5, f2 f2Var) {
            super(3);
            this.f59034a = z5;
            this.f59035b = f2Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(xw.p<Partner, Boolean, nm0.j<? extends Partner, ? extends d2>> pVar, Partner partner, Boolean bool) {
            Object q02;
            xw.p<Partner, Boolean, nm0.j<? extends Partner, ? extends d2>> livedata = pVar;
            Partner partner2 = partner;
            boolean booleanValue = bool.booleanValue();
            kotlin.jvm.internal.u.j(livedata, "livedata");
            kotlin.jvm.internal.u.j(partner2, "partner");
            boolean z5 = this.f59034a;
            f2 f2Var = this.f59035b;
            if (z5) {
                f2Var.getClass();
                if (!partner2.L()) {
                    q02 = d2.e.f58956a;
                } else if (booleanValue) {
                    q02 = d2.d.f58955a;
                } else {
                    q02 = d2.c.f58954a;
                }
            } else {
                q02 = f2.q0(f2Var, partner2);
            }
            if (q02 instanceof d2.f) {
                f2Var.f59008d.k(partner2);
            }
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(f2Var), Dispatchers.getIO(), null, new i2(partner2, f2Var, null), 2, null);
            livedata.setValue(new nm0.j(partner2, q02));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.p<nm0.j<? extends Partner, ? extends d2>, nm0.j<? extends Partner, ? extends d2>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f59036a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final Boolean invoke(nm0.j<? extends Partner, ? extends d2> jVar, nm0.j<? extends Partner, ? extends d2> jVar2) {
            return Boolean.valueOf(!kotlin.jvm.internal.u.e(jVar.b(), jVar2.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$refreshAssociationStatus$1$1", f = "PartnerActivity.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_FILE_NOT_EXIST}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Partner f59038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f2 f59039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Partner partner, f2 f2Var, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f59038b = partner;
            this.f59039c = f2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new j(this.f59038b, this.f59039c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59037a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Partner partner = Partner.f43457o;
                Partner partner2 = this.f59038b;
                if (partner2 == partner) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                f2 f2Var = this.f59039c;
                t10.e eVar = f2Var.f59008d;
                Context B0 = f2Var.B0();
                kotlin.jvm.internal.u.i(partner2, "$partner");
                this.f59037a = 1;
                if (eVar.l(B0, partner2, this, z5) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Application application, PartnerActivity activity, User user, int i11, boolean z5, a10.a aVar, t10.e eVar) {
        super(application);
        boolean z11;
        kotlin.jvm.internal.u.j(activity, "activity");
        kotlin.jvm.internal.u.j(user, "user");
        this.f59005a = activity;
        this.f59006b = user;
        this.f59007c = aVar;
        this.f59008d = eVar;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f59010f = MutableStateFlow;
        if (i11 == Partner.f43457o.l()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f59011g = FlowKt.flowOf(Boolean.valueOf(z11));
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f59012h = MutableStateFlow2;
        this.f59013i = FlowKt.asSharedFlow(MutableStateFlow);
        this.f59014j = FlowKt.asSharedFlow(MutableStateFlow2);
        androidx.lifecycle.k0<Boolean> b10 = xw.d.b(bool);
        this.f59015k = b10;
        t10.c cVar = new t10.c(androidx.lifecycle.h1.a(this), B0(), i11, eVar);
        this.f59016l = cVar;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(cVar, new f());
        androidx.lifecycle.j0 c12 = androidx.lifecycle.e1.c(cVar, new g());
        this.f59017m = nm0.h.b(c.f59025a);
        xw.h<nm0.j<Partner, d2>> a11 = xw.i.a(new xw.p(cVar, b10, new h(z5, this)), i.f59036a);
        this.f59018n = a11;
        this.f59019o = new com.withings.wiscale2.partner.ui.g(c12, c11, a11);
        xw.n<a> nVar = new xw.n<>();
        this.f59020p = nVar;
        this.f59021q = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context B0() {
        Context applicationContext = getApplication().getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    private final FitnessOptions K0() {
        List<? extends u10.u> value = this.f59019o.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (obj instanceof v10.c) {
                    arrayList.add(obj);
                }
            }
            FitnessOptions.Builder builder = FitnessOptions.builder();
            kotlin.jvm.internal.u.i(builder, "builder(...)");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kotlin.collections.x.n(((v10.c) it.next()).v(), arrayList2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                nm0.j jVar = (nm0.j) it2.next();
                builder.addDataType((DataType) jVar.c(), ((Number) jVar.d()).intValue());
            }
            FitnessOptions build = builder.build();
            kotlin.jvm.internal.u.i(build, "build(...)");
            return build;
        }
        return null;
    }

    private final void Z0() {
        List<? extends u10.u> value;
        com.withings.wiscale2.partner.ui.g gVar = this.f59019o;
        List<? extends u10.u> value2 = gVar.getValue();
        if ((value2 != null && value2.contains(c.p.f103158c)) || ((value = gVar.getValue()) != null && value.contains(c.k.f103138c))) {
            nm0.g gVar2 = this.f59017m;
            Context B0 = B0();
            ((c.a) gVar2.getValue()).getClass();
            if (!c.a.a(B0)) {
                ((c.a) gVar2.getValue()).b(this.f59005a);
                return;
            }
        }
        FitnessOptions K0 = K0();
        if (K0 != null) {
            Y0(K0);
        }
    }

    public static void f0(HealthConnectionErrorResult connectionError, f2 this$0) {
        kotlin.jvm.internal.u.j(connectionError, "$connectionError");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (!connectionError.hasResolution()) {
            connectionError = null;
        }
        if (connectionError != null) {
            connectionError.resolve(this$0.f59005a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public static final void g0(final HealthConnectionErrorResult healthConnectionErrorResult, final f2 f2Var) {
        String str;
        PartnerActivity partnerActivity = f2Var.f59005a;
        qc.b bVar = new qc.b(partnerActivity);
        if (healthConnectionErrorResult.hasResolution()) {
            int errorCode = healthConnectionErrorResult.getErrorCode();
            if (errorCode != 4) {
                if (errorCode != 6) {
                    if (errorCode != 9) {
                        str = partnerActivity.getString(C1987R.string._ENABLE_SHEALTH_);
                    } else {
                        str = partnerActivity.getString(C1987R.string.samsungHealthPopUp_policy);
                    }
                } else {
                    str = partnerActivity.getString(C1987R.string._ENABLE_SHEALTH_);
                }
            } else {
                str = partnerActivity.getString(C1987R.string._UPGRADE_SHEALTH_);
            }
            kotlin.jvm.internal.u.g(str);
        } else {
            str = "Connection with S Health is not available";
        }
        bVar.v(str);
        bVar.z(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.partner.ui.e2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                f2.f0(HealthConnectionErrorResult.this, f2Var);
            }
        }).w(C1987R.string._CANCEL_, new Object()).s();
    }

    public static final void i0(f2 f2Var, y10.a aVar, PartnerActivity partnerActivity, User user) {
        androidx.work.r rVar;
        if (aVar instanceof a.c) {
            long q11 = user.q();
            int[] m11 = a.c.f108298d.m();
            rVar = InsertMeasureToSamsungWorker.a.a(q11, Arrays.copyOf(m11, m11.length));
        } else if (aVar instanceof a.b) {
            long q12 = user.q();
            int[] m12 = a.b.f108296d.m();
            rVar = InsertMeasureToSamsungWorker.a.a(q12, Arrays.copyOf(m12, m12.length));
        } else if (aVar instanceof a.C1908a) {
            long q13 = user.q();
            int[] m13 = a.C1908a.f108294d.m();
            rVar = InsertMeasureToSamsungWorker.a.a(q13, Arrays.copyOf(m13, m13.length));
        } else {
            rVar = null;
        }
        if (rVar != null) {
            androidx.work.impl.n0.n(partnerActivity).c(rVar);
        }
    }

    public static final d2 q0(f2 f2Var, Partner partner) {
        f2Var.getClass();
        if (partner.e() == PartnerAssociationStatusLoader.AssociationStatus.f43519e) {
            return d2.b.f58953a;
        }
        int l5 = partner.l();
        Partner partner2 = Partner.f43457o;
        if (l5 == partner2.l() && HealthConnect.Checker.b() == HealthConnect.Checker.HealthConnectAvailability.f43381b) {
            return d2.g.f58958a;
        }
        if (partner.J(f2Var.B0()) && (partner.F() || partner.E())) {
            return d2.c.f58954a;
        }
        if (partner.l() == partner2.l() && HealthConnect.Checker.b() == HealthConnect.Checker.HealthConnectAvailability.f43380a) {
            return d2.f.f58957a;
        }
        if (partner.l() == Partner.f43455m.l() && partner.J(f2Var.B0())) {
            return d2.a.f58952a;
        }
        return d2.g.f58958a;
    }

    public final void A0(ym0.a<nm0.y> aVar) {
        Partner value = this.f59016l.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new d(value, aVar, null), 2, null);
        }
    }

    public final xw.n F0() {
        return this.f59021q;
    }

    public final com.withings.wiscale2.partner.ui.g G0() {
        return this.f59019o;
    }

    public final Flow<Boolean> M0() {
        return this.f59011g;
    }

    public final xw.h<nm0.j<Partner, d2>> O0() {
        return this.f59018n;
    }

    public final boolean R0() {
        return this.f59009e;
    }

    public final SharedFlow<Boolean> T0() {
        return this.f59013i;
    }

    public final SharedFlow<Boolean> U0() {
        return this.f59014j;
    }

    public final void V0(boolean z5) {
        if (z5) {
            Z0();
        } else {
            W0(false);
        }
    }

    public final void W0(boolean z5) {
        FitnessOptions K0;
        List<Scope> impliedScopes;
        t10.c cVar = this.f59016l;
        Partner value = cVar.getValue();
        if (value != null) {
            if (z5) {
                if (value == Partner.f43456n && (K0 = K0()) != null && (impliedScopes = K0.getImpliedScopes()) != null) {
                    for (Scope scope : impliedScopes) {
                        v10.e eVar = new v10.e(B0());
                        kotlin.jvm.internal.u.g(scope);
                        eVar.a(this.f59006b, scope);
                    }
                }
                this.f59015k.postValue(Boolean.TRUE);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new e(null), 2, null);
                if (this.f59009e) {
                    this.f59005a.finish();
                }
            }
            cVar.A();
        }
    }

    public final void X0() {
        Partner value = this.f59016l.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new j(value, this, null), 2, null);
        }
    }

    public final void Y0(FitnessOptions fitnessOptions) {
        PartnerActivity partnerActivity = this.f59005a;
        GoogleSignInAccount accountForExtension = GoogleSignIn.getAccountForExtension(partnerActivity, fitnessOptions);
        kotlin.jvm.internal.u.i(accountForExtension, "getAccountForExtension(...)");
        GoogleSignIn.requestPermissions(partnerActivity, 4097, accountForExtension, fitnessOptions);
    }

    public final void z0(boolean z5) {
        int i11;
        this.f59009e = z5;
        Partner value = this.f59016l.getValue();
        if (value == null) {
            i11 = -1;
        } else {
            i11 = b.f59024a[value.ordinal()];
        }
        if (i11 != 1) {
            String str = null;
            if (i11 == 2) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getMain(), null, new j2(this, null), 2, null);
                return;
            }
            xw.n<a> nVar = this.f59020p;
            if (i11 != 3) {
                if (i11 != 4) {
                    if (value != null) {
                        str = value.name();
                    }
                    x70.b.d(this, androidx.activity.a0.b("allowExchangesWithMissingPermissions not handled for partner ", str), new Object[0]);
                    return;
                }
                nVar.postValue(a.b.f59023a);
                return;
            }
            nVar.postValue(a.C0765a.f59022a);
            return;
        }
        Z0();
    }
}
