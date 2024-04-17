package com.withings.wiscale2.profile;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.profile.h;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ProfileViewModel.kt */
/* loaded from: classes5.dex */
public final class y0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f59494a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59495b;

    /* renamed from: c  reason: collision with root package name */
    private final t10.e f59496c;

    /* renamed from: d  reason: collision with root package name */
    private final PartnerRemoteRepository f59497d;

    /* renamed from: e  reason: collision with root package name */
    private final oi0.b f59498e;

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f59499f;

    /* renamed from: g  reason: collision with root package name */
    private final w0 f59500g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<com.withings.wiscale2.profile.h> f59501h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.f f59502i;

    /* renamed from: j  reason: collision with root package name */
    private final m70.a f59503j;

    /* renamed from: k  reason: collision with root package name */
    private final m70.c f59504k;

    /* renamed from: l  reason: collision with root package name */
    private final t10.o f59505l;

    /* renamed from: m  reason: collision with root package name */
    private final f1 f59506m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.f f59507n;

    /* renamed from: o  reason: collision with root package name */
    private final i1 f59508o;

    /* renamed from: p  reason: collision with root package name */
    private final com.withings.wiscale2.profile.c f59509p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.f f59510q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.f f59511r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.f f59512s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.f f59513t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.f f59514u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.f f59515v;

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$allTimeStatsEnabled$1", f = "ProfileViewModel.kt", l = {140, 140}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59516a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59517b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f59517b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59516a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59517b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59517b;
                w0 w0Var = y0.this.f59500g;
                this.f59517b = h0Var;
                this.f59516a = 1;
                obj = w0Var.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59517b = null;
            this.f59516a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$badgesEnabled$1", f = "ProfileViewModel.kt", l = {135, 135}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59519a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59520b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f59520b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59519a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59520b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59520b;
                w0 w0Var = y0.this.f59500g;
                this.f59520b = h0Var;
                this.f59519a = 1;
                obj = w0Var.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59520b = null;
            this.f59519a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$goalsEnabled$1", f = "ProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59522a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59523b;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f59523b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59522a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59523b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59523b;
                w0 w0Var = y0.this.f59500g;
                this.f59523b = h0Var;
                this.f59522a = 1;
                obj = w0Var.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59523b = null;
            this.f59522a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.s implements ym0.l<qm0.d<? super Boolean>, Object> {
        d(Object obj) {
            super(1, obj, w0.class, "badgesVisible", "badgesVisible(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ym0.l
        public final Object invoke(qm0.d<? super Boolean> dVar) {
            return ((w0) this.receiver).b(dVar);
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    /* synthetic */ class e extends kotlin.jvm.internal.s implements ym0.l<qm0.d<? super Boolean>, Object> {
        e(Object obj) {
            super(1, obj, w0.class, "partnersVisible", "partnersVisible(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ym0.l
        public final Object invoke(qm0.d<? super Boolean> dVar) {
            return ((w0) this.receiver).d(dVar);
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$partnersEnabled$1", f = "ProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59525a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59526b;

        f(qm0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f59526b = obj;
            return fVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((f) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59525a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59526b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59526b;
                w0 w0Var = y0.this.f59500g;
                this.f59526b = h0Var;
                this.f59525a = 1;
                obj = w0Var.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59526b = null;
            this.f59525a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$reminderList$1", f = "ProfileViewModel.kt", l = {111, 112}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends Reminder>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59528a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59529b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReminderRepository f59531d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ReminderRepository reminderRepository, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f59531d = reminderRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            g gVar = new g(this.f59531d, dVar);
            gVar.f59529b = obj;
            return gVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends Reminder>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((g) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59528a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59529b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59529b;
                w0 w0Var = y0.this.f59500g;
                this.f59529b = h0Var;
                this.f59528a = 1;
                obj = w0Var.e(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                LiveData<List<Reminder>> allRemindersLiveData = this.f59531d.getAllRemindersLiveData();
                this.f59529b = null;
                this.f59528a = 2;
                if (h0Var.a(allRemindersLiveData, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$remindersEnabled$1", f = "ProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59532a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59533b;

        h(qm0.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f59533b = obj;
            return hVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((h) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59532a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59533b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59533b;
                w0 w0Var = y0.this.f59500g;
                this.f59533b = h0Var;
                this.f59532a = 1;
                obj = w0Var.e(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59533b = null;
            this.f59532a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class i implements Flow<h.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f59535a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f59536a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$special$$inlined$map$1$2", f = "ProfileViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.profile.y0$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0767a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f59537a;

                /* renamed from: b  reason: collision with root package name */
                int f59538b;

                public C0767a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f59537a = obj;
                    this.f59538b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f59536a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.wiscale2.profile.y0.i.a.C0767a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.wiscale2.profile.y0$i$a$a r0 = (com.withings.wiscale2.profile.y0.i.a.C0767a) r0
                    int r1 = r0.f59538b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f59538b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.profile.y0$i$a$a r0 = new com.withings.wiscale2.profile.y0$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f59537a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f59538b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L4e
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.goal.core.model.HealthGoal r5 = (com.withings.goal.core.model.HealthGoal) r5
                    com.withings.wiscale2.profile.h$a r6 = new com.withings.wiscale2.profile.h$a
                    if (r5 == 0) goto L3d
                    int r5 = df.d.g(r5)
                    goto L40
                L3d:
                    r5 = 2132022685(0x7f14159d, float:1.9683797E38)
                L40:
                    r6.<init>(r5)
                    r0.f59538b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f59536a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.profile.y0.i.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public i(Flow flow) {
            this.f59535a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super h.a> flowCollector, qm0.d dVar) {
            Object collect = this.f59535a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    /* synthetic */ class j extends kotlin.jvm.internal.s implements ym0.l<qm0.d<? super Boolean>, Object> {
        j(Object obj) {
            super(1, obj, w0.class, "goalsVisible", "goalsVisible(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ym0.l
        public final Object invoke(qm0.d<? super Boolean> dVar) {
            return ((w0) this.receiver).c(dVar);
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.l<User, Boolean> {
        k() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(User user) {
            boolean z5;
            User it = user;
            kotlin.jvm.internal.u.j(it, "it");
            if (it.q() != y0.this.f59494a.q() && !it.D()) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: ProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$usersEnabled$1", f = "ProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59541a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f59542b;

        l(qm0.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            l lVar = new l(dVar);
            lVar.f59542b = obj;
            return lVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((l) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59541a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f59542b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f59542b;
                w0 w0Var = y0.this.f59500g;
                this.f59542b = h0Var;
                this.f59541a = 1;
                obj = w0Var.f(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f59542b = null;
            this.f59541a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public y0(User mainUser, Context context, t10.e partnerManager, PartnerRemoteRepository partnerRemoteRepository, oi0.b wsSyncManager, kn.e deviceManager, w0 w0Var, q70.j jVar, n20.b bVar, WorkoutCategoryManager workoutCategoryManager, m70.i userManager, TargetRepository targetRepository, ReminderRepository reminderRepository, cy.a aVar, ActivityAggregateManager activityAggregateManager, l70.w unitPreferencesRepository, iy.e measuresGroupRepositoryV2, is.b bVar2) {
        kotlin.jvm.internal.u.j(mainUser, "mainUser");
        kotlin.jvm.internal.u.j(partnerManager, "partnerManager");
        kotlin.jvm.internal.u.j(partnerRemoteRepository, "partnerRemoteRepository");
        kotlin.jvm.internal.u.j(wsSyncManager, "wsSyncManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(workoutCategoryManager, "workoutCategoryManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(reminderRepository, "reminderRepository");
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        this.f59494a = mainUser;
        this.f59495b = context;
        this.f59496c = partnerManager;
        this.f59497d = partnerRemoteRepository;
        this.f59498e = wsSyncManager;
        this.f59499f = deviceManager;
        this.f59500g = w0Var;
        this.f59501h = FlowKt.stateIn(new i(bVar2.a(mainUser.q())), androidx.lifecycle.h1.a(this), SharingStarted.Companion.getLazily(), h.b.f59350a);
        this.f59502i = androidx.lifecycle.q.b(bVar.a(), null, 3);
        om.d dVar = new om.d(jVar, androidx.lifecycle.h1.a(this), context, unitPreferencesRepository, userManager);
        this.f59503j = new m70.a(androidx.lifecycle.h1.a(this), userManager, new k());
        m70.c cVar = new m70.c(androidx.lifecycle.h1.a(this), userManager);
        this.f59504k = cVar;
        this.f59505l = new t10.o(androidx.lifecycle.h1.a(this), context, partnerManager, new e(w0Var));
        this.f59506m = new f1(androidx.lifecycle.h1.a(this), mainUser, targetRepository, workoutCategoryManager, new j(w0Var));
        this.f59507n = androidx.lifecycle.h.a(null, new g(reminderRepository, null), 3);
        this.f59508o = new i1(androidx.lifecycle.h1.a(this), context, cVar, dVar, aVar, measuresGroupRepositoryV2);
        this.f59509p = new com.withings.wiscale2.profile.c(androidx.lifecycle.h1.a(this), cVar, measuresGroupRepositoryV2, activityAggregateManager, dVar, context, deviceManager, new d(w0Var));
        this.f59510q = androidx.lifecycle.h.a(null, new b(null), 3);
        this.f59511r = androidx.lifecycle.h.a(null, new h(null), 3);
        this.f59512s = androidx.lifecycle.h.a(null, new c(null), 3);
        this.f59513t = androidx.lifecycle.h.a(null, new f(null), 3);
        this.f59514u = androidx.lifecycle.h.a(null, new l(null), 3);
        this.f59515v = androidx.lifecycle.h.a(null, new a(null), 3);
    }

    public static final void p0(y0 y0Var) {
        List<Device> m11 = y0Var.f59499f.m();
        kotlin.jvm.internal.u.i(m11, "getDevices(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : m11) {
            if (((Device) obj).isCustomScreens()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y0Var.f59498e.l((Device) it.next(), "partner_update");
        }
    }

    public final com.withings.wiscale2.profile.c A0() {
        return this.f59509p;
    }

    public final t10.o B0() {
        return this.f59505l;
    }

    public final androidx.lifecycle.f F0() {
        return this.f59513t;
    }

    public final androidx.lifecycle.f G0() {
        return this.f59507n;
    }

    public final androidx.lifecycle.f K0() {
        return this.f59511r;
    }

    public final f1 M0() {
        return this.f59506m;
    }

    public final i1 O0() {
        return this.f59508o;
    }

    public final androidx.lifecycle.f R0() {
        return this.f59502i;
    }

    public final m70.a T0() {
        return this.f59503j;
    }

    public final androidx.lifecycle.f U0() {
        return this.f59514u;
    }

    public final androidx.lifecycle.f q0() {
        return this.f59515v;
    }

    public final androidx.lifecycle.f r0() {
        return this.f59510q;
    }

    public final StateFlow<com.withings.wiscale2.profile.h> t0() {
        return this.f59501h;
    }

    public final androidx.lifecycle.f y0() {
        return this.f59512s;
    }

    public final m70.c z0() {
        return this.f59504k;
    }
}
