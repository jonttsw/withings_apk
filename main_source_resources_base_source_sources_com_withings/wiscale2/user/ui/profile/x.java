package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: EditProfileActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileActivity$initViewModel$1$1", f = "EditProfileActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NITRITES}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62107a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s0 f62108b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f62109c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f62110a;

        a(EditProfileActivity editProfileActivity) {
            this.f62110a = editProfileActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            int intValue = ((Number) obj).intValue();
            EditProfileActivity editProfileActivity = this.f62110a;
            editProfileActivity.setResult(intValue);
            editProfileActivity.finish();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s0 s0Var, EditProfileActivity editProfileActivity, qm0.d<? super x> dVar) {
        super(2, dVar);
        this.f62108b = s0Var;
        this.f62109c = editProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x(this.f62108b, this.f62109c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((x) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62107a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableSharedFlow<Integer> U0 = this.f62108b.U0();
            a aVar = new a(this.f62109c);
            this.f62107a = 1;
            if (U0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
