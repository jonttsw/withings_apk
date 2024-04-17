package com.withings.authentication.userCreation;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import th.a;
/* compiled from: UserCreationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserCreationViewModel$createAccountAndUser$1", f = "UserCreationViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN, 186, ConstantsWs.MEASURE_TYPE_WAIST}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32492a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32493b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f32494c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f32495d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ double f32496e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f32497f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserCreationViewModel.kt */
    /* renamed from: com.withings.authentication.userCreation.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0437a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32498a;

        C0437a(UserCreationViewModel userCreationViewModel) {
            this.f32498a = userCreationViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            this.f32498a.r0().setValue((a.b) obj);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserCreationViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32499a;

        b(UserCreationViewModel userCreationViewModel) {
            this.f32499a = userCreationViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            this.f32499a.r0().setValue((a.b) obj);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UserCreationViewModel userCreationViewModel, User user, double d11, double d12, boolean z5, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f32493b = userCreationViewModel;
        this.f32494c = user;
        this.f32495d = d11;
        this.f32496e = d12;
        this.f32497f = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f32493b, this.f32494c, this.f32495d, this.f32496e, this.f32497f, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.userCreation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
