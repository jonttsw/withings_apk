package com.withings.wiscale2.user.ui.profile;

import aa0.c;
import android.content.Intent;
import android.widget.Toast;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: EditProfileActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileActivity$initViewModel$1$3", f = "EditProfileActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62124a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s0 f62125b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f62126c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f62127a;

        a(EditProfileActivity editProfileActivity) {
            this.f62127a = editProfileActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            c.a aVar = (c.a) obj;
            boolean z5 = aVar instanceof c.a.C0008a;
            EditProfileActivity editProfileActivity = this.f62127a;
            if (z5) {
                editProfileActivity.L3().V0().setValue(Boolean.FALSE);
            } else if (aVar instanceof c.a.C0009c) {
                editProfileActivity.L3().V0().setValue(Boolean.TRUE);
            } else if (aVar instanceof c.a.b) {
                editProfileActivity.L3().V0().setValue(Boolean.FALSE);
                ((c.a.b) aVar).getClass();
                String string = editProfileActivity.getString(C1987R.string._ERROR_);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                Toast.makeText(editProfileActivity, string, 1).show();
            } else if (aVar instanceof c.a.d) {
                editProfileActivity.L3().V0().setValue(Boolean.FALSE);
                Intent intent = new Intent(editProfileActivity, MainActivity.class);
                intent.addFlags(0);
                editProfileActivity.startActivity(intent);
                editProfileActivity.finish();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s0 s0Var, EditProfileActivity editProfileActivity, qm0.d<? super z> dVar) {
        super(2, dVar);
        this.f62125b = s0Var;
        this.f62126c = editProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z(this.f62125b, this.f62126c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((z) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62124a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableStateFlow<c.a> R0 = this.f62125b.R0();
            a aVar = new a(this.f62126c);
            this.f62124a = 1;
            if (R0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
