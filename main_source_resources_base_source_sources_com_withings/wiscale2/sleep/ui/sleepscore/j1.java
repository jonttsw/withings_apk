package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.core.entity.MoodLevel;
import com.withings.manualLogging.ui.feature.addNote.AddManualLogActivity;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import xx.o;
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
public final class j1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f61025a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f61026b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f61027c;

    /* renamed from: d  reason: collision with root package name */
    private final SleepScoreRecalculator f61028d;

    /* renamed from: e  reason: collision with root package name */
    private final hx.l f61029e;

    /* renamed from: f  reason: collision with root package name */
    private final hx.i f61030f;

    /* renamed from: g  reason: collision with root package name */
    private final ei0.q f61031g;

    /* renamed from: h  reason: collision with root package name */
    private final lj0.h0 f61032h;

    /* renamed from: i  reason: collision with root package name */
    private final fl.p f61033i;

    /* renamed from: j  reason: collision with root package name */
    private final hx.n f61034j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.lifecycle.k0<xx.o> f61035k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.k0 f61036l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f61037m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f61038n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61039o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61040p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList f61041q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61042r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61043s;

    /* compiled from: SleepDayViewModel.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<ManualLogCategory> f61044a = sm0.b.a(ManualLogCategory.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDayViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$refreshYourLogsSection$1", f = "SleepDayViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        j1 f61045a;

        /* renamed from: b  reason: collision with root package name */
        Context f61046b;

        /* renamed from: c  reason: collision with root package name */
        int f61047c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f61049e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepDayViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$refreshYourLogsSection$1$1$1", f = "SleepDayViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            androidx.lifecycle.k0 f61050a;

            /* renamed from: b  reason: collision with root package name */
            int f61051b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j1 f61052c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ fx.e f61053d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f61054e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SleepDayViewModel.kt */
            /* renamed from: com.withings.wiscale2.sleep.ui.sleepscore.j1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0779a extends kotlin.jvm.internal.w implements ym0.l<ManualLogCategory, nm0.y> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Context f61055a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ j1 f61056b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ fx.e f61057c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0779a(Context context, j1 j1Var, fx.e eVar) {
                    super(1);
                    this.f61055a = context;
                    this.f61056b = j1Var;
                    this.f61057c = eVar;
                }

                @Override // ym0.l
                public final nm0.y invoke(ManualLogCategory manualLogCategory) {
                    ManualLogCategory category = manualLogCategory;
                    kotlin.jvm.internal.u.j(category, "category");
                    int i11 = AddManualLogActivity.f40697k;
                    this.f61055a.startActivity(AddManualLogActivity.a.a(this.f61055a, this.f61056b.f61025a.getId(), null, null, Long.valueOf(this.f61057c.o()), category, 12));
                    return nm0.y.f85009a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j1 j1Var, fx.e eVar, Context context, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f61052c = j1Var;
                this.f61053d = eVar;
                this.f61054e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f61052c, this.f61053d, this.f61054e, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.lifecycle.k0 k0Var;
                Object withContext;
                androidx.lifecycle.k0 k0Var2;
                Object obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f61051b;
                fx.e eVar = this.f61053d;
                j1 j1Var = this.f61052c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        k0Var2 = this.f61050a;
                        nm0.l.b(obj);
                        withContext = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    k0Var = j1Var.f61035k;
                    if (!eVar.isEmpty()) {
                        this.f61050a = k0Var;
                        this.f61051b = 1;
                        withContext = BuildersKt.withContext(Dispatchers.getIO(), new k1(j1Var, null), this);
                        if (withContext == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        k0Var2 = k0Var;
                    }
                    androidx.lifecycle.k0 k0Var3 = k0Var;
                    obj2 = o.a.f107619a;
                    k0Var2 = k0Var3;
                    k0Var2.setValue(obj2);
                    return nm0.y.f85009a;
                }
                if (!((Boolean) withContext).booleanValue()) {
                    k0Var = k0Var2;
                    androidx.lifecycle.k0 k0Var32 = k0Var;
                    obj2 = o.a.f107619a;
                    k0Var2 = k0Var32;
                    k0Var2.setValue(obj2);
                    return nm0.y.f85009a;
                }
                j1Var.getClass();
                sm0.a<ManualLogCategory> aVar = a.f61044a;
                int h11 = kotlin.collections.s0.h(kotlin.collections.x.y(aVar, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                Iterator it = ((kotlin.collections.c) aVar).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    ManualLogCategory manualLogCategory = (ManualLogCategory) next;
                    ArrayList arrayList = new ArrayList();
                    Iterator<fx.d> it2 = eVar.iterator();
                    while (it2.hasNext()) {
                        fx.d next2 = it2.next();
                        if (androidx.camera.camera2.internal.v1.E(next2) == manualLogCategory) {
                            arrayList.add(next2);
                        }
                    }
                    fx.d dVar = (fx.d) kotlin.collections.x.K(arrayList);
                    StringBuilder sb2 = new StringBuilder((dVar == null || (r11 = dVar.getContent()) == null) ? "" : "");
                    int size = arrayList.size();
                    for (int i12 = 1; i12 < size; i12++) {
                        sb2.append(", " + ((fx.d) arrayList.get(i12)).getContent());
                    }
                    String sb3 = sb2.toString();
                    kotlin.jvm.internal.u.i(sb3, "toString(...)");
                    linkedHashMap.put(next, sb3);
                }
                obj2 = new o.b(linkedHashMap, new C0779a(this.f61054e, j1Var, eVar));
                k0Var2.setValue(obj2);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f61049e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f61049e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r11.f61047c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                nm0.l.b(r12)
                goto L67
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L18:
                android.content.Context r1 = r11.f61046b
                com.withings.wiscale2.sleep.ui.sleepscore.j1 r3 = r11.f61045a
                nm0.l.b(r12)
                goto L4e
            L20:
                nm0.l.b(r12)
                com.withings.wiscale2.sleep.ui.sleepscore.j1 r12 = com.withings.wiscale2.sleep.ui.sleepscore.j1.this
                java.lang.Long r1 = com.withings.wiscale2.sleep.ui.sleepscore.j1.j0(r12)
                if (r1 == 0) goto L67
                long r7 = r1.longValue()
                hx.i r4 = com.withings.wiscale2.sleep.ui.sleepscore.j1.g0(r12)
                com.withings.user.core.models.User r1 = com.withings.wiscale2.sleep.ui.sleepscore.j1.t0(r12)
                long r5 = r1.getId()
                r11.f61045a = r12
                android.content.Context r1 = r11.f61049e
                r11.f61046b = r1
                r11.f61047c = r3
                r9 = r11
                java.lang.Object r3 = r4.b(r5, r7, r9)
                if (r3 != r0) goto L4b
                return r0
            L4b:
                r10 = r3
                r3 = r12
                r12 = r10
            L4e:
                fx.e r12 = (fx.e) r12
                kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.wiscale2.sleep.ui.sleepscore.j1$b$a r5 = new com.withings.wiscale2.sleep.ui.sleepscore.j1$b$a
                r6 = 0
                r5.<init>(r3, r12, r1, r6)
                r11.f61045a = r6
                r11.f61046b = r6
                r11.f61047c = r2
                java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r11)
                if (r12 != r0) goto L67
                return r0
            L67:
                nm0.y r12 = nm0.y.f85009a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.j1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j1(User user, DateTime day, SleepScoreRecalculator sleepScoreRecalculator, hx.l isManualLogEnabled, hx.i iVar, ei0.q sleepTrackManager, lj0.h0 vasistasManager, fl.p pVar, hx.n nVar, hx.c getAvailableMoodLevels, hx.e eVar) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(day, "day");
        kotlin.jvm.internal.u.j(isManualLogEnabled, "isManualLogEnabled");
        kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(getAvailableMoodLevels, "getAvailableMoodLevels");
        this.f61025a = user;
        this.f61026b = day;
        this.f61027c = null;
        this.f61028d = sleepScoreRecalculator;
        this.f61029e = isManualLogEnabled;
        this.f61030f = iVar;
        this.f61031g = sleepTrackManager;
        this.f61032h = vasistasManager;
        this.f61033i = pVar;
        this.f61034j = nVar;
        androidx.lifecycle.k0<xx.o> k0Var = new androidx.lifecycle.k0<>(o.a.f107619a);
        this.f61035k = k0Var;
        this.f61036l = k0Var;
        androidx.lifecycle.k0<Boolean> k0Var2 = new androidx.lifecycle.k0<>(Boolean.TRUE);
        this.f61037m = k0Var2;
        this.f61038n = true;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(k0Var2, new n1(this));
        this.f61039o = c11;
        this.f61040p = androidx.lifecycle.e1.c(c11, new m1(eVar));
        List<MoodLevel> a02 = kotlin.collections.l.a0(MoodLevel.values());
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a02, 10));
        for (MoodLevel moodLevel : a02) {
            arrayList.add(m0.t.D(moodLevel));
        }
        this.f61041q = arrayList;
        this.f61042r = androidx.lifecycle.e1.b(this.f61040p, p1.f61186a);
        this.f61043s = androidx.lifecycle.e1.c(this.f61039o, new r1(this));
    }

    public final androidx.lifecycle.j0 B0() {
        return this.f61042r;
    }

    public final androidx.lifecycle.j0 F0() {
        return this.f61043s;
    }

    public final ArrayList G0() {
        return this.f61041q;
    }

    public final androidx.lifecycle.k0 K0() {
        return this.f61036l;
    }

    public final void M0(Context context) {
        if (this.f61030f != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new b(context, null), 2, null);
        }
    }

    public final void O0() {
        if (this.f61038n) {
            this.f61037m.postValue(Boolean.TRUE);
            this.f61038n = false;
        }
    }
}
