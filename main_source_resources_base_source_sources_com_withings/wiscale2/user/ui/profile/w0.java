package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$updateUserMetrics$2", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVTYPE, ConstantsWs.WS_STATUS_WRONGDEVTYPE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    ej0.c f62100a;

    /* renamed from: b  reason: collision with root package name */
    User f62101b;

    /* renamed from: c  reason: collision with root package name */
    m70.k f62102c;

    /* renamed from: d  reason: collision with root package name */
    int f62103d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s0 f62104e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ User f62105f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ m70.k f62106g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(s0 s0Var, User user, m70.k kVar, qm0.d<? super w0> dVar) {
        super(2, dVar);
        this.f62104e = s0Var;
        this.f62105f = user;
        this.f62106g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w0(this.f62104e, this.f62105f, this.f62106g, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ej0.c cVar;
        SharedFlow sharedFlow;
        m70.k kVar;
        User user;
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62103d;
        s0 s0Var = this.f62104e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m70.k kVar2 = this.f62102c;
            User user2 = this.f62101b;
            cVar = this.f62100a;
            nm0.l.b(obj);
            kVar = kVar2;
            user = user2;
        } else {
            nm0.l.b(obj);
            cVar = s0Var.f62053n;
            sharedFlow = s0Var.f62058s;
            this.f62100a = cVar;
            User user3 = this.f62105f;
            this.f62101b = user3;
            m70.k kVar3 = this.f62106g;
            this.f62102c = kVar3;
            this.f62103d = 1;
            obj = FlowKt.first(sharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kVar = kVar3;
            user = user3;
        }
        z5 = s0Var.f62040a;
        this.f62100a = null;
        this.f62101b = null;
        this.f62102c = null;
        this.f62103d = 2;
        if (cVar.a(user, kVar, (Double) obj, z5, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
