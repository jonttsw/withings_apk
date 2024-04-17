package com.withings.coach.chatbot;

import com.withings.coach.webservices.SendScenarioForInsight;
import com.withings.insight.android.entity.SelectedExchange;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatbotViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$saveScenario$1", f = "ChatbotViewModel.kt", l = {ConstantsWs.WS_STATUS_PROASSOCIATIONMISMATCH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0 f33102b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f33103c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$saveScenario$1$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Long, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ long f33104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f33105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33106c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatbotViewModel.kt */
        /* renamed from: com.withings.coach.chatbot.q0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0446a extends kotlin.jvm.internal.w implements ym0.p<List<? extends SelectedExchange>, Long, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0 f33107a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f33108b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f33109c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0446a(p0 p0Var, String str, long j5) {
                super(2);
                this.f33107a = p0Var;
                this.f33108b = str;
                this.f33109c = j5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ym0.p
            public final nm0.y invoke(List<? extends SelectedExchange> list, Long l5) {
                List<? extends SelectedExchange> scenario = list;
                long longValue = l5.longValue();
                kotlin.jvm.internal.u.j(scenario, "scenario");
                p0 p0Var = this.f33107a;
                p0Var.f33048a.a(longValue, scenario);
                p0.F0(p0Var, p0Var.B, this.f33108b);
                new SendScenarioForInsight(this.f33109c, p0Var.f33048a, p0Var.f33049b, p0Var.Y0(), p0Var.B).run();
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var, String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f33105b = p0Var;
            this.f33106c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f33105b, this.f33106c, dVar);
            aVar.f33104a = ((Number) obj).longValue();
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
            long j5 = this.f33104a;
            p0 p0Var = this.f33105b;
            cr.a.a(new nm0.j(p0Var.B.getScenario(), p0Var.B.getInsightId()), new C0446a(p0Var, this.f33106c, j5));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p0 p0Var, String str, qm0.d<? super q0> dVar) {
        super(2, dVar);
        this.f33102b = p0Var;
        this.f33103c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q0(this.f33102b, this.f33103c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f33101a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            p0 p0Var = this.f33102b;
            SharedFlow sharedFlow = p0Var.M;
            a aVar = new a(p0Var, this.f33103c, null);
            this.f33101a = 1;
            if (FlowKt.collectLatest(sharedFlow, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
