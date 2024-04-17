package com.withings.wiscale2.user.ui;

import android.widget.EditText;
import android.widget.Toast;
import com.withings.user.core.models.User;
import com.withings.webservices.legacy.common.exception.EmailExistsException;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditUserEmailActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.EditUserEmailActivity$updateUserEmail$1", f = "EditUserEmailActivity.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61830a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditUserEmailActivity f61831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EditUserEmailActivity editUserEmailActivity, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f61831b = editUserEmailActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f61831b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        EditText F3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61830a;
        EditUserEmailActivity editUserEmailActivity = this.f61831b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                q70.l lVar = editUserEmailActivity.f61782m;
                if (lVar != null) {
                    User d11 = o70.a.d(EditUserEmailActivity.D3(editUserEmailActivity));
                    this.f61830a = 1;
                    if (lVar.c(d11, "edit_user_email", this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("updateUserEmail");
                    throw null;
                }
            }
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            nm0.y yVar = (nm0.y) a11;
            EditUserEmailActivity.E3(editUserEmailActivity);
            editUserEmailActivity.setResult(-1);
            editUserEmailActivity.finish();
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            EditUserEmailActivity.E3(editUserEmailActivity);
            if (b10 instanceof EmailExistsException) {
                EditUserEmailActivity.B3(editUserEmailActivity).setError(editUserEmailActivity.getString(C1987R.string._ERROR_ALREADYEXIST_));
                F3 = editUserEmailActivity.F3();
                F3.requestFocus();
            } else {
                Toast.makeText(editUserEmailActivity, editUserEmailActivity.getString(C1987R.string._ERROR_CONNECTION_TIMEOUT_), 0).show();
            }
        }
        return nm0.y.f85009a;
    }
}
