package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import dj.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import lj0.h0;
import org.joda.time.DateTime;
import va0.d;
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class z0 extends androidx.lifecycle.b implements t.a, h0.a, d.a {
    private final androidx.lifecycle.j0 A;
    private final androidx.lifecycle.j0 B;
    private final boolean F;
    private final nm0.g G;
    private final nm0.g M;
    private dj.t P;
    private DateTime Q;
    private boolean R;
    private boolean S;
    private final ArrayList T;

    /* renamed from: a  reason: collision with root package name */
    private final u70.a f48949a;

    /* renamed from: b  reason: collision with root package name */
    private final kn.e f48950b;

    /* renamed from: c  reason: collision with root package name */
    private final m70.i f48951c;

    /* renamed from: d  reason: collision with root package name */
    private final ej.w f48952d;

    /* renamed from: e  reason: collision with root package name */
    private final WorkoutCategoryManager f48953e;

    /* renamed from: f  reason: collision with root package name */
    private final ax.h f48954f;

    /* renamed from: g  reason: collision with root package name */
    private final fl.p f48955g;

    /* renamed from: h  reason: collision with root package name */
    private final lj0.h0 f48956h;

    /* renamed from: i  reason: collision with root package name */
    private final ax.b f48957i;

    /* renamed from: j  reason: collision with root package name */
    private final ax.c f48958j;

    /* renamed from: k  reason: collision with root package name */
    private final va0.d f48959k;

    /* renamed from: l  reason: collision with root package name */
    private LiveWorkout f48960l;

    /* renamed from: m  reason: collision with root package name */
    private final User f48961m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48962n;

    /* renamed from: o  reason: collision with root package name */
    private final wj0.i f48963o;

    /* renamed from: p  reason: collision with root package name */
    private final wj0.g f48964p;

    /* renamed from: q  reason: collision with root package name */
    private final wj0.o f48965q;

    /* renamed from: r  reason: collision with root package name */
    private final wj0.l f48966r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.k0<WorkoutCategory> f48967s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.k0<List<String>> f48968t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.j0 f48969u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.f f48970v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48971w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48972x;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48973y;

    /* renamed from: z  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f48974z;

    /* compiled from: LiveWorkoutViewModel.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48975a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final nm0.y invoke() {
            dm.a.f63977a.b();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LiveWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$onVasistasUpdated$1", f = "LiveWorkoutViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGAPPROVAL}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48976a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f48978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DateTime dateTime, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f48978c = dateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f48978c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48976a;
            z0 z0Var = z0.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ax.b bVar = z0Var.f48957i;
                User user = z0Var.f48961m;
                DateTime dateTime = this.f48978c;
                DateTime plusDays = dateTime.plusDays(1);
                kotlin.jvm.internal.u.i(plusDays, "plusDays(...)");
                this.f48976a = 1;
                obj = ((ta0.a) bVar).b(user, dateTime, plusDays, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            int intValue = ((Number) obj).intValue();
            if (!z0Var.c1().isInAppWorkout()) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(z0Var), Dispatchers.getIO(), null, new c1(z0Var, intValue, null), 2, null);
            } else {
                z0Var.Q = null;
                z0.T0(z0Var, intValue);
                xw.d.e(z0Var.f48962n, Boolean.valueOf(z0Var.c1().isInPause()));
                z0Var.f48954f.h(z0Var.c1());
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: LiveWorkoutViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$savePauseOrStopWorkout$1$1", f = "LiveWorkoutViewModel.kt", l = {201}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48979a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f48981c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DateTime dateTime, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f48981c = dateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f48981c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48979a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                z0 z0Var = z0.this;
                ax.b bVar = z0Var.f48957i;
                User user = z0Var.f48961m;
                this.f48979a = 1;
                if (((ta0.a) bVar).c(user, this.f48981c) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Application application, u70.a backgroundManager, kn.e deviceManager, m70.i userManager, ej.w wVar, WorkoutCategoryManager categoryManager, ax.h liveWorkoutManager, fl.p pVar, lj0.h0 vasistasManager, ta0.a aVar, ax.c liveWorkoutCommandSender, va0.d dVar, LiveWorkout liveWorkoutArg) {
        super(application);
        boolean z5;
        kotlin.jvm.internal.u.j(backgroundManager, "backgroundManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(categoryManager, "categoryManager");
        kotlin.jvm.internal.u.j(liveWorkoutManager, "liveWorkoutManager");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(liveWorkoutCommandSender, "liveWorkoutCommandSender");
        kotlin.jvm.internal.u.j(liveWorkoutArg, "liveWorkoutArg");
        this.f48949a = backgroundManager;
        this.f48950b = deviceManager;
        this.f48951c = userManager;
        this.f48952d = wVar;
        this.f48953e = categoryManager;
        this.f48954f = liveWorkoutManager;
        this.f48955g = pVar;
        this.f48956h = vasistasManager;
        this.f48957i = aVar;
        this.f48958j = liveWorkoutCommandSender;
        this.f48959k = dVar;
        this.f48960l = liveWorkoutArg;
        User e11 = userManager.e();
        kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
        this.f48961m = e11;
        androidx.lifecycle.k0<Boolean> k11 = liveWorkoutManager.f().k();
        this.f48962n = k11;
        this.f48963o = liveWorkoutManager.f().h();
        this.f48964p = liveWorkoutManager.f().g();
        this.f48965q = liveWorkoutManager.f().j();
        wj0.l i11 = liveWorkoutManager.f().i();
        this.f48966r = i11;
        androidx.lifecycle.k0<WorkoutCategory> k0Var = new androidx.lifecycle.k0<>();
        this.f48967s = k0Var;
        this.f48968t = new androidx.lifecycle.k0<>();
        this.f48969u = e1.b(i11, new r0(this));
        this.f48970v = androidx.lifecycle.h.a(Dispatchers.getIO(), new p0(this, null), 2);
        androidx.lifecycle.k0<Boolean> k0Var2 = new androidx.lifecycle.k0<>();
        k0Var2.setValue(Boolean.TRUE);
        this.f48971w = k0Var2;
        this.f48972x = xw.d.b(Boolean.valueOf(pVar.j(this.f48960l.getDeviceModelId()) instanceof gl.x));
        this.f48973y = xw.d.b(Boolean.valueOf(dVar.d()));
        this.f48974z = xw.d.b(Boolean.valueOf(this.f48960l.isWorkoutPauseEnabled()));
        this.A = e1.c(k11, new v0(this));
        this.B = e1.b(k0Var, new t0(this));
        int deviceModelId = this.f48960l.getDeviceModelId();
        if (deviceModelId != 91 && deviceModelId != 90) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.F = z5;
        this.G = nm0.h.b(new q0(this));
        this.M = nm0.h.b(new y0(application));
        this.T = new ArrayList();
        vasistasManager.x(this);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new o0(this, null), 2, null);
    }

    private final void A1(boolean z5) {
        if (z5) {
            this.f48954f.o(LiveWorkout.copy$default(this.f48960l, 0, 0L, Long.valueOf(DateTime.now().getMillis()), false, null, 0, null, null, null, 507, null), false);
        }
    }

    public static final boolean B0(String str) {
        if (!kotlin.jvm.internal.u.e(str, "connected") && !kotlin.jvm.internal.u.e(str, "conversing")) {
            return false;
        }
        return true;
    }

    public static final HorizontalScaleView.e F0(z0 z0Var) {
        return new HorizontalScaleView.e(50, kotlin.collections.x.W(new HorizontalScaleView.f("", z0Var.Z0().e() - 50, androidx.core.content.a.getColor(z0Var.getApplication(), C1987R.color.datavizMonochromaticNeutral2)), new HorizontalScaleView.f("", z0Var.Z0().f() - z0Var.Z0().e(), androidx.core.content.a.getColor(z0Var.getApplication(), C1987R.color.datavizMonochromaticNeutral3)), new HorizontalScaleView.f("", z0Var.Z0().d() - z0Var.Z0().f(), androidx.core.content.a.getColor(z0Var.getApplication(), C1987R.color.datavizMonochromaticNeutral4)), new HorizontalScaleView.f("", z0Var.Z0().c() - z0Var.Z0().d(), androidx.core.content.a.getColor(z0Var.getApplication(), C1987R.color.datavizMonochromaticNeutral5))));
    }

    public static final void G0(z0 z0Var) {
        if (!z0Var.f48960l.isInAppWorkout()) {
            vh.h.h().d(new w0(z0Var)).s(new x0(z0Var));
        }
    }

    public static final boolean K0(z0 z0Var) {
        WorkoutCategory value = z0Var.f48967s.getValue();
        if (value != null) {
            return value.isGpsRelevant();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(com.withings.wiscale2.activity.workout.live.ui.z0 r4, qm0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.withings.wiscale2.activity.workout.live.ui.b1
            if (r0 == 0) goto L16
            r0 = r5
            com.withings.wiscale2.activity.workout.live.ui.b1 r0 = (com.withings.wiscale2.activity.workout.live.ui.b1) r0
            int r1 = r0.f48858d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f48858d = r1
            goto L1b
        L16:
            com.withings.wiscale2.activity.workout.live.ui.b1 r0 = new com.withings.wiscale2.activity.workout.live.ui.b1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f48856b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f48858d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.withings.wiscale2.activity.workout.live.ui.z0 r4 = r0.f48855a
            nm0.l.b(r5)
            goto L4a
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            nm0.l.b(r5)
            com.withings.liveworkout.model.LiveWorkout r5 = r4.f48960l
            r0.f48855a = r4
            r0.f48858d = r3
            ax.b r2 = r4.f48957i
            ta0.a r2 = (ta0.a) r2
            com.withings.user.User r3 = r4.f48961m
            java.io.Serializable r5 = r2.a(r3, r5, r0)
            if (r5 != r1) goto L4a
            goto L71
        L4a:
            com.withings.comm.wpp.generated.object.PauseState r5 = (com.withings.comm.wpp.generated.object.PauseState) r5
            com.withings.liveworkout.model.LiveWorkout r0 = r4.f48960l
            com.withings.comm.wpp.generated.object.PauseState r0 = r0.getPauseState()
            if (r0 == 0) goto L60
            int r1 = r5.sum
            r0.sum = r1
            int r1 = r5.startTime
            r0.startTime = r1
            byte r1 = r5.value
            r0.value = r1
        L60:
            com.withings.liveworkout.model.LiveWorkout r0 = r4.f48960l
            boolean r0 = r0.isInAppWorkout()
            if (r0 != 0) goto L6f
            ax.c r0 = r4.f48958j
            com.withings.liveworkout.model.LiveWorkout r4 = r4.f48960l
            r0.b(r4, r5)
        L6f:
            nm0.y r1 = nm0.y.f85009a
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.z0.M0(com.withings.wiscale2.activity.workout.live.ui.z0, qm0.d):java.lang.Object");
    }

    public static final void T0(z0 z0Var, int i11) {
        if (i11 != 0) {
            PauseState pauseState = z0Var.f48960l.getPauseState();
            if (pauseState != null) {
                pauseState.sum = i11;
                pauseState.startTime = 0;
                return;
            }
            return;
        }
        z0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kj0.c Z0() {
        return (kj0.c) this.G.getValue();
    }

    public static final void q0(z0 z0Var) {
        String str;
        WorkoutCategory workoutCategory = z0Var.f48953e.getWorkoutCategory(z0Var.f48960l.getWorkoutCategoryId());
        z0Var.f48967s.postValue(workoutCategory);
        androidx.lifecycle.k0<List<String>> k0Var = z0Var.f48968t;
        kotlin.jvm.internal.u.g(workoutCategory);
        String[] strArr = new String[2];
        String str2 = null;
        if (workoutCategory.isGpsRelevant()) {
            str = "key_screen_distance";
        } else {
            str = null;
        }
        strArr[0] = str;
        if (z0Var.f48955g.j(z0Var.f48960l.getDeviceModelId()) instanceof gl.x) {
            str2 = "key_screen_hr";
        }
        strArr[1] = str2;
        k0Var.postValue(kotlin.collections.l.z(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s1() {
        nm0.g gVar = this.M;
        if (((ui.d) gVar.getValue()).h() && ((ui.d) gVar.getValue()).i() && (((ui.d) gVar.getValue()).g() || this.f48949a.e())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y0(com.withings.wiscale2.activity.workout.live.ui.z0 r8, qm0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.withings.wiscale2.activity.workout.live.ui.s0
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.wiscale2.activity.workout.live.ui.s0 r0 = (com.withings.wiscale2.activity.workout.live.ui.s0) r0
            int r1 = r0.f48929e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f48929e = r1
            goto L1b
        L16:
            com.withings.wiscale2.activity.workout.live.ui.s0 r0 = new com.withings.wiscale2.activity.workout.live.ui.s0
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f48927c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f48929e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.withings.wiscale2.activity.workout.live.ui.z0 r8 = r0.f48926b
            com.withings.wiscale2.activity.workout.live.ui.z0 r0 = r0.f48925a
            nm0.l.b(r9)
            goto L97
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            nm0.l.b(r9)
            com.withings.liveworkout.model.LiveWorkout r9 = r8.f48960l
            com.withings.comm.wpp.generated.object.PauseState r9 = r9.getPauseState()
            if (r9 == 0) goto L64
            com.withings.liveworkout.model.LiveWorkout r9 = r8.f48960l
            com.withings.comm.wpp.generated.object.PauseState r9 = r9.getPauseState()
            if (r9 == 0) goto L4e
            int r9 = r9.startTime
            if (r9 != 0) goto L4e
            goto L64
        L4e:
            org.joda.time.DateTime r9 = new org.joda.time.DateTime
            com.withings.liveworkout.model.LiveWorkout r2 = r8.f48960l
            com.withings.comm.wpp.generated.object.PauseState r2 = r2.getPauseState()
            kotlin.jvm.internal.u.g(r2)
            int r2 = r2.startTime
            long r4 = (long) r2
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r9.<init>(r4)
            r8.Q = r9
        L64:
            org.joda.time.DateTime r9 = new org.joda.time.DateTime
            com.withings.liveworkout.model.LiveWorkout r2 = r8.f48960l
            long r4 = r2.getStartDateMillis()
            r9.<init>(r4)
            org.joda.time.DateTime r2 = new org.joda.time.DateTime
            com.withings.liveworkout.model.LiveWorkout r4 = r8.f48960l
            long r4 = r4.getStartDateMillis()
            r2.<init>(r4)
            org.joda.time.DateTime r2 = r2.plusDays(r3)
            java.lang.String r4 = "plusDays(...)"
            kotlin.jvm.internal.u.i(r2, r4)
            r0.f48925a = r8
            r0.f48926b = r8
            r0.f48929e = r3
            ax.b r3 = r8.f48957i
            ta0.a r3 = (ta0.a) r3
            com.withings.user.User r4 = r8.f48961m
            java.lang.Integer r9 = r3.b(r4, r9, r2, r0)
            if (r9 != r1) goto L96
            goto Lc1
        L96:
            r0 = r8
        L97:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == 0) goto Lad
            com.withings.liveworkout.model.LiveWorkout r8 = r8.f48960l
            com.withings.comm.wpp.generated.object.PauseState r8 = r8.getPauseState()
            if (r8 == 0) goto Lb0
            r8.sum = r9
            r9 = 0
            r8.startTime = r9
            goto Lb0
        Lad:
            r8.getClass()
        Lb0:
            androidx.lifecycle.k0<java.lang.Boolean> r8 = r0.f48962n
            com.withings.liveworkout.model.LiveWorkout r9 = r0.f48960l
            boolean r9 = r9.isInPause()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            xw.d.e(r8, r9)
            nm0.y r1 = nm0.y.f85009a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.z0.y0(com.withings.wiscale2.activity.workout.live.ui.z0, qm0.d):java.lang.Object");
    }

    public final void C1() {
        LiveWorkout e11 = this.f48954f.e(this.f48960l.getDeviceMacAddress());
        if (e11 != null) {
            boolean isInPause = e11.isInPause();
            androidx.lifecycle.k0<Boolean> k0Var = this.f48962n;
            if (isInPause) {
                xw.d.e(k0Var, Boolean.TRUE);
            } else if (e11.isInAppWorkout() || e11.isResumed()) {
                xw.d.e(k0Var, Boolean.FALSE);
            }
            nm0.y yVar = nm0.y.f85009a;
        }
    }

    @Override // dj.t.a
    public final void D(dj.t lifecycle, dj.u event) {
        boolean z5;
        kotlin.jvm.internal.u.j(lifecycle, "lifecycle");
        kotlin.jvm.internal.u.j(event, "event");
        String a11 = lifecycle.a();
        kotlin.jvm.internal.u.i(a11, "getCurrentState(...)");
        if (!kotlin.jvm.internal.u.e(a11, "connected") && !kotlin.jvm.internal.u.e(a11, "conversing")) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.f48971w.setValue(Boolean.valueOf(z5));
    }

    @Override // va0.d.a
    public final void M(Uri uri) {
        String uri2 = uri.toString();
        ArrayList arrayList = this.T;
        if (arrayList.contains(uri2)) {
            uri2 = null;
        }
        if (uri2 != null) {
            arrayList.add(uri2);
            this.f48960l.addPhoto(uri2, a.f48975a);
            this.f48954f.p(this.f48960l);
        }
    }

    @Override // lj0.h0.a
    public final void T(long j5, Vasistas.Category category, DateTime dateTime, DateTime dateTime2, boolean z5) {
        if (!this.R) {
            BuildersKt__BuildersKt.runBlocking$default(null, new b(new DateTime(this.f48960l.getStartDateMillis()), null), 1, null);
        } else {
            A1(this.S);
        }
    }

    public final wj0.g U0() {
        return this.f48964p;
    }

    public final boolean V0() {
        return this.F;
    }

    public final wj0.i W0() {
        return this.f48963o;
    }

    public final androidx.lifecycle.f X0() {
        return this.f48970v;
    }

    public final wj0.l Y0() {
        return this.f48966r;
    }

    public final androidx.lifecycle.j0 a1() {
        return this.f48969u;
    }

    public final LiveWorkout c1() {
        return this.f48960l;
    }

    public final androidx.lifecycle.j0 d1() {
        return this.A;
    }

    public final androidx.lifecycle.k0<List<String>> e1() {
        return this.f48968t;
    }

    public final androidx.lifecycle.k0<Boolean> g1() {
        return this.f48972x;
    }

    public final androidx.lifecycle.k0<Boolean> i1() {
        return this.f48973y;
    }

    public final androidx.lifecycle.k0<Boolean> k1() {
        return this.f48974z;
    }

    public final wj0.o l1() {
        return this.f48965q;
    }

    public final androidx.lifecycle.k0<Boolean> m1() {
        return this.f48971w;
    }

    public final androidx.lifecycle.k0<WorkoutCategory> n1() {
        return this.f48967s;
    }

    public final void o1(int i11, int i12, Intent intent) {
        this.f48959k.b(i11, i12, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f48956h.A(this);
        dj.t tVar = this.P;
        if (tVar != null) {
            tVar.f(this);
        }
    }

    public final void q1(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        this.f48959k.c(i11, permissions, grantResults);
    }

    public final void r1() {
        if (this.f48960l.isResumed()) {
            this.Q = null;
            if (!this.f48960l.isInAppWorkout()) {
                ((ta0.a) this.f48957i).d(this.f48961m, this.f48960l);
                return;
            }
            return;
        }
        this.Q = DateTime.now();
        this.f48962n.setValue(Boolean.valueOf(this.f48960l.isInPause()));
    }

    public final androidx.lifecycle.j0 t1() {
        return this.B;
    }

    public final boolean v1() {
        WorkoutCategory value = this.f48967s.getValue();
        if (value != null && value.isGpsRelevant() && s1()) {
            return true;
        }
        return false;
    }

    public final void w1() {
        this.f48959k.i(this);
    }

    public final void y1(boolean z5, boolean z11) {
        Job launch$default;
        this.R = z5;
        this.S = z11;
        DateTime dateTime = this.Q;
        if (dateTime != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(dateTime, null), 2, null);
            if (launch$default != null) {
                return;
            }
        }
        A1(z11);
        nm0.y yVar = nm0.y.f85009a;
    }

    public final void z1(LiveWorkout liveWorkout) {
        this.f48960l = LiveWorkout.copy$default(liveWorkout, 0, 0L, null, false, null, 0, null, null, this.T, 255, null);
    }
}
