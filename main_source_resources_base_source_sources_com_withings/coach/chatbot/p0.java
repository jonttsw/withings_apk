package com.withings.coach.chatbot;

import android.app.Application;
import android.content.Intent;
import androidx.camera.camera2.internal.s2;
import com.withings.coach.chatbot.v0;
import com.withings.coach.webservices.GetInsight;
import com.withings.insight.android.entity.Action;
import com.withings.insight.android.entity.Conversation;
import com.withings.insight.android.entity.InputMetadata;
import com.withings.insight.android.entity.Insight;
import com.withings.insight.android.entity.SelectedExchange;
import com.withings.insight.android.entity.Suggestion;
import com.withings.insight.android.entity.UserResponseTypeHandler;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import si.b;
/* compiled from: ChatbotViewModel.kt */
/* loaded from: classes3.dex */
public final class p0 extends androidx.lifecycle.b implements b.a, UserResponseTypeHandler.UserResponseListener, v0.a {
    private final UserResponseTypeHandler A;
    private Insight B;
    private final xw.n<nm0.y> F;
    private final int G;
    private final SharedFlow<Long> M;

    /* renamed from: a  reason: collision with root package name */
    private final gw.b f33048a;

    /* renamed from: b  reason: collision with root package name */
    private final ew.a f33049b;

    /* renamed from: c  reason: collision with root package name */
    private final si.a f33050c;

    /* renamed from: d  reason: collision with root package name */
    private final ti.d f33051d;

    /* renamed from: e  reason: collision with root package name */
    private final r70.c f33052e;

    /* renamed from: f  reason: collision with root package name */
    private int f33053f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f33054g;

    /* renamed from: h  reason: collision with root package name */
    private si.b f33055h;

    /* renamed from: i  reason: collision with root package name */
    private v0 f33056i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f33057j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.k0<nm0.j<Conversation, List<Integer>>> f33058k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.k0<Conversation> f33059l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.k0<Conversation> f33060m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.k0<Conversation> f33061n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f33062o;

    /* renamed from: p  reason: collision with root package name */
    private androidx.lifecycle.k0<nm0.j<Conversation, Suggestion>> f33063p;

    /* renamed from: q  reason: collision with root package name */
    private androidx.lifecycle.k0<nm0.j<Conversation, List<Suggestion>>> f33064q;

    /* renamed from: r  reason: collision with root package name */
    private androidx.lifecycle.k0<nm0.j<Conversation, List<Suggestion>>> f33065r;

    /* renamed from: s  reason: collision with root package name */
    private androidx.lifecycle.k0<List<l0>> f33066s;

    /* renamed from: t  reason: collision with root package name */
    private androidx.lifecycle.k0<Intent> f33067t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.k0<List<Insight>> f33068u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.k0<Insight> f33069v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f33070w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f33071x;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.lifecycle.k0<String> f33072y;

