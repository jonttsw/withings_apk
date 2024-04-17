package com.withings.wiscale2.chat.ui;

import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$sendMessage$1", f = "ChatActivity.kt", l = {ConstantsWs.MEASURE_TYPE_CAN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50385a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f50386b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ChatActivity f50387c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ob0.b f50388d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$sendMessage$1$1$1", f = "ChatActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChatActivity f50390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ob0.b f50391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ChatActivity chatActivity, ob0.b bVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f50390b = chatActivity;
            this.f50391c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f50390b, this.f50391c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50389a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                long q11 = m70.i.b().e().q();
                LeaderboardRemoteRepository leaderboardRemoteRepository = this.f50390b.f50322h;
                if (leaderboardRemoteRepository != null) {
                    ob0.b bVar = this.f50391c;
                    long d11 = bVar.d();
                    String c11 = bVar.c();
                    String options = bVar.h().getOptions();
                    this.f50389a = 1;
                    if (leaderboardRemoteRepository.pushMessage(q11, d11, c11, options, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    u.s("leaderboardRemoteRepository");
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ChatActivity chatActivity, ob0.b bVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f50387c = chatActivity;
        this.f50388d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        d dVar2 = new d(this.f50387c, this.f50388d, dVar);
        dVar2.f50386b = obj;
        return dVar2;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50385a;
        ChatActivity chatActivity = this.f50387c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f50386b;
                ob0.b bVar = this.f50388d;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(chatActivity, bVar, null);
                this.f50385a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            int i12 = ChatActivity.f50318q;
            chatActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(t.l(chatActivity), null, null, new c(chatActivity, null), 3, null);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            int i13 = ChatActivity.f50318q;
            chatActivity.getClass();
            if (!(b10 instanceof ObjectNotFoundException)) {
                BuildersKt__Builders_commonKt.launch$default(t.l(chatActivity), null, null, new b(chatActivity, null), 3, null);
            } else {
                chatActivity.setResult(11);
                chatActivity.finish();
            }
        }
        return y.f85009a;
    }
}
