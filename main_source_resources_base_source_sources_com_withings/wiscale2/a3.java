package com.withings.wiscale2;

import com.withings.device.Device;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.SendStepGoalConversation;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TargetTrackerSync.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.TargetTrackerSyncKt$saveStepTargetAndStartTrackerSync$1", f = "TargetTrackerSync.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f47995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TargetRepository f47996c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f47997d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f47998e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TargetTrackerSync.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.TargetTrackerSyncKt$saveStepTargetAndStartTrackerSync$1$1", f = "TargetTrackerSync.kt", l = {24}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TargetRepository f48000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f48001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f48002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TargetRepository targetRepository, User user, int i11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48000b = targetRepository;
            this.f48001c = user;
            this.f48002d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48000b, this.f48001c, this.f48002d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47999a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                long q11 = this.f48001c.q();
                this.f47999a = 1;
                if (this.f48000b.saveStepTarget(q11, this.f48002d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ym0.a<nm0.y> aVar, TargetRepository targetRepository, User user, int i11, qm0.d<? super a3> dVar) {
        super(2, dVar);
        this.f47995b = aVar;
        this.f47996c = targetRepository;
        this.f47997d = user;
        this.f47998e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a3(this.f47995b, this.f47996c, this.f47997d, this.f47998e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47994a;
        User user = this.f47997d;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f47996c, user, this.f47998e, null);
            this.f47994a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ej.w w11 = ej.w.w();
        List<Device> h11 = kn.e.c().h(16);
        kotlin.jvm.internal.u.i(h11, "getByType(...)");
        ArrayList arrayList = new ArrayList();
        for (Device device : h11) {
            cj.b D = w11.D(device.getMacAddress());
            if (D != null) {
                arrayList.add(D);
            }
        }
        ArrayList<cj.b> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((cj.b) obj2).n()) {
                arrayList2.add(obj2);
            }
        }
        for (cj.b bVar : arrayList2) {
            SendStepGoalConversation sendStepGoalConversation = new SendStepGoalConversation(user);
            w11.getClass();
            w11.O(bVar, sendStepGoalConversation, sendStepGoalConversation.getClass());
        }
        this.f47995b.invoke();
        return nm0.y.f85009a;
    }
}