    /* renamed from: z  reason: collision with root package name */
    private final androidx.lifecycle.k0<l0> f33073z;

    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$initConversationItems$1", f = "ChatbotViewModel.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33074a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatbotViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$initConversationItems$1$3", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.coach.chatbot.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0444a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f33076a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0444a(p0 p0Var, qm0.d<? super C0444a> dVar) {
                super(2, dVar);
                this.f33076a = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0444a(this.f33076a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((C0444a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                p0 p0Var = this.f33076a;
                List<SelectedExchange> scenario = p0Var.B.getScenario();
                if (scenario == null) {
                    scenario = kotlin.collections.i0.f76187a;
                }
                if (scenario.isEmpty()) {
                    p0Var.e0(null);
                } else {
                    p0.f0(p0Var, scenario);
                }
                return nm0.y.f85009a;
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f33074a;
            p0 p0Var = p0.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                v0 v0Var = p0Var.f33056i;
                if (v0Var != null) {
                    CharSequence b10 = v0Var.d().b();
                    if (b10 != null) {
                        if (b10.length() <= 0) {
                            b10 = null;
                        }
                        if (b10 != null) {
                            List list = p0Var.f33054g;
                            v0 v0Var2 = p0Var.f33056i;
                            if (v0Var2 != null) {
                                list.add(v0Var2.d());
                            } else {
                                kotlin.jvm.internal.u.s("conversationParser");
                                throw null;
                            }
                        }
                    }
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0444a c0444a = new C0444a(p0Var, null);
                    this.f33074a = 1;
                    if (BuildersKt.withContext(io2, c0444a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("conversationParser");
                    throw null;
                }
            }
            p0Var.k1().postValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$nextConversation$1", f = "ChatbotViewModel.kt", l = {414}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33077a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f33079c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f33079c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f33077a;
            p0 p0Var = p0.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                p0Var.f33053f++;
                if (kotlin.jvm.internal.u.e(p0Var.d1().getValue(), Boolean.TRUE)) {
                    p0.j0(p0Var);
                    this.f33077a = 1;
                    if (DelayKt.delay(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            v0 v0Var = p0Var.f33056i;
            Conversation conversation = null;
            if (v0Var != null) {
                String str = this.f33079c;
                if (str == null) {
                    str = String.valueOf(p0Var.f33053f);
                }
                Conversation a11 = v0Var.a(str);
                p0.g0(p0Var, a11);
                if (a11 != null) {
                    if ((a11.hasNoNextDisplayActions() && a11.hasSuggestions()) || a11.requiresTextInput()) {
                        conversation = a11;
                    }
                    if (conversation != null) {
                        p0.i0(p0Var, a11);
                    }
                }
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("conversationParser");
            throw null;
        }
    }

    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$onContextUpdated$1$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Insight f33081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Insight insight, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f33081b = insight;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f33081b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            p0.this.f33048a.e(this.f33081b);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$onVariableUpdated$1$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Insight f33083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Insight insight, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f33083b = insight;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f33083b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            p0.this.f33048a.e(this.f33083b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$refreshDeeplinkHandlerAndInsight$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Insight f33085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Insight insight, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f33085b = insight;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f33085b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            p0.this.f33048a.e(this.f33085b);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$reloadForDeeplink$1", f = "ChatbotViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33086a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatbotViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$reloadForDeeplink$1$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Long, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ long f33088a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p0 f33089b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f33089b = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f33089b, dVar);
                aVar.f33088a = ((Number) obj).longValue();
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(Long l5, qm0.d<? super nm0.y> dVar) {
                return ((a) create(Long.valueOf(l5.longValue()), dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                long j5 = this.f33088a;
                p0 p0Var = this.f33089b;
                GetInsight getInsight = new GetInsight(j5, p0Var.f33048a, p0Var.f33049b, p0Var.f33051d, true);
                getInsight.setSyncContext("syncForDeepLink");
                getInsight.run();
                Insight f11 = p0Var.f33048a.f(j5);
                if (f11 != null) {
                    List<Insight> value = p0Var.V0().getValue();
                    if (value != null) {
                        value.add(f11);
                    }
                    Long insightId = f11.getInsightId();
                    if (insightId != null) {
                        p0Var.O0(insightId.longValue());
                    }
                }
                return nm0.y.f85009a;
            }
        }

        f(qm0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f33086a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                p0 p0Var = p0.this;
                SharedFlow sharedFlow = p0Var.M;
                a aVar = new a(p0Var, null);
                this.f33086a = 1;
                if (FlowKt.collectLatest(sharedFlow, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class g implements Flow<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f33090a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f33091a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$special$$inlined$map$1$2", f = "ChatbotViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.coach.chatbot.p0$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0445a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f33092a;

                /* renamed from: b  reason: collision with root package name */
                int f33093b;

                public C0445a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33092a = obj;
                    this.f33093b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f33091a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.coach.chatbot.p0.g.a.C0445a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.coach.chatbot.p0$g$a$a r0 = (com.withings.coach.chatbot.p0.g.a.C0445a) r0
                    int r1 = r0.f33093b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33093b = r1
                    goto L18
                L13:
                    com.withings.coach.chatbot.p0$g$a$a r0 = new com.withings.coach.chatbot.p0$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33092a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f33093b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L48
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.user.core.models.User r5 = (com.withings.user.core.models.User) r5
                    long r5 = r5.getId()
                    java.lang.Long r2 = new java.lang.Long
                    r2.<init>(r5)
                    r0.f33093b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f33091a
                    java.lang.Object r5 = r5.emit(r2, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.p0.g.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public g(Flow flow) {
            this.f33090a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Long> flowCollector, qm0.d dVar) {
            Object collect = this.f33090a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Insight initialInsight, gw.b insightRepository, ew.a insightRemoteRepository, si.a aVar, ti.d insightStateRepository, r70.c userRepository, Application application) {
        super(application);
        int i11;
        SharedFlow<Long> shareIn$default;
        kotlin.jvm.internal.u.j(initialInsight, "initialInsight");
        kotlin.jvm.internal.u.j(insightRepository, "insightRepository");
        kotlin.jvm.internal.u.j(insightRemoteRepository, "insightRemoteRepository");
        kotlin.jvm.internal.u.j(insightStateRepository, "insightStateRepository");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f33048a = insightRepository;
        this.f33049b = insightRemoteRepository;
        this.f33050c = aVar;
        this.f33051d = insightStateRepository;
        this.f33052e = userRepository;
        this.f33053f = -1;
        this.f33054g = new ArrayList();
        this.f33057j = new androidx.lifecycle.k0<>();
        this.f33058k = new androidx.lifecycle.k0<>();
        this.f33059l = new androidx.lifecycle.k0<>();
        this.f33060m = new androidx.lifecycle.k0<>();
        this.f33061n = new androidx.lifecycle.k0<>();
        this.f33062o = new androidx.lifecycle.k0<>();
        this.f33063p = new androidx.lifecycle.k0<>();
        this.f33064q = new androidx.lifecycle.k0<>();
        this.f33065r = new androidx.lifecycle.k0<>();
        this.f33066s = new androidx.lifecycle.k0<>();
        this.f33067t = new androidx.lifecycle.k0<>();
        this.f33068u = new androidx.lifecycle.k0<>(kotlin.collections.x.i0(initialInsight));
        this.f33069v = new androidx.lifecycle.k0<>();
        this.f33070w = new androidx.lifecycle.k0<>();
        this.f33071x = new androidx.lifecycle.k0<>();
        this.f33072y = new androidx.lifecycle.k0<>();
        this.f33073z = new androidx.lifecycle.k0<>();
        this.A = new UserResponseTypeHandler(this);
        this.B = initialInsight;
        this.F = new xw.n<>();
        if (s2.j()) {
            i11 = 35;
        } else {
            i11 = 38;
        }
        this.G = i11;
        shareIn$default = FlowKt__ShareKt.shareIn$default(new g(FlowKt.filterNotNull(userRepository.f())), androidx.lifecycle.h1.a(this), SharingStarted.Companion.getEagerly(), 0, 4, null);
        this.M = shareIn$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r6.booleanValue() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F0(com.withings.coach.chatbot.p0 r4, com.withings.insight.android.entity.Insight r5, java.lang.String r6) {
        /*
            r4.getClass()
            r0 = 0
            if (r5 == 0) goto Lb
            java.lang.Long r1 = r5.getInsightId()
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r5 == 0) goto L3e
            com.withings.insight.android.entity.Insight r2 = r4.B
            com.withings.insight.android.entity.InsightContent r2 = r2.getContent()
            if (r2 == 0) goto L27
            java.util.List r2 = r2.getConversation()
            if (r2 == 0) goto L27
            int r3 = r4.f33053f
            int r3 = r3 + 1
            int r2 = r2.size()
            if (r3 != r2) goto L27
            goto L46
        L27:
            com.withings.coach.chatbot.v0 r2 = r4.f33056i
            if (r2 == 0) goto L40
            com.withings.insight.android.entity.Conversation r6 = r2.a(r6)
            if (r6 == 0) goto L3e
            java.lang.Boolean r6 = r6.isEndMessage()
            if (r6 == 0) goto L3e
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L3e
            goto L46
        L3e:
            r5 = r0
            goto L46
        L40:
            java.lang.String r4 = "conversationParser"
            kotlin.jvm.internal.u.s(r4)
            throw r0
        L46:
            nm0.j r6 = new nm0.j
            r6.<init>(r1, r5)
            com.withings.coach.chatbot.s0 r5 = new com.withings.coach.chatbot.s0
            r5.<init>(r4)
            cr.a.a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.p0.F0(com.withings.coach.chatbot.p0, com.withings.insight.android.entity.Insight, java.lang.String):void");
    }

    private final void G0(String str, String str2) {
        SelectedExchange selectedExchange;
        Object obj;
        SelectedExchange selectedExchange2;
        Object obj2;
        if (str2 != null) {
            List<SelectedExchange> scenario = this.B.getScenario();
            if (scenario != null) {
                Iterator<T> it = scenario.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.u.e(((SelectedExchange) obj2).getMessageId(), str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                selectedExchange2 = (SelectedExchange) obj2;
            } else {
                selectedExchange2 = null;
            }
            if (selectedExchange2 != null) {
                selectedExchange2.setSuggestionId(str2);
            }
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new q0(this, str, null), 2, null);
            return;
        }
        List<SelectedExchange> scenario2 = this.B.getScenario();
        if (scenario2 != null) {
            Iterator<T> it2 = scenario2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (kotlin.jvm.internal.u.e(((SelectedExchange) obj).getMessageId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            selectedExchange = (SelectedExchange) obj;
        } else {
            selectedExchange = null;
        }
        if (selectedExchange == null) {
            SelectedExchange selectedExchange3 = new SelectedExchange(str, null);
            List<SelectedExchange> scenario3 = this.B.getScenario();
            if (scenario3 != null && !scenario3.isEmpty()) {
                Insight insight = this.B;
                List<SelectedExchange> scenario4 = insight.getScenario();
                if (scenario4 == null) {
                    scenario4 = kotlin.collections.i0.f76187a;
                }
                ArrayList S0 = kotlin.collections.x.S0(scenario4);
                S0.add(selectedExchange3);
                insight.setScenario(kotlin.collections.x.Q0(S0));
            } else {
                this.B.setScenario(kotlin.collections.x.q(selectedExchange3));
            }
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new q0(this, str, null), 2, null);
        }
    }

    private final void K0(List<String> list) {
        if (list != null) {
            for (String str : list) {
                si.b bVar = this.f33055h;
                if (bVar != null) {
                    bVar.c(str, this.B.getCrmId(), getApplication());
                } else {
                    kotlin.jvm.internal.u.s("coachDeepLinkHandler");
                    throw null;
                }
            }
        }
    }

    private final void R0(Conversation conversation, List list, boolean z5) {
        List<Suggestion> suggestions;
        androidx.lifecycle.k0<Boolean> k0Var = this.f33070w;
        if (this.f33056i != null) {
            kotlin.jvm.internal.u.j(conversation, "conversation");
            InputMetadata inputMetadata = conversation.getInputMetadata();
            if (inputMetadata == null || (suggestions = inputMetadata.getSuggestions()) == null) {
                suggestions = conversation.getSuggestions();
            }
            boolean z11 = false;
            if (suggestions != null) {
                List<Suggestion> list2 = suggestions;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<String> actions = ((Suggestion) it.next()).getActions();
                        if (actions != null) {
                            List<String> list3 = actions;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                for (String str : list3) {
                                    if (dp0.j.r(str, "refresh", false)) {
                                        if (!this.B.isToday()) {
                                            z11 = true;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            k0Var.postValue(Boolean.valueOf(z11));
            if (list.size() == 1) {
                this.f33063p.postValue(new nm0.j<>(conversation, kotlin.collections.x.I(list)));
            } else if (z5) {
                this.f33065r.postValue(new nm0.j<>(conversation, list));
            } else {
                this.f33064q.postValue(new nm0.j<>(conversation, list));
            }
            this.f33057j.postValue(Boolean.valueOf(!list.isEmpty()));
            return;
        }
        kotlin.jvm.internal.u.s("conversationParser");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f0(com.withings.coach.chatbot.p0 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.p0.f0(com.withings.coach.chatbot.p0, java.util.List):void");
    }

    public static final void g0(p0 p0Var, Conversation conversation) {
        l0 l0Var;
        if (conversation != null) {
            v0 v0Var = p0Var.f33056i;
            if (v0Var != null) {
                l0 b10 = v0Var.b(conversation, p0Var.B.getVariables());
                androidx.lifecycle.k0<List<l0>> k0Var = p0Var.f33066s;
                List<l0> value = k0Var.getValue();
                if (value != null) {
                    ListIterator<l0> listIterator = value.listIterator(value.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            l0Var = listIterator.previous();
                            if (kotlin.jvm.internal.u.e(l0Var.f(), "writing_bubble")) {
                                break;
                            }
                        } else {
                            l0Var = null;
                            break;
                        }
                    }
                    l0 l0Var2 = l0Var;
                    if (l0Var2 != null) {
                        value.remove(l0Var2);
                    }
                }
                if (value != null) {
                    value.add(b10);
                }
                k0Var.setValue(k0Var.getValue());
                if (p0Var.f33056i != null) {
                    List<String> c11 = v0.c(conversation.getOnDisplayActionsWithConditions(), p0Var.B.getConditions());
                    if (c11 == null) {
                        c11 = conversation.getOnDisplayActions();
                    }
                    p0Var.K0(c11);
                    p0Var.G0(conversation.getMessageId(), null);
                    return;
                }
                kotlin.jvm.internal.u.s("conversationParser");
                throw null;
            }
            kotlin.jvm.internal.u.s("conversationParser");
            throw null;
        }
        p0Var.getClass();
    }

    public static final void i0(p0 p0Var, Conversation conversation) {
        p0Var.A.getUserResponse(conversation);
    }

    public static final void j0(p0 p0Var) {
        p0Var.getClass();
        p0Var.f33054g.add(new l0(null, null, null, null, null, "writing_bubble", 63));
        p0Var.f33066s.postValue(p0Var.f33054g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(Insight insight) {
        insight.setOpened(true);
        insight.setSynced(false);
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new e(insight, null), 2, null);
        Map<String, String> context = insight.getContext();
        if (context == null) {
            context = new LinkedHashMap<>();
        }
        this.f33055h = new si.b(this.f33050c, this, context);
        List<Insight> value = this.f33068u.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.u.e(((Insight) next).getInsightId(), insight.getInsightId())) {
                    obj = next;
                    break;
                }
            }
            Insight insight2 = (Insight) obj;
            if (insight2 != null) {
                insight2.setOpened(true);
            }
        }
        this.f33069v.postValue(insight);
    }

    @Override // com.withings.coach.chatbot.v0.a
    public final void G(String str) {
        this.f33072y.postValue(str);
    }

    @Override // si.b.a
    public final void H(Map<String, String> variableKeyValue) {
        kotlin.jvm.internal.u.j(variableKeyValue, "variableKeyValue");
        Insight insight = this.B;
        insight.setVariables(variableKeyValue);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new d(insight, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r8 == null) goto L28;
     */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(com.withings.insight.android.entity.Conversation r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.p0.M0(com.withings.insight.android.entity.Conversation, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(long r9) {
        /*
            r8 = this;
            androidx.lifecycle.k0<java.lang.Boolean> r0 = r8.f33062o
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            xw.d.e(r0, r1)
            androidx.lifecycle.k0<java.util.List<com.withings.insight.android.entity.Insight>> r0 = r8.f33068u
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.withings.insight.android.entity.Insight r3 = (com.withings.insight.android.entity.Insight) r3
            java.lang.Long r3 = r3.getInsightId()
            if (r3 != 0) goto L2c
            goto L18
        L2c:
            long r3 = r3.longValue()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L18
            goto L36
        L35:
            r2 = r1
        L36:
            com.withings.insight.android.entity.Insight r2 = (com.withings.insight.android.entity.Insight) r2
            if (r2 == 0) goto L62
            com.withings.insight.android.entity.InsightContent r0 = r2.getContent()
            if (r0 == 0) goto L45
            java.util.List r0 = r0.getConversation()
            goto L46
        L45:
            r0 = r1
        L46:
            java.util.Collection r0 = (java.util.Collection) r0
            r3 = 1
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L52
            goto L54
        L52:
            r0 = 0
            goto L55
        L54:
            r0 = r3
        L55:
            r0 = r0 ^ r3
            if (r0 == 0) goto L59
            goto L5a
        L59:
            r2 = r1
        L5a:
            if (r2 == 0) goto L62
            r8.t1(r2)
            nm0.y r0 = nm0.y.f85009a
            goto L63
        L62:
            r0 = r1
        L63:
            if (r0 != 0) goto L78
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.h1.a(r8)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.coach.chatbot.o0 r5 = new com.withings.coach.chatbot.o0
            r5.<init>(r9, r8, r1)
            r4 = 0
            r6 = 2
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.p0.O0(long):void");
    }

    public final androidx.lifecycle.k0<List<l0>> T0() {
        return this.f33066s;
    }

    @Override // com.withings.coach.chatbot.v0.a
    public final void U(l0 l0Var) {
        hm.d a11 = l0Var.a();
        if (a11 != null) {
            si.b bVar = this.f33055h;
            if (bVar != null) {
                bVar.b(a11);
            } else {
                kotlin.jvm.internal.u.s("coachDeepLinkHandler");
                throw null;
            }
        }
        this.f33073z.postValue(l0Var);
    }

    public final androidx.lifecycle.k0<Insight> U0() {
        return this.f33069v;
    }

    public final androidx.lifecycle.k0<List<Insight>> V0() {
        return this.f33068u;
    }

    @Override // si.b.a
    public final void W() {
        if (this.B.isToday()) {
            this.f33062o.postValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new f(null), 2, null);
        }
    }

    public final androidx.lifecycle.k0<String> W0() {
        return this.f33072y;
    }

    public final androidx.lifecycle.k0<l0> X0() {
        return this.f33073z;
    }

    public final int Y0() {
        return this.G;
    }

    public final xw.n<nm0.y> Z0() {
        return this.F;
    }

    public final androidx.lifecycle.k0<Boolean> a1() {
        return this.f33070w;
    }

    public final androidx.lifecycle.k0<Boolean> c1() {
        return this.f33057j;
    }

    public final androidx.lifecycle.k0<Boolean> d1() {
        return this.f33071x;
    }

    @Override // si.b.a
    public final void e0(String str) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new b(str, null), 3, null);
    }

    public final androidx.lifecycle.k0<Conversation> e1() {
        return this.f33061n;
    }

    public final androidx.lifecycle.k0<Conversation> g1() {
        return this.f33059l;
    }

    public final androidx.lifecycle.k0<nm0.j<Conversation, List<Integer>>> i1() {
        return this.f33058k;
    }

    public final androidx.lifecycle.k0<Boolean> k1() {
        return this.f33062o;
    }

    public final androidx.lifecycle.k0<nm0.j<Conversation, Suggestion>> l1() {
        return this.f33063p;
    }

    public final androidx.lifecycle.k0<nm0.j<Conversation, List<Suggestion>>> m1() {
        return this.f33065r;
    }

    public final androidx.lifecycle.k0<nm0.j<Conversation, List<Suggestion>>> n1() {
        return this.f33064q;
    }

    public final androidx.lifecycle.k0<Conversation> o1() {
        return this.f33060m;
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onDatePickerInputRequired(Conversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f33059l.postValue(conversation);
        this.f33057j.postValue(Boolean.TRUE);
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onDateTimePickerInputRequired(Conversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f33061n.postValue(conversation);
        this.f33057j.postValue(Boolean.TRUE);
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onMultipleSuggestionSelectionRequired(List<Suggestion> suggestions, Conversation conversation) {
        kotlin.jvm.internal.u.j(suggestions, "suggestions");
        kotlin.jvm.internal.u.j(conversation, "conversation");
        R0(conversation, suggestions, true);
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onSingleSuggestionSelectionRequired(List<Suggestion> suggestions, Conversation conversation) {
        kotlin.jvm.internal.u.j(suggestions, "suggestions");
        kotlin.jvm.internal.u.j(conversation, "conversation");
        R0(conversation, suggestions, false);
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onTextInputRequired(Conversation conversation, List<Integer> inputType) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        kotlin.jvm.internal.u.j(inputType, "inputType");
        this.f33057j.postValue(Boolean.FALSE);
        this.f33058k.postValue(new nm0.j<>(conversation, inputType));
    }

    @Override // com.withings.insight.android.entity.UserResponseTypeHandler.UserResponseListener
    public final void onTimePickerInputRequired(Conversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f33060m.postValue(conversation);
        this.f33057j.postValue(Boolean.TRUE);
    }

    @Override // si.b.a
    public final void p(Intent deepLinkIntent) {
        kotlin.jvm.internal.u.j(deepLinkIntent, "deepLinkIntent");
        this.f33067t.postValue(deepLinkIntent);
    }

    public final androidx.lifecycle.k0<Intent> q1() {
        return this.f33067t;
    }

    @Override // si.b.a
    public final void r(Map<String, String> contextKeyValue) {
        kotlin.jvm.internal.u.j(contextKeyValue, "contextKeyValue");
        Insight insight = this.B;
        insight.setContext(contextKeyValue);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new c(insight, null), 2, null);
    }

    public final void r1(Insight insight) {
        kotlin.jvm.internal.u.j(insight, "insight");
        this.f33071x.postValue(Boolean.FALSE);
        ArrayList arrayList = new ArrayList();
        this.f33054g = arrayList;
        this.f33066s.postValue(arrayList);
        this.f33053f = -1;
        this.f33056i = new v0(insight, this);
        this.B = insight;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new a(null), 3, null);
    }

    public final void s1(int i11) {
        l0 l0Var;
        String conversationId;
        ArrayList arrayList;
        List<Action> list;
        ArrayList arrayList2;
        Object obj;
        InputMetadata inputMetadata;
        List<Action> onTapActionsWithConditions;
        androidx.lifecycle.k0<List<l0>> k0Var = this.f33066s;
        List<l0> value = k0Var.getValue();
        ArrayList arrayList3 = null;
        if (value != null) {
            l0Var = value.get(i11);
        } else {
            l0Var = null;
        }
        v0 v0Var = this.f33056i;
        if (v0Var != null) {
            if (l0Var == null || (conversationId = l0Var.d()) == null) {
                conversationId = String.valueOf(this.f33053f);
            }
            Map<String, String> conditions = this.B.getConditions();
            kotlin.jvm.internal.u.j(conversationId, "conversationId");
            Conversation a11 = v0Var.a(conversationId);
            if (a11 != null && (inputMetadata = a11.getInputMetadata()) != null && (onTapActionsWithConditions = inputMetadata.getOnTapActionsWithConditions()) != null) {
                List<Action> list2 = onTapActionsWithConditions;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (Action action : list2) {
                    arrayList4.add(action.getAction());
                }
                arrayList = kotlin.collections.x.S0(arrayList4);
            } else {
                arrayList = null;
            }
            if (a11 != null) {
                list = a11.getOnTapActionsWithConditions();
            } else {
                list = null;
            }
            List<String> c11 = v0.c(list, conditions);
            if (c11 == null) {
                if (a11 != null) {
                    c11 = a11.getOnTapActions();
                } else {
                    c11 = null;
                }
                if (c11 == null) {
                    if (a11 != null) {
                        c11 = a11.getActions();
                    } else {
                        c11 = null;
                    }
                }
            }
            if (c11 != null) {
                arrayList2 = kotlin.collections.x.S0(c11);
            } else {
                arrayList2 = null;
            }
            List<String> list3 = (List) cr.a.a(new nm0.j(arrayList2, arrayList), w0.f33123a);
            ArrayList arrayList5 = arrayList;
            if (list3 == null) {
                if (arrayList2 != null) {
                    arrayList5 = arrayList2;
                }
            } else {
                arrayList5 = list3;
            }
            if (arrayList5 != null) {
                if (l0Var != null && l0Var.d() != null) {
                    G0(l0Var.d(), arrayList5.get(0));
                }
                List<l0> value2 = k0Var.getValue();
                if (value2 != null && value2.size() == i11 + 1) {
                    K0(arrayList5);
                    this.f33057j.postValue(Boolean.FALSE);
                    this.f33071x.postValue(Boolean.TRUE);
                    return;
                } else if (this.f33056i != null) {
                    List<String> list4 = arrayList5;
                    Iterator<T> it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (dp0.j.r((String) obj, "next", false)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str = (String) obj;
                    if (str != null) {
                        arrayList3 = kotlin.collections.x.g0(list4, str);
                    }
                    K0(arrayList3);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("conversationParser");
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.u.s("conversationParser");
        throw null;
    }

    public final void v1(l0 l0Var, String previewHtml) {
        kotlin.jvm.internal.u.j(previewHtml, "previewHtml");
        String O = dp0.j.O(previewHtml, "\\n", "", false);
        Properties properties = new Properties();
        properties.load(new StringReader("html=".concat(O)));
        v0 v0Var = this.f33056i;
        if (v0Var != null) {
            String property = properties.getProperty("html");
            kotlin.jvm.internal.u.i(property, "getProperty(...)");
            v0Var.e(l0Var, property);
            return;
        }
        kotlin.jvm.internal.u.s("conversationParser");
        throw null;
    }
}
