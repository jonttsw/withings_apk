package com.withings.partner.model;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.common.MeasureGroupOrigin;
import com.withings.partner.model.PartnerAssociationStatusLoader;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
import org.joda.time.DateTime;
import org.json.JSONObject;
import v10.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Partner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/partner/model/Partner;", "", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class Partner {

    /* renamed from: l  reason: collision with root package name */
    public static final Partner f43454l;

    /* renamed from: m  reason: collision with root package name */
    public static final Partner f43455m;

    /* renamed from: n  reason: collision with root package name */
    public static final Partner f43456n;

    /* renamed from: o  reason: collision with root package name */
    public static final Partner f43457o;

    /* renamed from: p  reason: collision with root package name */
    public static final Partner f43458p;

    /* renamed from: q  reason: collision with root package name */
    public static final Partner f43459q;

    /* renamed from: r  reason: collision with root package name */
    public static final Partner f43460r;

    /* renamed from: s  reason: collision with root package name */
    public static final Partner f43461s;

    /* renamed from: t  reason: collision with root package name */
    public static final Partner f43462t;

    /* renamed from: u  reason: collision with root package name */
    public static final Partner f43463u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ Partner[] f43464v;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f43465w;

    /* renamed from: a  reason: collision with root package name */
    private boolean f43466a;

    /* renamed from: b  reason: collision with root package name */
    private String f43467b;

    /* renamed from: c  reason: collision with root package name */
    private Long f43468c;

    /* renamed from: d  reason: collision with root package name */
    private Long f43469d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<PartnerAssociationStatusLoader.AssociationStatus> f43470e;

    /* renamed from: f  reason: collision with root package name */
    private String f43471f;

    /* renamed from: g  reason: collision with root package name */
    private String f43472g;

    /* renamed from: h  reason: collision with root package name */
    private String f43473h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f43474i;

    /* renamed from: j  reason: collision with root package name */
    private final String f43475j;

    /* renamed from: k  reason: collision with root package name */
    private final i0 f43476k;

    /* compiled from: Partner.kt */
    /* loaded from: classes4.dex */
    static final class c extends Partner {
        private final int A;
        private final int B;
        private final String F;
        private final int G;
        private final String M;
        private final boolean P;
        private final boolean Q;
        private final boolean R;
        private final boolean S;
        private final boolean T;
        private final List<PartnerCapabilities> W;

        /* renamed from: x  reason: collision with root package name */
        private int f43483x;

        /* renamed from: y  reason: collision with root package name */
        private final int f43484y;

        /* renamed from: z  reason: collision with root package name */
        private final int f43485z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Partner.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.model.Partner$GoogleHealthConnect", f = "Partner.kt", l = {ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT}, m = "computeAssociationStatus")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43486a;

            /* renamed from: c  reason: collision with root package name */
            int f43488c;

            a(qm0.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43486a = obj;
                this.f43488c |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        c() {
            super("GoogleHealthConnect", 3);
            this.f43483x = 121;
            this.f43484y = C1987R.drawable.img_googlehealthconnect;
            this.f43485z = C1987R.string.googleHealthPlatform_title;
            this.A = C1987R.string.googleHealthPlatform_description;
            this.B = ConstantsWs.DEVICE_MODEL_STEP_COUNTER_ANDROID_GOOGLE_HEALTH_PLATFORM;
            this.F = ConstantsWs.BRAND_REDIRECT_URI_NAME_ANDROID_GOOGLE_HEALTH_PLATFORM;
            this.G = C1987R.string.partnerPackage_googleHealthPlatform;
            this.M = "healthconnect://onboarding";
            this.P = true;
            this.Q = true;
            this.R = true;
            this.S = true;
            this.T = true;
            this.W = PartnerCapabilities.a();
        }

        @Override // com.withings.partner.model.Partner
        public final String B() {
            return this.M;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean C() {
            return this.Q;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean E() {
            return this.T;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean F() {
            return this.S;
        }

        @Override // com.withings.partner.model.Partner
        public final String I() {
            return this.F;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
        @Override // com.withings.partner.model.Partner
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected final java.lang.Object a(android.content.Context r4, qm0.d<? super com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus> r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.withings.partner.model.Partner.c.a
                if (r4 == 0) goto L13
                r4 = r5
                com.withings.partner.model.Partner$c$a r4 = (com.withings.partner.model.Partner.c.a) r4
                int r0 = r4.f43488c
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.f43488c = r0
                goto L18
            L13:
                com.withings.partner.model.Partner$c$a r4 = new com.withings.partner.model.Partner$c$a
                r4.<init>(r5)
            L18:
                java.lang.Object r5 = r4.f43486a
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r4.f43488c
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 != r2) goto L27
                nm0.l.b(r5)
                goto L3e
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                nm0.l.b(r5)
                com.withings.partner.exchanges.google.healthconnect.HealthConnect$e r5 = com.withings.partner.exchanges.google.healthconnect.HealthConnect.e.f43397a
                r4.f43488c = r2
                r1 = 0
                java.lang.Object r5 = r5.h(r1, r4)
                if (r5 != r0) goto L3e
                return r0
            L3e:
                java.util.Set r5 = (java.util.Set) r5
                boolean r4 = r5.isEmpty()
                if (r4 == 0) goto L49
                com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r4 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43522h
                goto L4b
            L49:
                com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r4 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43515a
            L4b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.Partner.c.a(android.content.Context, qm0.d):java.lang.Object");
        }

        @Override // com.withings.partner.model.Partner
        public final int d() {
            return this.G;
        }

        @Override // com.withings.partner.model.Partner
        public final List<PartnerCapabilities> h() {
            return this.W;
        }

        @Override // com.withings.partner.model.Partner
        public final int l() {
            return this.f43483x;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean n() {
            return this.R;
        }

        @Override // com.withings.partner.model.Partner
        public final int q() {
            return this.A;
        }

        @Override // com.withings.partner.model.Partner
        public final Integer s() {
            return Integer.valueOf(this.B);
        }

        @Override // com.withings.partner.model.Partner
        public final int v() {
            return this.f43484y;
        }

        @Override // com.withings.partner.model.Partner
        public final int w() {
            return this.f43485z;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean x() {
            return this.P;
        }
    }

    /* compiled from: Partner.kt */
    /* loaded from: classes4.dex */
    static final class i extends Partner {
        private final int A;
        private final int B;
        private final int F;
        private final boolean G;
        private final boolean M;
        private final boolean P;
        private final boolean Q;
        private final List<PartnerCapabilities> R;

        /* renamed from: x  reason: collision with root package name */
        private int f43504x;

        /* renamed from: y  reason: collision with root package name */
        private final int f43505y;

        /* renamed from: z  reason: collision with root package name */
        private final int f43506z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Partner.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.partner.model.Partner$SamsungHealth", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_FILEERROR}, m = "computeAssociationStatus")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43507a;

            /* renamed from: c  reason: collision with root package name */
            int f43509c;

            a(qm0.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43507a = obj;
                this.f43509c |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        i() {
            super("SamsungHealth", 7);
            this.f43504x = 43;
            this.f43505y = 2131232505;
            this.f43506z = C1987R.string.samsungHealth_title;
            this.A = C1987R.string.samsungHealth_learnMoreInfo;
            this.B = ConstantsWs.DEVICE_MODEL_STEP_COUNTER_SHEALTH;
            this.F = C1987R.string.partnerPackage_samsungHealth;
            this.G = true;
            this.M = true;
            this.P = true;
            this.Q = true;
            this.R = x.V(PartnerCapabilities.f43544a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(2:10|11)(2:42|43))(3:44|45|(1:47)(1:48))|12|(4:15|(3:17|18|19)(1:21)|20|13)|22|23|(5:25|(2:28|26)|29|30|(4:32|33|34|(1:39)(2:36|37)))|41|33|34|(0)(0)))|51|6|7|(0)(0)|12|(1:13)|22|23|(0)|41|33|34|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
            r6 = nm0.l.a(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0027, B:23:0x0045, B:24:0x0054, B:26:0x005a, B:28:0x0067, B:29:0x006b, B:31:0x0072, B:32:0x007b, B:34:0x0081, B:35:0x0091, B:39:0x009d, B:19:0x0039), top: B:47:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0027, B:23:0x0045, B:24:0x0054, B:26:0x005a, B:28:0x0067, B:29:0x006b, B:31:0x0072, B:32:0x007b, B:34:0x0081, B:35:0x0091, B:39:0x009d, B:19:0x0039), top: B:47:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable X(android.content.Context r6, qm0.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.withings.partner.model.a
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.partner.model.a r0 = (com.withings.partner.model.a) r0
                int r1 = r0.f43529d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43529d = r1
                goto L18
            L13:
                com.withings.partner.model.a r0 = new com.withings.partner.model.a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f43527b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43529d
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r6 = r0.f43526a
                com.withings.partner.model.Partner$i r6 = (com.withings.partner.model.Partner.i) r6
                nm0.l.b(r7)     // Catch: java.lang.Throwable -> L2b
                goto L45
            L2b:
                r6 = move-exception
                goto La2
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                nm0.l.b(r7)
                r0.f43526a = r5     // Catch: java.lang.Throwable -> L2b
                r0.f43529d = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = y10.d.e(r6, r0)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r1) goto L44
                return r1
            L44:
                r6 = r5
            L45:
                com.samsung.android.sdk.healthdata.HealthDataStore r7 = (com.samsung.android.sdk.healthdata.HealthDataStore) r7     // Catch: java.lang.Throwable -> L2b
                java.util.ArrayList r0 = y10.b.a()     // Catch: java.lang.Throwable -> L2b
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2b
            L54:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L6b
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2b
                r4 = r2
                y10.a r4 = (y10.a) r4     // Catch: java.lang.Throwable -> L2b
                boolean r4 = r4.i(r6)     // Catch: java.lang.Throwable -> L2b
                if (r4 == 0) goto L54
                r1.add(r2)     // Catch: java.lang.Throwable -> L2b
                goto L54
            L6b:
                boolean r6 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
                r6 = r6 ^ r3
                if (r6 == 0) goto L9c
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
            L7b:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto L91
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2b
                y10.a r1 = (y10.a) r1     // Catch: java.lang.Throwable -> L2b
                java.util.List r1 = r1.q()     // Catch: java.lang.Throwable -> L2b
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L2b
                kotlin.collections.x.n(r1, r6)     // Catch: java.lang.Throwable -> L2b
                goto L7b
            L91:
                java.util.List r6 = kotlin.collections.x.B(r6)     // Catch: java.lang.Throwable -> L2b
                boolean r6 = y10.d.d(r7, r6)     // Catch: java.lang.Throwable -> L2b
                if (r6 != 0) goto L9c
                goto L9d
            L9c:
                r3 = 0
            L9d:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
                goto La6
            La2:
                nm0.k$a r6 = nm0.l.a(r6)
            La6:
                java.lang.Throwable r7 = nm0.k.b(r6)
                if (r7 != 0) goto Lad
                goto Laf
            Lad:
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
            Laf:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.Partner.i.X(android.content.Context, qm0.d):java.io.Serializable");
        }

        @Override // com.withings.partner.model.Partner
        public final boolean C() {
            return this.Q;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean E() {
            return this.M;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean F() {
            return this.G;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        @Override // com.withings.partner.model.Partner
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected final java.lang.Object a(android.content.Context r5, qm0.d<? super com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.withings.partner.model.Partner.i.a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.partner.model.Partner$i$a r0 = (com.withings.partner.model.Partner.i.a) r0
                int r1 = r0.f43509c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43509c = r1
                goto L18
            L13:
                com.withings.partner.model.Partner$i$a r0 = new com.withings.partner.model.Partner$i$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f43507a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f43509c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                nm0.l.b(r6)
                goto L3b
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                nm0.l.b(r6)
                r0.f43509c = r3
                java.io.Serializable r6 = r4.X(r5, r0)
                if (r6 != r1) goto L3b
                return r1
            L3b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r5 = r6.booleanValue()
                if (r5 == 0) goto L46
                com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r5 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43520f
                goto L48
            L46:
                com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r5 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43515a
            L48:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.Partner.i.a(android.content.Context, qm0.d):java.lang.Object");
        }

        @Override // com.withings.partner.model.Partner
        public final int d() {
            return this.F;
        }

        @Override // com.withings.partner.model.Partner
        public final List<PartnerCapabilities> h() {
            return this.R;
        }

        @Override // com.withings.partner.model.Partner
        public final int l() {
            return this.f43504x;
        }

        @Override // com.withings.partner.model.Partner
        public final int q() {
            return this.A;
        }

        @Override // com.withings.partner.model.Partner
        public final Integer s() {
            return Integer.valueOf(this.B);
        }

        @Override // com.withings.partner.model.Partner
        public final int v() {
            return this.f43505y;
        }

        @Override // com.withings.partner.model.Partner
        public final int w() {
            return this.f43506z;
        }

        @Override // com.withings.partner.model.Partner
        public final boolean x() {
            return this.P;
        }
    }

    static {
        Partner partner = new Partner() { // from class: com.withings.partner.model.Partner.h

            /* renamed from: x  reason: collision with root package name */
            private int f43501x = 8;

            /* renamed from: y  reason: collision with root package name */
            private final int f43502y = C1987R.drawable.img_runkeeper;

            /* renamed from: z  reason: collision with root package name */
            private final int f43503z = C1987R.string._STORE_RUNKEEPER_TITLE_;
            private final int A = C1987R.string._LEARN_MORE_INFO_TEXT_RUNKEEPER_;
            private final String B = ConstantsWs.BRAND_REDIRECT_URI_NAME_RUNKEEPER;
            private final MeasureGroupOrigin F = MeasureGroupOrigin.f40637b;
            private final int G = C1987R.string.partnerPackage_runkeeper;
            private final List<PartnerCapabilities> M = x.V(PartnerCapabilities.f43547d);

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            public final List<PartnerCapabilities> h() {
                return this.M;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43501x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43502y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43503z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }

            @Override // com.withings.partner.model.Partner
            public final MeasureGroupOrigin y() {
                return this.F;
            }
        };
        f43454l = partner;
        Partner partner2 = new Partner() { // from class: com.withings.partner.model.Partner.f

            /* renamed from: x  reason: collision with root package name */
            private int f43495x = 10;

            /* renamed from: y  reason: collision with root package name */
            private final int f43496y = C1987R.drawable.img_myfitnesspal;

            /* renamed from: z  reason: collision with root package name */
            private final int f43497z = C1987R.string._STORE_MYFITPAL_TITLE_;
            private final int A = C1987R.string._LEARN_MORE_INFO_TEXT_MYFITPAL_;
            private final String B = ConstantsWs.BRAND_REDIRECT_URI_NAME_MYFITNESSPAL;
            private final int F = C1987R.string.partnerPackage_myFitnessPal;
            private final List<PartnerCapabilities> G = x.V(PartnerCapabilities.f43551h);

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.F;
            }

            @Override // com.withings.partner.model.Partner
            public final List<PartnerCapabilities> h() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43495x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43496y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43497z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }
        };
        f43455m = partner2;
        Partner partner3 = new Partner() { // from class: com.withings.partner.model.Partner.b

            /* renamed from: x  reason: collision with root package name */
            private int f43480x = 15;

            /* renamed from: y  reason: collision with root package name */
            private final int f43481y = 2131232897;

            /* renamed from: z  reason: collision with root package name */
            private final int f43482z = C1987R.string._GOOGLE_FIT_;
            private final int A = C1987R.string._AT_INFO_TITLE_;
            private final int B = C1987R.string._GOOGLE_FIT_DESC_;
            private final int F = ConstantsWs.DEVICE_MODEL_STEP_COUNTER_GOOGLE;
            private final String G = ConstantsWs.BRAND_REDIRECT_URI_NAME_GOOGLE_FITNESS;
            private final MeasureGroupOrigin M = MeasureGroupOrigin.f40639d;
            private final int P = C1987R.string.partnerPackage_googleFit;
            private final boolean Q = true;
            private final boolean R = true;
            private final boolean S = true;
            private final boolean T = true;
            private final List<PartnerCapabilities> W = x.W(PartnerCapabilities.f43544a, PartnerCapabilities.f43547d, PartnerCapabilities.f43545b, PartnerCapabilities.f43546c, PartnerCapabilities.f43548e, PartnerCapabilities.f43549f, PartnerCapabilities.f43550g);

            @Override // com.withings.partner.model.Partner
            public final Integer A() {
                return Integer.valueOf(this.A);
            }

            @Override // com.withings.partner.model.Partner
            public final boolean C() {
                return this.R;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean E() {
                return this.T;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean F() {
                return this.S;
            }

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            protected final Object a(Context context, qm0.d<? super PartnerAssociationStatusLoader.AssociationStatus> dVar) {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                u.i(googleApiAvailability, "getInstance(...)");
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
                if (isGooglePlayServicesAvailable == 2) {
                    return PartnerAssociationStatusLoader.AssociationStatus.f43523i;
                }
                if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
                    return PartnerAssociationStatusLoader.AssociationStatus.f43524j;
                }
                if (GoogleSignIn.getLastSignedInAccount(context) == null) {
                    return PartnerAssociationStatusLoader.AssociationStatus.f43519e;
                }
                GoogleSignInAccount accountForExtension = GoogleSignIn.getAccountForExtension(context, v10.d.f());
                u.i(accountForExtension, "getAccountForExtension(...)");
                Set<Scope> requestedScopes = accountForExtension.getRequestedScopes();
                u.i(requestedScopes, "getRequestedScopes(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : requestedScopes) {
                    if (!accountForExtension.getGrantedScopes().contains((Scope) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return PartnerAssociationStatusLoader.AssociationStatus.f43517c;
                }
                if (K()) {
                    return PartnerAssociationStatusLoader.AssociationStatus.f43516b;
                }
                if (c.p.f103158c.i(this)) {
                    new c.a();
                    if (!c.a.a(context)) {
                        return PartnerAssociationStatusLoader.AssociationStatus.f43518d;
                    }
                }
                return PartnerAssociationStatusLoader.AssociationStatus.f43515a;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.P;
            }

            @Override // com.withings.partner.model.Partner
            public final List<PartnerCapabilities> h() {
                return this.W;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43480x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final Integer s() {
                return Integer.valueOf(this.F);
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43481y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43482z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return this.Q;
            }

            @Override // com.withings.partner.model.Partner
            public final MeasureGroupOrigin y() {
                return this.M;
            }
        };
        f43456n = partner3;
        c cVar = new c();
        f43457o = cVar;
        Partner partner4 = new Partner() { // from class: com.withings.partner.model.Partner.d

            /* renamed from: x  reason: collision with root package name */
            private int f43489x = 118;

            /* renamed from: y  reason: collision with root package name */
            private final int f43490y = C1987R.drawable.huawei_health;

            /* renamed from: z  reason: collision with root package name */
            private final int f43491z = C1987R.string.huaweiHealth_title;
            private final int A = ConstantsWs.DEVICE_MODEL_HUAWEI_HEALTH_KIT;
            private final String B = ConstantsWs.BRAND_REDIRECT_URI_NAME_HUAWEI;
            private final int F = C1987R.string.huaweiHealth_learnMoreInfo;
            private final int G = C1987R.string.partnerPackage_huaweiHealth;
            private final boolean M = true;
            private final boolean P = true;
            private final boolean Q = true;
            private final boolean R = true;
            private final boolean S = true;
            private final boolean T = true;
            private final List<PartnerCapabilities> W = x.V(PartnerCapabilities.f43545b);

            @Override // com.withings.partner.model.Partner
            public final boolean C() {
                return this.P;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean E() {
                return this.T;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean F() {
                return this.S;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean G() {
                return this.R;
            }

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            public final List<PartnerCapabilities> h() {
                return this.W;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43489x;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean n() {
                return this.Q;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.F;
            }

            @Override // com.withings.partner.model.Partner
            public final Integer s() {
                return Integer.valueOf(this.A);
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43490y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43491z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return this.M;
            }
        };
        f43458p = partner4;
        Partner partner5 = new Partner() { // from class: com.withings.partner.model.Partner.g

            /* renamed from: x  reason: collision with root package name */
            private int f43498x = 25;

            /* renamed from: y  reason: collision with root package name */
            private final int f43499y = C1987R.drawable.img_nest;

            /* renamed from: z  reason: collision with root package name */
            private final int f43500z = C1987R.string._NEST_;
            private final int A = C1987R.string._LEARN_MORE_INFO_TEXT_NEST_;
            private final String B = ConstantsWs.BRAND_REDIRECT_URI_NAME_NEST;
            private final int F = C1987R.string._URL_WEBSITE_NEST_;
            private final int G = C1987R.string.partnerPackage_nest;

            @Override // com.withings.partner.model.Partner
            public final int H() {
                return this.F;
            }

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43498x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43499y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43500z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }
        };
        f43459q = partner5;
        Partner partner6 = new Partner() { // from class: com.withings.partner.model.Partner.e

            /* renamed from: x  reason: collision with root package name */
            private int f43492x = 41;

            /* renamed from: y  reason: collision with root package name */
            private final int f43493y = C1987R.drawable.img_ifttt;

            /* renamed from: z  reason: collision with root package name */
            private final int f43494z = C1987R.string._IFTTT_;
            private final int A = C1987R.string._IFTTT_DESCRIPTION_;
            private final String B = ConstantsWs.BRAND_REDIRECT_URI_NAME_IFTTT;
            private final int F = C1987R.string._IFTTT_LINK_ACCOUNT_URL_;
            private final int G = C1987R.string.partnerPackage_ifttt;

            @Override // com.withings.partner.model.Partner
            public final int H() {
                return this.F;
            }

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.G;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43492x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43493y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43494z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }
        };
        f43460r = partner6;
        i iVar = new i();
        f43461s = iVar;
        Partner partner7 = new Partner() { // from class: com.withings.partner.model.Partner.a

            /* renamed from: x  reason: collision with root package name */
            private int f43477x = 100;

            /* renamed from: y  reason: collision with root package name */
            private final int f43478y = C1987R.drawable.img_logo_comme_jaime;

            /* renamed from: z  reason: collision with root package name */
            private final int f43479z = C1987R.string.partner_commeJAime_title;
            private final int A = C1987R.string.partner_commeJAime_description;
            private final int B = C1987R.string.partner_commeJAime_app_package_prod;

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43477x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43478y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43479z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }
        };
        f43462t = partner7;
        Partner partner8 = new Partner() { // from class: com.withings.partner.model.Partner.j

            /* renamed from: x  reason: collision with root package name */
            private int f43510x = 102;

            /* renamed from: y  reason: collision with root package name */
            private final int f43511y = C1987R.drawable.icone_strava;

            /* renamed from: z  reason: collision with root package name */
            private final int f43512z = C1987R.string.partner_strava_name;
            private final String A = "strava";
            private final int B = C1987R.string.strava_packageName;

            @Override // com.withings.partner.model.Partner
            public final String I() {
                return this.A;
            }

            @Override // com.withings.partner.model.Partner
            public final int d() {
                return this.B;
            }

            @Override // com.withings.partner.model.Partner
            public final int l() {
                return this.f43510x;
            }

            @Override // com.withings.partner.model.Partner
            public final int q() {
                return 0;
            }

            @Override // com.withings.partner.model.Partner
            public final int v() {
                return this.f43511y;
            }

            @Override // com.withings.partner.model.Partner
            public final int w() {
                return this.f43512z;
            }

            @Override // com.withings.partner.model.Partner
            public final boolean x() {
                return false;
            }
        };
        f43463u = partner8;
        Partner[] partnerArr = {partner, partner2, partner3, cVar, partner4, partner5, partner6, iVar, partner7, partner8};
        f43464v = partnerArr;
        f43465w = sm0.b.a(partnerArr);
    }

    private Partner() {
        throw null;
    }

    public Partner(String str, int i11) {
        this.f43470e = StateFlowKt.MutableStateFlow(PartnerAssociationStatusLoader.AssociationStatus.f43515a);
        String jSONObject = new JSONObject().toString();
        u.i(jSONObject, "toString(...)");
        this.f43471f = jSONObject;
        this.f43474i = true;
        this.f43475j = "";
        this.f43476k = i0.f76187a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object N(android.content.Context r4, com.withings.partner.model.Partner r5, qm0.d r6, boolean r7) {
        /*
            boolean r0 = r6 instanceof com.withings.partner.model.b
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.partner.model.b r0 = (com.withings.partner.model.b) r0
            int r1 = r0.f43533d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43533d = r1
            goto L18
        L13:
            com.withings.partner.model.b r0 = new com.withings.partner.model.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f43531b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f43533d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.partner.model.Partner r5 = r0.f43530a
            nm0.l.b(r6)
            goto L5b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            nm0.l.b(r6)
            boolean r6 = r5.J(r4)
            if (r6 == 0) goto L5f
            boolean r6 = r5.x()
            if (r6 != 0) goto L41
            goto L5f
        L41:
            if (r7 != 0) goto L50
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r6 = r5.e()
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r7 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43515a
            if (r6 == r7) goto L50
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r4 = r5.e()
            goto L61
        L50:
            r0.f43530a = r5
            r0.f43533d = r3
            java.lang.Object r6 = r5.a(r4, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r4 = (com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus) r4
            goto L61
        L5f:
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r4 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43515a
        L61:
            r5.P(r4)
            nm0.y r4 = nm0.y.f85009a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.partner.model.Partner.N(android.content.Context, com.withings.partner.model.Partner, qm0.d, boolean):java.lang.Object");
    }

    public static sm0.a<Partner> t() {
        return f43465w;
    }

    public static Partner valueOf(String str) {
        return (Partner) Enum.valueOf(Partner.class, str);
    }

    public static Partner[] values() {
        return (Partner[]) f43464v.clone();
    }

    public Integer A() {
        return null;
    }

    public String B() {
        return null;
    }

    public boolean C() {
        return false;
    }

    public final String D() {
        return this.f43472g;
    }

    public boolean E() {
        return false;
    }

    public boolean F() {
        return false;
    }

    public boolean G() {
        return false;
    }

    public int H() {
        return 0;
    }

    public String I() {
        return this.f43475j;
    }

    public final boolean J(Context context) {
        u.j(context, "context");
        if (!this.f43466a && (!G() || !new t10.a(context).a(l()))) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        String str = this.f43473h;
        if (str != null && str.length() != 0 && !u.e(this.f43473h, "_")) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        return this.f43466a;
    }

    public final Object M(Context context, boolean z5, qm0.d<? super y> dVar) {
        return N(context, this, dVar, z5);
    }

    public final void O(String str) {
        this.f43473h = str;
    }

    public final void P(PartnerAssociationStatusLoader.AssociationStatus value) {
        u.j(value, "value");
        this.f43470e.setValue(value);
    }

    public final void Q(String str) {
        this.f43467b = str;
    }

    public final void R(Long l5) {
        this.f43469d = l5;
    }

    public final void S(Long l5) {
        this.f43468c = l5;
    }

    public final void T(boolean z5) {
        this.f43466a = z5;
    }

    public final void U(String str) {
        this.f43471f = str;
    }

    public final void V(String str) {
        this.f43472g = str;
    }

    protected Object a(Context context, qm0.d<? super PartnerAssociationStatusLoader.AssociationStatus> dVar) {
        return PartnerAssociationStatusLoader.AssociationStatus.f43515a;
    }

    public final String b() {
        return this.f43473h;
    }

    public abstract int d();

    public final PartnerAssociationStatusLoader.AssociationStatus e() {
        return this.f43470e.getValue();
    }

    public final MutableStateFlow<PartnerAssociationStatusLoader.AssociationStatus> f() {
        return this.f43470e;
    }

    public List<PartnerCapabilities> h() {
        return this.f43476k;
    }

    public final String i() {
        return this.f43467b;
    }

    public abstract int l();

    public final Long m() {
        return this.f43469d;
    }

    public boolean n() {
        return this.f43474i;
    }

    public abstract int q();

    public Integer s() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = super.toString();
        boolean z5 = this.f43466a;
        PartnerAssociationStatusLoader.AssociationStatus e11 = e();
        DateTime dateTime = new DateTime(this.f43468c);
        String str2 = this.f43471f;
        return str + " isLinked:" + z5 + " | associationStatus:" + e11 + " | lastUpdate " + dateTime + "\ncontext:" + str2;
    }

    public final Long u() {
        return this.f43468c;
    }

    public abstract int v();

    public abstract int w();

    public abstract boolean x();

    public MeasureGroupOrigin y() {
        return null;
    }

    public final String z() {
        return this.f43471f;
    }
}
