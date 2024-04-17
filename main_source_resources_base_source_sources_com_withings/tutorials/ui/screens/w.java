package com.withings.tutorials.ui.screens;

import com.withings.device.Device;
import com.withings.device.details.scale.b;
import com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: SetupScaleForMultipleUsersViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel$generateShareScaleLinkStates$1", f = "SetupScaleForMultipleUsersViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46307a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f46308b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SetupScaleForMultipleUsersViewModel f46309c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Device f46310d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel, Device device, qm0.d<? super w> dVar) {
        super(2, dVar);
        this.f46309c = setupScaleForMultipleUsersViewModel;
        this.f46310d = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        w wVar = new w(this.f46309c, this.f46310d, dVar);
        wVar.f46308b = obj;
        return wVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.device.details.scale.b bVar;
        CoroutineScope coroutineScope;
        SetupScaleForMultipleUsersViewModel.a cVar;
        xw.n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46307a;
        SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel = this.f46309c;
        if (i11 != 0) {
            if (i11 == 1) {
                coroutineScope = (CoroutineScope) this.f46308b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f46308b;
            bVar = setupScaleForMultipleUsersViewModel.f44802a;
            this.f46308b = coroutineScope2;
            this.f46307a = 1;
            Object a11 = bVar.a(this.f46310d, this);
            if (a11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = a11;
        }
        b.a aVar = (b.a) obj;
        if (aVar instanceof b.a.c) {
            cVar = new SetupScaleForMultipleUsersViewModel.a.b(((b.a.c) aVar).a());
        } else if (aVar instanceof b.a.C0487b) {
            x70.b.d(coroutineScope, "Could not get link to share scale because of connectivity issues", new Object[0]);
            cVar = SetupScaleForMultipleUsersViewModel.a.d.f44810a;
        } else if (aVar instanceof b.a.C0486a) {
            b.a.C0486a c0486a = (b.a.C0486a) aVar;
            x70.b.f(coroutineScope, c0486a.a(), "Could not get link to share scale", new Object[0]);
            cVar = new SetupScaleForMultipleUsersViewModel.a.c(c0486a.a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        nVar = setupScaleForMultipleUsersViewModel.f44805d;
        nVar.postValue(cVar);
        return y.f85009a;
    }
}
