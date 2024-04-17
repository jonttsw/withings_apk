package com.withings.wiscale2.user.ui.profile;

import com.withings.user.User;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$updateProfile$1", f = "EditProfileViewModel.kt", l = {222, 226, 227, 229}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    m70.l f62081a;

    /* renamed from: b  reason: collision with root package name */
    User f62082b;

    /* renamed from: c  reason: collision with root package name */
    Object f62083c;

    /* renamed from: d  reason: collision with root package name */
    int f62084d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f62085e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ s0 f62086f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ m70.l f62087g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var, m70.l lVar, qm0.d<? super u0> dVar) {
        super(2, dVar);
        this.f62086f = s0Var;
        this.f62087g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u0 u0Var = new u0(this.f62086f, this.f62087g, dVar);
        u0Var.f62085e = obj;
        return u0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:17:0x0044, B:32:0x009d, B:35:0x00bc), top: B:57:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
