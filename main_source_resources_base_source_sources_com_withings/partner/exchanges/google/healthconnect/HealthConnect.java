package com.withings.partner.exchanges.google.healthconnect;

import android.content.Context;
import androidx.health.connect.client.records.BasalMetabolicRateRecord;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.BodyFatRecord;
import androidx.health.connect.client.records.BodyTemperatureRecord;
import androidx.health.connect.client.records.BodyWaterMassRecord;
import androidx.health.connect.client.records.BoneMassRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.FloorsClimbedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.HeightRecord;
import androidx.health.connect.client.records.LeanBodyMassRecord;
import androidx.health.connect.client.records.MenstruationPeriodRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.TotalCaloriesBurnedRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.WeightRecord;
import b5.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.vasistas.model.SleepLevel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.collections.c1;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import m5.a;
import nm0.k;
import nm0.l;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import ym0.p;
/* compiled from: HealthConnect.kt */
/* loaded from: classes4.dex */
public final class HealthConnect {

    /* renamed from: a  reason: collision with root package name */
    public static final HealthConnect f43375a = new HealthConnect();

    /* renamed from: b  reason: collision with root package name */
    private static b5.a f43376b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f43377c;

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class Checker {

        /* renamed from: a  reason: collision with root package name */
        private static HealthConnectAvailability f43378a = HealthConnectAvailability.f43382c;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f43379b = 0;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HealthConnect.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/partner/exchanges/google/healthconnect/HealthConnect$Checker$HealthConnectAvailability;", "", "partner_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class HealthConnectAvailability {

            /* renamed from: a  reason: collision with root package name */
            public static final HealthConnectAvailability f43380a;

            /* renamed from: b  reason: collision with root package name */
            public static final HealthConnectAvailability f43381b;

            /* renamed from: c  reason: collision with root package name */
            public static final HealthConnectAvailability f43382c;

            /* renamed from: d  reason: collision with root package name */
            private static final /* synthetic */ HealthConnectAvailability[] f43383d;

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.partner.exchanges.google.healthconnect.HealthConnect$Checker$HealthConnectAvailability] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.partner.exchanges.google.healthconnect.HealthConnect$Checker$HealthConnectAvailability] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.partner.exchanges.google.healthconnect.HealthConnect$Checker$HealthConnectAvailability] */
            static {
                ?? r02 = new Enum("INSTALLED", 0);
                f43380a = r02;
                ?? r12 = new Enum("NOT_INSTALLED", 1);
                f43381b = r12;
                ?? r22 = new Enum("NOT_SUPPORTED", 2);
                f43382c = r22;
                HealthConnectAvailability[] healthConnectAvailabilityArr = {r02, r12, r22};
                f43383d = healthConnectAvailabilityArr;
                sm0.b.a(healthConnectAvailabilityArr);
            }

            private HealthConnectAvailability() {
                throw null;
            }

            public static HealthConnectAvailability valueOf(String str) {
                return (HealthConnectAvailability) Enum.valueOf(HealthConnectAvailability.class, str);
            }

            public static HealthConnectAvailability[] values() {
                return (HealthConnectAvailability[]) f43383d.clone();
            }
        }

        public static void a(Context context, boolean z5) {
            HealthConnectAvailability healthConnectAvailability;
            u.j(context, "context");
            b5.a.f20419a.getClass();
            int c11 = a.b.c(context, "com.google.android.apps.healthdata");
            if (z5 && c11 != 1) {
                if (c11 == 3) {
                    healthConnectAvailability = HealthConnectAvailability.f43380a;
                } else if (c11 == 2) {
                    healthConnectAvailability = HealthConnectAvailability.f43381b;
                } else {
                    healthConnectAvailability = HealthConnectAvailability.f43382c;
                }
            } else {
                healthConnectAvailability = HealthConnectAvailability.f43382c;
            }
            f43378a = healthConnectAvailability;
        }

        public static HealthConnectAvailability b() {
            return f43378a;
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class a implements a20.c<Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f43384a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private static final Map<Integer, Integer> f43385b = s0.j(new nm0.j(15, 2), new nm0.j(191, 4), new nm0.j(20, 5), new nm0.j(6, 8), new nm0.j(30, 11), new nm0.j(195, 51), new nm0.j(29, 16), new nm0.j(18, 25), new nm0.j(31, 27), new nm0.j(22, 28), new nm0.j(27, 32), new nm0.j(192, 35), new nm0.j(3, 37), new nm0.j(192, 35), new nm0.j(193, 52), new nm0.j(194, 38), new nm0.j(196, 39), new nm0.j(308, 9), new nm0.j(16, 81), new nm0.j(33, 44), new nm0.j(19, 48), new nm0.j(187, 54), new nm0.j(23, 55), new nm0.j(2, 56), new nm0.j(307, 57), new nm0.j(21, 64), new nm0.j(4, 60), new nm0.j(34, 61), new nm0.j(35, 62), new nm0.j(14, 66), new nm0.j(8, 72), new nm0.j(10, 72), new nm0.j(9, 72), new nm0.j(7, 74), new nm0.j(12, 76), new nm0.j(13, 75), new nm0.j(24, 78), new nm0.j(1, 79), new nm0.j(25, 80), new nm0.j(28, 83), new nm0.j(17, 36), new nm0.j(36, 0));

        @Override // a20.c
        public final Map<Integer, Integer> c() {
            return f43385b;
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43386a = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HealthConnect.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Changes", f = "HealthConnect.kt", l = {416}, m = "getChanges")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            fn0.d f43387a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f43388b;

            /* renamed from: d  reason: collision with root package name */
            int f43390d;

            a(qm0.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43388b = obj;
                this.f43390d |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        private b() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(2:23|(1:25)(2:26|(2:28|(1:30))(2:31|32)))|11|12|(1:14)|15|(1:20)(2:17|18)))|35|6|7|(0)(0)|11|12|(0)|15|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
            r7 = nm0.l.a(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable a(fn0.d r6, qm0.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.withings.partner.exchanges.google.healthconnect.a
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.partner.exchanges.google.healthconnect.a r0 = (com.withings.partner.exchanges.google.healthconnect.a) r0
                int r1 = r0.f43439c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43439c = r1
                goto L18
            L13:
                com.withings.partner.exchanges.google.healthconnect.a r0 = new com.withings.partner.exchanges.google.healthconnect.a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f43437a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43439c
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 != r4) goto L2a
                nm0.l.b(r7)     // Catch: java.lang.Throwable -> L28
                goto L59
            L28:
                r6 = move-exception
                goto L62
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                nm0.l.b(r7)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r7 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r7.getClass()
                boolean r7 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.k()
                if (r7 != 0) goto L41
                return r3
            L41:
                b5.a r7 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.a()     // Catch: java.lang.Throwable -> L28
                if (r7 == 0) goto L5c
                o5.a r2 = new o5.a     // Catch: java.lang.Throwable -> L28
                java.util.Set r6 = kotlin.collections.c1.g(r6)     // Catch: java.lang.Throwable -> L28
                r2.<init>(r6)     // Catch: java.lang.Throwable -> L28
                r0.f43439c = r4     // Catch: java.lang.Throwable -> L28
                java.lang.Object r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L28
                if (r7 != r1) goto L59
                return r1
            L59:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L28
                goto L66
            L5c:
                java.lang.String r6 = "client"
                kotlin.jvm.internal.u.s(r6)     // Catch: java.lang.Throwable -> L28
                throw r3     // Catch: java.lang.Throwable -> L28
            L62:
                nm0.k$a r7 = nm0.l.a(r6)
            L66:
                java.lang.Throwable r6 = nm0.k.b(r7)
                if (r6 == 0) goto L74
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r0 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r0.getClass()
                r6.printStackTrace()
            L74:
                boolean r6 = r7 instanceof nm0.k.a
                if (r6 == 0) goto L79
                goto L7a
            L79:
                r3 = r7
            L7a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.b.a(fn0.d, qm0.d):java.io.Serializable");
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:24|25))(2:26|(1:28)(2:29|(2:31|(1:33))(2:34|35)))|12|13|(1:15)|16|(1:18)|(1:23)(2:20|21)))|38|6|7|(0)(0)|12|13|(0)|16|(0)|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
            r8 = nm0.l.a(r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(fn0.d<? extends androidx.health.connect.client.records.Record> r6, java.lang.String r7, qm0.d<? super p5.a> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.b.a
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$b$a r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.b.a) r0
                int r1 = r0.f43390d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43390d = r1
                goto L18
            L13:
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$b$a r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f43388b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43390d
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                fn0.d r6 = r0.f43387a
                nm0.l.b(r8)     // Catch: java.lang.Throwable -> L2a
                goto L54
            L2a:
                r7 = move-exception
                goto L5d
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                nm0.l.b(r8)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r8.getClass()
                boolean r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.k()
                if (r8 != 0) goto L43
                return r4
            L43:
                b5.a r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.a()     // Catch: java.lang.Throwable -> L2a
                if (r8 == 0) goto L57
                r0.f43387a = r6     // Catch: java.lang.Throwable -> L2a
                r0.f43390d = r3     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r8 = r8.c(r7, r0)     // Catch: java.lang.Throwable -> L2a
                if (r8 != r1) goto L54
                return r1
            L54:
                p5.a r8 = (p5.a) r8     // Catch: java.lang.Throwable -> L2a
                goto L61
            L57:
                java.lang.String r7 = "client"
                kotlin.jvm.internal.u.s(r7)     // Catch: java.lang.Throwable -> L2a
                throw r4     // Catch: java.lang.Throwable -> L2a
            L5d:
                nm0.k$a r8 = nm0.l.a(r7)
            L61:
                boolean r7 = r8 instanceof nm0.k.a
                r0 = r7 ^ 1
                if (r0 == 0) goto L7e
                r0 = r8
                p5.a r0 = (p5.a) r0
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r0 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                java.lang.String r6 = r6.i()
                nm0.j r1 = new nm0.j
                java.lang.String r2 = "read"
                r1.<init>(r2, r6)
                java.util.Map r6 = kotlin.collections.s0.i(r1)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect.b(r0, r6)
            L7e:
                java.lang.Throwable r6 = nm0.k.b(r8)
                if (r6 == 0) goto L8c
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r0 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r0.getClass()
                r6.printStackTrace()
            L8c:
                if (r7 == 0) goto L8f
                goto L90
            L8f:
                r4 = r8
            L90:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.b.b(fn0.d, java.lang.String, qm0.d):java.lang.Object");
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class c implements a20.c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43391a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private static final Map<PartnerCapabilities, fn0.d<? extends Record>> f43392b = s0.j(new nm0.j(PartnerCapabilities.f43547d, q0.b(ExerciseSessionRecord.class)), new nm0.j(PartnerCapabilities.f43545b, q0.b(WeightRecord.class)), new nm0.j(PartnerCapabilities.f43546c, q0.b(OxygenSaturationRecord.class)), new nm0.j(PartnerCapabilities.f43548e, q0.b(SleepSessionRecord.class)), new nm0.j(PartnerCapabilities.f43544a, q0.b(StepsRecord.class)), new nm0.j(PartnerCapabilities.f43560q, q0.b(BasalMetabolicRateRecord.class)), new nm0.j(PartnerCapabilities.f43549f, q0.b(BloodPressureRecord.class)), new nm0.j(PartnerCapabilities.f43550g, q0.b(BodyTemperatureRecord.class)), new nm0.j(PartnerCapabilities.f43552i, q0.b(FloorsClimbedRecord.class)), new nm0.j(PartnerCapabilities.f43553j, q0.b(Vo2MaxRecord.class)), new nm0.j(PartnerCapabilities.f43554k, q0.b(BodyFatRecord.class)), new nm0.j(PartnerCapabilities.f43555l, q0.b(LeanBodyMassRecord.class)), new nm0.j(PartnerCapabilities.f43556m, q0.b(BoneMassRecord.class)), new nm0.j(PartnerCapabilities.f43557n, q0.b(BodyWaterMassRecord.class)), new nm0.j(PartnerCapabilities.f43558o, q0.b(HeightRecord.class)), new nm0.j(PartnerCapabilities.f43559p, q0.b(HeartRateRecord.class)), new nm0.j(PartnerCapabilities.f43561r, q0.b(MenstruationPeriodRecord.class)));

        @Override // a20.c
        public final Map<PartnerCapabilities, fn0.d<? extends Record>> c() {
            return f43392b;
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class d implements u10.f<fn0.d<? extends Record>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f43393a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private static final LinkedHashSet f43394b = x.T0(c1.i(q0.b(OxygenSaturationRecord.class), q0.b(DistanceRecord.class), q0.b(TotalCaloriesBurnedRecord.class)));

        /* renamed from: c  reason: collision with root package name */
        private static final LinkedHashSet f43395c = new LinkedHashSet();

        /* renamed from: d  reason: collision with root package name */
        private static final LinkedHashSet f43396d = x.T0(c1.i(q0.b(ExerciseSessionRecord.class), q0.b(BasalMetabolicRateRecord.class), q0.b(BloodPressureRecord.class), q0.b(BodyFatRecord.class), q0.b(BoneMassRecord.class), q0.b(BodyWaterMassRecord.class), q0.b(BodyTemperatureRecord.class), q0.b(FloorsClimbedRecord.class), q0.b(HeartRateRecord.class), q0.b(HeightRecord.class), q0.b(LeanBodyMassRecord.class), q0.b(MenstruationPeriodRecord.class), q0.b(SleepSessionRecord.class), q0.b(StepsRecord.class), q0.b(Vo2MaxRecord.class), q0.b(WeightRecord.class)));

        @Override // u10.f
        public final LinkedHashSet a() {
            return f43395c;
        }

        @Override // u10.f
        public final LinkedHashSet b() {
            return f43396d;
        }

        @Override // u10.f
        public final LinkedHashSet d() {
            return f43394b;
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f43397a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final Set<String> f43398b;

        /* renamed from: c  reason: collision with root package name */
        private static final LinkedHashMap f43399c;

        /* renamed from: d  reason: collision with root package name */
        private static DateTime f43400d;

        /* renamed from: e  reason: collision with root package name */
        private static boolean f43401e;

        /* renamed from: f  reason: collision with root package name */
        private static final nm0.g f43402f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HealthConnect.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Permissions", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONGBATTERYLVL}, m = "getGrantedPermissions")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            e f43403a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f43404b;

            /* renamed from: d  reason: collision with root package name */
            int f43406d;

            a(qm0.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43404b = obj;
                this.f43406d |= Integer.MIN_VALUE;
                return e.this.b(null, false, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HealthConnect.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Permissions", f = "HealthConnect.kt", l = {272}, m = "hasPermissions")
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Set f43407a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f43408b;

            /* renamed from: d  reason: collision with root package name */
            int f43410d;

            b(qm0.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43408b = obj;
                this.f43410d |= Integer.MIN_VALUE;
                return e.this.f(null, this);
            }
        }

        /* compiled from: HealthConnect.kt */
        /* loaded from: classes4.dex */
        static final class c extends w implements p<String, Boolean, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f43411a = new w(2);

            @Override // ym0.p
            public final Boolean invoke(String str, Boolean bool) {
                u.j(str, "<anonymous parameter 0>");
                return null;
            }
        }

        /* compiled from: HealthConnect.kt */
        /* loaded from: classes4.dex */
        static final class d extends w implements ym0.a<g.a<Set<? extends String>, Set<? extends String>>> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f43412a = new w(0);

            @Override // ym0.a
            public final g.a<Set<? extends String>, Set<? extends String>> invoke() {
                Object a11;
                e eVar = e.f43397a;
                try {
                    a11 = new e5.a("com.google.android.apps.healthdata");
                } catch (Throwable th2) {
                    a11 = l.a(th2);
                }
                if (k.b(a11) != null) {
                    x70.b.t(e.f43397a, "Exception at permission controller creation", new Object[0]);
                }
                if (a11 instanceof k.a) {
                    a11 = null;
                }
                return (g.a) a11;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HealthConnect.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Permissions", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONGTZNAME}, m = "revokePermissions")
        /* renamed from: com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0586e extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43413a;

            /* renamed from: c  reason: collision with root package name */
            int f43415c;

            C0586e(qm0.d<? super C0586e> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43413a = obj;
                this.f43415c |= Integer.MIN_VALUE;
                return e.this.i(this);
            }
        }

        static {
            LinkedHashSet<fn0.d> c11 = d.f43393a.c(2);
            ArrayList arrayList = new ArrayList(x.y(c11, 10));
            for (fn0.d dVar : c11) {
                int i11 = m5.a.f81090b;
                arrayList.add(a.C1282a.b(dVar));
            }
            LinkedHashSet<fn0.d> c12 = d.f43393a.c(1);
            ArrayList arrayList2 = new ArrayList(x.y(c12, 10));
            for (fn0.d dVar2 : c12) {
                int i12 = m5.a.f81090b;
                arrayList2.add(a.C1282a.a(dVar2));
            }
            Set<String> U0 = x.U0(x.l0(arrayList2, arrayList));
            f43398b = U0;
            Set<String> set = U0;
            int h11 = s0.h(x.y(set, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (Object obj : set) {
                String str = (String) obj;
                linkedHashMap.put(obj, null);
            }
            f43399c = s0.s(linkedHashMap);
            f43400d = new DateTime(0L);
            f43402f = nm0.h.b(d.f43412a);
        }

        private e() {
        }

        public static Set a() {
            return f43398b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object c(e eVar, Set set, boolean z5, qm0.d dVar, int i11) {
            if ((i11 & 1) != 0) {
                set = f43399c.keySet();
            }
            if ((i11 & 2) != 0) {
                z5 = false;
            }
            return eVar.b(set, z5, dVar);
        }

        public static g.a d() {
            return (g.a) f43402f.getValue();
        }

        public static void g() {
            LinkedHashMap linkedHashMap = f43399c;
            final c cVar = c.f43411a;
            linkedHashMap.replaceAll(new BiFunction() { // from class: w10.a
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    p tmp0 = p.this;
                    u.j(tmp0, "$tmp0");
                    return (Boolean) tmp0.invoke(obj, obj2);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.util.Set<java.lang.String> r7, boolean r8, qm0.d<? super java.util.Set<java.lang.String>> r9) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.b(java.util.Set, boolean, qm0.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object e(int r6, com.withings.partner.model.capabilities.PartnerCapabilities r7, qm0.d r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof com.withings.partner.exchanges.google.healthconnect.b
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.partner.exchanges.google.healthconnect.b r0 = (com.withings.partner.exchanges.google.healthconnect.b) r0
                int r1 = r0.f43442c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43442c = r1
                goto L18
            L13:
                com.withings.partner.exchanges.google.healthconnect.b r0 = new com.withings.partner.exchanges.google.healthconnect.b
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r8 = r0.f43440a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43442c
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L30
                if (r2 != r4) goto L28
                nm0.l.b(r8)
                goto L52
            L28:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L30:
                nm0.l.b(r8)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$c r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.c.f43391a
                java.lang.Object r7 = r8.l(r7)
                fn0.d r7 = (fn0.d) r7
                if (r7 == 0) goto L5b
                java.lang.String r6 = w10.b.c(r6, r7)
                if (r6 == 0) goto L5b
                java.util.Set r6 = kotlin.collections.c1.g(r6)
                r0.f43442c = r4
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e r7 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.f43397a
                java.lang.Object r8 = r7.f(r6, r0)
                if (r8 != r1) goto L52
                return r1
            L52:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r6 = r8.booleanValue()
                if (r6 == 0) goto L5b
                r3 = r4
            L5b:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.e(int, com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(java.util.Set<java.lang.String> r5, qm0.d<? super java.lang.Boolean> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.b
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$b r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.b) r0
                int r1 = r0.f43410d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43410d = r1
                goto L18
            L13:
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$b r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$b
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f43408b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43410d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.util.Set r5 = r0.f43407a
                java.util.Set r5 = (java.util.Set) r5
                nm0.l.b(r6)
                goto L46
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                nm0.l.b(r6)
                r6 = r5
                java.util.Set r6 = (java.util.Set) r6
                r0.f43407a = r6
                r0.f43410d = r3
                r6 = 0
                r2 = 2
                java.lang.Object r6 = c(r4, r5, r6, r0, r2)
                if (r6 != r1) goto L46
                return r1
            L46:
                java.util.Set r6 = (java.util.Set) r6
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r6.containsAll(r5)
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.f(java.util.Set, qm0.d):java.lang.Object");
        }

        public final Object h(boolean z5, qm0.d<? super Set<String>> dVar) {
            boolean z11;
            if (!z5 && !new Duration(f43400d, DateTime.now()).isLongerThan(new Duration(10000L))) {
                z11 = false;
            } else {
                z11 = true;
            }
            return c(this, null, z11, dVar, 1);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:18|19))(2:20|(2:22|23)(2:24|(2:26|(1:28))(2:29|30)))|11|12|(1:14)|15|16))|33|6|7|(0)(0)|11|12|(0)|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            r5 = nm0.l.a(r5);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object i(qm0.d<? super nm0.y> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.C0586e
                if (r0 == 0) goto L13
                r0 = r5
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$e r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.C0586e) r0
                int r1 = r0.f43415c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43415c = r1
                goto L18
            L13:
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$e r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$e$e
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f43413a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43415c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                nm0.l.b(r5)     // Catch: java.lang.Throwable -> L27
                goto L55
            L27:
                r5 = move-exception
                goto L5f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L31:
                nm0.l.b(r5)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r5.getClass()
                boolean r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.k()
                if (r5 != 0) goto L42
                nm0.y r5 = nm0.y.f85009a
                return r5
            L42:
                b5.a r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.a()     // Catch: java.lang.Throwable -> L27
                if (r5 == 0) goto L58
                b5.b r5 = r5.g()     // Catch: java.lang.Throwable -> L27
                r0.f43415c = r3     // Catch: java.lang.Throwable -> L27
                java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L27
                if (r5 != r1) goto L55
                return r1
            L55:
                nm0.y r5 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L27
                goto L63
            L58:
                java.lang.String r5 = "client"
                kotlin.jvm.internal.u.s(r5)     // Catch: java.lang.Throwable -> L27
                r5 = 0
                throw r5     // Catch: java.lang.Throwable -> L27
            L5f:
                nm0.k$a r5 = nm0.l.a(r5)
            L63:
                java.lang.Throwable r5 = nm0.k.b(r5)
                if (r5 == 0) goto L71
                com.withings.partner.exchanges.google.healthconnect.HealthConnect r0 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
                r0.getClass()
                r5.printStackTrace()
            L71:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.i(qm0.d):java.lang.Object");
        }
    }

    /* compiled from: HealthConnect.kt */
    /* loaded from: classes4.dex */
    public static final class f implements a20.c<SleepLevel, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f43416a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private static final Map<SleepLevel, Integer> f43417b = s0.j(new nm0.j(SleepLevel.Awake, 1), new nm0.j(SleepLevel.Deep, 5), new nm0.j(SleepLevel.Light, 4), new nm0.j(SleepLevel.Rem, 6), new nm0.j(SleepLevel.Unspecified, 0));

        @Override // a20.c
        public final Map<SleepLevel, Integer> c() {
            return f43417b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnect.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONGAPPLIVER}, m = "delete")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        fn0.d f43418a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f43419b;

        /* renamed from: d  reason: collision with root package name */
        int f43421d;

        g(qm0.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43419b = obj;
            this.f43421d |= Integer.MIN_VALUE;
            return HealthConnect.this.d(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnect.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONGRELATION, ConstantsWs.WS_STATUS_WRONGCONTEXT}, m = "insert")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f43422a;

        /* renamed from: b  reason: collision with root package name */
        Collection f43423b;

        /* renamed from: c  reason: collision with root package name */
        Iterator f43424c;

        /* renamed from: d  reason: collision with root package name */
        Object f43425d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f43426e;

        /* renamed from: g  reason: collision with root package name */
        int f43428g;

        h(qm0.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43426e = obj;
            this.f43428g |= Integer.MIN_VALUE;
            return HealthConnect.this.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnect.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGCLIENTID}, m = "read")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        fn0.d f43429a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f43430b;

        /* renamed from: d  reason: collision with root package name */
        int f43432d;

        i(qm0.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43430b = obj;
            this.f43432d |= Integer.MIN_VALUE;
            return HealthConnect.this.m(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthConnect.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect", f = "HealthConnect.kt", l = {302, 307}, m = DiscoverItems.Item.UPDATE_ACTION)
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f43433a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f43434b;

        /* renamed from: d  reason: collision with root package name */
        int f43436d;

        j(qm0.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43434b = obj;
            this.f43436d |= Integer.MIN_VALUE;
            return HealthConnect.this.n(null, this);
        }
    }

    static {
        b5.a.f20419a.getClass();
        f43377c = a.b.a();
    }

    private HealthConnect() {
    }

    public static void c(HealthConnect healthConnect, String clientId, String str) {
        CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        healthConnect.getClass();
        u.j(coroutineScope, "coroutineScope");
        u.j(clientId, "clientId");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new com.withings.partner.exchanges.google.healthconnect.c(str, clientId, null), 2, null);
    }

    public static String e() {
        return f43377c;
    }

    private static DateTime f(Instant instant) {
        u.j(instant, "<this>");
        return b20.a.d(new DateTime(instant.toEpochMilli()));
    }

    public static final void g(Context context, boolean z5) {
        Object a11;
        u.j(context, "context");
        try {
            Checker.a(context, z5);
            if (Checker.b() == Checker.HealthConnectAvailability.f43380a) {
                f43376b = a.b.b(b5.a.f20419a, context);
            }
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            f43375a.getClass();
            b10.printStackTrace();
        }
        u.i(context.getPackageName(), "getPackageName(...)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c5, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0300, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (kotlin.jvm.internal.u.e(r1, f(r8.getEndTime())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0331, code lost:
        if (kotlin.jvm.internal.u.e(r1, f(r8.getEndTime())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x037c, code lost:
        if (kotlin.jvm.internal.u.e(r1, f(r8.getEndTime())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03bb, code lost:
        if (kotlin.jvm.internal.u.e(r1, f(r8.getEndTime())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03ec, code lost:
        if (kotlin.jvm.internal.u.e(r1, f(r8.getEndTime())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (kotlin.jvm.internal.u.e(r9, r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0143, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016e, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d4, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0203, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0232, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0269, code lost:
        if (kotlin.jvm.internal.u.e(r9, f(r8)) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(androidx.health.connect.client.records.Record r8, int r9, java.lang.Object r10, org.joda.time.DateTime r11, org.joda.time.DateTime r12) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.i(androidx.health.connect.client.records.Record, int, java.lang.Object, org.joda.time.DateTime, org.joda.time.DateTime):boolean");
    }

    public static boolean j(Record record, Long l5, int i11, Object value, DateTime startTime, DateTime dateTime) {
        u.j(record, "<this>");
        u.j(value, "value");
        u.j(startTime, "startTime");
        if ((l5 != null && u.e(record.getMetadata().getClientRecordId(), l5.toString()) && !x.W(0L, -1L).contains(l5)) || i(record, i11, value, startTime, dateTime)) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (f43376b != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Map map) {
        x70.b.l(this, "healthconnect " + map, new Object[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:22|23))(2:24|(2:37|38)(2:30|(2:32|(1:34))(2:35|36)))|12|13|(1:15)|16|(1:18)|19|20))|41|6|7|(0)(0)|12|13|(0)|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
        r6 = nm0.l.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(fn0.d<? extends androidx.health.connect.client.records.Record> r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, qm0.d<? super nm0.y> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.g
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$g r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.g) r0
            int r1 = r0.f43421d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43421d = r1
            goto L18
        L13:
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$g r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f43419b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f43421d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fn0.d r5 = r0.f43418a
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L58
        L29:
            r6 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            nm0.l.b(r8)
            boolean r8 = k()
            if (r8 == 0) goto L91
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L49
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L49
            goto L91
        L49:
            b5.a r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43376b     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto L5b
            r0.f43418a = r5     // Catch: java.lang.Throwable -> L29
            r0.f43421d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r8.i(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L58
            return r1
        L58:
            nm0.y r6 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L29
            goto L66
        L5b:
            java.lang.String r6 = "client"
            kotlin.jvm.internal.u.s(r6)     // Catch: java.lang.Throwable -> L29
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L29
        L62:
            nm0.k$a r6 = nm0.l.a(r6)
        L66:
            boolean r7 = r6 instanceof nm0.k.a
            r7 = r7 ^ r3
            com.withings.partner.exchanges.google.healthconnect.HealthConnect r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
            if (r7 == 0) goto L82
            r7 = r6
            nm0.y r7 = (nm0.y) r7
            java.lang.String r5 = r5.i()
            nm0.j r7 = new nm0.j
            java.lang.String r0 = "delete"
            r7.<init>(r0, r5)
            java.util.Map r5 = kotlin.collections.s0.i(r7)
            r8.l(r5)
        L82:
            java.lang.Throwable r5 = nm0.k.b(r6)
            if (r5 == 0) goto L8e
            r8.getClass()
            r5.printStackTrace()
        L8e:
            nm0.y r5 = nm0.y.f85009a
            return r5
        L91:
            nm0.y r5 = nm0.y.f85009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.d(fn0.d, java.util.List, java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(11:11|12|13|14|(1:16)|17|(1:19)|(1:21)|22|(1:24)|(1:29)(2:26|27))(2:30|31))(5:32|33|(1:53)|35|(6:37|(1:39)|33|(0)|35|(2:40|(2:42|(1:51)(2:44|(11:46|(1:48)|13|14|(0)|17|(0)|(0)|22|(0)|(0)(0))(2:49|50)))(1:52))(0))(0)))(3:54|35|(0)(0))))|57|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        r13 = nm0.l.a(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:26:0x0094). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List<? extends androidx.health.connect.client.records.Record> r12, qm0.d<? super java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.h(java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(2:29|(1:31))(2:32|33))|12|13|(1:15)|16|(1:18)|(1:23)(2:20|21)))|36|6|7|(0)(0)|12|13|(0)|16|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r8 = nm0.l.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(o5.b<? extends androidx.health.connect.client.records.Record> r6, fn0.d<? extends androidx.health.connect.client.records.Record> r7, qm0.d<? super p5.c<? extends androidx.health.connect.client.records.Record>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.i
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$i r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.i) r0
            int r1 = r0.f43432d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43432d = r1
            goto L18
        L13:
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$i r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f43430b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f43432d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            fn0.d r7 = r0.f43429a
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L46
        L2a:
            r6 = move-exception
            goto L4f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            nm0.l.b(r8)
            b5.a r8 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43376b     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L49
            r0.f43429a = r7     // Catch: java.lang.Throwable -> L2a
            r0.f43432d = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r8.d(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L46
            return r1
        L46:
            p5.c r8 = (p5.c) r8     // Catch: java.lang.Throwable -> L2a
            goto L53
        L49:
            java.lang.String r6 = "client"
            kotlin.jvm.internal.u.s(r6)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2a
        L4f:
            nm0.k$a r8 = nm0.l.a(r6)
        L53:
            boolean r6 = r8 instanceof nm0.k.a
            r0 = r6 ^ 1
            com.withings.partner.exchanges.google.healthconnect.HealthConnect r1 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
            if (r0 == 0) goto L70
            r0 = r8
            p5.c r0 = (p5.c) r0
            java.lang.String r7 = r7.i()
            nm0.j r0 = new nm0.j
            java.lang.String r2 = "read"
            r0.<init>(r2, r7)
            java.util.Map r7 = kotlin.collections.s0.i(r0)
            r1.l(r7)
        L70:
            java.lang.Throwable r7 = nm0.k.b(r8)
            if (r7 == 0) goto L7c
            r1.getClass()
            r7.printStackTrace()
        L7c:
            if (r6 == 0) goto L7f
            goto L80
        L7f:
            r4 = r8
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.m(o5.b, fn0.d, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(2:34|(2:45|46)(2:38|(2:40|(1:42))(2:43|44)))|19|20|(1:22)|23|(2:25|(2:31|(1:33)))|12|13))|49|6|7|(0)(0)|19|20|(0)|23|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r10 = nm0.l.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List<? extends androidx.health.connect.client.records.Record> r9, qm0.d<? super nm0.y> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.partner.exchanges.google.healthconnect.HealthConnect.j
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$j r0 = (com.withings.partner.exchanges.google.healthconnect.HealthConnect.j) r0
            int r1 = r0.f43436d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43436d = r1
            goto L18
        L13:
            com.withings.partner.exchanges.google.healthconnect.HealthConnect$j r0 = new com.withings.partner.exchanges.google.healthconnect.HealthConnect$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f43434b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f43436d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r10)
            goto Lb8
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.f43433a
            java.util.List r9 = (java.util.List) r9
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L3b
            goto L5c
        L3b:
            r10 = move-exception
            goto L66
        L3d:
            nm0.l.b(r10)
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto Lbb
            boolean r10 = k()
            if (r10 != 0) goto L4d
            goto Lbb
        L4d:
            b5.a r10 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43376b     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L5f
            r0.f43433a = r9     // Catch: java.lang.Throwable -> L3b
            r0.f43436d = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r10.h(r9, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r1) goto L5c
            return r1
        L5c:
            nm0.y r10 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L3b
            goto L6a
        L5f:
            java.lang.String r10 = "client"
            kotlin.jvm.internal.u.s(r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3b
        L66:
            nm0.k$a r10 = nm0.l.a(r10)
        L6a:
            boolean r2 = r10 instanceof nm0.k.a
            r2 = r2 ^ r4
            com.withings.partner.exchanges.google.healthconnect.HealthConnect r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.f43375a
            if (r2 == 0) goto L8e
            r2 = r10
            nm0.y r2 = (nm0.y) r2
            java.lang.Object r2 = kotlin.collections.x.I(r9)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            nm0.j r6 = new nm0.j
            java.lang.String r7 = "update"
            r6.<init>(r7, r2)
            java.util.Map r2 = kotlin.collections.s0.i(r6)
            r5.l(r2)
        L8e:
            java.lang.Throwable r2 = nm0.k.b(r10)
            if (r2 == 0) goto Lb8
            r5.getClass()
            r2.printStackTrace()
            boolean r6 = r2 instanceof android.os.RemoteException
            if (r6 == 0) goto Lb8
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto Lb8
            r6 = 0
            java.lang.String r7 = "Request contains invalid UID"
            boolean r2 = dp0.j.r(r2, r7, r6)
            if (r2 != r4) goto Lb8
            r0.f43433a = r10
            r0.f43436d = r3
            java.lang.Object r9 = r5.h(r9, r0)
            if (r9 != r1) goto Lb8
            return r1
        Lb8:
            nm0.y r9 = nm0.y.f85009a
            return r9
        Lbb:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.exchanges.google.healthconnect.HealthConnect.n(java.util.List, qm0.d):java.lang.Object");
    }
}
