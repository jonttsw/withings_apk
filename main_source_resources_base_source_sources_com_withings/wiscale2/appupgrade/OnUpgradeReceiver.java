package com.withings.wiscale2.appupgrade;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import lb0.m;
import lb0.n;
import m70.i;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: OnUpgradeReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/appupgrade/OnUpgradeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OnUpgradeReceiver extends Hilt_OnUpgradeReceiver {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f50045m = 0;
    @Inject

    /* renamed from: c  reason: collision with root package name */
    public i f50046c;
    @Inject

    /* renamed from: d  reason: collision with root package name */
    public vf.c f50047d;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public c90.a f50048e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public c90.b f50049f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public m f50050g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public a10.a f50051h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public c00.b f50052i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public kn.e f50053j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public x60.a f50054k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public hw.a f50055l;

    /* compiled from: OnUpgradeReceiver.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$Companion$saveAppVersionIfNullAsync$1", f = "OnUpgradeReceiver.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.appupgrade.OnUpgradeReceiver$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0678a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f50056a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0678a(Context context, qm0.d<? super C0678a> dVar) {
                super(2, dVar);
                this.f50056a = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new C0678a(this.f50056a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((C0678a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f50056a);
                if (defaultSharedPreferences.getInt("appVersion", -1) < 0) {
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("appVersion", 6040016);
                    edit.apply();
                }
                return y.f85009a;
            }
        }

        public static void a(Context context) {
            u.j(context, "context");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new C0678a(context, null), 2, null);
        }
    }

    /* compiled from: OnUpgradeReceiver.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1", f = "OnUpgradeReceiver.kt", l = {109, 115, 118, 122, 126, 130, 135, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_HR_STATE, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX, ConstantsWs.MEASURE_TYPE_PH, 150, ConstantsWs.MEASURE_TYPE_HR_SD_NN}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f50057a;

        /* renamed from: b  reason: collision with root package name */
        Object f50058b;

        /* renamed from: c  reason: collision with root package name */
        n f50059c;

        /* renamed from: d  reason: collision with root package name */
        int f50060d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n f50061e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f50062f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ OnUpgradeReceiver f50063g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$10", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50064a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50065b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super a> dVar) {
                super(1, dVar);
                this.f50065b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new a(this.f50065b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((a) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50064a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f50064a = 1;
                    int i12 = OnUpgradeReceiver.f50045m;
                    OnUpgradeReceiver onUpgradeReceiver = this.f50065b;
                    User f11 = onUpgradeReceiver.g().f();
                    if (f11 == null || (obj2 = onUpgradeReceiver.f().d(f11.q(), "unknown_measure", this)) != coroutineSingletons) {
                        obj2 = y.f85009a;
                    }
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$11", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_NITRITES}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.appupgrade.OnUpgradeReceiver$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0679b extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50066a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50067b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0679b(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super C0679b> dVar) {
                super(1, dVar);
                this.f50067b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new C0679b(this.f50067b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((C0679b) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50066a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f50066a = 1;
                    if (OnUpgradeReceiver.b(this.f50067b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$12", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_HR_RMS_SD}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50068a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50069b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super c> dVar) {
                super(1, dVar);
                this.f50069b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new c(this.f50069b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((c) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50068a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    hw.a aVar = this.f50069b.f50055l;
                    if (aVar != null) {
                        this.f50068a = 1;
                        if (aVar.b(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        u.s("healthInsightDatastore");
                        throw null;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$1", f = "OnUpgradeReceiver.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f50070a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Context context, qm0.d<? super d> dVar) {
                super(1, dVar);
                this.f50070a = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new d(this.f50070a, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((d) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                ActivityManager activityManager = (ActivityManager) androidx.core.content.a.getSystemService(this.f50070a, ActivityManager.class);
                if (activityManager != null) {
                    activityManager.clearApplicationUserData();
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$2", f = "OnUpgradeReceiver.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50071a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(OnUpgradeReceiver onUpgradeReceiver, Context context, qm0.d<? super e> dVar) {
                super(1, dVar);
                this.f50071a = onUpgradeReceiver;
                this.f50072b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new e(this.f50071a, this.f50072b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((e) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                c00.b bVar = this.f50071a.f50052i;
                if (bVar != null) {
                    bVar.g();
                    Context context = this.f50072b;
                    u.j(context, "context");
                    context.getSharedPreferences("synchronizeMissions", 0).edit().putLong("lastWsMissionsSync", 0L).apply();
                    return y.f85009a;
                }
                u.s("missionRepository");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$3", f = "OnUpgradeReceiver.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50073a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50074b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(OnUpgradeReceiver onUpgradeReceiver, Context context, qm0.d<? super f> dVar) {
                super(1, dVar);
                this.f50073a = onUpgradeReceiver;
                this.f50074b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new f(this.f50073a, this.f50074b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((f) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                c90.b bVar = this.f50073a.f50049f;
                if (bVar != null) {
                    bVar.b();
                    Context context = this.f50074b;
                    u.j(context, "context");
                    context.getSharedPreferences("synchronizeMissions", 0).edit().putLong("lastWsMissionsSync", 0L).apply();
                    return y.f85009a;
                }
                u.s("segmentalBodyCompositionRepository");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$4", f = "OnUpgradeReceiver.kt", l = {127}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50075a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50076b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super g> dVar) {
                super(1, dVar);
                this.f50076b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new g(this.f50076b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((g) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50075a;
                OnUpgradeReceiver onUpgradeReceiver = this.f50076b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    c90.a aVar = onUpgradeReceiver.f50048e;
                    if (aVar != null) {
                        this.f50075a = 1;
                        if (aVar.clear(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        u.s("bodyCompositionRangeRawRepository");
                        throw null;
                    }
                }
                c90.b bVar = onUpgradeReceiver.f50049f;
                if (bVar != null) {
                    bVar.b();
                    return y.f85009a;
                }
                u.s("segmentalBodyCompositionRepository");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$5", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50077a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50078b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super h> dVar) {
                super(1, dVar);
                this.f50078b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new h(this.f50078b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((h) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50077a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    OnUpgradeReceiver onUpgradeReceiver = this.f50078b;
                    User f11 = onUpgradeReceiver.g().f();
                    if (f11 != null) {
                        m mVar = onUpgradeReceiver.f50050g;
                        if (mVar != null) {
                            long q11 = f11.q();
                            this.f50077a = 1;
                            if (mVar.a(q11, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            u.s("migrateLegacyObjectiveWeightToHealthGoal");
                            throw null;
                        }
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$6", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50079a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50080b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super i> dVar) {
                super(1, dVar);
                this.f50080b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new i(this.f50080b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((i) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50079a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f50079a = 1;
                    if (OnUpgradeReceiver.c(this.f50080b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$7", f = "OnUpgradeReceiver.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f50081a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Context context, qm0.d<? super j> dVar) {
                super(1, dVar);
                this.f50081a = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new j(this.f50081a, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((j) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                ActivityManager activityManager = (ActivityManager) androidx.core.content.a.getSystemService(this.f50081a, ActivityManager.class);
                if (activityManager != null) {
                    activityManager.clearApplicationUserData();
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$8", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50082a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50083b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super k> dVar) {
                super(1, dVar);
                this.f50083b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new k(this.f50083b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((k) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50082a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f50082a = 1;
                    if (OnUpgradeReceiver.d(this.f50083b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnUpgradeReceiver.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver$onReceive$1$1$9", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.l<qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50084a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ OnUpgradeReceiver f50085b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super l> dVar) {
                super(1, dVar);
                this.f50085b = onUpgradeReceiver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(qm0.d<?> dVar) {
                return new l(this.f50085b, dVar);
            }

            @Override // ym0.l
            public final Object invoke(qm0.d<? super y> dVar) {
                return ((l) create(dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50084a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f50084a = 1;
                    if (OnUpgradeReceiver.a(this.f50085b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar, Context context, OnUpgradeReceiver onUpgradeReceiver, qm0.d<? super b> dVar) {
            super(1, dVar);
            this.f50061e = nVar;
            this.f50062f = context;
            this.f50063g = onUpgradeReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(qm0.d<?> dVar) {
            return new b(this.f50061e, this.f50062f, this.f50063g, dVar);
        }

        @Override // ym0.l
        public final Object invoke(qm0.d<? super y> dVar) {
            return ((b) create(dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0144 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0174 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x018c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01be A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01ec A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0203 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x021a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0231 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.OnUpgradeReceiver.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnUpgradeReceiver.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.appupgrade.OnUpgradeReceiver", f = "OnUpgradeReceiver.kt", l = {ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT, 180}, m = "updateNotifications")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        OnUpgradeReceiver f50086a;

        /* renamed from: b  reason: collision with root package name */
        Object f50087b;

        /* renamed from: c  reason: collision with root package name */
        Object f50088c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f50089d;

        /* renamed from: f  reason: collision with root package name */
        int f50091f;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50089d = obj;
            this.f50091f |= Integer.MIN_VALUE;
            return OnUpgradeReceiver.this.h(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.withings.wiscale2.appupgrade.OnUpgradeReceiver r17, qm0.d r18) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.OnUpgradeReceiver.a(com.withings.wiscale2.appupgrade.OnUpgradeReceiver, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.withings.wiscale2.appupgrade.OnUpgradeReceiver r9, qm0.d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.withings.wiscale2.appupgrade.c
            if (r0 == 0) goto L16
            r0 = r10
            com.withings.wiscale2.appupgrade.c r0 = (com.withings.wiscale2.appupgrade.c) r0
            int r1 = r0.f50102d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f50102d = r1
            goto L1b
        L16:
            com.withings.wiscale2.appupgrade.c r0 = new com.withings.wiscale2.appupgrade.c
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f50100b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f50102d
            java.lang.String r3 = "tabsIndicationStateRepository"
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L47
            if (r2 == r7) goto L41
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            nm0.l.b(r10)
            goto L8f
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver r9 = r0.f50099a
            nm0.l.b(r10)
            goto L79
        L41:
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver r9 = r0.f50099a
            nm0.l.b(r10)
            goto L63
        L47:
            nm0.l.b(r10)
            vf.c r10 = r9.f50047d
            if (r10 == 0) goto L9f
            boolean r10 = r10.j()
            if (r10 == 0) goto L8f
            x60.a r10 = r9.f50054k
            if (r10 == 0) goto L9a
            r0.f50099a = r9
            r0.f50102d = r7
            java.lang.Object r10 = r10.clear(r0)
            if (r10 != r1) goto L63
            goto L9e
        L63:
            x60.a r10 = r9.f50054k
            if (r10 == 0) goto L96
            v60.a r2 = new v60.a
            com.withings.tutorials.core.model.TabType r8 = com.withings.tutorials.core.model.TabType.f44589c
            r2.<init>(r8, r7)
            r0.f50099a = r9
            r0.f50102d = r6
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 != r1) goto L79
            goto L9e
        L79:
            x60.a r9 = r9.f50054k
            if (r9 == 0) goto L92
            v60.a r10 = new v60.a
            com.withings.tutorials.core.model.TabType r2 = com.withings.tutorials.core.model.TabType.f44588b
            r10.<init>(r2, r7)
            r0.f50099a = r4
            r0.f50102d = r5
            java.lang.Object r9 = r9.a(r10, r0)
            if (r9 != r1) goto L8f
            goto L9e
        L8f:
            nm0.y r1 = nm0.y.f85009a
            goto L9e
        L92:
            kotlin.jvm.internal.u.s(r3)
            throw r4
        L96:
            kotlin.jvm.internal.u.s(r3)
            throw r4
        L9a:
            kotlin.jvm.internal.u.s(r3)
            throw r4
        L9e:
            return r1
        L9f:
            java.lang.String r9 = "accountManager"
            kotlin.jvm.internal.u.s(r9)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.OnUpgradeReceiver.b(com.withings.wiscale2.appupgrade.OnUpgradeReceiver, qm0.d):java.lang.Object");
    }

    public static final Object c(OnUpgradeReceiver onUpgradeReceiver, qm0.d dVar) {
        Object h11 = onUpgradeReceiver.h(d.f50103a, dVar);
        if (h11 != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return h11;
    }

    public static final Object d(OnUpgradeReceiver onUpgradeReceiver, qm0.d dVar) {
        Object h11 = onUpgradeReceiver.h(e.f50104a, dVar);
        if (h11 != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ym0.l<? super c10.c<?>, ? extends c10.c<?>> r10, qm0.d<? super nm0.y> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.appupgrade.OnUpgradeReceiver.c
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver$c r0 = (com.withings.wiscale2.appupgrade.OnUpgradeReceiver.c) r0
            int r1 = r0.f50091f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50091f = r1
            goto L18
        L13:
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver$c r0 = new com.withings.wiscale2.appupgrade.OnUpgradeReceiver$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f50089d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f50091f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.f50088c
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f50087b
            com.withings.user.User r2 = (com.withings.user.User) r2
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver r4 = r0.f50086a
            nm0.l.b(r11)
            goto La6
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r0.f50088c
            com.withings.user.User r10 = (com.withings.user.User) r10
            java.lang.Object r2 = r0.f50087b
            ym0.l r2 = (ym0.l) r2
            com.withings.wiscale2.appupgrade.OnUpgradeReceiver r4 = r0.f50086a
            nm0.l.b(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L78
        L4f:
            nm0.l.b(r11)
            m70.i r11 = r9.g()
            com.withings.user.User r11 = r11.f()
            if (r11 == 0) goto Lc9
            a10.a r2 = r9.f()
            long r5 = r11.q()
            kotlinx.coroutines.flow.Flow r2 = r2.f(r5)
            r0.f50086a = r9
            r0.f50087b = r10
            r0.f50088c = r11
            r0.f50091f = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r2, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            r4 = r9
        L78:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L7e
            kotlin.collections.i0 r2 = kotlin.collections.i0.f76187a
        L7e:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L89:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r2.next()
            c10.c r6 = (c10.c) r6
            java.lang.Object r6 = r10.invoke(r6)
            c10.c r6 = (c10.c) r6
            if (r6 == 0) goto L89
            r5.add(r6)
            goto L89
        La1:
            java.util.Iterator r10 = r5.iterator()
            r2 = r11
        La6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lc9
            java.lang.Object r11 = r10.next()
            c10.c r11 = (c10.c) r11
            a10.a r5 = r4.f()
            long r6 = r2.q()
            r0.f50086a = r4
            r0.f50087b = r2
            r0.f50088c = r10
            r0.f50091f = r3
            java.lang.Object r11 = r5.e(r6, r11, r0)
            if (r11 != r1) goto La6
            return r1
        Lc9:
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.OnUpgradeReceiver.h(ym0.l, qm0.d):java.lang.Object");
    }

    public final a10.a f() {
        a10.a aVar = this.f50051h;
        if (aVar != null) {
            return aVar;
        }
        u.s("notificationRepository");
        throw null;
    }

    public final i g() {
        i iVar = this.f50046c;
        if (iVar != null) {
            return iVar;
        }
        u.s("userManager");
        throw null;
    }

    @Override // com.withings.wiscale2.appupgrade.Hilt_OnUpgradeReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        u.j(context, "context");
        u.j(intent, "intent");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i11 = defaultSharedPreferences.getInt("appVersion", -1);
        defaultSharedPreferences.edit().putInt("appVersion", 6040016).apply();
        x70.b.l(this, "OnUpgradeReceiver lastUpgradeVersion " + i11, new Object[0]);
        ar.b.a(this, GlobalScope.INSTANCE, Dispatchers.getIO(), new b(new n(i11), context, this, null));
    }
}
