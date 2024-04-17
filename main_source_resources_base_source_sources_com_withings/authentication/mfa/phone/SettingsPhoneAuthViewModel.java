package com.withings.authentication.mfa.phone;

import ah.x;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.withings.account.network.ws.AccountRemoteRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.j;
import nm0.l;
import nm0.y;
import qm0.d;
import th.f;
import ym0.p;
/* compiled from: SettingsPhoneAuthViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/phone/SettingsPhoneAuthViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SettingsPhoneAuthViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final x f31762a;

    /* renamed from: b  reason: collision with root package name */
    private final AccountRemoteRepository f31763b;

    /* renamed from: c  reason: collision with root package name */
    private final f f31764c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<Locale> f31765d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<Locale> f31766e;

    /* renamed from: f  reason: collision with root package name */
    private final Flow<List<j<String, Locale>>> f31767f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<List<String>> f31768g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<String> f31769h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<String> f31770i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31771j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.authentication.mfa.phone.b> f31772k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<com.withings.authentication.mfa.phone.b> f31773l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.authentication.mfa.phone.a> f31774m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<com.withings.authentication.mfa.phone.a> f31775n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<String> f31776o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableStateFlow<Phone> f31777p;

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    @e(c = "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$localeItems$1", f = "SettingsPhoneAuthViewModel.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<FlowCollector<? super List<? extends j<? extends String, ? extends Locale>>>, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31778a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31779b;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f31779b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends j<? extends String, ? extends Locale>>> flowCollector, d<? super y> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31778a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f31779b;
                SettingsPhoneAuthViewModel.this.f31762a.getClass();
                Locale[] availableLocales = Locale.getAvailableLocales();
                u.i(availableLocales, "getAvailableLocales(...)");
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : kotlin.collections.l.R(availableLocales, new Object())) {
                    if (hashSet.add(((Locale) obj2).getCountry())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<Locale> arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (PhoneNumberUtil.i().g(((Locale) next).getCountry()) != 0) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(arrayList2, 10));
                for (Locale locale : arrayList2) {
                    arrayList3.add(new j(locale.getDisplayCountry(Locale.getDefault()), locale));
                }
                this.f31778a = 1;
                if (flowCollector.emit(arrayList3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SettingsPhoneAuthViewModel.kt */
    @e(c = "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$sendConfirmationCode$1", f = "SettingsPhoneAuthViewModel.kt", l = {81, 82, 83, 88, 92}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31781a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f31782b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Phone f31784d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f31785e;

        /* compiled from: SettingsPhoneAuthViewModel.kt */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f31786a;

            static {
                int[] iArr = new int[Phone.values().length];
                try {
                    Phone phone = Phone.f31755a;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Phone phone2 = Phone.f31755a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Phone phone3 = Phone.f31755a;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f31786a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Phone phone, String str, d<? super b> dVar) {
            super(2, dVar);
            this.f31784d = phone;
            this.f31785e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f31784d, this.f31785e, dVar);
            bVar.f31782b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f31781a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel r6 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.this
                r7 = 1
                if (r1 == 0) goto L31
                if (r1 == r7) goto L2b
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                nm0.l.b(r9)
                goto Lb9
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r1 = r8.f31782b
                nm0.l.b(r9)
                goto L9f
            L2b:
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L2f
                goto L7d
            L2f:
                r9 = move-exception
                goto L81
            L31:
                nm0.l.b(r9)
                java.lang.Object r9 = r8.f31782b
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.k0(r6)
                com.withings.authentication.mfa.phone.Phone r1 = r8.f31784d
                r9.setValue(r1)
                if (r1 != 0) goto L45
                r9 = -1
                goto L4d
            L45:
                int[] r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.b.a.f31786a     // Catch: java.lang.Throwable -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L2f
                r9 = r9[r1]     // Catch: java.lang.Throwable -> L2f
            L4d:
                java.lang.String r1 = r8.f31785e
                if (r9 == r7) goto L70
                if (r9 == r5) goto L63
                if (r9 == r4) goto L56
                goto L7d
            L56:
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.f0(r6)     // Catch: java.lang.Throwable -> L2f
                r8.f31781a = r4     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r9 = r9.sendConfirmationCodeCall(r1, r8)     // Catch: java.lang.Throwable -> L2f
                if (r9 != r0) goto L7d
                return r0
            L63:
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.f0(r6)     // Catch: java.lang.Throwable -> L2f
                r8.f31781a = r5     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r9 = r9.sendConfirmationCodeSms(r1, r8)     // Catch: java.lang.Throwable -> L2f
                if (r9 != r0) goto L7d
                return r0
            L70:
                com.withings.account.network.ws.AccountRemoteRepository r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.f0(r6)     // Catch: java.lang.Throwable -> L2f
                r8.f31781a = r7     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r9 = r9.sendConfirmationCodeWhatsApp(r1, r8)     // Catch: java.lang.Throwable -> L2f
                if (r9 != r0) goto L7d
                return r0
            L7d:
                nm0.y r9 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2f
            L7f:
                r1 = r9
                goto L86
            L81:
                nm0.k$a r9 = nm0.l.a(r9)
                goto L7f
            L86:
                boolean r9 = r1 instanceof nm0.k.a
                r9 = r9 ^ r7
                if (r9 == 0) goto L9f
                r9 = r1
                nm0.y r9 = (nm0.y) r9
                kotlinx.coroutines.flow.MutableSharedFlow r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.q0(r6)
                com.withings.authentication.mfa.phone.b$b r4 = com.withings.authentication.mfa.phone.b.C0415b.f31795a
                r8.f31782b = r1
                r8.f31781a = r3
                java.lang.Object r9 = r9.emit(r4, r8)
                if (r9 != r0) goto L9f
                return r0
            L9f:
                java.lang.Throwable r9 = nm0.k.b(r1)
                if (r9 == 0) goto Lb9
                x70.b.n(r9)
                kotlinx.coroutines.flow.MutableSharedFlow r9 = com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.q0(r6)
                com.withings.authentication.mfa.phone.b$a r3 = com.withings.authentication.mfa.phone.b.a.f31794a
                r8.f31782b = r1
                r8.f31781a = r2
                java.lang.Object r9 = r9.emit(r3, r8)
                if (r9 != r0) goto Lb9
                return r0
            Lb9:
                nm0.y r9 = nm0.y.f85009a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class c implements Flow<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f31787a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f31788a;

            /* compiled from: Emitters.kt */
            @e(c = "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$special$$inlined$map$1$2", f = "SettingsPhoneAuthViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0413a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f31789a;

                /* renamed from: b  reason: collision with root package name */
                int f31790b;

                public C0413a(d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f31789a = obj;
                    this.f31790b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f31788a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.c.a.C0413a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$c$a$a r0 = (com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.c.a.C0413a) r0
                    int r1 = r0.f31790b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f31790b = r1
                    goto L18
                L13:
                    com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$c$a$a r0 = new com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f31789a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f31790b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L6a
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r5, r2)
                    r6.<init>(r2)
                    java.util.Iterator r5 = r5.iterator()
                L45:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L5f
                    java.lang.Object r2 = r5.next()
                    nm0.j r2 = (nm0.j) r2
                    java.lang.Object r2 = r2.d()
                    java.util.Locale r2 = (java.util.Locale) r2
                    java.lang.String r2 = rk.d.a(r2)
                    r6.add(r2)
                    goto L45
                L5f:
                    r0.f31790b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f31788a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L6a
                    return r1
                L6a:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(Flow flow) {
            this.f31787a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends String>> flowCollector, d dVar) {
            Object collect = this.f31787a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    @Inject
    public SettingsPhoneAuthViewModel(x xVar, AccountRemoteRepository accountRemoteRepository, f fVar) {
        u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f31762a = xVar;
        this.f31763b = accountRemoteRepository;
        this.f31764c = fVar;
        Locale locale = Locale.getDefault();
        u.i(locale, "getDefault(...)");
        MutableStateFlow<Locale> MutableStateFlow = StateFlowKt.MutableStateFlow(locale);
        this.f31765d = MutableStateFlow;
        this.f31766e = FlowKt.asStateFlow(MutableStateFlow);
        Flow<List<j<String, Locale>>> flowOn = FlowKt.flowOn(FlowKt.flow(new a(null)), Dispatchers.getMain());
        this.f31767f = flowOn;
        this.f31768g = FlowKt.flowOn(new c(flowOn), Dispatchers.getMain());
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.f31769h = MutableStateFlow2;
        this.f31770i = FlowKt.asStateFlow(MutableStateFlow2);
        this.f31771j = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        MutableSharedFlow<com.withings.authentication.mfa.phone.b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f31772k = MutableSharedFlow$default;
        this.f31773l = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<com.withings.authentication.mfa.phone.a> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f31774m = MutableSharedFlow$default2;
        this.f31775n = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        this.f31776o = StateFlowKt.MutableStateFlow("");
        this.f31777p = StateFlowKt.MutableStateFlow(null);
    }

    public final StateFlow<Locale> A0() {
        return this.f31766e;
    }

    public final StateFlow<Phone> B0() {
        return FlowKt.asStateFlow(this.f31777p);
    }

    public final StateFlow<String> F0() {
        return this.f31770i;
    }

    public final StateFlow<Boolean> G0() {
        return FlowKt.asStateFlow(this.f31771j);
    }

    public final StateFlow<String> K0() {
        return FlowKt.asStateFlow(this.f31776o);
    }

    public final SharedFlow<com.withings.authentication.mfa.phone.b> M0() {
        return this.f31773l;
    }

    public final void O0(Locale locale) {
        u.j(locale, "locale");
        this.f31765d.setValue(locale);
    }

    public final void R0(String phoneNumber) {
        u.j(phoneNumber, "phoneNumber");
        this.f31769h.setValue(phoneNumber);
    }

    public final void T0(Phone phone, String formattedNumber) {
        u.j(formattedNumber, "formattedNumber");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(phone, formattedNumber, null), 2, null);
    }

    public final void r0(String code) {
        u.j(code, "code");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.authentication.mfa.phone.c(this, code, null), 2, null);
    }

    public final SharedFlow<com.withings.authentication.mfa.phone.a> t0() {
        return this.f31775n;
    }

    public final Flow<List<String>> y0() {
        return this.f31768g;
    }

    public final Flow<List<j<String, Locale>>> z0() {
        return this.f31767f;
    }
}
